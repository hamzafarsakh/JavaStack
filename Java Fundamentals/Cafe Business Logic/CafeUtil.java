import java.util.*;


public class CafeUtil{
    int sum = 0;
    int getStreakGoal(int num){
        for(int i = 1; i < 11; i++){
            sum += i;
        }
        sum += num;
        return sum;
    }
    int getStreakGoal(int num, int numWeeks){
        for(int i = 1; i <= numWeeks; i++){
            sum += i;
        }
        sum += num;
        return sum;
    }

    double getOrderTotal(double[] prices){
        double sum = 0;
        for( double i : prices){
            sum += i;
        }
        return sum;
    }
    // ArrayList menuItems = new ArrayList();
    void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            String name = menuItems.get(0);
            System.out.println(name);
        }
         // to access an element in an ArrayList using an index
    }


}

