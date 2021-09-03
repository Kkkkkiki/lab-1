import java.util.*;
import java.io.*;


class Main {
  public static void main(String[] args) {
    
    //Read the Words
    TextReader txt = new TextReader("small.txt");
    ArrayList<String> allWords = txt.getAllWords();

    // Clean the Words 
    StringAnalyzer sz = new StringAnalyzer();
    ArrayList<String> cleanWords = sz.getListOfCleanWords(allWords);

    //Count the Words
    Counter ct = new Counter();
    ct.countAllWords(cleanWords);

    //Print the top word
    System.out.println(ct.getTopWord());
  }
}