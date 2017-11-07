package com.additionaltasks;

import org.junit.*;

public class StreamTest {
    Stream stream = new Stream("");
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void getReverseWord_forGivenWord(){
        //Given
        String word = "Ksiazka";
        //When
        String result = stream.getReverseWord(word);
        //Then
        Assert.assertEquals("akzaisK", result);
    }

    @Test
    public void checkIfGivenTextIsNumber_forString() throws MessageNumberException {
        //Given
        String text = "s25";
        //When
        int d = stream.checkIfGivenTextIsNumber(text);
        //Then
        Assert.assertEquals(0, d);
    }

    @Test
    public void checkIfGivenTextIsNumber_forNumber() throws MessageNumberException{
        //Given
        String text = "25";
        //When
        int d = stream.checkIfGivenTextIsNumber(text);
        //Then
        Assert.assertEquals(7, d);
    }

}
