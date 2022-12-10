import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
        int satir;
        int sutun;
        String[][] tarla;
        String[][] mayinYeri;
        int mayin;
        int tarlaBoyutu;

        Minesweeper(int satir, int sütun) {
            this.satir = satir;
            this.sutun = sütun;
            this.tarla = new String[this.satir][this.sutun];
            this.mayinYeri = new String[this.satir][this.sutun];
            this.mayin = (this.satir * this.sutun) / 4;
            this.tarlaBoyutu = this.satir * this.sutun;
        }

        public void tarlaDoldur() {
            for (int i = 0; i < this.satir; i++) {
                for (int j = 0; j < this.sutun; j++) {
                    tarla[i][j] = "-";
                }
            }
        }

        public void mayinla() {
            System.out.println("Mayınların Konumu");
            tarlaDoldur();
            for (int i = 0; i < this.mayin; i++) {
                Random rand = new Random();
                int rand_int1 = rand.nextInt(this.satir);
                int rand_int2 = rand.nextInt(this.sutun);
                if (tarla[rand_int1][rand_int2] != "*") {
                    tarla[rand_int1][rand_int2] = "*";
                    mayinYeri[rand_int1][rand_int2] = "*";
                }
            }
            goster();
            System.out.println("============================================");
            System.out.println("Göster Kendini!!!");
        }

        public void goster() {
            for (int i = 0; i < this.satir; i++) {
                for (int j = 0; j < this.sutun; j++) {
                    System.out.print(tarla[i][j] + " ");
                }
                System.out.println();
            }
        }

        public void play() {
            Scanner input = new Scanner(System.in);
            int bosAlan = this.tarlaBoyutu - this.mayin;
            while (bosAlan > 0) {
                System.out.print("İşaretlenecek satır değeri: ");
                int seciliSatir = input.nextInt() - 1;
                System.out.print("İşaretlenecek sütun değeri: ");
                int seciliSütun = input.nextInt() - 1;

                if (mayinYeri[seciliSatir][seciliSütun] == "*") {
                    System.out.println("====GAME OVER====");
                    return;
                }
                if (tarla[seciliSatir][seciliSütun] == "-") {
                    tarla[seciliSatir][seciliSütun] = mayinSayar(seciliSatir, seciliSütun);
                }
                goster();
                System.out.println("============================================");
                bosAlan--;
            }
            System.out.println("Tebrikler kazandınız!!!");
        }

        public String mayinSayar(int seciliSatir, int seciliSütun) {
            int mayinSayar = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (seciliSatir - 1 + i >= 0 && seciliSatir - 1 + i < tarla.length) {
                        if (seciliSütun - 1 + j >= 0 && seciliSütun - 1 + j < tarla[i].length) {
                            if (mayinYeri[seciliSatir - 1 + i][seciliSütun - 1 + j] == "*") {
                                mayinSayar++;
                            }
                        }
                    }
                }


            }
            String s = Integer.toString(mayinSayar);
            return s;
        }

        public void run() {

            mayinla();
            tarlaDoldur();
            goster();
            play();


        }
    }