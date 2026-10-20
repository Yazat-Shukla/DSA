//create a class for every single student
class Student {
    int rno;
    String name;
    float marks;

    // we need a way to add the values of the above properties object by object
    //we need one word to acces every object
    void greeting() {
        System.out.println("Hello my name is " + name);
    }

    void changename(String newname) {
        this.name = newname;
    }

    Student() {
        //call anothe rconstructor from another constructor
        //internally : new student(13,"default person",100.00f)
        this(13, "Default person", 100.00f);
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
}
