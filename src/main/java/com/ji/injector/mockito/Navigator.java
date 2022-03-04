/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ji.injector.mockito;

import java.util.List;

/**
 *
 * @author Luca
 */
public class Navigator {

    public int getXDistance(GoogleMapAPI api, String city1, String city2) {
        Position p1 = api.getPositionOf(city1);
        Position p2 = api.getPositionOf(city2);
        return Math.abs(p2.getX() - p1.getX());
    }

    public boolean isCityExisting(String city) {
        throw new UnsupportedOperationException();
    }

    public void printThings(List<String> lista) {
        for (String cosa : lista) {
            save(cosa);
        }
    }

    public void salvaTuttoDelonghi(List<String> lista) {
        for (String cosa : lista) {

            save(cosa);
        }
    }

    public void save(String cosa) {
        connect();
        System.out.println(cosa);
        disconnect(cosa + "ciao");
    }

    public void connect() {

    }

    public void disconnect(String cosa) {

    }

}