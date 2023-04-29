import java.util.List;

public class Threads implements Runnable{
    List<Integer> numberList;
    List<Integer> evenNumberList;
    List<Integer> oddNumberList;

    public Threads(List<Integer> numberList, List<Integer> evenNumberList, List<Integer> oddNumberList) {
        this.numberList = numberList;
        this.evenNumberList = evenNumberList;
        this.oddNumberList = oddNumberList;
    }



    @Override
    public void run(){
        for(int i : numberList) {
            synchronized (evenNumberList){
                if(i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName()+" Even number added " +i);
                    evenNumberList.add(i);
                    try{
                        Thread.sleep(1000);
                    }
                    catch(Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            synchronized (oddNumberList) {
                if(i % 2 == 1) {
                    System.out.println(Thread.currentThread().getName()+" Odd number added " + i);
                    oddNumberList.add(i);
                }
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
