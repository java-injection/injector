/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ji.injector.exercise.patterns.builder.easy.cargoship;

import com.ji.injector.headquarter.Exercise;
import com.ji.injector.headquarter.ExerciseType;
import java.util.Date;

/**
 *
 * @author sommovir
 */
@Exercise(name = "F3-CARGO", type = ExerciseType.FREE, testEnabled = false)
public class CargoShip {
    
    private String name;  //Mandatory
    private String code;  //Mandatory
    private int maxWeight;
    private float maxRadius;
    private boolean stealh;
    private int passengers;
    private String route;   //Mandatory    La route deve essere composta da due blocchi di numeri di 4-6 cifre separati da una virgola o trattino
    private Date expirationTime;
    
}
