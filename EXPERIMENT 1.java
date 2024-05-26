//Write a program to display prime numbers between 1 to 100, and check wether the given number is prime or not. 

import java.util.Scanner; 

public class manu 
{ 
    public static void main(String[] args) 
    {      
        System.out.println("THIS IS CODE BY PRIANSHU KHALDE"); 
        Scanner sc = new Scanner(System.in); 
        for(int i = 2; i <= 100; i++) { 
            if(primu(i)) 
            { 
                System.out.print(i+" "); 
            } 
        } 
        System.out.println(); 
        System.out.println("Enter a number = "); 
        int number = sc.nextInt(); 
        boolean isprime = checkprime(number); 
        if (isprime) 
        { 
            System.out.println("Number is prime"); 
        } 
        else 
        { 
            System.out.println("Number is not prime"); 
        } 
    } 
    public static boolean checkprime(int number) 
    { 
        if(number <= 1) 
        { 
            return false; 
        } 
        for(int i = 2; i<=Math.sqrt(number); i++) 
        { 
            if(number%i == 0) 
            { 
                return false; 
            } 
        } 
        return true; 
    } 

    public static boolean primu(int num) 
    { 
        if(num <= 1) 
        { 
            return false; 
        } 
        for(int i = 2; i <= Math.sqrt(num); i++) 
        { 
            if(num % i == 0) { 
                return false; 
            } 
        } 
        return true; 
    } 
} 

// OUTPUT :  
// THIS CODE IS BY PRIANSHU KHALDE 
// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97  
// Enter a number = 5 
// Number is prime 