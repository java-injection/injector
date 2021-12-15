/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ji.injector.exercise.patterns.builder.easy.soldier;

/**
 * DO NOT MODIFY
 * Questa classe non verrà testata per incapsulamento ecc. 
 * @author sommovir
 */
public class Weapon {
    
    private String name;
    private String power;

    public Weapon(String name, String power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
    
    
    
    
    
}
