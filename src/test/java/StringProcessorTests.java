import org.junit.Test;

import java.net.PortUnreachableException;

import static org.junit.Assert.*;

public class StringProcessorTests {
    @Test
    public void testStringCopy1(){
        StringProcessor a = new StringProcessor();
        assertEquals("====",a.stringCopy("=",4));

    }
    @Test
    public void testStringCopy2(){
        StringProcessor a = new StringProcessor();
        assertEquals("",a.stringCopy("a",0));
    }
    @Test
    public void testStringCopy3(){
        StringProcessor a = new StringProcessor();
        try{
            a.stringCopy("a",-1);
        }
        catch (IllegalArgumentException error){
            System.err.println("Целое число меньше 0!");
        }
    }

    @Test
    public void testStringCoountIn1(){
        StringProcessor a = new StringProcessor();
        int b = a.stringCountIn("hellohelohello", "he");
        assertEquals(3,b);
    }
    @Test
    public void testStringCountIn2(){
        StringProcessor a = new StringProcessor();
        int b = a.stringCountIn("hellohelohello", "");
        assertEquals(0,b);
    }

    @Test
    public void testReplaceString1(){
        StringProcessor a = new StringProcessor();
        assertEquals("одиндватри4",a.replaceString("1234"));
    }
    @Test
    public void testReplaceString2(){
        StringProcessor a = new StringProcessor();
        assertEquals("4567",a.replaceString("4567"));
    }
    @Test
    public void testReplaceString3(){
        StringProcessor a = new StringProcessor();
        assertEquals("",a.replaceString(""));
    }

    @Test
    public void testDeleteElements(){
        StringBuilder a = new StringBuilder("123456789");
        StringProcessor c = new StringProcessor();
        String b = c.deleteSymbol(a);
        assertEquals("13579", b.toString());
    }
}
