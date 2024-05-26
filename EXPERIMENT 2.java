//PROGRAM TO REVERSE A STRING

import java.util.Scanner; 
public class priansu { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a string: "); 
        String inputString = sc.nextLine(); 
        String reversedString = reverse(inputString);  
        System.out.println("Reversed string: " + reversedString); 
    } 
    public static String reverse(String str) { 
        StringBuilder reversed = new StringBuilder(); 
        for (int i = str.length() - 1; i >= 0; i--) { 
            reversed.append(str.charAt(i)); 
        } 
        return reversed.toString(); 
    } 
} 

// OUTPUT :  
// Enter a string: prianshu khalde 
// Reversed string: edlahk uhsnairp 
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
// PROGRAM TO REVERSE AN ARRAY

import java.util.Scanner; 
public class khalde { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the size of the array: "); 
        int count = sc.nextInt(); 
        int[] numbers = new int[count]; 
        System.out.println("Enter " + numbers.length + " double numbers:"); 
        for (int i = 0; i < numbers.length; i++) { 
            numbers[i] = sc.nextInt(); 
        } 
        System.out.println("Original order:"); 
        for (int i = 0; i < numbers.length; i++) { 
            System.out.print(numbers[i] + " "); 
        } 
        System.out.println("\nReverse order:"); 
        for (int i = numbers.length - 1; i >= 0; i--) { 
            System.out.print(numbers[i] + " "); 
        } 
    } 
} 

// OUTPUT Enter the size of the array: 5 
// Enter 5 double numbers: 
// 1 2 3 4 5 
// Original order: 
// 1 2 3 4 5  
// Reverse order: 
// 5 4 3 2 1 
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
// PROGRAM FOR CONCATENATION OF TWO STRINGS

import java.util.Scanner; 
public class concatenation { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the first string: "); 
        String str1 = sc.nextLine(); 
        System.out.print("Enter the second string: "); 
        String str2 = sc.nextLine(); 
        String concatenatedString = str1 + " " + str2; // Concatenation using the + operator 
        System.out.println("Concatenated string: " + concatenatedString); 
    } 
}

// OUTPUT :  
// Enter the first string: Prianshu  
// Enter the second string: Khalde 
// Concatenated string: Prianshu Khalde 
