package DesignPatterns.factory;


interface Shape {
    void draw();
}


// Business logic of which shape is needed is handled here
class ShapeFactory{
    Shape shape;

    public ShapeFactory(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            shape = new CircleShape();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            shape = new RectangleShape();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            shape = new SquareShape();
        }
    }
    public Shape getShape() {
        return shape;
    }
}


class RectangleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class CircleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}


class SquareShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

public class Polygon {
    public static void main(String[] args) {
        ShapeFactory circleShapeFactory = new ShapeFactory("CIRCLE");
        Shape circle = circleShapeFactory.getShape();
        circle.draw();

        ShapeFactory rectangleShapeFactory = new ShapeFactory("RECTANGLE");
        Shape rectangle = rectangleShapeFactory.getShape();
        rectangle.draw();

        ShapeFactory squareShapeFactory = new ShapeFactory("SQUARE");
        Shape square = squareShapeFactory.getShape();
        square.draw();
    }
}
