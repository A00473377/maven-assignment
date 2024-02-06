package com.smu.mscda;
import org.junit.Assert;
import org.junit.Test;

public class StringProcessorForCapitalizationTest {

    @Test
    public void testCapitalize() {
        StringProcessorForCapitalization processor = new StringProcessorForCapitalization();
        String input = "test";
        String result = processor.capitalize(input);
        Assert.assertEquals("Test", result);
    }

    @Test
    public void testGenerateMd5Hex() {
        StringProcessorForCapitalization processor = new StringProcessorForCapitalization();
        String input = "test";
        String result = processor.generateMd5Hex(input);
        Assert.assertEquals("098f6bcd4621d373cade4e832627b4f6", result);
    }
}
