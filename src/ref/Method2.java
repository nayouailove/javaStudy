package ref;

public class Method2        {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15,90);
        Student student2 = createStudent("학생2", 40,80);
                //student1,2는 지역변수

        printStudent(student1);
        printStudent(student2);

    }
    static Student createStudent(String name, int age, int grade){
        Student student = new Student(); //Student객체 생성
        student.name=name;
        student.age=age;
        student.grade=grade;
        return student;
            //메서드 안에서 객체를 생성했기 때문에 만들어진 객체를 밖에서 사용할 수 있게 돌려주어야한다.
    }

    static void printStudent(Student student1){
        System.out.println("이름"+student1.name+"나이 : "+student1.age+"성적 : "+student1.grade);
    }
}
