import java.util.*;
public class Main
{
    public static void rj(int x, int y, int z)
    {
        System.out.println((5*x+10*y)/z);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        rj(x, y, z);
    }
}