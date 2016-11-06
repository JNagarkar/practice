package src.JavaBasics.Questions.Serialization;
import java.io.*;



/**
 * Created by jaydatta on 9/19/16.
 */
public class SerializationExample implements Serializable{

    //Will throw error
//    Address address;

    String name,dept;

    SerializationExample(String a1,String a2){
        name = a1;
        dept = a2;
    }

    public static void main(String[] args) throws Exception {
        SerializationExample example  = new SerializationExample("JAY","CS");

        System.out.println(12 >> 2);

        FileOutputStream ft = new FileOutputStream("f.txt");
        ObjectOutputStream out = new ObjectOutputStream(ft);
  try {
      out.writeObject(example);
      out.flush();
  }
  catch(Exception e ){
      System.out.println(e);

  }System.out.println("success");

    ObjectInputStream ipStream = new ObjectInputStream(new FileInputStream("f.txt"));
        SerializationExample deserializedObject = (SerializationExample) ipStream.readObject();
        System.out.println(deserializedObject.dept+":"+deserializedObject.name);


    }

}
