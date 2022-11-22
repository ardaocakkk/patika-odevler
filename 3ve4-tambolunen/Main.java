import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int max_sayi;
        double sum,counter,average;
        sum = 0;
        counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        max_sayi = input.nextInt();

        for (int i = 0; i<=max_sayi; i++){
            if(i%12==0){
                sum+=i;
                counter++;
            }
        }
        average = sum/counter;
        System.out.println(average);

    }
}