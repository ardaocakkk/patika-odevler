public class Main{
    public static void main(String[] args) {
        double sum = 0.0;
        double[] list = {1,2,3,4,5,6};
        double harmonik_ortalama = 0;
        for(double i : list){
            harmonik_ortalama += 1/i;
        }
        System.out.println(harmonik_ortalama);

    }
}