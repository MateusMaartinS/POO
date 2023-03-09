/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author aluno
 */
public class Jacare {  
    String cor;
    int tamanho;
    String especiae;
    char sexo;
    String quanditadeDentes;
    
    public void morder(){
        if ( tamanho >= 8)
            System.out.print("Esse é bitelo \n CORRE MUITO\n\n");
        else if (tamanho <3)
            System.out.print("Esse da medo \n CORRE\n\n");
        
        else
            System.out.print("É um jacaré irmão \n CORRE\n\n");
        }
}
