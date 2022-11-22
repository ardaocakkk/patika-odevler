import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int n1,n2,diff, n1_mult, n2_mult, solution;
        Scanner input = new Scanner(System.in);
        System.out.println("Kombinasyon hesaplama");
        System.out.print("Kombinasyonunu hesaplamak istediğiniz sayıyı giriniz: (3'ün 2'lisi ise 3 2 şeklinde)");
        n1 = input.nextInt();
        n2 = input.nextInt();

        diff = n1-n2;
        n1_mult = 1;
        n2_mult = 1;

        for(n1=n1; n1>diff; n1--){
            n1_mult *= n1;
        }
        for(n2=n2; n2>0; n2--){
            n2_mult *= n2;
        }
        solution = n1_mult/n2_mult;
        System.out.println(n1_mult + " "+ n2_mult);
        System.out.println(solution);
    }
}