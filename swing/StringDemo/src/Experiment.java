
class Experiment {
	
	public static void main(String[] args) {
		String s1="a",s2="ba";
		StringBuilder s=new StringBuilder(s1.concat(s2));
		System.out.println(s);
		if(s.equals(s.reverse())){
			System.out.println("awesome pair");
		}
	}

}
