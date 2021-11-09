package org.acme.getting.started;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class AnagramDictionaryEntry extends PanacheEntity {
    // @Id @GeneratedValue private Long id;
    private String word;
    private String word_alphabatized;
    private int word_length;

    // public Long getId(){
    //     return id;
    // }
    public String getWord(){
        // create
        return word.toUpperCase();
    }
    public String getWord_alphabatized(){
        // create
        return word_alphabatized;
    }
    public int getWord_length(){
        return word_length;
    }
    // public void setId(Long id){
    //     this.id = id;
    // }
    public void setWord(String input){
        this.word = input.toLowerCase();
    }
    public void setWord_length(int input){
        this.word_length = input;
    }
    public void setWord_alphabatized(String input){
        this.word_alphabatized = input.toLowerCase();
    }
    // public static List<AnagramDictionaryEntry> findByAlphabatized(String word_alphabatized){
    //     return find("word_alphabatized", word_alphabatized).list();
    // }
    // public static List<AnagramDictionaryEntry> findByLength(int length){
    //     return list("word_length", length == this.word_length).list();
    // }

}
