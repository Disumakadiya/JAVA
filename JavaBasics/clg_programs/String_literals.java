package JavaBasics.clg_programs;
// import java.lang.*;
public class String_literals
 {
    public static void main(String[] args) 
    {
        String str1 = "Disu";//string pool
        // String str3 = "Disu"; // This will not create a new object,
        // String str1 = "Makadiya";
        String str2 = new String("Disu");//heap memory
        // String str2 = new String("Makadiya"); // This will create a new object in heap memory
  
        System.out.println(str1);
        // System.out.println(str1);
        System.out.println(str2);
         System.out.println("str1 == str2: " + (str1 == str2));
         System.out.println("str1.equals(str2): " + str1.equals(str2));
         String str3=str2.intern();// Interning the string object
        System.out.println("str1 == str3: " + (str1 == str3));
    //    calculate length
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of str2: " + str2.length());
        System.out.println("Length of str3: " + str3.length());
        
        // Example of String methods
        System.out.println("Uppercase str1: " + str1.toUpperCase());
        System.out.println("Lowercase str2: " + str2.toLowerCase());
        System.out.println("Substring of str1 (0, 2): " + str1.substring(0, 2));

        //character at index
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
        System.out.println("Character at index 2 in str2: " + str2.charAt(2));
        System.out.println("Character at index 3 in str3: " + str3.charAt(3));

        //last index of character
        System.out.println("Last index of 'i' in str1: " + str1.lastIndexOf('i'));
        System.out.println("Last index of 's' in str2: " + str2.lastIndexOf('s'));
        System.out.println("Last index of 'u' in str3: " + str3.lastIndexOf('u'));

        //index of character
        System.out.println("Index of 'D' in str1: " + str1.indexOf('D'));
        System.out.println("Index of 'i' in str2: " + str2.indexOf('i'));
        System.out.println("Index of 's' in str3: " + str3.indexOf('s'));

        //example of substring
        System.out.println("Substring of str1 (0, 3): " + str1.substring(0));
        System.out.println("Substring of str2 (1, 4): " + str2.substring(1, 4));   

        //argurment have negative index which method is that
        //contains method
        System.out.println("Does str1 contain 'is'? " + str1.contains("is"));
        System.out.println("Does str2 contain 'Su'? " + str2.contains("Su"));

        //ignore case
        System.out.println("Does str1 equal 'disu' (ignore case)? " + str1.equalsIgnoreCase("disu"));
        System.out.println("Does str2 equal 'DISU' (ignore case)? " + str2.equalsIgnoreCase("D ISU"));

        //touppercase and lowercase
        System.out.println("str1 in uppercase: " + str1.toUpperCase());
        System.out.println("str2 in lowercase: " + str2.toLowerCase());

        //first letter capital then rest small
        System.out.println("str1 with first letter capital: " + str1.substring(0, 1).toUpperCase() + str1.substring(1).toLowerCase());
        System.out.println("str2 with first letter capital: " + str2.substring(0, 1).toUpperCase() + str2.substring(1).toLowerCase());

        //trim method
        String str4 = "   HelloWorld!";
        System.out.println("Trimmed str4: '" + str4.trim() + "'");
        System.out.println("str1 after trim: '" + str1.trim() + "'");
        System.out.println("str2 after trim: '" + str2.trim() + "'");   
        System.out.println("str3 after trim: '" + str3.trim() + "'");

        //ltrim and rtrim
        String str5 = "   HelloWorld!   ";
        System.out.println("Left trimmed str5: '" + str5.replaceAll("^\\s+", "") + "'");
        System.out.println("Right trimmed str5: '" + str5.replaceAll("\\s+$", "") + "'");

        //replace method(old,new)
        String str6 = "Hello World!";   
        System.out.println("str6 after replacing 'World' with 'Java': " + str6.replace("World", "Java"));

        //split method--immutable
        String str7 = "Java,Python,C++,JavaScript"; 
        String[] languages = str7.split(",");
        System.out.println("Languages after split:");   
        for (String lang : languages) {
            System.out.println(lang);
        }
         //string builder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World!");
        System.out.println("StringBuilder content: " + sb.toString());
        sb.insert(5, ",");
        System.out.println("After insert: " + sb.toString());
        sb.delete(5, 6);
        System.out.println("After delete: " + sb.toString());
        sb.reverse();
        System.out.println("After reverse: " + sb.toString());

        // StringBuffer example
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World!");
        System.out.println("StringBuffer content: " + sbf.toString());
        sbf.insert(5, ",");
        System.out.println("After insert: " + sbf.toString());
        sbf.delete(5, 6);
        System.out.println("After delete: " + sbf.toString());
        sbf.reverse();
        System.out.println("After reverse: " + sbf.toString());

    }
}
   
// example of intern method in Java:
// class StringInternExample {  
//     public static void main(String[] args) {
//         String str1 = "Disu"; // String literal in the string pool       
//         String str2 = new String("Disu"); // String object in heap memory
//         String str3 = str2.intern(); // Interning the string object

//         System.out.println("str1.equals(str2): " + str1.equals(str2));
//         // compare 2 object with == operator
//         System.out.println("str1 == str2: " + (str1 == str2));
//     }
// }