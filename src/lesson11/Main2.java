package lesson11;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main2 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("qqq");
        set.add("eee");
        set.add("rrr");
        set.add("uuu");
        set.add("eee");
        set.add("eee");

        System.out.println(set);
    }
}
