import java.util.Scanner;

public class Berhitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int B = scanner.nextInt();
        int hasil = 0;

        switch (operator){
            case '+':
                hasil = A + B;
                break;
            case '-':
                hasil = A - B;
                break;
            case '*':
                hasil = A * B;
                break;
            case '/':
                hasil = A / B;
                break;
            case '%':
                hasil = A % B;
                break;
            default:
                System.out.println("Operator tidak valid");
                return;
        }
        System.out.println(hasil);
        scanner.close();

    }


}
