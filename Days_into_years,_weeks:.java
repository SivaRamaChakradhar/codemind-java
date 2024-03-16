import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        int years = d/365;
        int weeks = (d%365)/7;
        System.out.println(years);
        System.out.println(weeks);
    }
}