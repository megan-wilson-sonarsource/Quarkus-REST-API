package org.acme.getting.started;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class AnagramDictionaryEntry extends PanacheEntity {

    public String word;
    public String word_alphabatized;
    public int word_lenght;

    public String getWord(){
        // create
        return word.toUpperCase();
    }
    public String getWord_alphabatized(){
        // create
        return word_alphabatized;
    }
    public int getWord_length(){
        return word_lenght;
    }
    public void setWord(String input){
        this.word = input.toLowerCase();
    }
    public void setWord_length(int input){
        this.word_lenght = input;
    }
    public void setWord_alphabatized(String input){
        this.word_alphabatized = input.toLowerCase();
    }

}
