import java.util.ArrayList;


public class CoffeeKiosk{
    ArrayList<Item> menu;
    ArrayList<Order> orders;

    public CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }
    public void addMenuItem(String name, double price){
        Item item = new Item(name, price);
        item.index += 1;
        this.menu.add(item);
    }
    public void displayMenu(){
        for(int i = 0; i < menu.size(); i++){
            System.out.println(i + " " + menu.get(i).getName() +" -- $"+ menu.get(i).getPrice());
        }
    }


    public void newOrder() {
    
        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        Order order1 = new Order(name);
        this.displayMenu();

        
        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            System.out.println("Please enter a menu item index or q to quit:");
        String itemNumbe = System.console().readLine();
            int itemIndex = Integer.parseInt(itemNumber);
            
            order1.addItem(this.menu.get(itemIndex));
        }
        order1.display();
        // After you have collected their order, print the order details 
        // as the example below. You may use the order's display method.
    
}

}