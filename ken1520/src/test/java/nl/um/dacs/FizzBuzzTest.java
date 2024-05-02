package nl.um.dacs;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FizzBuzzTest 
{

    @Test
    public void negativeNumberTest()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(-1);
    }

    @Test
    public void zeroNumberTest()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(0);
    }

    @Test
    public void fizzBuzzTest()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertTrue(fizzBuzz.fizzBuzz(3).equals("fizz"));
        assertTrue(fizzBuzz.fizzBuzz(5).equals("buzz"));
        assertTrue(fizzBuzz.fizzBuzz(15).equals("fizz buzz"));
        assertTrue(fizzBuzz.fizzBuzz(1).equals("1"));
    }
}
