import java.util.*;
import java.io.*;
 
public class test1
{
    public static void main(String[] args) throws Exception
    {
		
        System.out.println("Enter string to reverse:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
        
       
        
        System.out.println("Reversed string is:");
        
 
		int count1 = 0;
		int count2=0;
		

      for (int i=0 ; i<str.length(); i++){
         char ch = str.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
            count1 ++;
         }
		 else if(ch==' '){
		
}
		else		 count2++;
      }
	  System.out.println(new StringBuffer(str).reverse().toString());
      System.out.println("The given string contains "+count1+ "vowels," +count2+"consonants");
   }
}