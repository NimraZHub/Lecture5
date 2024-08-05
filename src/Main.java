public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        //Function
        print();

    }
    public static void print(){
        System.out.println("Message 1");
        print1();
    }

    private static void print1() {
        System.out.println("Message 2");
        print2();
    }

    private static void print2() {
        System.out.println("Message 3");
    }
}