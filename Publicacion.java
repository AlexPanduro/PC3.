/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc3;

/**
 *
 * @author LAB-USR-LNORTE
 */
// Clase Publicacion
public class Publicacion {
    private final String titulo;
    private final String contenido;
    private final int anyo;

    // Constructor
    public Publicacion(String titulo, String contenido, String anyo) {
        this.titulo = titulo;
        this.contenido = contenido;
        // Obtener solo el año del formato "yyyy-mm-dd"
        String[] partes = anyo.split("-");
        this.anyo = Integer.parseInt(partes[0]);
    }

    // Método toString
    @Override
    public String toString() {
        return "Título: " + titulo + ", Contenido: " + contenido + ", Año: " + anyo;
    }
}
