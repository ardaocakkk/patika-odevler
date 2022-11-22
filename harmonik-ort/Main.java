import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        double number1;
        double total,asd;
        total = 0.0;
        asd = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        number1 = input.nextInt();

        for(int i = 1; i<=number1; i++){
            total += (1.0/i);
            System.out.println(total);
        }

    }
}