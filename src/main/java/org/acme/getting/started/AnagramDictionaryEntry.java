package org.acme.getting.started;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
public class AnagramDictionaryEntry extends PanacheEntity {
    private String word;
    private String word_alphabatized;
    private int word_length;

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

    public void setWord(String input){
        this.word = input.toLowerCase();
    }
    public void setWord_length(int input){
        this.word_length = input;
    }
    public void setWord_alphabatized(String input){
        this.word_alphabatized = input.toLowerCase();
    }
    public static <T extends PanacheEntityBase> List<T> listAll() {
        return PanacheEntity.listAll();
        //what should I do about this
        //idk
        //delete it
        //whattheactual fuck
    }

}
