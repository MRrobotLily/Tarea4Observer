/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuentenoticias;

/**
 *
 * @author niza
 */
public class SuscriptorEmail implements Suscriptor {
    private String email;
    
    public SuscriptorEmail (String email){
        this.email = email;
    }
    @Override
    public void actualizar(String noticia){
        System.out.println("Enviando noticia al email " + email + ": " + noticia);   
    }
}
