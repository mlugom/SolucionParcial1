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
public class Estudiante {
    private String nombre;
    private Premio premio;
    private ArrayList<Carta> cartasEnviadas;

    public Estudiante(String nombre, Premio premio) {
        this.nombre = nombre;
        this.premio = premio;
        this.cartasEnviadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Premio getPremio() {
        return premio;
    }

    public ArrayList<Carta> getCartasEnviadas() {
        return cartasEnviadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPremio(Premio premio) {
        this.premio = premio;
    }

    public void setCartasEnviadas(ArrayList<Carta> cartasEnviadas) {
        this.cartasEnviadas = cartasEnviadas;
    }
    
    public Carta escribirCarta(String contenido){
        Carta carta = new Carta(contenido, this.nombre, this.premio.getPatrocinadores());
        this.cartasEnviadas.add(carta);
        for(int i = 0; i < this.premio.getPatrocinadores().size();i++){
            this.premio.getPatrocinadores().get(i).anadirCarta(carta);
        }
        return carta;
    }
}
