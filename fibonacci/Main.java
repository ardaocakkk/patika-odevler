import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int num1 = 0,num2 = 1,set;
        int counter = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç Elemanlı olsun:  ");
        set = input.nextInt();
        while(counter <set){
            System.out.println(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter++;


        }

    }
}