import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%3==0 && n%5!=0 && n%7!=0)
        {
            System.out.println("Pling");
        }
        else if(n%5==0 && n%3!=0 && n%7!=0)
        {
            System.out.println("Plang");
        }
        else if(n%7==0 && n%3!=0 && n%5!=0)
        {
            System.out.println("Plong");
        }
        else if(n%7==0 && n%3==0 && n%5!=0)
        {
            System.out.println("PlingPlong");
        }
        else if(n%7==0 && n%3!=0 && n%5==0)
        {
            System.out.println("PlangPlong");
        }
        else if(n%7!=0 && n%3==0 && n%5==0)
        {
            System.out.println("PlingPlang");
        }
        else
        {
            System.out.println(n);
        }
    }
}