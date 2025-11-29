public class test1 {
    public static void main(String[] args) {
        String[] stringNumbers = { "10", "20", "A30", "40", "50" };
        int[] intArray = new int[4];
        System.err.println("1. Start ===================================================");
        for (int i = 0; i < stringNumbers.length; i++) {
            try {
                intArray[i] = Integer.parseInt(stringNumbers[i]);
                System.out.println("[" + intArray[i] + "] : " + "Success");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Error!! " + e.getMessage() + " :  Index " + i + " out of bounds for length "
                        + intArray.length);
            } catch (NumberFormatException e) {
                System.err.println("Err " + ": " + stringNumbers[i] + " cannot make a number");
            }
        }
        System.err.println("2. End ===================================================");
    }
}
