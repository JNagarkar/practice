package src.designPattern.AbstractFactory.Shape;

import src.designPattern.AbstractFactory.AbstractFactory;
import src.designPattern.AbstractFactory.Color.Color;
import src.designPattern.AbstractFactory.Size.Size;

/**
 * Created by jaydatta on 8/23/16.
 */
public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shape) {

        if(shape==null)
            return null;
        else if(shape.equalsIgnoreCase("SQUARE"))
            return new Square();
        else if (shape.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if (shape.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Size getSize(String size) {
        return null;
    }
}
