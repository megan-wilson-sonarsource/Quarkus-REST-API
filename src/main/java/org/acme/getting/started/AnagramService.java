package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;
import java.util.Arrays;

@ApplicationScoped
public class AnagramService {
    public String alphabetize(String word) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
    
    public int word_length(String data){
        data = data.toLowerCase();
        return data.length();
    }

}