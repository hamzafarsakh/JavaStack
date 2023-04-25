import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
    Item item1 = new Item("mocha",16.0);
    Item item2 = new Item("latte",26.0);
    Item item3 = new Item("drip coffee",12.0);
    Item item4 = new Item("capuccino",15.0);
    
        // Order variables -- order1, order2 etc.
    Order order1 = new Order("Noah");
    Order order2 = new Order("Cindhuri");
    Order order3 = new Order("Jimmy");
    Order order4 = new Order("Sam");

    order2.items.add(item2);
    order2.total += item2.price;
    
    order2.items.add(item1);
    order2.total += item1.price;

    order3.items.add(item4);
    order3.total += item4.price;

    order4.items.add(item2);
    order4.total += item2.price;

    order2.ready = true ;

    order4.items.add(item2);
    order4.total += item2.price;
    order4.items.add(item2);
    order4.total += item2.price;

    order3.ready = true;

    System.out.println(order2.items);
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.println("Name: " + order1.name+ "\n");
        System.out.printf("Total: "+ order1.total+ "\n");
        System.out.printf("Ready: "+ order1.ready + "\n");
        // System.out.printf("Ready: "+ order1.printTotal() + "\n");
    }
}
