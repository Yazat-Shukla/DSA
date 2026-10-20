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
