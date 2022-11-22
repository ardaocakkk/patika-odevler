import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Sınırlayıcı sayısını giriniz: ");
        n = input.nextInt();


        for(int j = 1, k =1; j<n || k<n; j*=4, k*=5 ){
            System.out.println(j + " "+ k);
        }
    }
}