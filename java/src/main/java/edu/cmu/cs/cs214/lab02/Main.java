package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Square;
import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape square = new Square(3);
        Shape circle = new Circle(5);

        Renderer renderer1 = new Renderer(rectangle);
        Renderer renderer2 = new Renderer(square);
        Renderer renderer3 = new Renderer(circle);

        renderer1.draw();
        renderer2.draw();
        renderer3.draw();
    }
}
