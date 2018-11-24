public class Test6 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner inner = o.new Inner();
        inner.print1();
        o.show();
        Outer.SInner os = new Outer.SInner();
        os.print2();
        o.print3();
        o.print4();
        o.print5(new IJk() {
            @Override
            public void s() {
                System.out.println("参数式内部类");
            }
        });
    }
}
class Outer{
    static class SInner{
        public void print2(){
            System.out.println("静态内部类");
        }
    }
    class Inner{
        public void print1(){
            System.out.println("内部类");
        }
    }
    public void show(){
        int i=1;//jdk1.8之后默认final型，可用不可改
        class Inner1{
            public void print(){
                System.out.println("方法内部类"+i);
            }
        }
        Inner1 inner1 = new Inner1();
        inner1.print();
    }
    public void print3(){
        Animal cat = new Animal() {
            @Override
            public void speak() {
                System.out.println("我是猫，继承式内部类");
            }
        };
        cat.speak();
    }
    public void print4(){
        IJk iJk = new IJk() {
            @Override
            public void s() {
                System.out.println("接口式内部类");
            }
        };
        iJk.s();
    }
    public void print5(IJk iJk){
        iJk.s();
    }
}
abstract class Animal{
    abstract public void speak();
}
interface IJk{
    public void s();
}