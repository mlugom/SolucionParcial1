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
public class Premio {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Patrocinador> patrocinadores;

    public Premio(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
        this.patrocinadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public ArrayList<Patrocinador> getPatrocinadores() {
        return patrocinadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
        this.patrocinadores = new ArrayList<>();
        
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void setPatrocinadores(ArrayList<Patrocinador> patrocinadores) {
        this.patrocinadores = patrocinadores;
    }
    
    public void anadirEstYPat(Estudiante est1, Patrocinador pat){
        this.estudiantes.add(est1);
        this.patrocinadores.add(pat);
    }
}
