import java.util.Scanner;

public class Main{

     static void orderedArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                int tmp = 0;
                if(arr[i]>arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
         for(int value : arr){
             System.out.print(value + " ");
         }

     }


    public static void main(String[] args) {
        int eleman_sayisi;
        int eleman;
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz: ");
        eleman_sayisi = input.nextInt();
        int[] dizi = new int[eleman_sayisi];

        for(int i = 0; i<dizi.length; i++){
            System.out.println("Elemanı giriniz: ");
            eleman = input.nextInt();
            dizi[i] = eleman;
        }

        orderedArray(dizi);



    }
}