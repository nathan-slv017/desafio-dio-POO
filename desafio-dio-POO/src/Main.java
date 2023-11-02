import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("POO");
        curso1.setDescricao("Programação orientada a objeto");
        curso1.setCargaHoraria(160);

        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria De Java");
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        //System.out.println(mentoria1);

        // Conteudo conteudo1 = new Curso();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devcamila = new Dev();
        devcamila.setNome("Camila");

        devcamila.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos" + devcamila.getConteudosInscritos());
        devcamila.progredir();
        System.out.println("Conteudos Concluidos" + devcamila.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos" + devcamila.getConteudosInscritos());

        System.out.println("------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos Concluidos" + devJoao.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());



    }
}