package interviewBit;

import java.util.ArrayList;

/**
 * Created by jaydatta on 10/31/16.
 */
public class xOR {

    public static void main(String[] args) {
        ArrayList<Long> one  = new ArrayList<>();
        one.add((long)1);
        one.add((long) 2);one.add((long)2);one.add((long)4);one.add((long)5);one.add((long)6);

        ArrayList<Long> two  = new ArrayList<>();
        two.add((long)1);
        two.add((long)2);two.add((long)3);two.add((long)4);two.add((long)5);two.add((long)6);

        Long xor = new Long(0);

        int counter=0;
        for(int i=1; i < 7;i++){
            System.out.println(one.get(counter)+":"+i);
            xor = one.get(counter++)^ xor  ^i;
            System.out.println(xor);
        }


        System.out.println(213^87);


    }

}
