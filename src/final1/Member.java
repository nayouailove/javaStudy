package final1;

public class Member {
    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void print(){
        System.out.println("id ="+id + "name = " + name);//객체.print니까 객체의 인스턴스변수name들어가서 this아님.
    }

    public void changeDate(String id, String name){
//        this.id=id; //final은 생성자에서 한번 정해지면 못바꾼다.
        this.name=name;
    }
}
