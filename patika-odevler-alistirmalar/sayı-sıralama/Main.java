import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1,num2,num3;
        Scanner input = new Scanner(System.in);

        System.out.print("1.sayıyı giriniz: ");
        num1 = input.nextDouble();

        System.out.print("2.sayıyı giriniz: ");
        num2 = input.nextDouble();

        System.out.print("3.sayıyı giriniz: ");
        num3 = input.nextDouble();

        if(num1 > num2 && num1>num3){
            if (num2 > num3){
                System.out.println(num1 + " > "+ num2 + " " + num3 );
            }else if(num2<num3){
                System.out.println(num1 + " > "+ num3 + " " + num1 );
            }
        }else if(num1<num2 && num1<num3){
            if(num2 > num3){
                System.out.println(num2 + " > "+ num3 + " " + num1 );
            }else if(num3 > num2){
                System.out.println(num3 + " > "+ num2 + " " + num1 );
            }
        }
    }
}