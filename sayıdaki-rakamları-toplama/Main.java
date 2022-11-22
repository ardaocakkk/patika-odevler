import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int num1, kalan,sum;
        sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        num1 = input.nextInt();

        while(num1!=0){
            kalan = num1 % 10;
            sum += kalan;
            num1 = num1 /10;

        }
        System.out.println(sum);

    }
}