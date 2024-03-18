class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public void draw(String color) {
        System.out.println("Drawing a shape with color: " + color);
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    public void draw(int width, int height) {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();               
        shape.draw("red");          
        Rectangle rectangle = new Rectangle();
        rectangle.draw();           
        rectangle.draw(10, 5);      
    }
}
