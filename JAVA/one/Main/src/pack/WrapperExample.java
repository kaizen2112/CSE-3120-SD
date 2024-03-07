package pack;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //Integer num = 45;
        //swap(a,b);
        Integer x=10, y=20;
        

        System.out.println(a+" "+b);
        System.out.println(x+" "+y);



    }

    // static void swap( int a, int b) {
    //     int temp = a;
    //     a = b;
    //     b = temp;
    // }
    static void swap( Integer x, Integer y) {
            int temp = x;
            x = y;
            y = temp;
        }
    
}
