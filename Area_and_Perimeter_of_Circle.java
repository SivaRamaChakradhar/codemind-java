import java.util.*;
import java.text.DecimalFormat;
public class Main
{
    public static void area(int r)
    {
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println(df.format(3.14*r*r));
    }
    public static void peri(int r)
    {
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println(df.format(2*3.14*r));
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        area(r);
        peri(r);
    }
}