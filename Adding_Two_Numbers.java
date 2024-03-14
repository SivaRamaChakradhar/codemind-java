import java.util.*;
public class Main
{
    public static int sum(int x, int y)
    {
        return x+y;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int result = sum(a, b);
        System.out.println(result);
    }
}