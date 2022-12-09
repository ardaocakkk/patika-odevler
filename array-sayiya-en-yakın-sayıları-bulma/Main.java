import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        int[] list ={15,12,788,1,-1,-778,2,0};
        int[] list2 = new int[list.length+1];
        list2[0] = sayi;
        for(int i = 0; i<list.length; i++){
            list2[i+1] = list[i];
        }

        Arrays.sort(list2);
        int index = Arrays.binarySearch(list2,sayi);

        if(index == 0){
            System.out.println("Girdiğiniz sayı array'in en küçük sayısı.");
        }else if(index != 0){
            System.out.println("Girilen sayıdan küçük en yakın sayı: "+ list2[index-1]);
        }
        if(index == list2.length-1){
            System.out.println("Girdiğiniz sayı array'in en büyük  sayısı.");
        }else if(index != list2.length-1){
            System.out.println("Girilen sayıdan büyük  en yakın sayı"+ list2[index+1]);
        }

    }
}