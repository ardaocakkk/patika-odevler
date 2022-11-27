import java.util.Scanner;

public class Main{

    static int pow(int a, int b){
        if(b==0) return 1;
        return a * pow(a,b-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int taban = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = input.nextInt();
        System.out.println("Sonuc: "+ pow(taban,us));
    }


}