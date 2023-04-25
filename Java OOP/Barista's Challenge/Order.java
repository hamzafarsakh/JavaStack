import java.util.ArrayList;

public class Order{
    private String name;
    public double total;
    private boolean ready;
    private ArrayList<Item> items;
    

    
    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    public Order(String name,ArrayList<Item> items){
        this.name = name;
        this.items = items;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getTotal(){
        return this.total;
    }
    // private void setTotal(){

    // }

    public boolean getStatus(){
        return this.ready;
    }
    public void setStatus(boolean ready){
        this.ready = ready;
    }

    
    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if (this.ready == true){
            return "Your order is ready.";
        }else{
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    
    public double getOrderTotal(){
        for(int i = 0; i < items.size(); i++){
            total += items.get(i).getPrice();
        }
        return total;
    }

    public void display(){
        
    this.getOrderTotal();
    System.out.println("Customer Name: " + this.name);
    for(int i =0; i < items.size(); i++ ){
        System.out.println(items.get(i).getName() + " -$ "+ items.get(i).getPrice());
        // System.out.println(items.get(i).getPrice());
    }
    System.out.println("Total: $" + this.total);

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

