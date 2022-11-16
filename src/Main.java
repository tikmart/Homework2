import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // divided by 9
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int num = sc.nextInt();

        int result = num % 9;

        if (result == 0) {
            System.out.println("Divided without remainder");
        } else {
            System.out.print("The remainder is: " + result);
        }

    }
}