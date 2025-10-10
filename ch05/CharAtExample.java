public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9408151234567";
        char sex = ssn.charAt(6);

        switch (sex) {
            case '1', '3' -> System.out.println("Male");
            case '2', '4' -> System.out.println("Female");
            default -> System.out.println("Unknown");
        }

        String str = "CharAtExample_test1";
        String s1 = str.substring(12);
        System.out.println("s1: " + s1);
        String s2 = str.substring(12, 15);
        System.out.println("s2: " + s2);

        String str2 = "CharAtExample_test2";
        int a1 = str2.indexOf("E");
        System.out.println("a1: " + a1);

    }
}
