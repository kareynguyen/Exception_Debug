import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter side 1: ");
            int side1 = sc.nextInt();
            System.out.println("Enter side 2: ");
            int side2 = sc.nextInt();
            System.out.println("Enter side 3: ");
            int side3 = sc.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Nhap so thoi");
        }


    }
}
