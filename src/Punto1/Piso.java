/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author Equipo de Trabajo
 */
public class Piso {
    private int numero;
    private Habitacion[] habitaciones;

    public Piso(int numero) {
        this.numero = numero;
        this.habitaciones = new Habitacion[5];
        for(int i = 0; i < 5; i++){
            this.habitaciones[i] = new Habitacion(i,10, true, 100000, 0, null, null, this);
        }
    }

    public int getNumero() {
        return numero;
    }

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setHabitaciones(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }
    
}
