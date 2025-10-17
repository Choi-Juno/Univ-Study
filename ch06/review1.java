class review1 {
    public static void main(String[] args) {
        int iVal1 = 3;
        int iVal2 = 7;
        int iVal3 = 9;
        int iVal4 = 5;

        int result = iVal1++ * ++iVal2 + ++iVal1 / iVal4 + iVal3 % 3;
        System.out.println(result);
    }
}