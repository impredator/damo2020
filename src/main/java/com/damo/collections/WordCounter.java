package main.java.com.damo.collections;

import com.sun.tools.corba.se.idl.IncludeGen;

import java.util.HashMap;

public class WordCounter {
    //"{Hi,Helo,Hello,Hi,hi}"
    // Hi:2, Hello: 1, Helo:1, hi: 1

    public static void main(String[] args) {
        Integer[] nums = {10, 8, 25, 32, 68, 68, 10, 68, 68, 2, 2, 32, 68, 68, 1};
        HashMap<?, Integer> counts1 = wordCount(nums);
        System.out.println(counts1);

        String str = "Hi Helo Hello Hi Hi hi";
        String words[] = str.split(" ");
        HashMap<?, Integer> counts2 = wordCount(words);
        System.out.println(counts2);
    }

    private static <T> HashMap<T, Integer> wordCount(T groups[]) {
        HashMap<T, Integer> map = new HashMap<>();
        for(T key : groups) {
            Integer keyValue = map.get(key);
            map.put(key, keyValue != null ? keyValue + 1 : 1);
        }
        return map;
    }
}
