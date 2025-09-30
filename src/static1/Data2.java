package static1;

public class Data2 {
    public String name;

    public Data2(String name, Counter counter){
        this.name = name;
        counter.count++;
    }//생성자에서 Counter인스턴스를 추가로 전달 받는다.
    //생성자가 호출되면 counter인스턴스에 있는 count변수의 값을 하나 증가시킨다.
}
