import java.util.*;
public class Main
{
    public static void div(int x, int y)
    {
        System.out.println(x/y);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        div(a, b);
    }
}