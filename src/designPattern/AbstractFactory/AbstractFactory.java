package designPattern.AbstractFactory;

import designPattern.AbstractFactory.Color.*;
import designPattern.AbstractFactory.Shape.*;
import designPattern.AbstractFactory.Size.*;


/**
 * Created by jaydatta on 8/23/16.
 * If any new attributes are to be added, that have to be added here.
 */
public interface AbstractFactory {

    abstract Shape getShape(String shape);
    abstract Color getColor(String color);
    abstract Size getSize(String size);

}
