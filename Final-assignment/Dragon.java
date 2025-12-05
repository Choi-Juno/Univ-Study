public class Dragon extends Pet {
    public Dragon(String name) {
        super(name, "Dragon");
    }

    @Override
    public void specialAction() throws PetStatusException {
        if (energy <= 10) {
            throw new PetStatusException("에너지가 부족해서 비행 연습을 할 수 없습니다.");
        }
        System.out.println(name + "이(가) 하늘을 날며 불을 뿜습니다!");
        happiness = Math.min(100, happiness + 20);
        energy = Math.max(0, energy - 15);
        hunger = Math.min(100, hunger + 10);
    }
}
