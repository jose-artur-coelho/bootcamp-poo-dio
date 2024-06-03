
import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {

        Curso cursoGit = new Curso();
        Curso cursoJava = new Curso();
        Mentoria mentoriaGit = new Mentoria();

        cursoGit.setTitulo("Git");
        cursoGit.setDescricao("Descrição Curso Git");
        cursoGit.setCargaHoraria(4);

        cursoJava.setTitulo("Java");
        cursoJava.setDescricao("Descrição Curso Java");
        cursoJava.setCargaHoraria(8);

        mentoriaGit.setTitulo("Mentoria Git");
        mentoriaGit.setDescricao("Descrição Mentoria Git");
        mentoriaGit.setData(LocalDate.now());

        Bootcamp bootcampjava = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcampjava.getConteudos().add(cursoGit);
        bootcampjava.getConteudos().add(cursoJava);
        bootcampjava.getConteudos().add(mentoriaGit);

        Dev devArtur = new Dev("Artur");
        devArtur.inscreverBootcamp(bootcampjava);

        Dev devCadu = new Dev("Cadu");
        devCadu.inscreverBootcamp(bootcampjava);

        devArtur.progredir();
        devArtur.progredir();

        devCadu.progredir();

        System.out.println("-----------------------------------------------------");
        System.out.println(" Conteudos Inscritos Artur: " + devArtur.getConteudosInscritos());
        System.out.println(" Conteudos Inscritos Cadu: " + devCadu.getConteudosInscritos());
        System.out.println("-----------------------------------------------------");

        System.out.println("Conteudos Concluidos Artur: " + devArtur.getConteudosConcluidos());
        System.out.println("Conteudos Concluidos Cadu: " + devCadu.getConteudosConcluidos());

        System.out.println("-----------------------------------------------------");
        System.out.println("XP Total Artur: " + devArtur.calcularXpTotal());
        System.out.println("XP Total Cadu: " + devCadu.calcularXpTotal());
        System.out.println("-----------------------------------------------------");

    }
}
