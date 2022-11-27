import java.util.Scanner;

public class Main{

    static int sum(int a , int b){
        int result = a+b;
        System.out.println(a + " + "+ b +" = "+ result);
        return result;
    }

    static int subst(int a, int b){
        double result = a-b;
        System.out.println(a + " - " + b + " = " + result);
        return (int) result;
    }

    static int multp(int a, int b){
        double result = a*b;
        System.out.println(a + " x " + b + " = " + result);
        return (int) result;
    }

    static int divide(int a, int b){
        double result = a/b;
        System.out.println(a + " / " + b + " = " + result);
        return (int) result;
    }

    static int power(int a, int b){
        int result = 1;
        for(int i = 1; i<=b; i++){
            result *= a;
        }
        System.out.println(a + "'nın "+ b + "üssü" + " = " + result);
        return result;
    }

    static int mod(int a,int b){
        int result = a%b;
        System.out.println("Mod: " + result);
        return result;

    }

    static void cm(int a, int b){
        int cevre = 2*a + 2*b;
        int alan = a*b;

        System.out.println("Cevre = "+ cevre);
        System.out.println("Alan = " + alan);

    }









    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        int a,b;
        String menu = "1- Toplama İşlemi\n"
                +     "2- Çıkarma işlemi\n"
                +     "3- Çarpma işlemi\n"
                +     "4- Bölme işlemi\n"
                +     "5- Üs Alma İşlemi\n"
                +     "6-Mod alma\n"
                +     "7- Dikdörtgen çevre ve alan hesabı\n"
                +     "0- Çıkış yap";

        boolean isTrue = true;
        while(isTrue){
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz: ");
            select = input.nextInt();
            System.out.print("1.sayıyı seçiniz: ");
            a = input.nextInt();
            System.out.print("2. sayıyı seçiniz: ");
            b = input.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    subst(a,b);
                    break;
                case 3:
                    multp(a,b);
                    break;
                case 4:
                    divide(a,b);
                    break;

                case 5:
                    power(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    cm(a,b);

                case 0:
                    isTrue = false;
                default:
                    System.out.println("Lütfen geçerli bir işlem seçiniz");
            }
    }

    }

}