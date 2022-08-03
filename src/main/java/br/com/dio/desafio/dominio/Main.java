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


       /* System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descricao Bootcamp java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devClaiton = new Dev();
        devClaiton.setNome("Claiton");
        devClaiton.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Claiton:" + devClaiton.getConteudosinscritos());
        devClaiton.progredir();
        devClaiton.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Claiton:" + devClaiton.getConteudosinscritos());
        System.out.println("Conteudos concluidos Claiton:" + devClaiton.getConteudosConcluidos());
        System.out.printf("XP:" + devClaiton.calcularTotalXp());


        System.out.println("---------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosinscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosinscritos());
        System.out.println("Conteudos concluidos Joao: " + devJoao.getConteudosConcluidos());
        System.out.printf("XP:" + devJoao.calcularTotalXp());

    }


}
