import java.lang.reflect.Array;
/**Write a program to set up an array of places, Loop round and remove the vowels. Display the new words in console
 Input:
 India
 United States
 Germany
 Egypt
 czechoslovakia

 Output:
 Place Name without Vowels:0 Ind
 Place Name without Vowels:1 Untd Stts
 Place Name without Vowels:2 Grmny
 Place Name without Vowels:3 Egypt
 Place Name without Vowels:4 czchslvk**/
public class ArrayOfPlaces
{
    public Array[] removeVowels(String arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            String str=arr[i];
            for(int j=0;j<str.length();j++)
            {
                char[] pompom=str.toCharArray();
                if(pompom.equals("a")||pompom.equals("e")||pompom.equals("i")||pompom.equals("o")||pompom.equals("u"))
                {
                   str.replace("a",null);
                    str.replace("e",null);
                    str.replace("i",null);
                    str.replace("o",null);
                    str.replace("u",null);
                }
            }
        }
    }return
}
