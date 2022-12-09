import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {


        int[] list = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10};
        int startIndex = 0;
        int[] duplicate = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j) {
                    if (list[i] % 2 == 0 && list[j] % 2 == 0) {
                        if (!isFind(duplicate, list[i])) {
                            duplicate[startIndex++] = list[i];
                        }
                    }
                }


            }
        }
        System.out.println(Arrays.toString(duplicate));
        for(int value : duplicate){
            if(value !=0){
                System.out.print(value+" ");
            }
        }
    }
}