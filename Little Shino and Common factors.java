//Little Shino and Common factors


/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.Scanner;
class TestClass {
    
    static long gcd(long a, long b) 
    { 
        if (a == 0)  
            return b; 
          
        return gcd(b%a,a); 
    } 
    
    static long getDiv(long a,long b) 
    { 
        // find gcd of a,b 
        long n = gcd(a, b); 
       
        // Count divisors of n. 
        int result = 0; 
        for (long i=1; i<=Math.sqrt(n); i++) 
        { 
            // if 'i' is factor of n 
            if (n%i==0) 
            { 
                // check if divisors are equal 
                if (n/i == i) 
                    result += 1; 
                else
                    result += 2; 
            } 
        } 
        return result; 
    } 
    
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        System.out.println(getDiv(a, b)); 

    }
}


  
    