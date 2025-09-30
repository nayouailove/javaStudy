package final1;

public class FieldInit {
    static final int CONST_VALUE = 10;
    //이런 변수는 한개만 존재한다.
    //static 영역은 단 하나만 존재하는 영역이다.
    final int value=10;//필드에서 초기화
    //생성자 초기화와 다르게 필드 초기화는 해당 값이 미리 정해져있음.
    //모든 인스턴스가 같은 값을 사용하기 때문에 메모리 낭비 => static사용하면 됨.
    //생성자를 통해서도 초기화할 수 없다.

    //다른 클래스에서 : FieldInit.CONST_VALUE
}
