package myapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TextStats {
    
    //member
    private String filename;

    //constructor
    public TextStats(){}

    public TextStats(String filename){
        this.filename = filename;
    }

    //getters and setters
    public String getFilename() {return filename;}
    public void setFilename(String filename) {this.filename = filename;}

    //method
    public void process(String filename){

        Path p = Paths.get(filename);
        File f = p.toFile();

        try {
            InputStream is = new FileInputStream(f);
    
            InputStreamReader isr = new InputStreamReader(is);
            // Read whole lines
            BufferedReader br = new BufferedReader(isr);

        String line;
        int numWords = 0;
        ArrayList<String> arrListWords = new ArrayList<>();
        Map<String, Integer> wordFreq = new HashMap<>();
      

        while ((line = br.readLine()) != null) {  
            line = line.replaceAll("\\p{Punct}"," ");
            line = line.replaceAll("\\d","");
            line = line.toLowerCase();
            
            //place in String array
            String[] words = line.split(" "); 
            for (String w: words){
                System.out.println(w);
            }

            //Add words to ArrayList
            Collections.addAll(arrListWords, words);
            numWords += words.length;

            //Add words to Map
            for (String w: words) {
                String t = w.trim().toLowerCase();
                if (t.length() <= 0) {           //if no word, proceed back to for loop to find next word
                    continue;
                }
                if (!wordFreq.containsKey(t)) {
                    // If word is not in map, initialize the word with freq 1
                    wordFreq.put(t, 1);
                } else {
                    // If word is in map, the increment the count
                    int c = wordFreq.get(t);
                    wordFreq.put(t, c + 1);
                }

            } 


        }

        // List<ArrayList<String>> matrix = new ArrayList<ArrayList<String>>(wordFreq.size());

        Set<String> words = wordFreq.keySet(); 
        for (String w: words) {
            int count = wordFreq.get(w);
            System.out.printf(": %s = %d\n", w, count);
        }

        String[][] matrix = new String[numWords][3];

        for (int i = 0; i < numWords; i++){
            matrix[i][0] = arrListWords.get(i);
            System.out.print(matrix[i][0] + " ");
        }
        
        
            int count2 = 0;
        // for (int i = 0; i < wordFreq.size(); i++){
        //     for (int j = 0; j < 3; j++){
        //         matrix[i][j] = arrListWords.get(i);
        //         System.out.print(matrix[i][j] + " ");
        //         count2++;
        //     }
        // }
        System.out.printf("There are %d elements in the matrix\n", count2);


        System.out.println("The total number of words is " + numWords);
        System.out.println("The total number of unique words is " + wordFreq.size());
        System.out.printf("Percentage of unique words: %f\n", wordFreq.size()/(float)numWords);

          

            
        br.close();
        isr.close();
        is.close();
        
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
