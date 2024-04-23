public interface Curso {
    void cursando();
}
public class Direito implements Curso {
    @Override
    public void cursando() {
        System.out.println("Cursando Direito.");
    }
}
public class Engenharia implements Curso {
    @Override
    public void cursando() {
        System.out.println("Cursando Engenharia.");
    }
}
public abstract class Aluno {
    private Curso curso;

    public Aluno(Curso curso) {
        this.curso = curso;
    }

    public abstract void cancelarMatricula();
}

public class AlunoDireito extends Aluno {

    public AlunoDireito(Curso curso) {
        super(curso);
    }

    @Override
    public void cancelarMatricula() {
        System.out.println("Direito trancado");
    }
}
public class AlunoEngenharia extends Aluno {

    public AlunoEngenharia(Curso curso) {
        super(curso);
    }

    @Override
    public void cancelarMatricula() {
        System.out.println("Engenharia trancada");
    }
}

