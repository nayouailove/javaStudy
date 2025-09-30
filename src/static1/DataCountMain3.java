package static1;

public class DataCountMain3 {
    public static void main(String[] args) {

        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);
        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);
        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);
        //data3.count도 되긴 하는데 안씀.(인스턴스를 통한 접근/클래스를 통한 접근)

        method(10);
    }
    public static void method(final int n) {
//        n=200; //메서드 호출 시 사용된 값이 끝까지 사용된다.
    }
}
