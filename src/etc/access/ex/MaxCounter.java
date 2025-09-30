package etc.access.ex;

public class MaxCounter {
    private int count =0;
        //접근 제어자를 사용해서 데이터를 캡슐화한다.
    public int max;

    public MaxCounter(int max){
        this.max = max;//뒤에있는게 이 클래스의 멤버변수, 다른데서 MaxCounter가 호출되고 int 파라미터가 들어오면 멤버변수로 쓴다.
    }

    public void increment(int max) {
        if(count >= max) {
            System.out.println("최대값을 초과할 수 없습니다. ");
        }
            count++;

    }
    public int getCounter() {
        return count;
    }
}
