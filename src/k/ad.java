package k;

import java.util.Scanner;

public class ad {

  public static void main(String[] args) {
    
    Scanner s =new Scanner(System.in);
    int n=s.nextInt();
    int[] c=new int[n];
    for(int i=0;i<n;i++){
    	int a=s.nextInt();
    	int b=s.nextInt();
    	int ad=0;
    	for(int j=a;j<=b;j++){
    		if(j%2!=0)
    			ad=ad+j;
    	}
    	c[i]=ad;
    	
    }
    for(int i=0;i<n;i++)
    {
    	System.out.printf("Case%d : %d\n",i+1,c[i]);
    }
    
  }

}
