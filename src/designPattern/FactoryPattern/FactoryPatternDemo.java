package src.designPattern.FactoryPattern;

/**
 * Created by jaydatta on 8/23/16.
 */
public class FactoryPatternDemo {

    public static void main(String[] args){

        // Made class ShapeFactory as singleton


        ShapeFactory shapeFactoryInstance= ShapeFactory.getShapeFactoryInstance();

        Shape circleInstance= shapeFactoryInstance.getInstance("CIRCLE");
        circleInstance.draw();

        Shape someAbstractInstance = shapeFactoryInstance.getInstance("CIRCLE");
        someAbstractInstance.draw();

        Shape squareInstance=shapeFactoryInstance.getInstance("SQUARE");
        squareInstance.draw();

        Shape rectangleInstance=shapeFactoryInstance.getInstance("RECTANGLE");
        rectangleInstance.draw();
    }
}
