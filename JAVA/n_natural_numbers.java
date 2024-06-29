package JAVA;
import java.util.*;

public class n_natural_numbers{
    public static void main(String[] args){
        System.out.println("Enter a natural number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i =1; i<=n; i++){
            sum=sum+i;
        }
        System.out.println("Sum of first "+n+" natural numbers is : "+sum);
    }
}