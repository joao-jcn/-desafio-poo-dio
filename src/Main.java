import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


    }
}