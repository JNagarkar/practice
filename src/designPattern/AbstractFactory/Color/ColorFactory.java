package designPattern.AbstractFactory.Color;

import designPattern.AbstractFactory.AbstractFactory;
import designPattern.AbstractFactory.Shape.Shape;
import designPattern.AbstractFactory.Size.Size;

/**
 * Created by jaydatta on 8/23/16.
 */
public class ColorFactory implements AbstractFactory {


    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color==null){
            return null;}
        else if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }
        else if (color.equalsIgnoreCase("GREEN")){
            return new Green();
            }
        else if (color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
        }



    @Override
    public Size getSize(String size) {
        return null;
    }
}
