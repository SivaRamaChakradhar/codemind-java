import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = (a*a)+(b*b);
        
        System.out.printf("%.2f", Math.sqrt(c));
    }
}