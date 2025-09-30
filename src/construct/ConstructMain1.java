package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member = new MemberConstruct("user1",34,5);
        MemberConstruct member2 = new MemberConstruct("user2",34,5);
        MemberConstruct member3 = new MemberConstruct("user3",34);

        //성적입력이 필요하면 세개 다 넣고, 아니면 두개만 넣으면 됨.
        //그것에 맞는 생성자가 호출된다.

        //      생성과 동시에 조건도 같이 맞춘것이다.
    }
}
