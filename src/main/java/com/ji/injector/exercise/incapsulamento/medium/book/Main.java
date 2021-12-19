/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ji.injector.exercise.incapsulamento.medium.book;

/**
 *
 * @author Federico
 */
public class Main {
    
    public static void main(String[] args) {
        
        Author author = new Author();
        
        
        Book book1 = new Book("Lo", 24, author);
        
        System.out.println(book1.getAuthor().getName());
        
    }
    
}
