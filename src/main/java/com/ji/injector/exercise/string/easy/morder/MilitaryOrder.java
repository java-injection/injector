/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ji.injector.exercise.string.easy.morder;

import com.ji.injector.headquarter.Exercise;
import com.ji.injector.headquarter.ExerciseType;

/**
 * 3 BASIC 2 Completare l'incapsulamento di questa classe secondo queste
 * specifiche: 1. il commander è un nome composto dal grado seguito da uno
 * spazio e poi dal cognome del comandante. I gradi possono essere
 * esclusivamente: - 'Gen.' - 'Ten.' non ne sono ammessi altri. Il cognome non
 * deve contenere numeri e deve iniziare con la maiuscola. Alcuni esempi validi:
 * 'Gen. Badoglio', 'Ten. Fasulli'. Se si tenta di inserire un commander
 * invalido si setti con il valore: 'INVALID'.
 *
 * 2. il campo order specifica il tipo di ordine che il comandante impartisce:
 * L'ordine è rappresentato da una stringa alfa numerica criptata. Si può
 * riconoscere però se è un ordine valido se contiene il codice segreto 'NUC'. e
 * contenga subito dopo almeno altri 3 caratteri (lo spazio e i caratteri di 
 * punteggiatura invalidano la stringa ). Se si tenta di inserire un
 * codice invalido si setti il valore 'INVALID'.
 *
 * 3. isLaunchOrder() Implementare il metodo secondo le specifiche che
 * troveretesopra la signature
 *
 * 4. isValid() Implementare il metodo secondo le specifiche che troverete sopra
 * la signature
 *
 * IMPORTANTE: Attivare il tester Lesson3TUTORUnitTest
 *
 * @author sommovir
 */
@Exercise(name = "B2-MORDER", type = ExerciseType.AUTO, testEnabled = true)
public class MilitaryOrder {

    private String commander;
    private String order;

    private static final String INVALID = "INVALID";

    public MilitaryOrder() {
        this.commander = INVALID;
        this.order = INVALID;
    }

    public MilitaryOrder(String commander, String order) {
        setCommander(commander);
        setOrder(order);
    }

    /**
     * Questo metodo ritorna true se il codice 'order' sia un codice di lancio
     * Si presuppone che il codice a questo punto sia già validato. Per capire
     * la tipologia di codice si dovranno guardare i 3 caratteri successivi alla
     * parola chiave 'NUC. Se nei 3 seguenti c'è almeno una lettera allora sarà
     * un codice di lancio viceversa sarà un codice di ripristino (false).
     */
    public boolean isLaunchOrder() {
       if(order.matches("[A-Za-z0-9]+[NUC].[0-9]{3}[A-Za-z0-9]+")){
           return false;
       }
       return true;
    }

    //Questo metodo ritorna true se sia commander che order sono validi, false viceversa. 
    public boolean isValid() {
        if (commander != INVALID && order != INVALID) {
            return true;
        }
        return false;
    }

    public String getCommander() {
        return this.commander;
    }

    public void setCommander(String commander) {

        if (commander != null && commander.matches("\\b((Ten.|Gen.).)?[A-Z]{1}[a-z]+\\b") && !commander.isEmpty()) {
            
            this.commander = commander;
            
        } else {
            
            this.commander = INVALID;
            
        }

    }

    public String getOrder() {
        return this.order;
    }

    public void setOrder(String order) {

        if (order != null && order.matches("[A-Za-z0-9]+[NUC].[A-Za-z0-9]+") && !order.isEmpty()) {
            this.order = order;
        } else {
            this.order = INVALID;
        }

    }

}
