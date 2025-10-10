public class DeepCopy1 {
    public static void main(String[] args) {
        int a[] = { 1, 8, 3 };
        int b[] = a.clone();

        System.out.println("a Array: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println();

        System.out.println("b Array: ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");

        System.out.println("\n--------------------------------");

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
