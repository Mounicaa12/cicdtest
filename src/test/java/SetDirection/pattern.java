package SetDirection;

import java.util.Arrays;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int c=0;
	String[][] arr =new String[n][n];
		for (int i=n-1;i>=0;i--)
		{
			c=0;
			for (int j=0;j<n;j++)
			{
				c=i-j;
				while(c<=n-1)
				{
					arr[i][j]="*";
					System.out.println(arr[i][j]);
					c++;
				}
			}
			
			
		}
	}
}
