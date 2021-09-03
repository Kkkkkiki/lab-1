import java.util.*;

class Counter
{
  HashMap<String, Integer> allWordsCount;

  public Counter()
  {
    allWordsCount = new HashMap<>();
  }

  /**
  * Receives and ArrayList of strings.
  * Keeps a count for each string in the allWordsCount HashMap
  * Returns the allWordsCount Hashmap once finished. 
  **/
  public HashMap<String, Integer> countAllWords(ArrayList<String> allWords)
  {
    //A for loop that starts from 0, +1 each time and ends when it reaches all words size
    for (int i = 0; i < allWords.size(); i++)
    {
      //If the hashmap (allwordscount) containsKey(Object key) has a word that matches with the word that you are getting
      if (allWordsCount.containsKey(allWords.get(i)))
      {
        // You put the new word and new value into the hashmap, and this will inserts a new key value (which is the word) and a new value that has added 1 to the previous value.
        allWordsCount.put(allWords.get(i), allWordsCount.get(allWords.get(i)) + 1);
      }
      else
      {
        //if it is a brand new word, you just insert a new value into the hashmap and set a value of 1
        allWordsCount.put(allWords.get(i), 1);
      }
    }
      return allWordsCount;
  }

  /**
  * Finds the word with the highest count in the allWordsCount     
  * HashMap.
  * Return a string with the format "The top word is -----, which  
  * appears ## times."
  **/
  public String getTopWord()
  {
    int max = 0;
    String maximum = "";
    StringAnalyzer sz = new StringAnalyzer();

//Set keySet(): Returns the Set of the keys fetched from the map.
//Going through the list 1 by 1 and insert them into the string i
    for (String i : allWordsCount.keySet())
    {
      if (allWordsCount.get(i) > max)
      {
        //word will be replaced if there is a word that has a higher value
        maximum = i; 
        max = allWordsCount.get(i);
        
      }
    }
    maximum = sz.getOneCleanWord(maximum);
    return ("The top word is" + maximum + ", which appears" + max + "times");
  }
}