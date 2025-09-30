package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("hye", 24, 100);//초기값넣어주기

        MemberInit member2 = new MemberInit();
        member2.initMember("hoon", 27, 9);

        MemberInit[] members = new MemberInit[]{member1,member2};

        for (MemberInit member : members) {
            System.out.println("이름 :"+member.name+"나이:"+member.age+"성적:"+member.grade);
        }
    }
}
