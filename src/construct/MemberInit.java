package construct;

    //객체를 생성하는 시점에 어떤 작업을 하고 싶다.

public class MemberInit {
    String name;
    int age;
    int grade;
        //멤버변수

    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        //초기값 설정 기능을 제공하는 메서드.
                //this는 인스턴스 자신의 참조값이다.
                    //name=name : 둘다 매개변수
        //this는 인스턴스 자신을 가리킴.
        //위에 매개변수가 name=name에서 더 가까워서 우선순위를 갖는다. 그냥 name은 매개변수임.

//        member2.initMember("hoon", 27, 9);
    }//        멤버변수에 인자로 넘어온 값을 채운다.
}
