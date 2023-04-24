import java.util.*;
import java.util.Random;
    




public class PuzzleJava{

    Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < 20; i++){
            int x = randMachine.nextInt(20) + 1;
            arr.add(x);
        }
        return arr;}
    public int getTenRolls(int z){
            int x = randMachine.nextInt(z) ;
        return x;
    }
    public String getRandomLetter(){

        String[] arr = {"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
        int x = randMachine.nextInt(26);
        String cc = arr[x];
        return cc ;
    }
    public String generatePassword(int num){
        ArrayList<String> arr = new ArrayList<String>();
        PuzzleJava x = new PuzzleJava();
        for(int i=0; i<num+1; i++){
            arr.add(x.getRandomLetter());
        }
        String xxx = "";
        for(int j = 0; j <arr.size()-1; j++){
            xxx += arr.get(j);
        }
        return xxx;
    }
    public ArrayList<String> getNewPasswordSet(int num){
        ArrayList<String> arr = new ArrayList<String>();
        PuzzleJava x = new PuzzleJava();
        for(int i =0; i < num; i++){
            arr.add(x.generatePassword(8));
        }
        return arr;
    }
}

    
