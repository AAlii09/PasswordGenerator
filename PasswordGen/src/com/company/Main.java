package com.company;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Set the desired length of the password
        int passwordLength = 15;
        // Initialize a character array to hold the password
        char[] password = new char[passwordLength];
        // Initialize a new Random object to generate random indices for the password characters
        Random random = new Random();

        // Define arrays containing the characters that can be used in the password
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        char[] lowerCaseAlphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] upperCaseAlphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] symbols = {'!', '@', '#', '$', '%', '^', '&', '*'};

        // Build a string containing all the valid characters that can be used in the password
        StringBuilder validCharsBuilder = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            // Convert each digit to a char and add it to the validCharsBuilder
            validCharsBuilder.append(Character.forDigit(numbers[i], 10));
        }
        validCharsBuilder.append(lowerCaseAlphabet);
        validCharsBuilder.append(upperCaseAlphabet);
        validCharsBuilder.append(symbols);

        // Convert the StringBuilder to a String
        String validChars = validCharsBuilder.toString();

        // Generate the password by selecting random characters from the validChars string
        for (int i = 0; i < passwordLength; i++) {
            // Generate a random index in the validChars string
            int randomIndex = random.nextInt(validChars.length());
            // Select the character at the random index and add it to the password array
            password[i] = validChars.charAt(randomIndex);
        }

        // Convert the password character array to a String and print it out
        String generatedPassword = new String(password);
        System.out.println("Generated Password: " + generatedPassword);
    }
}
