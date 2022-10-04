import java.util.Arrays;

public class stringPalindrome{
    	public static void main(String[] args){
	    String name = "Naman";
		System.out.println(rev(name));
	}
	
	static boolean rev(String name){
        if(name == null || name.length() == 0){
            return true;
        }
	    name = name.toLowerCase();
	    
	    for(int i=0; i< name.length(); i++){
	        char start = name.charAt(i);
	        char end = name.charAt(name.length()-1-i);
	        
	        if(start != end){
	            return false;
	        }
	    }
	    return true;
	}
}