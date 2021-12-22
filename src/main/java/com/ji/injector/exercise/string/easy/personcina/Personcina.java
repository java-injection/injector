/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ji.injector.exercise.string.easy.personcina;

/**
 * 3BASIC-0 1. Si completi l'incapsulamento della classe facendo in modo che la
 * classe non permetta di inserire nei campi 'name' e 'surname' valori nulli o
 * vuoti. In tal caso i valori di default siano "NO_NAME" e "NO_SURNAME". Nessun
 * controllo viene fatto invece sull'attributo 'postapay' in fase di costruzione
 * o inserimento. 
 * 2. Oltre ai controlli del punto 1, si dovrà verificare che il
 * nome e il cognome inizino con la lettera maiuscola e non contengano numeri.
 * (suggerimento: si può generare un nuovo metodo ad hoc) 
 * 3. Si completi il
 * metodo 'needsToBePayed' come descritto sopra la signature
 * 
 * ATTIVARE TEST: Lesson3BASICUnitTest
 *
 * @author sommovir
 */
public class Personcina {

    private String name;
    private String surname;
    private int dayOfWork;
    private String postapay;
    public final static String NO_NAME = "NO_NAME";
    public final static String NO_SURNAME = "NO_SURNAME";

    public Personcina() {
        
        name = NO_NAME;
        surname = NO_SURNAME;
    }

    public Personcina(String name, String surname, int dayOfWork, String postapay) {
        setName(name);
        setSurname(surname);
        this.dayOfWork = dayOfWork;
        this.postapay = postapay;
    }

    /**
     * 3BASIC-1 Restituisce true se il postapay inserito è valido, false
     * viceversa. Un postapay risulta valido se è ha questo formato:
     * AAAA-AAAA-AAAA-AAAA ovvero se ha tutti caratteri numerici divisi in
     * blocchi da 4 cifre separati esclusivamente dal trattino '-'.
     *
     * @return
     */
    public boolean isPostaPayValid() {
        
        if(postapay != null && postapay != "" && postapay.matches("\\b[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}\\b")){
            return true;
        }
            
            return false;

    }

    /**
     * 3BASIC-2 Restituisce true se il codice postapay è valido e sono già stati
     * consumati almeno 20 giorni di lavoro
     *
     * @return
     */
    public boolean needsToBePayed() {
        
        
        if(dayOfWork >= 20 && isPostaPayValid()){
            
            return true;
            
        }
        
        return false;
        
    }

    public String getName() {
        
        return this.name;
        
    }

    public void setName(String name) {

        if (name == null || name.isEmpty() || !attMatch(name)) {
           
            name = NO_NAME;
            
        }

        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {

        if (surname == null || surname.isEmpty() || !attMatch(surname)){
            
            surname = NO_SURNAME;
            
        }

        this.surname = surname;
    }

    public int getDayOfWork() {
        return dayOfWork;
    }

    public void setDayOfWork(int dayOfWork) {
        this.dayOfWork = dayOfWork;
    }

    public String getPostapay() {
        return this.postapay;
    }

    public void setPostapay(String postapay) {
        
        if(isPostaPayValid() || needsToBePayed()){
            
            this.postapay = postapay;
        }
        
        
        
        
    }
    
    
    public boolean attMatch(String stringa){
        
        if(stringa.matches("\\b[A-Z]{1}[a-z]*\\b")){
            
            return true;
            
        }
        
        return false;
        
    }
    
}
