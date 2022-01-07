/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ji.injector.exercise.list.free.esercizio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Esercizio 1. - OPERAZIONI DI BASE [EASY][SHORT]
 *
 * Creare una classe Main, con un metodo main. Al suo interno chiedere l’input
 * da tastiera 5 volte, chiedendo di immettere 5 parole. Se la parola è composto
 * di sole lettere, la si immagazzini in una lista creata appositamente.
 * Viceversa si stampi un messaggio di errore. Al termine dell’inserimento si
 * visualizzi: - Il numero di parole correttamente inserite - Il numero di
 * inserimenti scartati - Il numero di caratteri della parola più grande - Si
 * visualizzi la parola più corta
 *
 * @author sommovir
 */
public class Main {

    public static void main(String[] args) {

        List<String> parole = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int maxWord = 0;
        String shorterWord = null;

        for (int i = 0; i < 5; i++) {
            System.out.println(i + ". Immettere una parola:");
            String text = scanner.nextLine();

            if (text.matches("[A-Za-z]+")) {
                if (text.length() > maxWord) {
                    maxWord = text.length();
                }
                if(shorterWord == null){
                    shorterWord = text;
                }else{
                    if(text.length() < shorterWord.length()){
                        shorterWord = text;
                    }
                }
                parole.add(text);
            } else {
                System.err.println("La parola non è composta di sole lettere");
            }

        }
        System.out.println("-----------------------");
        int min = 5 - parole.size();
        int correct = parole.size();
        System.out.println("Sono state inserite correttamente: " + correct + (correct == 1 ? " parola": " parole"));
        System.out.println("Sono state scartate: " + min + (min == 1 ? " parola" : " parole"));
        System.out.println("La parola più lunga è di " + maxWord + (maxWord == 1 ? " caratere": " caratteri"));
        System.out.println("La parola più breve è: "+shorterWord);

    }

}
