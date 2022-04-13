import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayi giriniz : ");
        int input = scanner.nextInt();
        int t = 0;
        if (input < 0) {
            System.out.println("girdiğiniz sayi negatif tam sayidir ve negatif sayilarin karekoku alinamaz");
        } else {


            for (int i = 0; i <= input / 3; i++) {
                if (input == i * i) {
                    t = 1;
                    break;
                }
            }
            if (t != 0) {
                System.out.println("tam kare");
            } else System.out.println("tam kare değil ");

        }


    }
}

