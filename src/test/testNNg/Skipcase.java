import org.testng.annotations.Test;

public class Skipcase{
    @Test(priority = 0)
    public void startthecae(){
        System.out.println("start the car");
    }
    @Test(priority = 4,enabled = false)
    public void music(){
        System.out.println("music on");}

    @Test(priority = 1)
    public void putfirstGear(){
        System.out.println("first gear");
    }
    @Test(priority = 2)
    public void putsecondGear() {
        System.out.println("second gear");
    }
    @Test(priority = 3)
    public void putthirdGear() {
        System.out.println("third gear");
    }
}


