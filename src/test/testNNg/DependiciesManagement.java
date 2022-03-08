import org.testng.annotations.Test;

public class DependiciesManagement {
    @Test(enabled = true)
    public  void highschool(){
        System.out.println("highschool");

    }
    @Test(dependsOnMethods = "highschool")
    public  void highersecondary(){
        System.out.println("highersecondary");

    }
    @Test(dependsOnMethods = "highersecondary")
    public void degree(){
        System.out.println("collage");
    }
}
