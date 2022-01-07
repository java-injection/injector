/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ji.injector.exercise.list.free.esercizio2;

/**
 *
 * @author sommovir
 */
public enum TipoScarpa {
    
    CLASSICA("CLA"),
    SPORTIVA("SPO"),
    LAVORO("LAV");
    
    private String codiceSconto;

    private TipoScarpa(String codiceSconto) {
        this.codiceSconto = codiceSconto;
    }

    public String getCodiceSconto() {
        return codiceSconto;
    }
    
    
}
