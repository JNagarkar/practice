package JavaBasics.CollectionFramework;

import java.util.TreeMap;

/**
 * Created by jaydatta on 9/6/16.
 */
public class convertToRoman {


    public static void main(String[] args){

        convertToRoman object = new convertToRoman();

        TreeMap<Integer,String> map = new TreeMap<>();

        Integer sampleInteger=1234;
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");

        String result = object.toRoman(map, sampleInteger);
        System.out.println(result);

    }

    public static String toRoman(TreeMap<Integer,String> map, Integer sampleInteger){


    int lower = map.floorKey(sampleInteger);
        System.out.println(lower);
        if(lower == sampleInteger){
        return map.get(lower);
        }
        else{
        return map.get(lower) + toRoman(map,sampleInteger-lower);
        }
    }
}
