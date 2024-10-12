/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fuentenoticias;

/**
 *
 * @author niza
 */
public class FuenteNoticias {

    public static void main(String[] args) {
        FeedNoticias feed = new FeedNoticias();
        
    SuscriptorEmail suscriptor1 = new SuscriptorEmail("usuario1@ejemplo.com");
    SuscriptorAppMovil suscriptor2 = new SuscriptorAppMovil("usuarioMovil");
    
    feed.agregarSuscriptor(suscriptor1);
    feed.agregarSuscriptor(suscriptor2);
    
    feed.publicarNoticia("Nueva noticia: El clima estara soleado maniana.");
    feed.publicarNoticia("ultima hora: el equipo local gana el campeonato");
    }
    
}
