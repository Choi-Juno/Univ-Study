public class DeepCopy2 {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int b[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int sourcePos = 3;
        int destPos = 5;
        int len = 4;

        System.arraycopy(a, sourcePos, b, destPos, len);

        System.out.println("a Array: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println();

        System.out.println("b Array: ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");

        System.out.println();

        b[0] = 10;
        System.out.println("a Array: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println();

        System.out.println("b Array: ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");

        System.out.println();
    }
}
