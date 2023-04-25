import java.util.ArrayList;

public class Order{
    String name;
    double total;
    boolean ready;
    ArrayList<Item> items = new ArrayList<Item>();

    public Order(){
    }
    public Order(String name){
        this.name = name;
    }
    public Order(String name,ArrayList<Item> items){
        this.name = name;
        this.items = items;
    }
}

