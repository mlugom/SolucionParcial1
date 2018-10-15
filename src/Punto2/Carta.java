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
import java.util.ArrayList;
public class Carta {
    private String contenido;
    private String remitente;
    private ArrayList<Patrocinador> destinatarios;

    public Carta(String contenido, String remitente, ArrayList<Patrocinador> destinatarios) {
        this.contenido = contenido;
        this.remitente = remitente;
        this.destinatarios = destinatarios;
    }

    public String getContenido() {
        return contenido;
    }

    public String getRemitente() {
        return remitente;
    }

    public ArrayList<Patrocinador> getDestinatarios() {
        return destinatarios;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public void setDestinatarios(ArrayList<Patrocinador> destinatarios) {
        this.destinatarios = destinatarios;
    }
    
}
