public class wrapperexamples {
    public static void main(String[] args){
//        int x = 19;
//        Integer num = 45;
//        int a = 10;
//        int b = 20;
        Integer a = 10;
        Integer b = 20;
        swap(a,b);
        System.out.println(a+" "+b);
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
