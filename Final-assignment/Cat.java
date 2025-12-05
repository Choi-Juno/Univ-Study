public class Cat extends Pet implements Trainable {
    public Cat(String name) {
        super(name, "Cat");
    }

    @Override
    public void specialAction() throws PetStatusException {
        if (energy <= 0) {
            throw new PetStatusException("너무 피곤해서 놀 힘이 없습니다.");
        }
        System.out.println(name + "이(가) 창밖을 보며 혼자 즐겁게 놉니다.");
        happiness = Math.min(100, happiness + 10);
        energy = Math.max(0, energy - 5);
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
