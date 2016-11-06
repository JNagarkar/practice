package JavaBasics;
import java.util.*;
/**
 * Created by jaydatta on 8/24/16.
 */
public class StringImmutability {

public static void main(String[] args) throws Throwable {



    StringImmutability sImm = new StringImmutability();
    sImm.finalize();

    StringBuffer sbuffer= new StringBuffer();
    sbuffer.append("buffer example");
    System.out.println(sbuffer);

    sbuffer.substring(0,2);
    System.out.println(sbuffer);


    sbuffer.append(" appended stuff");
    System.out.println(sbuffer);


    StringBuilder sbuilder = new StringBuilder();
    sbuilder.append("sbuilder");

    System.out.println(sbuilder);


    String s= "Ifskd fhsddkh";
    System.out.println(s);
    s.substring(0,4);
    System.out.println(s);


}

}
