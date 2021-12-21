package com.ji.injector.exercise.classes.easy.table;

import com.ji.injector.headquarter.Exercise;
import com.ji.injector.headquarter.ExerciseType;
import com.ji.injector.headquarter.InProgress;

/**
 * F.1-TABLE Inserire come attributi privati una stringa per il 'name' del
 * tavolo e due interi, uno per la 'width' e l'altro per la 'height'. Si crei
 * (senza usare le shortcut) il costruttore vuoto, uno con tutti gli argomenti
 * (nell'ordine: name, width e height) e uno con soli 'width' e 'height'. Si
 * crei un metodo pubblico 'area' che calcoli l'area del tavolo restituendo
 * semplicemente il prodotto di width * height. Si crei un metodo 'changeName',
 * che permetta, da fuori, di cambiare l'attributo'name', assicurandosi che se
 * il parametro si prova a settare null, il 'name' venga sovrascritto con
 * "INVALID".
 *
 * @author sommovir
 */
@InProgress
@Exercise(name = "F.1-TABLE", type = ExerciseType.FREE, testEnabled = true)
public class Table {

    private String name;
    private int width;
    private int height;

    public Table() {
    }

    public Table(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Table(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public int area() {
        return this.width * this.height;
    }

    public void changeName(String ciao) {
        if (ciao == null) {
            this.name = "INVALID";
        } else {
            this.name = ciao;
        }
    }

}
