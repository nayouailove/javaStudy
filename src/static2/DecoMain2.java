package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "heiik";
        DecoUtil2.deco(s);
        //String deco = DecoUtil2.deco(s);

        System.out.println("before"+s);
        System.out.println("after"+DecoUtil2.deco(s));//이렇게 하면 걍 deco라고 써도 됨
    }}
