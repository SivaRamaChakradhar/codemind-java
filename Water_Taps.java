import java.util.*;
public class main{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = (x*y)/(x+y);
        System.out.println(z);
    }
}