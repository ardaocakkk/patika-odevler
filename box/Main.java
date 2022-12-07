public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("A",30,120,100,100);
        Fighter f2 = new Fighter("B",10,100,100,0);

        Match match = new Match(f1,f2,130,95);
        match.run();

    }
}