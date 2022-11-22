import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int num1,total;
        total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        num1 = input.nextInt();
        while(num1 %2 != 1){
            if(num1 %4 == 0){
                total += num1;
            System.out.print("Bir sayı giriniz:");
            num1 = input.nextInt();
            }
            else {
                total = total;
                System.out.print("Bir sayı giriniz:");
                num1 = input.nextInt();
            }
        }
        System.out.println(total);
    }
}