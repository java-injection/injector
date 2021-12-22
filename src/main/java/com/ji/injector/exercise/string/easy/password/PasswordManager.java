/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ji.injector.exercise.string.easy.password;

import com.ji.injector.headquarter.Exercise;
import com.ji.injector.headquarter.ExerciseType;

/**
 * Esercizio 1.A 1. Completare i seguenti metodi di modo che inserendo una
 * password usando il metodo 'checkPassword' si abbiano solo 3 tentativi per
 * verificare la password. Per i dettagli si leggano i commenti ai metodi
 * sottostanti. WARNING: non si possono cambiare le signature dei metodi ma si
 * possono aggiungere nuovi metodi e nuovi attributi se necessari.
 *
 * @author Luca
 */
@Exercise(name = "1A-PASSWORD", type = ExerciseType.AUTO, testEnabled = false)
public class PasswordManager {

    private static final String correctPassword = "antisgamo";
    private int wrongAttempts;
    private int maxAttempts = 3;
    public final static String CORRECT = "CORRECT";
    public final static String BLOCKED = "BLOCKED";
    public final static String ERROR = "ERROR";

    /**
     * 1.A.1 Restituisce il numero massimo di tentativi disponibili
     *
     * @return
     */
    public int getMaxAttempts() {
        return maxAttempts;
    }

    /**
     * 1.A.2 restituisce il numero di errori fatti fino a questo momento
     *
     * @return
     */
    public int getWrongAttempts() {
        return wrongAttempts;
    }

    /**
     * 1.A.3 controlla che la password in argomento sia uguale alla password
     * memorizzata nell'attributo 'correctPassword'. Se la password è corretta,
     * il metodo restituisce la stringa CORRECT, viceversa la stringa ERROR e
     * tiene traccia del numero di tentativi. Se il numero di tentativi è
     * maggiore di 3, non importa che la password sia corretta o meno: deve
     * restituire BLOCKED. Quando la password viene inserita correttamente, il
     * numero di errori va resettato.
     *
     * @param password
     * @return
     */
    public String checkPassword(String password) {

        String messaggio = "";

        if (wrongAttempts == maxAttempts) {
            return BLOCKED;
        }

        if (password.equals(this.correctPassword)) {

            wrongAttempts = 0;

            return CORRECT;

        }

        wrongAttempts++;

        return ERROR;
    }

}
