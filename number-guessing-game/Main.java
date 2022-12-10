import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);
        System.out.println(randomNumber);

        System.out.print("0 ile 100 arasında bir sayı giriniz: ");
        int guess = input.nextInt();
        boolean isGameOn = true;
        int rights = 0;
        while(isGameOn){
            if(guess == randomNumber){
                System.out.println("Tebrikler! Doğru sayıyı tahmin ettiniz. Sayı: "+ randomNumber);
                isGameOn = false;
            }else if(guess <0 || guess>99){
                System.out.print("HATALI GİRİŞ. Lütfen 0 ile 100 arasında bir sayı giriniz:  ");
                guess = input.nextInt();
                if(guess <0 || guess >99){
                    rights++;
                    if(rights==5){
                        System.out.println("Kaybettiniz!");
                        isGameOn = false;
                        break;
                    }
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan canınız: " + (5-rights));
                }
            }
            else{
                rights++;
                System.out.println("Yanlış tahmin! Kalan canınız: " + (5-rights));
                if(guess > randomNumber){
                    System.out.println("Girdiğiniz sayı "+ guess+ ", tahmin edilmesi gereken sayıdan büyük.");
                }else if(guess < randomNumber){
                    System.out.println("Girdiğiniz sayı "+ guess+ ", tahmin edilmesi gereken sayıdan küçük");
                }
                System.out.print("Başka bir sayı deneyiniz: ");
                guess=input.nextInt();
                if(rights==4){
                    System.out.println("Kaybettiniz!");
                    isGameOn = false;
                }

            }
        }


    }
}