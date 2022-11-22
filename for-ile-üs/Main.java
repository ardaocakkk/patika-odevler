import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int num1, num2, total;
        total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        num1 = input.nextInt();

        System.out.println("Üs olacak sayıyı giriniz: ");
        num2 = input.nextInt();

        for(int i =1; i<=num2; i++){
            total *= num1;
           
        }
        System.out.println(total);

    }
}