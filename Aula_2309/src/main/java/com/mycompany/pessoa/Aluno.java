package com.mycompany.pessoa;

import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Aluno extends Pessoa{
    
    public Aluno(String aNome, String aCpf, Date aData) {
        super(aNome, aCpf, aData);
    }
    public String matricula;
}
public class Professor extends Pessoa{
    
    public Professor(String aNome, String aCpf, Date aData) {
        super(aNome, aCpf, aData);
    }
    public double salario;
    public String disciplina;
}
public class Funcionario extends Pessoa {
    
    public Funcionario(String aNome, String aCpf, Date aData) {
        super(aNome, aCpf, aData);
    }
    public double salario;
    public Date data_admissao;
    public String cargo;
}