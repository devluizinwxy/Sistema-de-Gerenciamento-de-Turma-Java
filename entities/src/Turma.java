import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List<Aluno> alunos = new ArrayList<>();
    private String nome;

    public Turma(String nome) {
        if(nome == null || nome.isBlank())
            throw new IllegalArgumentException("O nome da turma não pode ser vazio");
        if (!nome.matches("^\\p{Lu}\\p{Ll}*$"))
            throw new IllegalArgumentException("O nome não pode começar com minuscula");
        this.nome = nome;
    }
    public void  addAluno (Aluno aluno){
        if (aluno == null)throw new IllegalArgumentException("aluno n pode ser null");
        this.alunos.add(aluno);
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
    public double mediaTurma (){
        double mediaTurma = alunos.stream().flatMapToDouble(aluno -> aluno.getNotas().stream().mapToDouble(Double::doubleValue)).average().orElse(0);
        return mediaTurma;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Turma: ").append(getNome()).append(System.lineSeparator());
        for (Aluno aluno : alunos){
            stringBuilder.append(aluno);
        }
        stringBuilder.append("Média da turma: ").append(mediaTurma());
        return stringBuilder.toString();
    }
}
