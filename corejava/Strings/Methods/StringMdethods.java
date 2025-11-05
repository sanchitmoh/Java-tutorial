package Strings.Methods;

public class StringMdethods {
    public static void main(String[] args) {
        // str.length() - returns the length of the string
        String str1= "Hello World";

        int length = str1.length();
        System.out.println("Length of the string: " + length);

        // str.charAt(index) - returns the character at the specified index
        char ch = str1.charAt(0);
        System.out.println("Character at index 0: " + ch);

        // concat(str) - concatenates the specified string to the end of the current string
        String str2 = " Java";
        String concatenatedString = str1.concat(str2);
        System.out.println("Concatenated String: " + concatenatedString);

        // str.indexOf(substring) - returns the index of the first occurrence of the specified substring
        int index = str1.indexOf("World");
        System.out.println("Index of 'World': " + index);


        // str.substring(startIndex, endIndex) - returns a substring from the specified start index to the end index
        String substring1 = str2.substring(0, 4);
        System.out.println("Substring from index 0 to 4: " + substring1);

        String substring = str1.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + substring);

        //concat(str) - concatenates the specified string to the end of the current string
        String str3 = "Welcome to Java";
        String concatenated = str1.concat(" " + str3);
        System.out.println("Concatenated String: " + concatenated);

        // str.toLowerCase() - converts the string to lowercase
        String str4 = "HELLO WORLD";
        String Lower= str4.toLowerCase();
        System.out.println("Lowercase String: " + Lower);

       // str1.toUpperCase();
        // str.toUpperCase() - converts the string to uppercase
        String str5 = "hello world";
        String Upper = str5.toUpperCase();
        System.out.println("Uppercase String: " + Upper);

        // str.trim() - removes leading and trailing whitespace from the string
        String str6 = "   Hello World   ";
        String trimmedString = str6.trim();
        System.out.println("Trimmed String: '" + trimmedString + "'");

        // str.replace(oldChar, newChar) - replace all old charchater occurences with new character
        String str7="hello world";
        String replacedString = str7.replace('o', 'a');
        System.out.println("Replaced String: " + replacedString);

        String str8="hello world";
        System.out.println(str8);






    }
}
