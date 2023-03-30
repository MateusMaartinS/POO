package com.mycompany.pessoa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author aluno
 */
public class cadastroAluno {
    public static void main (String[] args) {
        Aluno i = new Aluno ("Jose Francisco","123.456.789-00", new Date());
        System.out.println("Veja como os astributos foram preenchidos\nNome: "+ i.nome);
        System.out.println("CPF: "+ i.cpf);
        System.out.println("Data de nascimento: "+ i.data.toString());
    }
}
