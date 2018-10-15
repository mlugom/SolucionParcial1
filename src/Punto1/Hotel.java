/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

import java.util.ArrayList;

/**
 *
 * @author Equipo de Trabajo
 */
public class Hotel {
    private Piso[] pisos;

    public Hotel() {
        this.pisos = new Piso[3];
        for(int i = 0; i < 3; i++){
            this.pisos[i] = new Piso(i);
        }
    }

    public Piso[] getPisos() {
        return pisos;
    }

    public void setPisos(Piso[] pisos) {
        this.pisos = pisos;
    }
    public ArrayList<Habitacion> getHabitaciones(){
        ArrayList<Habitacion> habsAuxiliar = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                habsAuxiliar.add(this.pisos[i].getHabitaciones()[j]);
            }
        }
        return habsAuxiliar;
    }
    public ArrayList<Habitacion> getHabitacionesPiso(int numPiso){
        return this.pisos[numPiso].getHabitaciones();
    }
    public Habitacion getHabitacion(int numHabitacion){ //numero de tres digitos. Ej: 202, 305.
        return this.pisos[numHabitacion/100].getHabitaciones()[numHabitacion%100];
    }
    public boolean inhabilitarHabitacion(int numHabitacion){
        this.pisos[numHabitacion/100].getHabitaciones()[numHabitacion%100].inhabilitar();
        return true;
    }
    public boolean habilitarHabitacion(int numHabitacion){
        this.pisos[numHabitacion/100].getHabitaciones()[numHabitacion%100].habilitar();
        return true;
    }
    public boolean alquilarHabitacion(int numHabitacion, Persona responsable, ArrayList<Persona> acompanantes){
        this.pisos[numHabitacion/100].getHabitaciones()[numHabitacion%100].alquilar(responsable, acompanantes);
        return true;
    }
    public float getIngresosTotales(){
        float ingresos = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                ingresos += this.pisos[i].getHabitaciones()[j].getIngresos();
            }
        }
        return ingresos;
    }
    public float getIngresosHabitacion(int numHabitacion){
        return this.pisos[numHabitacion/100].getHabitaciones()[numHabitacion%100].getIngresos();
    }
}
