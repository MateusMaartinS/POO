/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciooverridee;

/**
 *
 * @author aluno
 */
public class Animal {

    public void emitirSom() {
        System.out.println("O animal emitil um som");
    }

    public void mover() {
        System.out.println("O animal se moveu");
    }
}
    class Cachorro extends Animal {

        @Override
        public void emitirSom() {
            System.out.println("auau");
        }

        @Override
        public void mover() {
            System.out.println("cachorro pulo de alegria");
        }
    }

    class Gato extends Animal {

        @Override
        public void emitirSom() {
            System.out.println("meaw meaw");
        }

        @Override
        public void mover() {
            System.out.println("Gato deitou-se");
        }
    }

