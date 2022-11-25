import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1;
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        num1 = input.nextInt();

        for(int i=1; i<=num1; i++){
            if(num1 % i == 0){
                total += i;

            }
        }
        if(total-num1 == num1){
            System.out.println(num1+ " Mükemmel sayıdır.");
        }else{
            System.out.println(num1+ " Mükemmel sayı değildir.");
        }



    }
}