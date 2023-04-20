public class CafeJava{
    public static void main(String[] args){
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";


        double mochaPrice = 25;
        double dripCoffeePrice = 15;
        double lattePrice = 20;
        double cappuccinoPrice = 22;

        String customer1 = "Sam";
        String customer2 = "Jimmy";
        String customer3 = " Noah";

        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;




        System.out.println(generalGreeting + customer1);

        if (isReadyOrder2){
            System.out.println( customer1 + readyMessage);
            System.out.println( displayTotalMessage + dripCoffeePrice);
        }else{
            System.out.println(customer1 + pendingMessage);
        }

        
    }
}



// public class CafeJava {
//     public static void main(String[] args) {
//         // APP VARIABLES
//         // Lines of text that will appear in the app. 
//         String generalGreeting = "Welcome to Cafe Java, ";
//         String pendingMessage = ", your order will be ready shortly";
//         String readyMessage = ", your order is ready";
//         String displayTotalMessage = "Your total is $";
        
//         // Menu variables (add yours below)
//         double mochaPrice = 3.5;
    
//         // Customer name variables (add yours below)
//         String customer1 = "Cindhuri";
    
//         // Order completions (add yours below)
//         boolean isReadyOrder1 = false;
    
//         // APP INTERACTION SIMULATION (Add your code for the challenges below)
//         // Example:
//         System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
//     	// ** Your customer interaction print statements will go here ** //
//     }
// }
