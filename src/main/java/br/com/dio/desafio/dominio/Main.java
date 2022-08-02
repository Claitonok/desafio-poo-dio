package br.com.dio.desafio.dominio;

import java.awt.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("descricao curso java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setDescricao("descricao curso js");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("mentoria de java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);

    }


}
