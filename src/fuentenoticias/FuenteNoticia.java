/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fuentenoticias;

/**
 *
 * @author niza
 */
public interface FuenteNoticia {
    void agregarSuscriptor(Suscriptor suscriptor);
    void eliminarSuscriptor(Suscriptor suscriptor);

    /**
     *
     */
    void notificarSuscriptores();
}
