
public class helloword {
    //两个变量值交换
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("交换前：a="+a+"，b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("交换后：a="+a+"，b="+b);

    }
}
