/**
 *1、构造方法私有化
 2、声明一个本类对象
 3、给外部提供一个静态方法获取对象实例

 * */
public class Test4 {
    public static void main(String[] args) {
        Singleton s=Singleton.getS();
        s.print();
        Singleton1 s1=Singleton1.getS();
        s1.print();
        Singleton1 s2=Singleton1.getS();
        s2.print();
        System.out.println(s1==s2);
    }
}
//单例模型
//饿汉式
class Singleton{
    private Singleton(){}
    public static Singleton s = new Singleton();
    public static Singleton getS(){
        return s;
    }
    public void print(){
        System.out.println("饿汉式单例");
    }
}
//懒汉式
class Singleton1{
    private Singleton1(){}
    private static Singleton1 s;
    public static Singleton1 getS(){
        if (s == null) {
            s = new Singleton1();
        }
        return s;
    }
    public void print(){
        System.out.println("懒汉式单例");
    }
}