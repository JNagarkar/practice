package src.designPattern.AbstractFactory;

import src.designPattern.AbstractFactory.Color.*;
import src.designPattern.AbstractFactory.Shape.*;
import src.designPattern.AbstractFactory.Size.*;
import src.designPattern.AbstractFactory.Color.Color;
import src.designPattern.AbstractFactory.Shape.Shape;
import src.designPattern.AbstractFactory.Size.Size;


/**
 * Created by jaydatta on 8/23/16.
 * If any new attributes are to be added, that have to be added here.
 */
public interface AbstractFactory {

    abstract Shape getShape(String shape);
    abstract Color getColor(String color);
    abstract Size getSize(String size);

}
