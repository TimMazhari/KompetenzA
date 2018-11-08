package garage;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class TestJunit {

   InputOutput inputOutputTest = new InputOutput();
    @Test
    /**
     * Testing first if the return value is set to null after initiation.
     *
     * Testing the regular String scanner by setting the "System.in" to a preset string. This way the scanner will
     * automatically be filled in
     */
    public void testStringInputOutput(){
        assertEquals(null, inputOutputTest.getInput());
        String input = "Test";
        InputStream in = new ByteArrayInputStream(input.getBytes()); //ByteArrayInputStream converts a String to a line of bytes. This way the System.In will accept the String.
        System.setIn(in);
        inputOutputTest.inputManager();
        assertEquals("Test", inputOutputTest.getInput());
    }

    @Test
    /**
     * Testing the scanner for the numbers. This works basically the same way as testing the strings, except that a number is expected.
     */
    public void testIntInputOutput(){
        assertEquals(0, inputOutputTest.getInputNumber());
        String inputString = "10"; //String needed because the number is first read as a string and afterwards converted to an int.
        InputStream in = new ByteArrayInputStream(inputString.getBytes()); //ByteArrayInputStream converts a String to a line of bytes. This way the System.In will accept the String.
        System.setIn(in);
        inputOutputTest.inputManagerNumber(0);
        assertEquals(10, inputOutputTest.getInputNumber());
    }

    @Test
    /**
     * Testing the scanner for the car attribute "status"
     */

    public void testBrokenInputOutput(){
        assertEquals(null, inputOutputTest.getInputBroken());
        String input = "broken";
        InputStream in = new ByteArrayInputStream(input.getBytes()); //ByteArrayInputStream converts a String to a line of bytes. This way the System.In will accept the String.
        System.setIn(in);
        inputOutputTest.inputManagerBroken(0);
        assertEquals("broken", inputOutputTest.getInputBroken());
    }
    @Test
    public void testRepairedInputOutput(){
        assertEquals(null, inputOutputTest.getInputBroken());
        String input = "repaired";
        InputStream in = new ByteArrayInputStream(input.getBytes()); //ByteArrayInputStream converts a String to a line of bytes. This way the System.In will accept the String.
        System.setIn(in);
        inputOutputTest.inputManagerBroken(0);
        assertEquals("repaired", inputOutputTest.getInputBroken());
    }

    @Test
    /**
     * Testing the scanner for the car attribute "sold"
     */

    public void testSoldInputOutput(){
        assertEquals(false, inputOutputTest.isInputBool());
        String input = "yes";
        InputStream in = new ByteArrayInputStream(input.getBytes()); //Since the user is asked to input the bool via yes or no, we need to do the string conversion again.
        System.setIn(in);
        inputOutputTest.inputManagerBool(0);
        assertEquals(true, inputOutputTest.isInputBool());
    }
}