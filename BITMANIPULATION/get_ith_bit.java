package BITMANIPULATION;
import java.util.*;
public class get_ith_bit {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no.: ");
    int n=sc.nextInt();
    System.out.println("Enter the i: ");
    int i=sc.nextInt();

    int bitmask=1<<i;
    if((n & bitmask)==0){
        System.out.print("0");
    }else{
            System.out.println("1");

    }
  
}
}
