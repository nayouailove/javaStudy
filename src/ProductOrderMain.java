public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3]; //배열생성

        //첫번째 상품 정보 입력
        ProductOrder order1 = new ProductOrder();
        order1.productName="가지";
        order1.price=1000;
        order1.quantity=2;
        orders[0]=order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName="치즈";
        order2.price=5000;
        order2.quantity=1;
        orders[1]=order2;

        ProductOrder order3 = new ProductOrder();
        order3 = new ProductOrder();
        order3.productName="용과";
        order3.price=300;
        order3.quantity=4;
        orders[2]=order3; //만들어뒀던 배열에 인스턴스

        int totalAmount=0;

        //iter쓰기.
        for (ProductOrder order : orders) {
            System.out.println("상품명: "+order.productName+", 가격:"+order.price+", 수량:"+order.quantity);
            totalAmount += order.price*order.quantity;
        }

        System.out.println("총 결제 금액:"+totalAmount);
    }
}
