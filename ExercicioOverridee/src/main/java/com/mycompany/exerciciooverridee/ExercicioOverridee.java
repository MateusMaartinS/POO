/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exerciciooverridee;

/**
 *
 * @author aluno
 */
public class ExercicioOverridee {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        
        cachorro.emitirSom();
        cachorro.mover();
        
        gato.emitirSom();
        gato.mover();
    }
}
