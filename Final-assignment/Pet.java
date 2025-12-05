public abstract class Pet {
    protected String name;
    protected int age;
    protected int hunger;
    protected int happiness;
    protected int energy;
    protected int cleanness;
    protected String type;

    // 생성자 초기화
    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
        this.age = 0;
        this.hunger = 30;
        this.happiness = 70;
        this.energy = 70;
        this.cleanness = 50;
    }

    // 밥 먹기
    public void feed() {
        hunger = Math.max(0, hunger - 20);
        happiness = Math.min(100, happiness + 5);
    }

    // 잠자기
    public void sleep() {
        energy = Math.min(100, energy + 30);
        hunger = Math.min(100, hunger + 10);
    }

    // 씻기
    public void wash() {
        cleanness = Math.min(100, cleanness + 40);
        happiness = Math.max(0, happiness - 2); // 씻기 싫어하는 설정
    }

    // 매 틱마다 상태 변화
    public void tick() {
        age++;
        hunger = Math.min(100, hunger + 5);
        happiness = Math.max(0, happiness - 3);
        energy = Math.max(0, energy - 2);
        cleanness = Math.max(0, cleanness - 1);
    }

    // 상태 문자열 반환
    public String getStatusString() {
        return String.format(
                "타입: %s / 이름: %s / 나이: %d\n[배고픔:%d 행복:%d 에너지:%d 청결:%d]",
                type, name, age, hunger, happiness, energy, cleanness);
    }

    // 생존 여부 확인
    public boolean isAlive() {
        return hunger < 100 && happiness > 0 && energy > 0;
    }

    // 특수 행동 추상 메서드
    public abstract void specialAction() throws PetStatusException;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public int getHunger() {
        return hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getEnergy() {
        return energy;
    }

    public int getCleanness() {
        return cleanness;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setCleanness(int cleanness) {
        this.cleanness = cleanness;
    }
}