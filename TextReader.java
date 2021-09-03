import java.util.*;
import java.io.*;

class TextReader
{
  String filename;
  ArrayList<String> allWords;

  private TextReader()
  {

  }

  public TextReader(String filename)
  {
    this.filename = filename;
    this.allWords = new ArrayList<String>();
    storeAllWords();
  }

  /**
  * This method reads one word at a time from a file and stores it in an ArrayList
  * You can use getter methods to use the words read in other classes. 
  **/
  private void storeAllWords()
  {
    try
    {
        Scanner sc = new Scanner(new File(filename));

        while(sc.hasNext())
        {
            String word = sc.next();
            allWords.add(word);
        }
    }
    catch(Exception err)
    {
      System.out.println(err);
    }
  }

  public ArrayList<String> getAllWords()
  {
    return allWords; 
  }

  public String getFileName()
  {
    return filename;
  }

  public void setFilename(String filename)
  {
    this.filename = filename;
  }

}