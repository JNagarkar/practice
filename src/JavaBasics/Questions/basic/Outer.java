package JavaBasics.Questions.basic;

/**
 * Created by jaydatta on 9/18/16.
 */
public class Outer {


    private static int number = 22;
    private String name;

    public static void main(String[] args) {

        Outer object = new Outer();
        Inner obj = new Inner();
        obj.number();

        nonStaticInner nonStaticObject = object.new nonStaticInner();
        nonStaticObject.number();


    }

    class nonStaticInner {
        public void number() {
            System.out.println("nonStaticInner:" + number);
        }
    }

    static class Inner {
        public void number() {
            System.out.println(number);
        }
    }

}
