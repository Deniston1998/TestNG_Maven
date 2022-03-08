import org.testng.annotations.Test;

public class Grouping {
    @Test(groups = {"apple"})
    public void apple1(){
        System.out.println("apple");
    }
    @Test(groups = {"apple"})
    public void apple2(){
        System.out.println("apple");
    }
    @Test(groups = {"moto"})
    public void moto1(){
        System.out.println("moto");
    }
    @Test(groups = {"oneplus"})
    public void oneplus1(){
        System.out.println("1plus");
    }
    @Test(groups = {"oneplus"})
    public void oneplus2(){
        System.out.println("1plus");
    }
}
