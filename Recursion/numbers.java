public class numbers{
	public static void main(String[] args) {
		oneToN(5);
		nToOne(5);
	}
	
	//PRINTS NUMBER FROM 1 TILL N
	static void oneToN(int n){
	    if(n == 0){
	        return;
	    }
	    oneToN(n-1);
	    System.out.println(n); 
	}
	
	//PRINTS NUMBER FROM N TILL 1
	static void nToOne(int n){
	    if(n == 0){
	        return;
	    }
	    System.out.println(n);
	    nToOne(n-1);
	}
}