import java.util.*;
public class Solution{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        float loss = x-y;
        float f = (loss/x)*100;
        System.out.printf("%.2f", f);
    }
}