import java.io.*;
import java.util.*;

public class efficientalgo7
{
  public static void main(String args[])
  {
    int j,k;
    k=1;
    boolean A[]={true,true,false,false,true,true,false,true,true,false,true};
    elephantnutco(A,k);
    for(int z=0;z<A.length;z++)
        System.out.print(A[z]+" ");
  }

static void elephantnutco(boolean A[],int k)
  {
    for(int j=0;j<k;j++)
     Elephant.wicked(A);
  }

}

class Elephant
{
  static void wicked(boolean A[])
  {
    int i=0;
    while(i<A.length && A[i]==true)
    {
      A[i]=false;
      i++;
    }//while
    if(i<A.length)
        A[i]=true;
  }//wicked
}//Elephant
