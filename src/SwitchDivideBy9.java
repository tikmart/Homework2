import java.util.Scanner;

public class SwitchDivideBy9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input one of the mentioned numbers:\n 5645 \n 6724 \n 4300 \n 525 \n 7777");
        int num = sc.nextInt();
        int result = 0;

        switch (num){
            case 5645:
                result = num % 9;
                break;
            case 6724:
                result = num % 9;
                break;
            case 4300:
                result = num % 9;
                break;
            case 525:
                result = num % 9;
                break;
            case 7777:
                result = num % 9;
                break;
        }

        if (result == 0) {
            System.out.println("Divided by 9");
        } else {
            System.out.println("The remainder is " + result);
        }
    }
}
