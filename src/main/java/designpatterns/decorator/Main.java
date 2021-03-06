package designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating Simple Shape Objects...");
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        System.out.println("Drawing Simple Shape Objects...");
        rectangle.draw();
        circle.draw();
        System.out.println();

//        System.out.println("Creating Decorated Circle: ");
//        Shape circle1 = new FillColorDecorator(new LineColorDecorator(new Circle(), Color.BLUE), Color.YELLOW);
//        circle1.draw();
    }
}
