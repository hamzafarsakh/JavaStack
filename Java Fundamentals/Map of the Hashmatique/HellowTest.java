
import java.util.*;
import java.util.HashMap;
import java.util.Set;
public class HellowTest{
    public static void main(String[] args){
        Hellow x = new Hellow();

        x.trackList.put("aaaaa","1111111");
        x.trackList.put("bbbbbbbb","2222222");
        x.trackList.put("cccccc","333333333");
        x.trackList.put("dddddd","4444444444");
        System.out.println(x.trackList.get("bbbbbbbb"));

        Set<String> keys = x.trackList.keySet();
        for(String key : keys){
            System.out.println(key+": "+x.trackList.get(key));
        }
    }
}