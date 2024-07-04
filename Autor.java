/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc3;

/**
 *
 * @author LAB-USR-LNORTE
 */
import java.util.ArrayList;

// Clase Autor
public class Autor {
    private final String nombre;
    private final ArrayList<Publicacion> publicaciones;
    private final int tamañoArreglo;

    // Constructor
    public Autor(String nombre, int tamañoArreglo) {
        this.nombre = nombre;
        this.tamañoArreglo = tamañoArreglo;
        this.publicaciones = new ArrayList<>();
    }

    // Método para validar y establecer cantidad de publicaciones
    public void setCantidadPublicaciones(int cantidad) throws Exception {
        if (cantidad > tamañoArreglo) {
            throw new Exception("La cantidad de publicaciones excede el tamaño del arreglo.");
        }
    }

    // Método para agregar una publicación
    public void agregarPublicacion(Publicacion publicacion) throws Exception {
        if (publicaciones.size() >= tamañoArreglo) {
            throw new Exception("Se ha alcanzado el máximo de publicaciones permitidas.");
        }
        publicaciones.add(publicacion);
    }

    // Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autor: ").append(nombre).append("\n");
        sb.append("Publicaciones:\n");
        for (Publicacion p : publicaciones) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}
