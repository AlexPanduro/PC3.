/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc3;

/**
 *
 * @author LAB-USR-LNORTE
 */
// Clase ControladorAutor
public class ControladorAutor {
    private final Autor autor;

    // Constructor
    public ControladorAutor(Autor autor) {
        this.autor = autor;
    }

    // Método para agregar una publicación al autor
    public void agregarPublicacion(Publicacion publicacion) throws Exception {
        autor.agregarPublicacion(publicacion);
    }

    // Método para imprimir los detalles del autor
    public void imprimirAutor() {
        System.out.println(autor.toString());
    }
}

