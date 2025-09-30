package static2.ex;

public class Car {

    private static int count;//공용으로 사용하기 위해서 (클래스변수)
    //public 이라면 Car.count=100 바꿔버릴 수도 있음.
    private String name; //인스턴스 변수
        //car.name = null맘대로 변경 못하게 한다.


    public Car(String name) {
        System.out.println("차량 구입, 이름: " + name);
        this.name=name;//클래스 내부이므로 private변수 접근 가능
        count++;
    }

    public static void showTotalCars(){//static변수만 쓰기 때문에 static메서드로 선언
        System.out.println("구매한 차량 수 : "+count);
    }
}
