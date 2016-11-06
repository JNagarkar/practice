package JavaBasics.Questions.toStringoverride;

/**
 * Created by jaydatta on 9/19/16.
 */
public class ToStringOverride {

    String name;
    int id;
    String department;


    ToStringOverride(String n,int i, String d){
        this.name = n;
        this.id = i;
        this.department = d;
    }

public String toString(){
    return name+" "+id+" "+department;
}
}
