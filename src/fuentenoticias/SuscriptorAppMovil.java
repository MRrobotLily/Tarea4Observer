/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuentenoticias;

/**
 *
 * @author niza
 */
public class SuscriptorAppMovil implements Suscriptor {
    private String nombreUsuario;
    
    public SuscriptorAppMovil(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }
    @Override
    public void actualizar(String noticia){
            System.out.println("Noticiaion en la app para " + nombreUsuario + ": " + noticia);
            
    }
}
