import java.util.Scanner;
class Multiply
{
public static void main(String args[])
{
int a[][],b[][],c[][],sum=0,r1,r2,c1,c2,i,j,k;
Scanner sc =new Scanner(System.in);
System.out.println("Enter no. of rows and columns of matrix 1 : ");
r1=sc.nextInt();
c1=sc.nextInt();
a=new int[r1][c1];
System.out.println("Enter no. of rows and columns of matrix 2 : ");
r2=sc.nextInt();
c2=sc.nextInt();
b=new int[r2][c2];
if(r2==c1)
{
	c=new int[r1][c2];
	System.out.println("Enter elements of matrix 1 : ");
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c1;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("Enter elements of matrix 2 : ");
	for(i=0;i<r2;i++)
	{
		for(j=0;j<c2;j++)
		{
			b[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<r1;i++)
	{	
		for(k=0;k<c2;k++)
		{
			sum=0;
			for(j=0;j<c2;j++)
			{
				sum=sum+(a[k][j]*b[j][k]);


			}
			c[i][k]=sum;
		}
	}
	for(i=0;i<r1;i++)
	{
		for(j=0;j<r2;j++)
		{
			System.out.print(c[i][j]+" ");
		}
		System.out.println("");
	}
}
else
{
	System.out.println("matrix multiplication not possible");
}
}
}