public class Fighter {
    String name;
    int damage;
    int hp;
    int weight;
    int dodge;


    Fighter(String name, int damage, int hp, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.hp = hp;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter foe){
        System.out.println(this.name + " "+ foe.name + "'ye "+ this.damage + "hasar vurdu");
        return this.damage;
    }

    boolean isDodge(){
        double chance = Math.random()*100;
        return chance < this.dodge;
    }




}
