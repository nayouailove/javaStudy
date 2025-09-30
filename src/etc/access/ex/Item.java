package etc.access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity){//생성자는 반환타입이 없다.
        //생성자는 인스턴스를 생성하고 나서 즉시 호출된다.
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }//생성자는 클래스 이름과 같고,

    public String getName(){
        return name;
    }
    public int getTotalPrice(){
        return price*quantity;
    }//외부에서걍 호출만 하면 됨.. 메서드 캡슐화의 핵심 : 자신이 가진 데이터를 사용한다.
}
