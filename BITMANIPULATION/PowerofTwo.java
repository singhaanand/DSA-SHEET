package BITMANIPULATION;
import java.util.*;

public class PowerofTwo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// check number is power of two or not
        if(n<=0){
            System.out.print("FALSE");
        }
        else if((n & (n-1))==0){
            System.out.print("TRUE");
        }else{
            System.out.print("FALSE");
        }
    }
}

// Power of 2 numbers ka binary form hota hai

// 1      -> 1
// 2      -> 10
// 4      -> 100
// 8      -> 1000
// 16     -> 10000

// Matlab sirf 1 bit set hoti hai.
// Jab hum n - 1 karte hain:

// Example: n = 8
// 8  = 1000
// 7  = 0111
// -----------
// &   0000