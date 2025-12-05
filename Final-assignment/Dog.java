public class Dog extends Pet implements Trainable {
    public Dog(String name) {
        super(name, "Dog");
    }

    @Override
    public void specialAction() throws PetStatusException {
        if (energy <= 5) {
            throw new PetStatusException("에너지가 부족해서 선택할 수 없습니다.");
        }
        System.out.println(name + "이(가) 신나게 산책을 합니다!");
        happiness = Math.min(100, happiness + 15);
        energy = Math.max(0, energy - 10);
        cleanness = Math.max(0, cleanness - 5);
    }

    @Override
    public void trainSkill(String skillName) throws PetStatusException {
        if (hunger >= 90) {
            throw new PetStatusException("너무 배고파서 훈련이 불가능합니다.");
        }
        System.out.println(name + "이(가) " + skillName + " 훈련을 하고 있습니다!");
        energy = Math.max(0, energy - 15);
        happiness = Math.min(100, happiness + 5);
    }
}
