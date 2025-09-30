package ref;

public class Rectangle {

    int width;
    int height;

//    void calculateArea(Rectangle rectangle) {
//        return rectangle.width * rectangle.height;
//    }    void는 아무것도 반환하지 않을 때쓴다. 그냥 단순히 출력만 할 대.
//    void calculatePerimeter(Rectangle rectangle) {
//        return 2 *( rectangle.width +  rectangle.height);
//    }
//    void boolean isSquare(Rectangle rectangle) {
//        return  rectangle.width ==   rectangle.height;
//    }

    int calcPerimeter(){
     return 2 *(width+height);
    }//계산된 값을 반환해야하기 때문에 int쓴다.

    boolean isSquare(){
        return this.width ==this.height;
    }
    int calculateArea(){
        return width*height;
    }

}
