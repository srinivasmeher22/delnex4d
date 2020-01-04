 class Wordbywordrev {  
public static String reverseWord(String str){  
    String words[]=str.split("\\s");  
    String reverseWord="";  
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";  
    }  
    return reverseWord.trim();  
}  
}  public class Stringrevword {  
	public static void main(String[] args) {  
    System.out.println(Wordbywordrev.reverseWord("This is the world of java")); 
    System.out.println(Wordbywordrev.reverseWord("Welcome to the world of java"));
    }  
}  