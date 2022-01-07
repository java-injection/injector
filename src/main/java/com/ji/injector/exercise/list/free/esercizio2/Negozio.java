/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ji.injector.exercise.list.free.esercizio2;

import java.util.LinkedList;
import java.util.List;

/**
 * Creare una classe Negozio che all’interno memorizzi le scarpe presenti. In
 * particolare si devono differenziare le scarpe sportive che saranno tutte
 * disposte nello scaffale centrale del negozio. Mentre il resto ( classiche e
 * da lavoro) saranno disposte, tutte insieme nello scaffale laterale.  *
 * Ogni tipologia di scarpa poi ha un codice sconto, che inizia con “SPO” per le
 * sportive, “CLA” per le classiche e “LAV” per quelle da lavoro.  *
 * Creare un metodo main che all’inizio richiama un altro metodo responsabile di
 * sistemare nelle strutture dati una quindicina di scarpe, 5 per tipo.  *
 * Subito dopo si deve presentare un menu del tipo:  *
 * Visualizza Scaffale Centrale Visualizza Scaffale Laterale Acquista Mostra
 * Incasso Esci.  *
 * L’utente immetterà la propria scelta, che se validata comporterà le seguenti
 * azioni:  *
 * Viene visualizzato l’elenco di tutte le scarpe disposte nello scaffale
 * centrale, deve comparire per ogni scarpa, modello e prezzo.  *
 *
 * Viene visualizzato l’elenco di tutte le scarpe disposte nello scaffale
 * centrale, deve comparire per ogni scarpa, modello e prezzo e tipologia
 * (classica o da lavoro)  *
 *
 * Si deve richiedere all’utente di immettere il nome del modello della scarpa.
 * Se non è presente si visualizza un messaggio di errore , e si ritorna al menu
 * principale. Se invece è presente si visualizza il prezzo e si chiede
 * all’utente se è in possesso di un codice sconto. L’utente può rispondere y o
 * n. Se risponde n, la scarpa è acquistata e va rimossa dalla lista. Se
 * risponde y, si chiede di immettere un codice sconto. I codici sconto sono del
 * tipo:  *
 * CLA-81BA50 LAV-21NU72
 *
 * Sono fatti così: la prima parte di tre lettere identifica la tipologia di
 * scarpa e può essere come abbiamo detto CLA, LAV o SPO, dopo di che c’è un
 * trattino seguido da 2 cifre, seguite da 2 lettere maiuscole e l’ultima parte
 * sono 2 cifre ma sempre maggiori di 50, ad esempio:  *
 * CLA-33AV49 non è valido.  *
 * Se il codice sconto è valido si applica uno sconto del 30% sul prezzo e la
 * scarpa viene acquistata correttamente e rimossa dall’inventario.  *
 *
 * Mostra i soldi accumulati finora dalle vendite.  *
 *
 * Esci dal programma.
 *
 * @author sommovir
 */
public class Negozio {
    
    private List<Scarpa> scaffaleCentrale = new LinkedList<>();
    private List<Scarpa> scaffaleLaterale = new LinkedList<>();

    public Negozio() {
    }
    
    
    public void addScarpa(Scarpa scarpa){
        if(scarpa.getTipoScarpa() == TipoScarpa.SPORTIVA){
            this.scaffaleCentrale.add(scarpa);
        }else{
            this.scaffaleLaterale.add(scarpa);
        }
    }
    
      

}
