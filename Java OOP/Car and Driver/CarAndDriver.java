public class CarAndDriver{
    public static void main(String[] args){
        Driver drive1 = new Driver();
        drive1.boost();
        drive1.boost();
        drive1.drive();
        drive1.drive();
        drive1.drive();
        drive1.boost();
        drive1.refuel();
        drive1.refuel();
        drive1.refuel();
        drive1.refuel();
        drive1.refuel();

        drive1.printStatus();
    }
}
