package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){}//인스턴스 생성을 막는다. 타클래스에서 못쓰니까.
        //객체를 생성하지 않고 사용해, 인스턴스 생성하지 못하게 하려면
    //생성자를 private으로 막아버리면 됨
    //그런 것을 유틸리티 클래스라고 한다. : 특정 기능을 제공하는 메서드.
    //유틸리티 클래스는 상태를 가질 필요가 없고 객체를 생성할 필요가 없기 때문에
    // static멤버와 private생성자를 사용해 설계한다.

    //private static int sum=0;//static변수는 하나 올 수 있다.
    //만약 이게 static이 아니면 아래에서 부를 수 없음.
    //왜냐면 인스턴스변수는 인스턴스를 생성해야만 쓸 수 있으니까.

    public static int sum(int[] array){
        int total = 0;
        for (int i=0;i<array.length;i++){
            total+=array[i];
        }
        return total;
    }
    public static double average(int[] array){
        return (double) sum(array)/array.length;
    }

    public static int min(int[] array){
        int minValue=array[0];
        for (int i=1;i<array.length;i++){//두번째요소부터 끝까지 순회
            if(array[i]<minValue){//현재 요소가 현재까지의 최소값보다 작으면
                minValue=array[i];}//최소값 업데이트
    }   return minValue;}

    public static int max(int[] array){
            int maxValue = array[0];
            for (int i=1;i<array.length;i++){
                if(array[i]>maxValue){
                    maxValue=array[i];}
            }return maxValue;
        }

    }



