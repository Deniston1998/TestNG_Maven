import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionUnit {
    String name ="Denis";
    @Test
    public void unitTest(){
       /* if(name.equals("Denis")){
            System.out.println("name is correct");
        }
        else {
            System.out.println("not correct");
        }*/
        Assert.assertEquals(name,"denis");

    }
}
