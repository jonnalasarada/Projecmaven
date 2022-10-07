import org.testng.annotations.Test;

public class Simple {

    @Test(priority = 1)
    void hi(){
        System.out.println("hi i am king");
    }
    @Test(priority  =2)
    void name(){
        System.out.println("i am a leader");

    }
    @Test(priority = 3)
    void shock(){
        System.out.println("i am not");
    }
}
