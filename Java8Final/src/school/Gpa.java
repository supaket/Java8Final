package school;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Gpa {    
    HashMap<String, Integer> subjectGpa;  
    
    public Gpa() {        
        subjectGpa = new HashMap();
        subjectGpa.put("THAI",4);
        subjectGpa.put("MATH",4);        
        subjectGpa.put("Eng",4);
    }
    
    public double getGpa() {
        int numberOfSubject = subjectGpa.size();
        Set<String> keys = subjectGpa.keySet();
          double total =0;
          for (String subjName : keys) {                                
                total += subjectGpa.get(subjName);
          }  
          return total/numberOfSubject;
    }
}
