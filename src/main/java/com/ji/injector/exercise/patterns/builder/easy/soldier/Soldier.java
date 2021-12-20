/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ji.injector.exercise.patterns.builder.easy.soldier;

import com.ji.injector.headquarter.Exercise;
import com.ji.injector.headquarter.ExerciseType;

/**
 *  
 * @author sommovir
 */
@Exercise(name = "F3-SOLDIER", type = ExerciseType.AUTO, testEnabled = false)
public class Soldier {
    
    private String name;
    private String type; 
    private int hp;
    private int defence;
    private int attack;
    private Weapon weapon;
    private int shield;
    
}
