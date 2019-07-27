//Fredo and Array Update

import java.util.*;
class TestClass {
    
public static void main(String args[] ) throws Exception {
  
Scanner s = new Scanner(System.in);
int len=s.nextInt();
int sum=0;
int a[]=new int[len];
for(int i=0;i<len;i++)
{
a[i]=s.nextInt();
sum=sum+a[i];
}
System.out.println((sum/len)+1);

}
}