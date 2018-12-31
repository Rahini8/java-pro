import java.io.*;
import java.util.*;
public class candies
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int number=s.nextInt();
    int count=1;
    int flag=1;
    int a[]=new int[number];
    for(int i=0;i<number;i++)
    {
      a[i]=s.nextInt();
      if(i!=0)
      {
        if(a[i-1]<a[i])
          flag=flag+1;
        else
          flag=1;
        count+=flag;
      }
    }
    System.out.println(count);
  }
}
