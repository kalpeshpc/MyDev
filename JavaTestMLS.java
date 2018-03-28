
public class JavaTestMLS {
	
	public static String encode(int offset, String original) {
		String strData="";
		if(offset==1)
		{
			System.out.println("\n\nOld String:-"+original);
			strData=original.replace('b', 'c').replace('a', 'b');
			
		}else if(offset==-1)
		{
			System.out.println("\n\nOld String:-"+original);
			strData=original.replace('a', 'z').replace('b', 'a');
		}
		
		System.out.println("\nData Is:"+strData);
		
		
		return strData;
		 }
	
	


	public static void main(String[] args) {
		
		JavaTestMLS j=new JavaTestMLS();
		j.encode(1, "that is new keyword best will be best");
		j.encode(-1, "that is new keyword best will be best");
	}

}
