package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();//회원 객체 생성
        initMember(m1, "mark", 15, 90);

        MemberInit m2 = new MemberInit();
        initMember(m2, "jiji", 5, 60);

        MemberInit[] members = new MemberInit[] {m1, m2 };

        for (MemberInit member : members) {
            System.out.println("이름 :"+member.name+"나이:"+member.age+"성적:"+member.grade);
        }
    }
    static void initMember(MemberInit member, String name, int age, int grade) {
                            //MemberInit타입의 객체 받는다.
        member.name = name;
        member.age = age;
        member.grade = grade;
    } //얘는 기능에 속한다. 속성과 기능을 한곳에 두는것이 더 객체지향스럽다.
}
