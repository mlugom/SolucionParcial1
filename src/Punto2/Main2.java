/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

/**
 *
 * @author Equipo de Trabajo
 */
public class Main2 {
    public static void main(String[] args) {
        Premio premio1 = new Premio("Premio1");
        Premio premio2 = new Premio("Premio2");
        Estudiante est1 = new Estudiante("Pacheco",premio1);
        Estudiante est2 = new Estudiante("Alfonso",premio2);
        Patrocinador pat1 = new Patrocinador("Colciencias");
        Patrocinador pat2 = new Patrocinador("SENA");
        
        premio1.anadirEstYPat(est1, pat1);
        premio2.anadirEstYPat(est2, pat2);
        
        est1.escribirCarta("Gracias señores de " + est1.getPremio().getPatrocinadores().get(0).getNombre() + " por este premio.\nAtt: " + est1.getNombre());
        est2.escribirCarta("Gracias señores de " + est2.getPremio().getPatrocinadores().get(0).getNombre() + " por este premio.\nAtt: " + est2.getNombre());
        
        System.out.println("Carta 1: ");
        System.out.println(est1.getCartasEnviadas().get(0).getContenido());
        System.out.println("Carta 2: ");
        System.out.println(est2.getCartasEnviadas().get(0).getContenido());
    }
}
