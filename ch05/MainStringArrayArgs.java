public class MainStringArrayArgs {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("프로그램 입력값이 부족");
            System.exit(0);
        }

        String strNum = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
