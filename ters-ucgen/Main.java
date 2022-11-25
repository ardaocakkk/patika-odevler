import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int basamak;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        basamak = input.nextInt();

        for(int a=basamak; a>=0; a--){
            for(int j = 1; j<=(a-j); j++){
                System.out.print(" ");
            }
            for(int index=1; index<=(2*a-1); index++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}