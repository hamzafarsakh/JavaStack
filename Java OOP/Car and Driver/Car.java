public class Car{
    public int gas = 10;
    // public void getGas(){
    //     System.out.println("your gas level id: " + gas);
    // }
    public void setGas(int gas){
        if(gas <1){
            System.out.println("Game Over (:");
        }else{
            this.gas = gas;
        }
    }
    public int getGas(){
        return this.gas ;
    }
    public void printStatus(){
        System.out.println("your gas level is: " + this.gas);
    }

}