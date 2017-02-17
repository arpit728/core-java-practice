import java.util.Scanner;


class DeceptiveSudz {
	
	static void sort(int wp[],int n){
	
			int temp;
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j <n-i-1; j++)
				{
					if (wp[j]<wp[j+1])
					{
						temp=wp[j];
						wp[j]=wp[j+1];
						wp[j+1]=temp;
					}
				}
			}
		}

	
	public static int calculateMinimumCoins(int coins[],int n,int knapsack){
		int minCoin=0;
		for (int j = 0; knapsack!=0; j++) {
			if (coins[j]<=knapsack)
			{
				knapsack-=coins[j];
				minCoin++;
			}
			else{
				knapsack=0;
			}
		}
		return ++minCoin;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int i = 0; i < t; i++) {
			
			int sum=0,knapsack=0,n=sc.nextInt();
			int coins[]=new int[n];
			
			for (int j = 0; j <n; j++) {
				coins[j]=sc.nextInt();
				sum=sum+coins[j];
			}
			
			knapsack=sum/2;

			sort(coins,n);
			
			System.out.println(calculateMinimumCoins(coins, n, knapsack));
		}
	}
}
