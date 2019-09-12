public class ReverseString {
	
	static void reverse(String name) {
		
		String[] nameArray = name.split(" ");
		
		for(int i=nameArray.length-1;i>=0;i--) {
			String result="";
			for(int j=nameArray[i].length()-1;j>=0;j--) {
				result=result+nameArray[i].charAt(j);
			}
			
			System.out.print(result +" ");	
				
			/*if(i==nameArray.length-1) {
				result = nameArray[i];
			}else {
				result = result+" " +nameArray[i];
			}*/
		}
		
	}
	
	
	
	
	public static void main(String args[]) {
		
		String name = "welcome to geeksForgeeks";
		
		reverse(name);
		
		
		
		
	}
	

}
