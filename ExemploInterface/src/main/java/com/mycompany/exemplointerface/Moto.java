/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplointerface;

/**
 *
 * @author aluno
 */
public class Moto implements Veiculo {
    @Override
    public void acelerar(){
        System.out.println("A Moto está acelerando");
    }
    
    @Override
    public void frear (){
        System.out.println("A Moto está freando");
    }
    
}
