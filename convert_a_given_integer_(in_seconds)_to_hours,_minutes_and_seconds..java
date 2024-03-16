import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int S = s.nextInt();
        int h = S/(3600);
        int m = (S%3600)/60;
        int sec = S%60;
        System.out.println("H:M:S-"+h+":"+m+":"+sec);
        
    }
}