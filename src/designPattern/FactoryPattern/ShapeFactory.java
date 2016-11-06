package designPattern.FactoryPattern;

/**
 * Created by jaydatta on 8/23/16.
 */
public class ShapeFactory {

    static ShapeFactory instance = new ShapeFactory();

    private ShapeFactory() {

    }

    public static ShapeFactory getShapeFactoryInstance() {

        return instance;
    }


    public Shape getInstance(String shapeInstance) {

        if (shapeInstance == null) {
            return null;
        }
        if (shapeInstance.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (shapeInstance.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        if (shapeInstance.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}