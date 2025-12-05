import java.io.*;

public class DataManager {

    public static void save(Pet pet, String fileName) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            // type, name, age, hunger, happiness, energy, cleanness
            String line = String.format("%s,%s,%d,%d,%d,%d,%d",
                    pet.getType(),
                    pet.getName(),
                    pet.getAge(),
                    pet.getHunger(),
                    pet.getHappiness(),
                    pet.getEnergy(),
                    pet.getCleanness());

            bw.write(line);
        } catch (IOException e) {
            throw new IOException("저장 실패: " + e.getMessage());
        }
    }

    public static Pet load(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            if (line == null) {
                throw new IOException("저장된 데이터가 없습니다.");
            }

            String[] parts = line.split(",");
            if (parts.length != 7) {
                throw new IOException("저장 포맷이 올바르지 않습니다. (length=" + parts.length + ")");
            }

            String type = parts[0];
            String name = parts[1];
            int age = Integer.parseInt(parts[2]);
            int hunger = Integer.parseInt(parts[3]);
            int happiness = Integer.parseInt(parts[4]);
            int energy = Integer.parseInt(parts[5]);
            int cleanness = Integer.parseInt(parts[6]);

            Pet pet;
            switch (type) {
                case "Dog" -> pet = new Dog(name);
                case "Cat" -> pet = new Cat(name);
                case "Dragon" -> pet = new Dragon(name);
                default -> throw new IOException("지원하지 않는 펫 타입입니다: " + type);
            }

            pet.setAge(age);
            pet.setHunger(hunger);
            pet.setHappiness(happiness);
            pet.setEnergy(energy);
            pet.setCleanness(cleanness);

            return pet;
        } catch (IOException e) {
            throw new IOException("로드 실패: " + e.getMessage());
        }
    }
}
