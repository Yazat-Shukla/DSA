public class P01_OopsIntro {
    public static void main(String[] args){
        int[] numbers = new int[5];
        Student[] students = new Student[5];
//        Student kunal;

//        kunal = new Student();
        Student kunal = new Student(13,"Dhruv",23.53f);
//        kunal.rno = 23;
//        kunal.name = "Kunal kushwaha";
//        kunal.marks = 53.63f;
//    System.out.println(kunal);
//
//    kunal.changename("rishit");
//    kunal.greeting();
        Student one = new Student();
        Student two = one;
        one.name = "Something something";
        System.out.println(two.name);

        System.out.println(kunal.name);
        System.out.println(kunal.rno);
        System.out.println(kunal.marks);
        Student random = new Student(kunal);
        System.out.println(random.name);
        Student random2 = new Student();
        System.out.println(random2.name);
    }
}
//create a class for every single student
class Student{
    int rno;
    String name;
    float marks;
    // we need a way to add the values of the above properties object by object
    //we need one word to acces every object
    void greeting(){
        System.out.println("Hello my name is "+ name);
    }
    void changename(String newname){
        this.name = newname;
    }
    Student(){
        //call anothe rconstructor from another constructor
        //internally : new student(13,"default person",100.00f)
        this (13,"Default person",100.00f);
    }
    Student(int rno,String name,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
}
