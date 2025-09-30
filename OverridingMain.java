package poly;

public class OverridingMain {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value ="+child.value);
        child.method();

        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value ="+parent.value);
        parent.method();

        //부모변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value ="+poly.value); // 변수는 오버라이딩 x
        poly.method();
    }
}
