package ref;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

//        calculateArea(rectangle);
//        calculatePerimeter(rectangle);
//        isSquare(rectangle);

        int area = rectangle.calculateArea();
        System.out.println(area);

        int perimeter = rectangle.calcPerimeter();
        System.out.println(perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부:"+square);

    }
}
