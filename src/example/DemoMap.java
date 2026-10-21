package example;

import java.sql.SQLOutput;
import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(7, "dhoni");
        map.put(10,"SRT");
        map.put(6,"tripathi");
        boolean has=map.containsKey(6);
        System.out.println(map + "  " + has);

        int[] a = new int[32];
        System.out.println(Arrays.toString(a));
    }


}
