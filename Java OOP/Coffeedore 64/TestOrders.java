import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
    Item item1 = new Item("mocha",16.0);
    Item item2 = new Item("latte",26.0);
    Item item3 = new Item("drip coffee",12.0);
    Item item4 = new Item("capuccino",15.0);

    CoffeeKiosk coffeeKiosk1 =new CoffeeKiosk();
    coffeeKiosk1.addMenuItem("mocha",16.0);
    coffeeKiosk1.addMenuItem("latte",26.0);
    coffeeKiosk1.addMenuItem("drip coffee",12.0);
    coffeeKiosk1.addMenuItem("capuccino",15.0);
    coffeeKiosk1.newOrder();

}
}

