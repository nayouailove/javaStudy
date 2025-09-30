package construct;

public class MethodInitMain1    {
    public static void main(String[] args) {
        MemberInit m = new MemberInit();//회원 객체 생성
        m.name = "John";//변수 초기값 설정
        m.age = 18;
        m.grade=90;

        MemberInit m2 = new MemberInit();
        m2.name = "mark";
        m2.age = 90;
        m2.grade=70;

        MemberInit[] members = new MemberInit[] { m, m2 };

        for (MemberInit member : members) {
            System.out.println("이름 :"+member.name+"나이:"+member.age+"성적:"+member.grade);
        }
    }
}
