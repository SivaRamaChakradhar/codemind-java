import java.util.*;
public class Main{
    public static void Sv(int x)
    {
        System.out.println("Surface area = "+6*x*x + " and Volume = "+x*x*x);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        Sv(a);
    }
}