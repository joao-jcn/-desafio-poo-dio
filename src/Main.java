import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso de java");
        curso1.setDescricao("descrição curso de java");
        curso1.setCargaHorario(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso de js");
        curso2.setDescricao("descrição curso de js");
        curso2.setCargaHorario(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição de mentoria de java");
        mentoria.setDate(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Luiz" + devLuiz.getConteudoInscritos());
        devLuiz.progredir();
        devLuiz.progredir();

        System.out.println("--");
        System.out.println("Conteudos inscritos Luiz" + devLuiz.getConteudoInscritos());
        System.out.println("Conteudos concluidos Luiz" + devLuiz.getConteudosConcluidos());
        System.out.println("XP: " + devLuiz.calcularTotalXp());
        System.out.println("------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao " + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("--");
        System.out.println("Conteudos concluidos Joao " + devJoao.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Joao " + devJoao.getConteudoInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}