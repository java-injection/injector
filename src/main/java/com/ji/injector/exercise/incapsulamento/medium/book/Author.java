/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ji.injector.exercise.incapsulamento.medium.book;

/**
 * Esercizio 2A. Limitarsi alla creazione del costruttore vuoto, di quello con argomenti e dei getter & setter. 
 * @author Luca
 */
public class Author {
    
    private String name;
    private String surname;

    public Author() {
        
    }

    public Author(String name, String surname) {
        
        setName(name);
        setSurname(surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    
}
