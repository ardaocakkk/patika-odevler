import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1,number2,minor;
        int counter = 1;
        int ebob =1;
        System.out.print("İlk sayıyı giriniz: ");
        number1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        number2 = input.nextInt();

        minor = Math.min(number1, number2);
        while(counter<=minor){
            if(number1 % counter == 0 && number2 % counter == 0){
                System.out.println(counter);
                ebob = counter;
            }

            counter++;
        }
        System.out.println(number1+" "+ number2 +" EBOB'u :"+ ebob);
        int ekok = (number1*number2)/ebob;
        System.out.println(number1+" "+ number2 +" EKOK'u :"+ ekok);

    }
}