package static1;

public class Data3 {
    public String name;
    public static int count;//static이 붙으면 정적변수, 클래스 변수라고 한다.
                                //객체가 생성되면 생성자에서 정적변수 count값을 하나 증가시킨다.

    //static이 붙은 멤버변수는 메서드 영역에서 관리한다.

    public Data3(String name) {
        this.name = name;
        Data3.count++;//Data3.count : 정적변수 접근 방법
        //count++그냥 이렇게 써도 된다. 자신의 클래스에 있는 정적변수라면 클래스명 생략.
    }
}
