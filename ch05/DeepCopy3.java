import java.util.Arrays;

public class DeepCopy3 {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3 };
        int[] b = Arrays.copyOf(a, a.length);

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
