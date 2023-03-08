/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Mateus Martins da Silva
 * RA: 00231293
 */
public class Ativ_1 {

    public static void main(String[] args) {
        Jacare jonas = new Jacare();
        jonas.cor = "albino";
        jonas.especiae = "jacaré-anão";
        jonas.sexo = 'M';
        jonas.tamanho = 8;
        jonas.quanditadeDentes = "80";
        
        Jacare maua = new Jacare();
        maua.cor = "acinzentado";
        maua.especiae = "jacaré-açu";
        maua.sexo = 'F';
        maua.tamanho = 3;
        maua.quanditadeDentes = "50";
        
        Jacare renato = new Jacare();
        renato.cor = "verde escuro";
        renato.especiae = "jacaré-coroa";
        renato.sexo = 'M';
        renato.tamanho = 1;
        renato.quanditadeDentes = "75";
        
        Jacare jare = new Jacare();
        jare.cor = "verde e amarelo";
        jare.especiae = "jacare-do-papo-amarelo";
        jare.sexo = 'F';
        jare.tamanho = 2;
        jare.quanditadeDentes = "75";
        
        Jacare rex = new Jacare();
        rex.cor = "verde";
        rex.especiae = "jacare-açu";
        rex.sexo = 'M';
        rex.tamanho = 7;
        rex.quanditadeDentes = "60";
    }
}
