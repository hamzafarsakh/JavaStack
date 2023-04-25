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
    // public double printTotal(){
        // if(items.size() > 0){
        // for(int i =0; i < items.size(); i++){
        //     total += items.get(i).price;
        // }

        // }
        // else{
        //     return 0.0;
        // }
        // return total;
    // }
}

