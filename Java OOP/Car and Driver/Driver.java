public class Driver extends Car{
    // , , 
    public void drive(){
        gas = getGas();
        gas = gas -1;
        setGas(gas);
    }
    public void boost(){
        gas = getGas();
        if(gas <3){
            System.out.println("pleas refuel");
        }else{
            gas = gas -3;
            setGas(gas);
        }
    }
    public void refuel(){
        gas = getGas();
        if(gas >8){
            System.out.println("you cant add more gass");
            gas = 10;
            setGas(gas);
        }else{
            gas = gas +2;
            setGas(gas);
        }
    }


} 