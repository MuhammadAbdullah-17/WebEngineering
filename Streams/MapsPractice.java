import java.util.*;

public class MapsPractice {
     public static void main(String[] args) {
        HashMap<String, String> c = new HashMap<String, String>();
        c.put("Pakistan","Islamabad");
        c.put("India","Delhi");
        c.put("Bangladesh","Dhaka");
        c.put("Australia","Camberra");
        for(String i : c.keySet())
        System.out.println(i + "'s Capital: "+  c.get(i));
        }

}
