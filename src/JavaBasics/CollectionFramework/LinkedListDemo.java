package src.JavaBasics.CollectionFramework;

import java.util.LinkedList;

import static java.lang.System.out;

/**
 * Created by jaydatta on 8/24/16.
 */
public class LinkedListDemo {

    public static void main(String[] args){

        LinkedListDemo myDemo= new LinkedListDemo();

        LinkedList demoLinkedList= new LinkedList();

        // If position specified, adds element at that position such that 1st element at that position
        demoLinkedList.add(0,"A");
        demoLinkedList.add(0,"B");
        demoLinkedList.add(0,"C");
        myDemo.printing(demoLinkedList);

        demoLinkedList.add(1,"D");
        demoLinkedList.add(1,"E");
        myDemo.printing(demoLinkedList);

        demoLinkedList.add(0,"L");
        myDemo.printing(demoLinkedList);


        //Without specifying position, adds at the end of the list.
        demoLinkedList.add("X");
        myDemo.printing(demoLinkedList);

        //can contain duplicate elements
        demoLinkedList.add(1,"E");
        myDemo.printing(demoLinkedList);

    }

    public void printing(Object object){
    System.out.println(object);
    }

}
