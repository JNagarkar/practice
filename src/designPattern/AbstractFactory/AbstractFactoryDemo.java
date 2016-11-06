package src.designPattern.AbstractFactory;
import src.designPattern.AbstractFactory.Shape.*;
import src.designPattern.AbstractFactory.Color.*;
import src.designPattern.AbstractFactory.Size.*;


/**
 * Created by jaydatta on 8/23/16.
 */
public class AbstractFactoryDemo {

    public static void main(String[] args){

        // This is only for illustration purpose
        AbstractFactory abstractShapeFactory= AbstractFactoryProducer.getFactory("SHAPE");
        Shape RectangleItem= abstractShapeFactory.getShape("RECTANGLE");
        RectangleItem.draw();
        Shape SquareItem= abstractShapeFactory.getShape("SQUARE");
        SquareItem.draw();
        Shape CircleItem= abstractShapeFactory.getShape("CIRCLE");
        CircleItem.draw();

        AbstractFactory abstractSizeFactory= AbstractFactoryProducer.getFactory("SIZE");
        Size smallItem= abstractSizeFactory.getSize("SMALL");
        smallItem.measure();
        Size mediumItem= abstractSizeFactory.getSize("MEDIUM");
        mediumItem.measure();
        Size largeItem= abstractSizeFactory.getSize("LARGE");
        largeItem.measure();

        AbstractFactory abstractColorFactory= AbstractFactoryProducer.getFactory("COLOR");
        Color redItem= abstractColorFactory.getColor("RED");
        redItem.fill();
        Color greenItem= abstractColorFactory.getColor("GREEN");
        greenItem.fill();
        Color blueItem= abstractColorFactory.getColor("BLUE");
        blueItem.fill();


        System.out.println("-----------------------------------------");
        //Ideally it should be like this, even the item in getFactory "COLOR" and color in getColor should be  should be something else so as to conceal internal logic completely
        AbstractFactory abstractItem;
        abstractItem= AbstractFactoryProducer.getFactory("COLOR");
        abstractItem.getColor("RED").fill();

        abstractItem= AbstractFactoryProducer.getFactory("SIZE");
        abstractItem.getSize("SMALL").measure();

    }




}
