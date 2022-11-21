import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yolculuk_tipi,yas,mesafe;
        double fiyat;

        System.out.print("Yalnızca gidiş için 1, Gidiş-Dönüş için 2 giriniz: ");
        yolculuk_tipi = input.nextInt();

        System.out.print("Yaşınızı girin: ");
        yas = input.nextInt();

        System.out.print("Mesafeyi tam sayı olarak girin(KM): ");
        mesafe = input.nextInt();

        fiyat = mesafe * 0.10;

        if(yas <12 && yolculuk_tipi ==1){
            fiyat = fiyat/2; // %50 indirim
            System.out.println("Toplam tutar: "+ fiyat);
        }else if(yas<12 && yolculuk_tipi == 2){
            fiyat = fiyat*0.3; //70 indirim indirim
            System.out.println("Toplam tutar: "+ fiyat);
        }else if(yas >=12 && yas <=24 && yolculuk_tipi == 1) {
            fiyat = fiyat *0.9; //%10 indirim
            System.out.println("Toplam tutar: "+ fiyat);
        }else if(yas >= 12 && yas <=24 &&yolculuk_tipi == 2) {
            fiyat = fiyat * 0.7 ;  //%30 indirim
            System.out.println("Toplam tutar: "+ fiyat);
        }else if(yas>24 && yas<=65 ){
            if(yolculuk_tipi == 1){
                fiyat = fiyat;
                System.out.println("Toplam tutar: "+ fiyat);
            }else if(yolculuk_tipi == 2){
                fiyat = fiyat *0.8; //% yüzde 20 indirim
                System.out.println("Toplam tutar: "+ fiyat);
            }
        }else if(yas >65){
            if(yolculuk_tipi == 1){
                fiyat = fiyat * 0.7; //%30 indirim
                System.out.println("Toplam tutar: "+ fiyat);
            }else if(yolculuk_tipi == 2){
                fiyat = fiyat * 0.5; //%50 indirim
                System.out.println("Toplam tutar: "+ fiyat);
            }
            else{
                System.out.println("Yanlış bir veri girdiniz.");
            }
        }
    }
}