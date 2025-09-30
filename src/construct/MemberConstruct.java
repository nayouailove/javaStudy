package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //객체를 생성하자마자 초기값 할당, 피룡한 기능을 바로 수행한다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
        //생성자 : 클래스 이름과 같다. 첫글자 대문자
        //반환타입이 없ㄷㅏ void도 안씀
    }

    //추가
    MemberConstruct(String name, int age) {
        this(name, age, 100); //위에거가 호출이 됨.
        //생성자 코드의 첫줄에만 작성할 수 있다.
//        this.name = name;
//        this.age = age;
//        this.grade = 100;
            //생성자가 두개가 되었다. overloading

        //this는 생성자 내부에서 자신의 생성자를 호출할 수 있다.
            //this는 인스턴스 자신의 참조값을 가리킨다. 자신의 생성자 호출함
    }
}
