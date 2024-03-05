import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int i, j, n;
        n= s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}