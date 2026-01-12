import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTiutlo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTiutlo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargahoraria(4);


     /**   Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        List<String> palavras = new ArrayList<>();
**/


        Mentoria mentoria = new Mentoria();
        mentoria.setTiutlo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);




    }
}
