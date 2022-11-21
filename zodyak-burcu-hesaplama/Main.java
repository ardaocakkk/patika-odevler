import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        System.out.print("Buraya doğum yılını giriniz: ");
        yil = input.nextInt();

        if(yil%12 == 0){
            System.out.println("Çin zodyağı burcunuz : Maymun");
        } else if (yil%12 == 1) {
            System.out.print("Çin zodyağı burcunuz : Horoz");
        } else if (yil%12 == 2) {
            System.out.println("Çin zodyağı burcunuz : Köpek");
        } else if (yil%12 == 3) {
            System.out.println("Çin zodyağı burcunuz : Domuz");
        } else if (yil%12 == 4) {
            System.out.println("Çin zodyağı burcunuz : fare");
        } else if (yil%12 == 5) {
            System.out.println("Çin zodyağı burcunuz : öküz");
        } else if (yil%12 == 6) {
            System.out.println("Çin zodyağı burcunuz : kaplan");
        } else if (yil%12 == 7) {
            System.out.println("Çin zodyağı burcunuz : tavşan");
        } else if (yil%12==8) {
            System.out.println("Çin zodyağı burcunuz : ejderha");
        } else if (yil%12==9) {
            System.out.println("Çin zodyağı burcunuz : yılan");
        } else if (yil%12==10) {
            System.out.println("Çin zodyağı burcunuz : at");
        }else if(yil%12==11){
            System.out.println("Çin zodyağı burcunuz : koyun");
        }

    }
}