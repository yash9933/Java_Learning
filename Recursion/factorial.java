public class factorial {
    public static void main(String[] args) {
		int i=5;
		int ans = 1;
		fact(ans, i);
	}
	
	static void fact(int ans, int n){
	    if(n == 0){
	        System.out.println(ans);
	        return;
	    }
	    ans = ans*n;
	    fact(ans, n-1);
	}
}