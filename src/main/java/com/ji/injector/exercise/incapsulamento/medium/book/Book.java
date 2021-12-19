/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ji.injector.exercise.incapsulamento.medium.book;

import com.ji.injector.headquarter.ExecutingTest;
import com.ji.injector.headquarter.Exercise;
import com.ji.injector.headquarter.ExerciseType;

/**
 * Esercizio 2.A 
 * 1. creare l'incapsulamente di questa classe generando il
 * costruttore vuoto e quello con argomenti e tutti i metodi getter & setter
 * sistemando tutti quelli già in essere che contengono vari errori. 
 * 2. se viene
 * inserito un numero di pagine negativo o pari a zero, qualunque sia il numero,
 * sovrascriverlo con -1 
 * 3. se non viene esplicitamente settato l'autore o viene
 * inserito un autore incompleto (stringhe vuote o null) di nome o cognome o
 * passato un valore null, inserire un autore di default con nome-> "Autore" e
 * cognome -> "Sconosciuto".
 *
 * @author Luca
 */

@Exercise(name = "2.A-BOOK", type = ExerciseType.AUTO)
@ExecutingTest(enabled = false)
public class Book {

    private String title;
    private int pages;
    private Author author;

    public Book() {

        author = new Author("Autore", "Sconosciuto");
    }

    public Book(String title, int pages, Author author) {

        this.title = title;
        setPages(pages);
        setAuthor(author);

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {

        if (pages <= 0) {

            pages = -1;

        }
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {

        if (author == null || author.getName() == null || author.getSurname() == null || author.getName().isEmpty() || author.getSurname().isEmpty()) {

            author = new Author("Autore", "Sconosciuto");

        }
        this.author = author;
    }

}
