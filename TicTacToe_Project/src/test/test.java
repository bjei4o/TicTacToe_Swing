package test;


public class test {

	
	public static void main(String[] args) {
		
		int [] table = {-3, -14, -5, 7, 9, 42, 8, 3};
		
		
		System.out.println(Solution(table));
	

	
	}
	
	
	public static String Solution(int[] T) {

		String season;
		int length = T.length; //=8
		int samplesPerSeason = length/4; //=2
		
		int max = Math.max(T[0], T[1]);
		int min = Math.min(T[0], T[1]);
		
		

		int tab[] = new int[T.length];
		String temp = Integer.toString(min);
		String temp2 = Integer.toString(max);
		season = "Min "+temp+" "+"Max "+temp2;
		return season;
	}
}

