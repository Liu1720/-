public class Test5 {
    public static void main(String[] args) {
        IPowerB powerB = new PowerBImpl();
        IPowerA powerA =new AdapterPowerA(powerB);
        work(powerA);

    }
    public static void work(IPowerA powerA){
        System.out.println("正在连接。。。");
        powerA.insert();
        System.out.println("工作结束。。");
    }
}
class AdapterPowerA implements IPowerA{
    private IPowerB powerB;
    public AdapterPowerA(IPowerB powerB){ this.powerB=powerB;}
    public void insert() {
        powerB.insert();
    }
}
interface IPowerA{
    public void insert();
}
class PowerAImpl implements IPowerA{

    public void insert() {
        System.out.println("A工作。。");
    }
}
interface IPowerB{
    public void insert();
}
class PowerBImpl implements IPowerB{

    public void insert() {
        System.out.println("B工作。。");
    }
}