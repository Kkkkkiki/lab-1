import java.util.*;

class StringAnalyzer
{
  ArrayList<String> allCommonWords;

  public StringAnalyzer()
  {
    TextReader commonWords = new TextReader("commonWords.txt");
    this.allCommonWords = commonWords.getAllWords();
  }
  
  /**
  * Receives a string and returns the same word but only after "cleaning it". Returns null if the word is a common word or empty
  **/
  public String getOneCleanWord(String word)
  {
    //Instructions : 1. get rid of punctuation
    //2. make all lowercase
    //3. check if is a common word, which should not also be empty string, and should return null if common word, else return new cleaned word
String newWord = word.replaceAll("[^a-zA-z]","");
newWord = newWord.toLowerCase();
//returns a string that provides a string with all leading and trailing white spaces removed. 
newWord = newWord.strip(); 

if(allCommonWords.contains(newWord))
{
  return null;
}
else{
    return newWord;
}
  }
  /**
  * Receives a list of words. For each word, use getOneCleanWord to clean it. 
  * GetOneCleanWord should return null if the word is empty or common.
  * Return an ArrayList of words that getOneCleanWord does not deem as null.
  * Return the ArrayList which should contain only clean words. 
  **/
  public ArrayList<String> getListOfCleanWords(ArrayList<String> listOfWords)
  {
    ArrayList<String> listOfCleanWords = new ArrayList<String>();
     //loop through each word
for(int index = 0; index < listOfWords.size(); index++)
    {
      String word = listOfWords.get(index);
      //get a clean version of each word
      String newWord = getOneCleanWord(word);
      
      if(newWord != null)
      {
      listOfCleanWords.add(newWord);
      }
    }
//return the a new list with only clean words. 
    return listOfCleanWords;
  }


}