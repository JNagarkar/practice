package JavaBasics.Questions.basic.RuntimePolymorphism;

/**
 * Created by jaydatta on 9/18/16.
 */
public class Interest {
    public static void main(String[] args) {


        //will throw an error Abstract class cannot be instantiated
//        Bank bank = new Bank();


        String a = "Wild";
        String b = " Irish";
String c = " Rose";
        String result = a + b+ c;
        System.out.println(result);




        System.out.println(a==b);
        System.out.println(a.equals(b));


        String arr[] = {};


        Bank bankInstance = new SBI();
        System.out.println(bankInstance.returnRateOfInterest());

        bankInstance= new HDFC();
        System.out.println(bankInstance.returnRateOfInterest());// will print those rates of the banks


        // Prints value initialized in parent class. No runtime polymorphism for data members
        System.out.println(bankInstance.datamember);


    // Not possible
//        SBI sbiInstance = new Bank();
    }
}
