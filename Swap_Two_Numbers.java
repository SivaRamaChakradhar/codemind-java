import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int t = a;
        a = b;
        b = t;
        System.out.println(a);
        System.out.println(b);
    }
}