/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ji.injector.exercise.incapsulamento.medium.book;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Federico
 */
public class Main {
    
    public static void main(String[] args) {
        
        

        
        //SETTER MISTAKE
        
        Author author2 = new Author("Federico", "Tiberi");
        
        Book book2 = new Book("Lo", 24, author2);
        
        
        System.out.println("Before hack: " + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname());
        
        author2.setName("Giggi");
        author2.setSurname("");
        
        System.out.println("After hack: " + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname());
        
        
        //GETTER MISTAKE
        
        System.out.println("-------------------------------------------------------------------");
        
        Author author1 = new Author("Luca", "Coraci");


        Book book1 = new Book("Lo", 24, author1);
        System.out.println("Before hack: " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());
        
        Author author = book1.getAuthor();
        author.setName("Federico");

        System.out.println("After hack: " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());
        
        
        
       
    }
    
}
