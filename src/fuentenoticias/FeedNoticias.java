/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuentenoticias;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author niza
 */
public class FeedNoticias implements FuenteNoticia {
    private List<Suscriptor> suscriptores;
    private String noticia;
    
    public FeedNoticias(){
        this.suscriptores = new ArrayList<>();
    }

    @Override
    public void agregarSuscriptor(Suscriptor suscriptor) {
        suscriptores.add(suscriptor);
    }

    @Override
    public void eliminarSuscriptor(Suscriptor suscriptor) {
        suscriptores.remove(suscriptor);
    }

    @Override
    public void notificarSuscriptores() {
        for(Suscriptor suscriptor : suscriptores){
        suscriptor.actualizar(noticia);
    }
    
    }
    public void publicarNoticia(String noticia) {
        this.noticia = noticia;
        notificarSuscriptores();
  
    }

}
