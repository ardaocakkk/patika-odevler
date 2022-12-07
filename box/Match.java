

public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;
    int initial_value = 50;

    Match(Fighter f1, Fighter f2, int maxWeight, int minWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void run(){
        if(isChecked()){
            while(this.f1.hp >0 && this.f2.hp >0){
                System.out.println("---- YENİ ROUND----");

                if(whoStart()){
                    System.out.println(this.f1.name + " basladi");
                    this.f2.hp -= f1.hit(f2);
                }else{
                    System.out.println(this.f2.name + " basladi");
                    this.f1.hp -= f2.hit(f1);
                }

                if(this.f1.isDodge()){
                    System.out.println(this.f2.name+ " saldırıdan kaçtı");
                }else{
                    f2.hp -= f1.hit(f2);
                }
                if(f2.hp <0){
                    f2.hp = 0;
                }
                System.out.println(this.f2.name +" "+f2.hp);

                if(this.f2.isDodge()){
                    System.out.println(this.f1.name +" saldırıdan kaçtı");
                }else{
                    f1.hp -= f2.hit(f1);
                }
                if(f1.hp <0){
                    f1.hp = 0;
                }
                System.out.println(this.f1.name+" "+this.f1.hp);

            }
        }else{
            System.out.println("Sporcuların sikleti uymuyor.");
        }
        isWin();
    }



    boolean isChecked(){
        return (f1.weight <= maxWeight && f1.weight >= minWeight) && (f2.weight <= maxWeight && f2.weight >=minWeight);
    }

    void isWin(){
        if(this.f1.hp == 0){
            System.out.println(this.f2.name + " Kazandı");
        }else if(this.f2.hp == 0){
            System.out.println(this.f1.name + " Kazandı");
        }
    }

    boolean whoStart(){
        double chance = Math.random()*100;
        return chance <= initial_value;
    }

}
