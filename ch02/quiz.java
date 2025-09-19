package JavaProgramming.ch02;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x값 입력: ");
        int x = sc.nextInt();

        System.out.print("y값 입력: ");
        int y = sc.nextInt();

        System.out.println("x : " + x + ", y : " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("x : " + x + ", y : " + y);

        String str = "5";
        byte var1 = Byte.parseByte(str);
        int var2 = Byte.parseByte(str);
        float var4 = Float.parseFloat(str);
        float var3 = Float.parseFloat(str);
    }
}
