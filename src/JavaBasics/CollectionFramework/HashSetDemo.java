package src.JavaBasics.CollectionFramework;

import java.util.HashSet;

/**
 * Created by jaydatta on 8/24/16.
 */
public class HashSetDemo extends printingJob {

    public static void main(String[] args) {
        // You can only add at sequentially in a hashset, cannot specify the position where you want to add
        HashSet<String> stringHashSet = new HashSet<String>();
        stringHashSet.add("B");
        stringHashSet.add("L");
        stringHashSet.add("A");
        System.out.println(stringHashSet.add("A"));
        new HashSetDemo().printing(stringHashSet);

        stringHashSet.remove("A");
        new HashSetDemo().printing(stringHashSet);

        HashSet<Integer> hset = new HashSet<>();
        hset.add(1);
        hset.add(2);
        hset.add(9);
        hset.add(1);
        hset.add(2);
        hset.add(3);
        hset.add(1);
        hset.add(4);
        hset.add(1);
        hset.add(5);
        hset.add(7);

        new HashSetDemo().printing(hset);

        int i=1;
        int count=0;
        while(i < 100){
            i*=2;
        count++;
        }
        System.out.println(count);



        System.out.println(0^2);








    }
}
