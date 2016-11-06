package src.JavaBasics.Questions.basic;

/**
 * Created by jaydatta on 9/18/16.
 */
public class CopyConstructor implements Cloneable{

    String name;
    int age;

    static int example = 23;

    CopyConstructor(){

    }

    CopyConstructor(String nam,int number){

        //this is used to invoke default class constructor with no arguments
        this();
    this.name=nam;
    this.age = number;


    }

    CopyConstructor(String name,int age,String some){
        name = name;
        age = age;
    }


    CopyConstructor(CopyConstructor c){
        this.name = c.name;
        this.age  = c.age;
    }


    public Object clone() throws CloneNotSupportedException{

        return super.clone();
    }

    public static void main(int a) {
        System.out.println("int main invoked"+a);
    }

    public static void main(String some) {
        System.out.println(""+some);
    }



    public static void main(String[] args) throws CloneNotSupportedException {

        main(1);
        main("JAY");

        CopyConstructor sn = new CopyConstructor("JAYDATTA",231,"PP");
        System.out.println(sn.name+sn.age);

        CopyConstructor s1 = new CopyConstructor("JAY",23);

        System.out.println(s1.name+s1.age);



        CopyConstructor s2 = new CopyConstructor(s1);
        System.out.println(s2.name+s2.age);


        CopyConstructor s3 = (CopyConstructor) s2.clone();


        System.out.println("<-->"+s3.name+s3.age);
        StaticMethod();

        s2.InstanceMethod();

    }

    public static void StaticMethod() {
    example++;
        System.out.println(example);
        // gives erreor, static method cannot access non static variables
        //System.out.println(name);

    }


    public void InstanceMethod(){
       //can access both static and non-static varaiables


        example++;
        System.out.println(name);
        System.out.println(example);
    }
}
