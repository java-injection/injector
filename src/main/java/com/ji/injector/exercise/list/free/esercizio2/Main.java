/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ji.injector.exercise.list.free.esercizio2;

import java.util.Scanner;

/**
 *
 * @author sommovir
 */
public class Main {
    
    public static void init(Negozio negozio){
        negozio.addScarpa(new Scarpa("nike air", 80, 36, TipoScarpa.SPORTIVA));
        negozio.addScarpa(new Scarpa("nike air", 80, 37, TipoScarpa.SPORTIVA));
        negozio.addScarpa(new Scarpa("nike air", 80, 38, TipoScarpa.SPORTIVA));
        negozio.addScarpa(new Scarpa("Adidas Falcon", 46, 44, TipoScarpa.SPORTIVA));
        negozio.addScarpa(new Scarpa("Giulius", 29.90f, 43, TipoScarpa.SPORTIVA));
        
        negozio.addScarpa(new Scarpa("Mocassino Fashion", 74.50f, 43, TipoScarpa.CLASSICA));
        negozio.addScarpa(new Scarpa("Mocassino Semplice", 59.90f, 43, TipoScarpa.CLASSICA));
        negozio.addScarpa(new Scarpa("Mocassino Semplice", 59.90f, 44, TipoScarpa.CLASSICA));
        negozio.addScarpa(new Scarpa("Mocassino Semplice", 59.90f, 45, TipoScarpa.CLASSICA));
        negozio.addScarpa(new Scarpa("Stivalone gigantone", 110f, 43, TipoScarpa.CLASSICA));
        
        negozio.addScarpa(new Scarpa("Stivalone gigantone", 110f, 43, TipoScarpa.LAVORO));
        negozio.addScarpa(new Scarpa("Stivalone gigantone", 110f, 43, TipoScarpa.LAVORO));
        negozio.addScarpa(new Scarpa("Stivalone gigantone", 110f, 43, TipoScarpa.LAVORO));
        negozio.addScarpa(new Scarpa("Stivalone gigantone", 110f, 43, TipoScarpa.LAVORO));
        negozio.addScarpa(new Scarpa("Stivalone gigantone", 110f, 43, TipoScarpa.LAVORO));
    }
    
    public static void main(String[] args) {
        
        Negozio negozio = new Negozio();
        init(negozio);
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("1) Visualizza Scaffale Centrale");
            System.out.println("2) Visualizza Scaffale Laterale");
            System.out.println("3) Acquista");
            System.out.println("4) Mostra Incasso");
            System.out.println("5) Esci");
            System.out.println("-----------------------------------");
            System.out.println("\nSeleziona un opzione:");
            int opzione = scanner.nextInt();
            switch(opzione){
                case 1:{
                    System.out.println("*** Visualizzazione Scaffale Centrale ***");
                    break;
                }
                case 2:{
                    System.out.println("*** Visualizzazione Scaffale Laterale ***");
                    break;
                }
                case 3:{
                    System.out.println("*** Acquista ***");
                    break;
                }
                case 4:{
                    System.out.println("*** Mostra Incasso ***");
                    break;
                }
                case 5:{
                    System.out.println("*** Esci ***");
                    break;
                }
                
            }

        }
        
    }
    
}
