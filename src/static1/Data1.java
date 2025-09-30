package static1;

public class Data1 {
    public String name;
    public int count;

    public Data1(String name){
        this.name = name;
        count++; //객체가 생성될 때마다 생성자를 통해 인스턴스의 멤버변수인 count의 값을 증가시킨다.
    }
}//근데 이렇게 하면 count는 인스턴스가 생성된 횟수를 가리키지 못하고 영원히 1이다. 힙영역에 한개씩 고유하게 생기기때무니다.

