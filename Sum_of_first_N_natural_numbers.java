import java.util.*;
public class Main{
    public static int add(int x)
    {
        return x*(x+1)/2;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res=add(n);
        System.out.println(res);
    }
}