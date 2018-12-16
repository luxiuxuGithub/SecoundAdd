package Demo4TestException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Method;

public class Demo1Test {
    public static void main(String[] args) throws Exception{
        Demo1 d = new Demo1();//创建需要被测试的类的对象

        Method[] methods = d.getClass().getMethods();//获取类中所有被public修饰的方法

        int num = 0;//定义一个统计异常出现的计数器
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\DEVELOP\\TestFile\\bug.txt"));
        for (Method method : methods) {
            if(method.isAnnotationPresent(Demo1Check.class)){//判断方法是否被Demo1Check.class字节码修饰
                /*
                default boolean isAnnotationPresent(类<? extends Annotation> annotationClass)
                                如果此元素上 存在指定类型的注释，则返回true，否则返回false。
                 */
                try {
                    method.invoke(d);
                }catch (Exception e){
                    bw.write(method+"方法出现异常");
                    bw.newLine();
                    bw.write("异常名称: "+e.getCause().getClass().getName());
                    bw.newLine();
                    bw.write("异常原因："+e.getCause().getMessage());
                    bw.newLine();
                    num++;
                }
            }
        }
        bw.write("总共出现了"+num+"个异常");
        bw.flush();
        bw.close();
    }
}
