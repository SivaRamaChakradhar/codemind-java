import java.util.*;
public class Main
{
    public static void area(int b, int h)
    {
        double A;
        A = 0.5*b*h;
        System.out.println((int)(A));
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int h = s.nextInt();
        area(b, h);
    }
}