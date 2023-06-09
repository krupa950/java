package string;

import java.util.Scanner;

public class reversee {
 /**
 * @param args
 */
public static void main(String[] args) {
    System.out.println("enter the string you want to reverse");
    Scanner sc= new Scanner(System.in);
    String mystr=sc.nextLine(),rev="";
    int len;
    char ch[]=mystr.toCharArray();
    len=ch.length-1;
    while(len>=0)
    {
        rev=rev+ ch[len];
        len--;

    }
    System.out.println(rev);
    sc.close();

 }
    
}
