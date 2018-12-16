package Demo4TestException;


public class Demo1 {
    @Demo1Check
    public void method() {
        String str = null;
        str.toString();
    }

    @Demo1Check
    public void method2() {
        int a = 3;
        int b = 0;
        System.out.println(a / b);
    }

    @Demo1Check
    public void method3() {
        int a = 12;
        int b = 4;
        System.out.println(a / b);
    }

    @Demo1Check
    public void method4() {
        int a = 3;
        int b = 5;
        System.out.println(a + b);
    }
}
