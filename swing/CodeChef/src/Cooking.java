import java.io.BufferedReader;
import java.io.InputStreamReader;
class Cooking {
	public static void main(String[] args) {
		int a=0,b=0,t=0,min=0,i=1;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		try {
			t=Integer.parseInt(reader.readLine());
			 
			do
			{
				min=0;
				
				String[]s=reader.readLine().split(" ");
				a=Integer.parseInt(s[0]);
				b=Integer.parseInt(s[1]);
				
				
				if(a<b && (isPowerOfTwo(a)))min=giveMinimumCount(a, b);
				else if(a<b){
					while(a!=1&&a!=2)
					{
						if(a%2==0){
							if(isPowerOfTwo(a))break;
							else a=a/2;
						}
						else{
							a=(a-1)/2;
						}
						min++;
					}
					min=min+giveMinimumCount(a, b);
				}
				else{
					while(a!=b){
						if(a%2==0)a=a/2;
						else{
							a=(a-1)/2;
						}
						min++;
					}
				}
				i++;
				System.out.println(min);
			}while(i<=t);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
	}
	
	static boolean isPowerOfTwo(int n)
	{
	  if (n == 0)
	    return false;
	  while (n != 1)
	  {
	    if (n%2 != 0)
	      return false;
	    n = n/2;
	  }
	  return true;
	}
	
	static int giveMinimumCount(int a,int b){
		int min=0;
		while(a!=b){
			a=a*2;
			min++;
		}
		return min;
	}

}
