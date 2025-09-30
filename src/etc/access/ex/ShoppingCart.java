package etc.access.ex;


import java.sql.SQLOutput;

public class ShoppingCart {
    private Item[] items=new Item[10]; //몰랏오 ㅜㅜ
    private int itemCount=0;

    public void addItem(Item item){
       
//        if(itemCount<10){//정상적인 경우-->여기에 초점을 둠
//            items[itemCount]=item;
//            itemCount++;
//
//        }else{//예외
//            System.out.println("10개이상 안됨");
//        }

        if(itemCount>=items.length){//예외상황 먼저 처리하기(early exit)
            System.out.println("가득찻습니다" );
            return;
        }items[itemCount]=item;//정상적인 부분(이부분의 경우가 더 많겠지)
            itemCount++;
            //예외나 오류조건을 함수의 맨 앞에서 처리하는 것을 선호한다.

    }
    public void displayItem(){
        System.out.println("장바구니 상품 출력");
//        for(Item s :items ) { //items s: items라고 함..이렇게 하면 10개 다 만들어진것을 가리키게 됨
//            //NullPointerExcepion
//            if (s != null) { //null인 부분 뛰어넘기. s가 널이 아닐 때만 실행한다.
//                System.out.println("상품명" + s.getName() + ", 합계 : " + s.getTotalPrice());
//            }
//        }
        for(int i=0;i<itemCount;i++){
            Item item=items[i];
            System.out.println("상품명 :"+item.getName()+", 합계 :"+item.getTotalPrice());
        }

        System.out.println("전체 가격 합 : "+calculateTotalPrice());
    }

    private int calculateTotalPrice(){
        int totalPrice=0;
        for (Item t : items) {
            if(t !=null){
            totalPrice += t.getTotalPrice();}
        }
       return totalPrice;}//이 메서드 내부에서만 사용하기 때문에 private접근제어자사용
}
