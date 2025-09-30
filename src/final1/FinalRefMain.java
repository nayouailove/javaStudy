package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data d = new Data();
        //d = NEW Data(); //final변경 불가 컴파일 오류
            //참조형 변수 d에 final이 붙었다. 변수 선언시점에 참조값ㅇ르 할당했으므로 더는 참조값을 변경할 수 없다.

        //참조 대상의 값은 변경 가능

        d.value=10;
        System.out.println(d.value );

        d.value=100;
        System.out.println(d.value );
    }
}
