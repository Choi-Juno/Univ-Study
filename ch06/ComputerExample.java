public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer();
        int result1 = myCom.sum(1, 2, 3);
        System.out.println("result1: " + result1);

        // Sum 메소드 호출 시 매개값 1,2,3,4,5를 제공하고
        // 합산 결과를 리턴받아 result2 변수에 대입
        int result2 = myCom.sum(1, 2, 3, 4, 5);
        System.out.println("result2: " + result2);

        int[] values = { 1, 2, 3, 4, 5 };
        int result3 = myCom.sum(values); // sum({1,2,3,4,5})
        System.out.println("result3: " + result3);

        int result4 = myCom.sum(new int[] { 1, 2, 3, 4, 5 }); // sum({1,2,3,4,5})
        System.out.println("result4: " + result4);
    }
}
