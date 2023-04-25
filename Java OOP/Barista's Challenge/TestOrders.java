import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
    Item item1 = new Item("mocha",16.0);
    Item item2 = new Item("latte",26.0);
    Item item3 = new Item("drip coffee",12.0);
    Item item4 = new Item("capuccino",15.0);


    Order order1 = new Order();
    Order order2 = new Order();

    Order order3 = new Order("Jimmy");
    Order order4 = new Order("Sam");
    Order order5 = new Order("Cindhuri");

// Add at least 2 items to each of the orders using the addItem method you wrote, for example, to add item1 to order3 you would need to call the addItem method from the order3 instance like so: order3.addItem(item1);
    order1.addItem(item1);
    order1.addItem(item2);

    order2.addItem(item4);
    order2.addItem(item2);

    order3.addItem(item1);
    order3.addItem(item3);

    order4.addItem(item2);
    order4.addItem(item4);
    order4.addItem(item1);

    order5.addItem(item3);
    order5.addItem(item1);
    order5.addItem(item2);
    order5.addItem(item1);

// Implement the getStatusMessage method within the Order class
    order1.setStatus(true);

    order2.setStatus(false);

    order3.setStatus(true);

    order4.setStatus(true);

    order5.setStatus(false);

    System.out.println(order1.getStatusMessage());
    System.out.println(order2.getStatusMessage());
    System.out.println(order3.getStatusMessage());
    System.out.println(order4.getStatusMessage());
    System.out.println(order5.getStatusMessage());


// Test the total by printing the return value like so:
    System.out.println("your total is: $"+order1.getOrderTotal());

// Finally, call the display method on all of your orders
    order3.display();

}
}

