/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ji.injector.exercise.list.free.esercizio2;

/**
 * Una stringa per il modello
 * Un intero per il numero
 * Un float per il costo
 * Un enum (SPORTIVA, CLASSICA, LAVORO).  *
 * Creare incapsulamento e validazione minimale per la classe Scarpa.  *
 * 
 * @author sommovir
 */
public class Scarpa {
    
    private String modello;
    private float costo;
    private int numero;
    private TipoScarpa tipoScarpa;

    public Scarpa(String modello, float costo, int numero, TipoScarpa tipoScarpa) {
        this.modello = modello;
        this.costo = costo;
        this.numero = numero;
        this.tipoScarpa = tipoScarpa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoScarpa getTipoScarpa() {
        return tipoScarpa;
    }

    public void setTipoScarpa(TipoScarpa tipoScarpa) {
        this.tipoScarpa = tipoScarpa;
    }
   
    
    
}
