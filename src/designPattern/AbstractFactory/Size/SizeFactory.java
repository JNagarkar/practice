package designPattern.AbstractFactory.Size;

import designPattern.AbstractFactory.AbstractFactory;
import designPattern.AbstractFactory.Color.Color;
import designPattern.AbstractFactory.Shape.Shape;

/**
 * Created by jaydatta on 8/23/16.
 */
public class SizeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Size getSize(String size){
    if(size==null)
        return null;
    else if (size.equalsIgnoreCase("LARGE"))
        return new Large();
    else if (size.equalsIgnoreCase("MEDIUM"))
        return new Medium();
    else if (size.equalsIgnoreCase("SMALL"))
        return new Small();
        return null;
    }


}
