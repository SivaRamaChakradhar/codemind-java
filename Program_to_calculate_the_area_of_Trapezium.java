import java.util.*;
import java.text.DecimalFormat;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
        int b1 = s.nextInt();
        int b2 = s.nextInt();
        int h = s.nextInt();
        double A = 0.5*(b1+b2)*h;
        System.out.println(df.format(A));
    }
}