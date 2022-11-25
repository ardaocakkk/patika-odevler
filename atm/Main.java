import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        double cekme,yatirma;
        System.out.print("Kullanıcı adınızı girin: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi girin: ");
        password = input.nextLine();
        while(right > 0) {
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçin: ");
                    System.out.println("""
                            1-Para Yatırma
                            2-Para Çekme
                            3-Bakiye Sorgulama
                            4-Çıkış Yap
                            """
                    );
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Bakiyeniz: "+ balance);
                            System.out.print("Ne kadar yatıracaksınız: ");
                            yatirma = input.nextDouble();
                            balance += yatirma;
                            System.out.println("Güncel bakiyeniz: "+ balance);
                            break;
                        case 2:
                            System.out.print("Bakiyeniz: "+balance);
                            System.out.print("Ne kadar çekeceksiniz: ");
                            cekme = input.nextDouble();
                            if(cekme>balance){
                                System.out.println("Yetersiz Bakiye");
                            }else {
                                balance -= cekme;
                            }
                            break;
                        case 3:
                            System.out.print("Bakiyeniz: "+ balance);
                            break;
                    }
                }while(select != 4);
                System.out.println("Bay bay");
                break;
            } else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı ya da Şifre. Lütfen bir daha deneyiniz: ");
                if(right==0){
                    System.out.println("Hesabınınız bloke edildi. Lütfen bankanızla iletişime geçin.");
                }else {
                    System.out.println("Kalan hakkınız: "+right);
                }
            }
        }


    }
}