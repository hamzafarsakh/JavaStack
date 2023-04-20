

public class TestCafe{
    public static void main(String[] args) {
        int num = 5;
        double[] num1 = {5.2,6.2};
        CafeUtil x = new CafeUtil();
        // String[] m = {"drip coffee", "cappuccino", "latte","mocha"};
        ArrayList<String> menuItems = new ArrayList();
        menuItems.add("drip coffee");
        System.out.println(x.getStreakGoal(num,10));
        System.out.println(x.getOrderTotal(num1));
        System.out.println(x.displayMenu(menuItems));
    }
}

