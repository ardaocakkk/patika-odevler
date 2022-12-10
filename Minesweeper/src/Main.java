import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===MİNE SWEEPER===");
        System.out.print("Satır boyutunu giriniz: ");
        int satir =input.nextInt();
        System.out.print("Sütun boyutunu giriniz: ");
        int sutun = input.nextInt();

        Minesweeper ms = new Minesweeper(satir,sutun);
        ms.run();
    }
}