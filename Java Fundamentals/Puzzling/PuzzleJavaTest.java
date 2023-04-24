import java.util.*;

public class PuzzleJavaTest{
    public static void main(String[] args){
        PuzzleJava v = new PuzzleJava();
        System.out.println(v);
        System.out.println(v.getTenRolls());
        System.out.println(v.getRandomLetter());
        // System.out.println(randMachine.getTenRolls(25));
        System.out.println(v.generatePassword(1));
        System.out.println(v.getNewPasswordSet(10));
    }
}