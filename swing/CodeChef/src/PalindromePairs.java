import java.io.BufferedReader;
import java.io.InputStreamReader;


class PalindromePairs {	
	public static void main(String[] args){
		try{
			int t,n;
			String w[]=null;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			t=Integer.parseInt(br.readLine());
			while(t-->0){
				n=Integer.parseInt(br.readLine());
				w=new String[n];
				for (int i = 0; i < w.length; i++) {
					w[i]=br.readLine();
				}
				int m=0,p=0;
				for (int i = 0,j=0; i < n; i++) {
					for (j = 0; j < n	; j++) {
						if(i!=j){
							String s=w[i].concat(w[j]);
							StringBuilder s1=new StringBuilder(s);
							s1.reverse();
							if(s.equals(s1.toString())){
								p++;
							}
						}
							
					}
				}
				System.out.println(p);
			}
			
		}
		catch(Exception e){}
	
	}

}
