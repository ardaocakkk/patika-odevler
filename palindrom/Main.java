public class Main{

    static boolean isPalindrom(int x){
        int reverseNumber = 0, lastNumber;
        int temp = x;
        while(temp!=0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;;
            temp /= 10;
        }
        if (x == reverseNumber)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrom(181));
    }
}