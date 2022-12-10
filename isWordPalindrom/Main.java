import java.util.Scanner;
public class Main {

    static void isPalindromString(String str){
        int[] arr = new int[str.length()];
        for(int i = 0; i <str.length(); i++){
            arr[i] = str.charAt(i);
        }
        int counter1 = 0;
        for(int k = arr.length-1; k > 0; k--){
            if(arr[counter1] == arr[k]){
                counter1++;

            }

            }
        if(counter1 == arr.length-1){
            System.out.println("palindrom");
        }else{
            System.out.println("değil");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Palindrom kelime olup olmadığını test etmek istediğiniz kelimeyi girin: ");
        String kelime = input.nextLine();
        isPalindromString(kelime);
    }
}