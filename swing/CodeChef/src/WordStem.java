import java.io.BufferedReader;
import java.io.InputStreamReader;


class WordStem {
	public static void main(String[] args){
		try{
		int t,n;
		String w[]=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		t=Integer.parseInt(br.readLine());
		while(t-->0){
			n=Integer.parseInt(br.readLine());
			w=new String[n];
			w=br.readLine().split(" ");
			int p=0,sub[]=new int[n],m=0;
			for (int i = 0,j=0; i < n; i++) {
				p=0;
				for (j = 0; j < n	; j++) {
					if(j!=i)
					if(w[j].contains(w[i])){
						p++;
					}
				}
				if(p==j-1){
					sub[m]=i;
					m++;
					}
			}
			int lex=0;
			if(m>1){	
				for (int i = 0; i <m; i++) {
					 lex=0;
					for (int j = 0; j < m; j++) {
						if(j!=i){
							if (w[sub[i]].compareTo(w[sub[j]])<0) {
								lex++;
							}
						}
					}
					if(lex==m-1){
						lex=sub[i];
						break;
					}
				}
				System.out.println(w[lex]);
			}
			else {
				System.out.println(w[sub[m-1]]);
			}
		}
		}
		catch(Exception e){}
	}
}
