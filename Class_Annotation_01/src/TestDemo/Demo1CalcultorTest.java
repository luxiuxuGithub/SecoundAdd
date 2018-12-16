package TestDemo;

import Demo1.Demo1Calcultor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Demo1CalcultorTest {

    @Before//标注一个方法，这个方法会在所有测试类之前执行
    public void before(){
        System.out.println("before...");
    }

    @After//标注一个方法，这个方法会在所有测试类之后执行
    public void after(){
        System.out.println("after...");
    }


    @Test
    public void addTest(){
        System.out.println("addTest....");
        //1.创建测试类对象
        Demo1Calcultor d = new Demo1Calcultor();
        //调用测试方法
        int result = d.add(1, 3);

        //断言，断言预测结果与实际结果是否相等
        Assert.assertEquals(4,result);
    }
}
