/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;
import java.util.*;

/**
 *
 * @author aluno
 */
public class Professor extends Pessoa{
    
    public Professor(String aNome, String aCpf, Date aData) {
        super(aNome, aCpf, aData);
    }
    public double salario;
    public String disciplina;
}
