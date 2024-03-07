import org.junit.*;
public class GreetTest {
    @Test
    public void test1() {
        Greet gre = new Greet();
        // assertEquals("Hello", greet.says());
        Assert.assertEquals("Hello", gre.says());
    }
    @Test
    public void test2() {
        Greet gre = new Greet();
        // assertEquals("Hello", greet.says());
        Assert.assertNotEquals("Hello", gre.says());
    }
    
}
