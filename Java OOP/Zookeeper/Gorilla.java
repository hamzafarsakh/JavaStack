public class Gorilla extends Mammal{
    public Gorilla(){
        this.energyLevel = 100;
    }
    public void throwSomething(){
        System.out.println("take this, you dead");
        this.energyLevel -= 5;

    }
    public void eatBananas(){
        System.out.println("Banana,Banana,Banana!!!!");
        this.energyLevel +=10;


    }
    public void climb(){
        System.out.println("waaaaaaaaaaaaaa");
        this.energyLevel -=10;
    }
}