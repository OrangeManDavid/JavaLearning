package com.myExtends.java_09;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author David.Jackson.Lyd@gmail.com
 * @Date: 2020/05/04 16:15
 */
public class Demo {
    public static void main(String[] args) {
        //创建老师类对象进行测试
        Teacher t1 = new Teacher();
        t1.setName("林青霞");
        t1.setAge(30);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("风清扬", 33);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();

    }
}
