package com.smu.mscda;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.codec.digest.DigestUtils;

public class StringProcessorForCapitalization {

    public String capitalize(String input) {
        String result = StringUtils.capitalize(input);
        System.out.println("Capitalized String: " + result);
        return result;
    }

    public String generateMd5Hex(String input) {
        String result = DigestUtils.md5Hex(input);
        System.out.println("MD5 Hex: " + result);
        return result;
    }

    public static void main(String[] args) {
        StringProcessorForCapitalization processor = new StringProcessorForCapitalization();

        System.out.println("This program will capitalize the input string and Generate MD5 hex\n");
        System.out.println("Enter the input string :");
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        processor.capitalize(input);
        processor.generateMd5Hex(input);
    }
}
