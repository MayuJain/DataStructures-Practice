import java.util.*;

//Strings are case-sensitive
public class AnagramCheck {
	
	public static boolean isAnagram(String string1, String string2) {
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		if(string1.length() != string2.length()){
		    return false;
		}else{
		    for(Character x: string1.toCharArray()){
		        if(hm.keySet().contains(x)){
		            hm.put(x,hm.get(x)+1);
		        }else{
		            hm.put(x,1);
		        }
		    }
		    
		    for(Character x: string2.toCharArray()){
		        if(!hm.keySet().contains(x)){
		            return false;
		        }
		        if(hm.keySet().contains(x)){
		            hm.put(x,hm.get(x)-1);
		        }else{
		        	 return false;
		        }
		    }
		    //System.out.println(hm.toString());
		    for(Integer x:hm.values()) {
		    	if(x!=0) {
		    		 return false;
		    	}
		    }
		    return true;
	 
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		boolean result = AnagramCheck.isAnagram("INTEGRAL", "TRIANGLE");
		System.out.println(result);
	}
}