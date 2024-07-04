/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pc3;

/**
 *
 * @author LAB-USR-LNORTE
 */
// Clase VistaAutor
// Clase VistaAutor
public class VistaAutor {
    public static void main(String[] args) throws Exception {
        // Crear dos autores
        Autor autor1 = new Autor("Carlos", 3);
        Autor autor2 = new Autor("ChatGPT", 3);

        // Crear tres publicaciones para cada autor
        Publicacion publicacion1_autor1 = new Publicacion("Primer artículo", "Contenido del primer artículo", "2024-07-04");
        Publicacion publicacion2_autor1 = new Publicacion("Segundo artículo", "Contenido del segundo artículo", "2024-07-05");
        Publicacion publicacion3_autor1 = new Publicacion("Tercer artículo", "Contenido del tercer artículo", "2024-07-06");

        Publicacion publicacion1_autor2 = new Publicacion("Introducción a la IA", "Conceptos básicos de Inteligencia Artificial", "2024-06-30");
        Publicacion publicacion2_autor2 = new Publicacion("Avances en NLP", "Últimos desarrollos en Procesamiento del Lenguaje Natural", "2024-07-01");
        Publicacion publicacion3_autor2 = new Publicacion("Aplicaciones de GPT-3", "Casos de uso prácticos del modelo GPT-3", "2024-07-02");

        // Agregar las publicaciones a los autores
        ControladorAutor controladorAutor1 = new ControladorAutor(autor1);
        ControladorAutor controladorAutor2 = new ControladorAutor(autor2);

        try {
            controladorAutor1.agregarPublicacion(publicacion1_autor1);
            controladorAutor1.agregarPublicacion(publicacion2_autor1);
            controladorAutor1.agregarPublicacion(publicacion3_autor1);

            controladorAutor2.agregarPublicacion(publicacion1_autor2);
            controladorAutor2.agregarPublicacion(publicacion2_autor2);
            controladorAutor2.agregarPublicacion(publicacion3_autor2);

            // Imprimir los autores con sus publicaciones
            System.out.println("Autor 1:");
            controladorAutor1.imprimirAutor();

            System.out.println("\nAutor 2:");
            controladorAutor2.imprimirAutor();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
