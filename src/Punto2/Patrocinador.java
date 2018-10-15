/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import java.util.ArrayList;

/**
 *
 * @author Equipo de Trabajo
 */

public class Patrocinador {
    private String nombre;
    private ArrayList<Carta> cartasRecibidas;

    public Patrocinador(String nombre) {
        this.nombre = nombre;
        this.cartasRecibidas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Carta> getCartasRecibidas() {
        return cartasRecibidas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCartasRecibidas(ArrayList<Carta> cartasRecibidas) {
        this.cartasRecibidas = cartasRecibidas;
    }
    
    public void anadirCarta(Carta carta){
        this.cartasRecibidas.add(carta);
    }
}
