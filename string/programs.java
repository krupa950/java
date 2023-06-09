package string;

class program
{
    public  void vowels()
    {
        int vCount = 0, cCount = 0;    
            
        //Declare a string    
        String str = "hello world";    
            
        //Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                //Increments the vowel counter    
                vCount++;    
            }    
            //Checks whether a character is a consonant    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                //Increments the consonant counter    
                cCount++;    
            }    
        }    
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount);
    }


    public void Convert()
    {
    String str1="Great Power";
    StringBuffer str = new StringBuffer(str1);
    for(int i=0;i<str1.length();i++)
    {
    if(Character.isLowerCase(str1.charAt(i)))
    {
        str.setCharAt(i,Character.toUpperCase(str1.charAt(i)));
    }
    else if(Character.isUpperCase(str1.charAt(i)))
    {
        str.setCharAt(i,Character.toLowerCase(str1.charAt(i)));
    }  
    }
    System.out.println(str);
    }
}
    


public class programs {
    public static void main(String[] args) {

        program obj1= new program();
        obj1.vowels();
        obj1.Convert();
        
    }
    
}
