import java.io.IOException;
import java.util.Scanner;

public class GameManager {
    private Pet currentPet;
    private Scanner scanner = new Scanner(System.in);
    private boolean isRunning = true;

    public void start() {
        while (isRunning) {
            showMainMenu();
            int choice = readInt();
            switch (choice) {
                case 1 -> createNewPet();
                case 2 -> loadPet();
                case 0 -> {
                    System.out.println("게임을 종료합니다.");
                    isRunning = false;
                }
                default -> System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }
    }

    private void showMainMenu() {
        System.out.println("=== AI 다마고치 ===");
        System.out.println("1. 새 펫 만들기");
        System.out.println("2. 저장된 펫 불러오기");
        System.out.println("0. 종료");
        System.out.print("선택: ");
    }

    private void createNewPet() {
        System.out.print("펫 이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.println("펫 타입을 선택하세요");
        System.out.println("1. 강아지");
        System.out.println("2. 고양이");
        System.out.println("3. 용");
        System.out.print("선택: ");
        int typeChoice = readInt();

        switch (typeChoice) {
            case 1 -> currentPet = new Dog(name);
            case 2 -> currentPet = new Cat(name);
            case 3 -> currentPet = new Dragon(name);
            default -> {
                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                return;
            }
        }
        gameLoop();
    }

    private void loadPet() {
        try {
            currentPet = DataManager.load("pet_save.csv");
            System.out.println("펫을 불러왔습니다!");
            gameLoop();
        } catch (IOException e) {
            System.out.println("펫 불러오기 실패: " + e.getMessage());
        }
    }

    private void gameLoop() {
        boolean inGame = true;
        while (inGame && currentPet != null) {
            System.out.println("-------------");
            System.out.println(currentPet.getStatusString());
            System.out.println("1. 밥 주기");
            System.out.println("2. 재우기");
            System.out.println("3. 씻기기");
            System.out.println("4. 특수 행동");
            System.out.println("5. 훈련하기 (지원하는 펫만)");
            System.out.println("6. 하루 보내기(시간 경과)");
            System.out.println("7. 저장하기");
            System.out.println("0. 메인 메뉴로");
            System.out.print("선택: ");

            int choice = readInt();

            try {
                switch (choice) {
                    case 1 -> currentPet.feed();
                    case 2 -> currentPet.sleep();
                    case 3 -> currentPet.wash();
                    case 4 -> currentPet.specialAction();
                    case 5 -> {
                        if (currentPet instanceof Trainable t) {
                            System.out.print("훈련 스킬 이름: ");
                            String skill = scanner.nextLine();
                            t.trainSkill(skill);
                        } else {
                            System.out.println("훈련 기능을 지원하지 않는 펫입니다.");
                        }
                    }
                    case 6 -> currentPet.tick();
                    case 7 -> {
                        try {
                            DataManager.save(currentPet, "pet_save.csv");
                            System.out.println("펫 저장 완료!");
                        } catch (IOException e) {
                            System.out.println("펫 저장 실패: " + e.getMessage());
                        }
                    }
                    case 0 -> {
                        System.out.println("메인 메뉴로 돌아갑니다.");
                        inGame = false;
                    }
                    default -> System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                }
            } catch (PetStatusException e) {
                System.out.println("행동 불가: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("오류 발생: " + e.getMessage());
            }

            if (!currentPet.isAlive()) {
                System.out.println("펫이 죽었습니다. 게임오버 ㅜㅜ");
                inGame = false;
            }
        }
    }

    private int readInt() {
        while (true) {
            try {
                int value = scanner.nextInt();
                return value;
            } catch (NumberFormatException e) {
                System.out.print("숫자를 입력하세요: ");
            }
        }
    }
}
