package Lec39_Sliding_Window;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababaaabaaaababbbbaa";
		int k = 2;
		int flip_a = maximum_perfectness(s, k, 'a');
		int flip_b = maximum_perfectness(s, k, 'b');
		System.out.println(Math.max(flip_a, flip_b));

	}

	public static int maximum_perfectness(String s, int k, char ch){
		int flip = 0;
		int n = s.length();
		int ans = 0;
		int si = 0;

		for(int i=0; i<n; i++){

			//grow
			if(s.charAt(i) == ch){
				flip++;
			}


			//shrink
			if (flip > k) {
				while (si < i && s.charAt(si) == ch){
					flip--;
					si++;
				}
			}


			//ans
			ans = Math.max(ans, i-si+1);
		}

		return  ans;

	}
}