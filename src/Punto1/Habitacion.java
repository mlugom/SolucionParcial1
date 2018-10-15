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
import java.util.*;
public class Habitacion {
    private int numero;
    private int capacidad;
    private boolean habilitado;
    private float precioAlquiler;
    private float ingresos;
    private Persona responsable;
    private ArrayList<Persona> acompanantes;
    private Piso piso;

    public Habitacion(int numero, int capacidad, boolean habilitado, float precioAlquiler, float ingresos, Persona responsable, ArrayList<Persona> acompanantes, Piso piso) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.habilitado = habilitado;
        this.precioAlquiler = precioAlquiler;
        this.ingresos = ingresos;
        this.responsable = responsable;
        this.acompanantes = acompanantes;
        this.piso = piso;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public float getPrecioAlquiler() {
        return precioAlquiler;
    }

    public float getIngresos() {
        return ingresos;
    }

    public Persona getResponsable() {
        return responsable;
    }

    public ArrayList<Persona> getAcompanantes() {
        return acompanantes;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public void setPrecioAlquiler(float precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void setIngresos(float ingresos) {
        this.ingresos = ingresos;
    }

    public void setResponsable(Persona responsable) {
        this.responsable = responsable;
    }

    public void setAcompanantes(ArrayList<Persona> acompanantes) {
        this.acompanantes = acompanantes;
    }
    
    public boolean inhabilitar(){
        this.habilitado = false;
        return true;
    }
    public boolean habilitar(){
        this.habilitado = true;
        return true;
    }
    public boolean alquilar(Persona responsable, ArrayList<Persona> acompanantes){
        this.responsable = responsable;
        this.acompanantes = acompanantes;
        anadirIngresos();
        return true;
    }
    public boolean anadirIngresos(){
        this.ingresos += this.precioAlquiler;
        return true;
    }
}
