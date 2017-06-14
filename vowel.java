import java.io.*;
import java.util.Scanner;
public class vowel
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char s1=s.next().charAt(0);
if(s1=='a' || s1=='e' || s1=='i' || s1=='o' || s1=='u')
{
System.out.println("vowel");
}
else
{
System.out.println("consonants");
}
}
}
