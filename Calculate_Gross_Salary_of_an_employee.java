import java.util.*;
import java.text.DecimalFormat;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double bs = s.nextDouble();
        double hra = s.nextDouble();
        double da = s.nextDouble();
        double pf = (12/100.0)*bs;
        double gs = bs+hra+da+pf;
        System.out.println(df.format(pf));
        System.out.println(df.format(gs));
    }
}