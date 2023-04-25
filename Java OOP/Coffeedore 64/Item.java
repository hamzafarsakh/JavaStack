public class Item{
    public static int index = -1;
    private String name;
    private double price;
    
    public Item(){
    }
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }





}