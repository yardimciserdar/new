import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        System.out.print("Bir sayi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int maxNum = scanner.nextInt();

        for (int i = 0; i <= maxNum ; i++) {
            if (i%2==0){
                System.out.print(i + " ");
            }

        }


    }
}
