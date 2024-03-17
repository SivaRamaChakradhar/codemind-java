import java.util.*;
import java.text.DecimalFormat;
public class Main
{
    public static void Avg(int a, int b)
    {
        DecimalFormat df = new DecimalFormat("0.00");
        double c = (a+b)/2.0;
        System.out.println("Average of"+" "+a+" "+"and"+" "+b+" "+"is: "+df.format(c));
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        Avg(a, b);
    }
}