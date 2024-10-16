import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando um Bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Bootcamp focado em Java e OOP");

        // Criando Cursos e Mentorias
        Curso cursoJava = new Curso("Curso Java", "Aprenda Java do zero", 10);
        Mentoria mentoriaJava = new Mentoria("Mentoria Java", "Mentoria avançada de Java", 2, LocalDate.now());

        // Adicionando Cursos e Mentorias ao Bootcamp
        bootcamp.adicionarCurso(cursoJava);
        bootcamp.adicionarMentoria(mentoriaJava);

        // Criando Devs
        Dev dev1 = new Dev("Miguel");
        Dev dev2 = new Dev("Ana");

        // Inscrevendo os Devs no Bootcamp
        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        // Dev Miguel conclui um curso
        dev1.concluirCurso(cursoJava);

        // Exibindo o progresso do Dev
        System.out.println(dev1.getNome() + " concluiu " + dev1.getCursosConcluidos().size() + " cursos e tem " + dev1.getTotalXP() + " XP.");
        System.out.println(dev2.getNome() + " concluiu " + dev2.getCursosConcluidos().size() + " cursos e tem " + dev2.getTotalXP() + " XP.");
    }
}
