import java.util.*;

public class lcoJavaCCDay3{
    public static void main(String[] args){
        int c;
        Scanner scn = new Scanner(System.in);
        System.out.println("Required Water? ");
        int x = scn.nextInt();
        System.out.println("Available Size of Cups?");
        int a = scn.nextInt();
        int b = scn.nextInt();
        if(x>a+b){
            System.out.println("Not Possible as required quantity is greater than available cups");
        }
        else if(x==a+b){
            System.out.println("Pour water into both cups and use");
        }
        else if(x<a+b){
            if(a>b){
                c=a-b;
                if(c==x)
                    System.out.println("pour water to first cup and empty to second cup then use remaining water in first cup");
                else{
                    System.out.println("not possible!");
            }
            }
            else if(b>a){
                c=b-a;
                if(c==x)
                    System.out.println("pour water to second cup and empty to first cup then use remaining water in second cup");
                else{
                    System.out.println("not possible!");
            }
            }
        }
    }
}
