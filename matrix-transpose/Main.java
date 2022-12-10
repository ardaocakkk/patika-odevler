public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
        };
        int[][] new_arr = new int[arr[0].length][arr.length];
        for(int i = 0; i < new_arr.length; i++){
            for(int j = 0; j<new_arr[i].length; j++){
                new_arr[i][j] = arr[j][i];
                System.out.print(new_arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}