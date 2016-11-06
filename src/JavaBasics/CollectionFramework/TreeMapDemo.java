package JavaBasics.CollectionFramework;

import java.util.TreeMap;

/**
 * Created by jaydatta on 8/24/16.
 */
public class TreeMapDemo extends printingJob {
    public static void main(String[] args) {
        // Does not allow heterogenous items, keys should be of the same type. Sorts by keys
        TreeMap homogenousTM = new TreeMap();
        homogenousTM.put(3, "L");
/*
        //Will give runtime error
        homogenousTM.put("L", 5);
        homogenousTM.put(new HashSetDemo(), 3);*/
        homogenousTM.put(2, 9);

        // This is used to define if we want to omit keys before a certain value
        Object something=homogenousTM.ceilingKey(8);


        new TreeMapDemo().printing(something);
        new TreeMapDemo().printing(homogenousTM);
    }
}
