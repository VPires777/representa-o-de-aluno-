import java.util.Scanner;
import java.text.DecimalFormat;

public class Aluno {
    private String nome;
    private String matricula;
    private String sexo;
    private String dataNascimento;
    private String curso;
    private int anoInicio;
    private double notaProva1;
    private double notaProva2;
    private double mediaTrabalhos;

    public Aluno(String nome, String matricula, String sexo, String dataNascimento, 
                 String curso, int anoInicio, double notaProva1, double notaProva2, double mediaTrabalhos) {
        this.nome = nome;
        this.matricula = matricula;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.curso = curso;
        this.anoInicio = anoInicio;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.mediaTrabalhos = mediaTrabalhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public double getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public double getMediaTrabalhos() {
        return mediaTrabalhos;
    }

    public void setMediaTrabalhos(double mediaTrabalhos) {
        this.mediaTrabalhos = mediaTrabalhos;
    }

    public double calcularMediaFinal() {
        return (notaProva1 + notaProva2 + mediaTrabalhos) / 3.0;
    }

    public boolean estaAprovado() {
        return calcularMediaFinal() >= 6.0;
    }

    public void exibirSituacao() {
        DecimalFormat df = new DecimalFormat("#.00");
        double mediaFinal = calcularMediaFinal();
        String situacao = estaAprovado() ? "Aprovado" : "Reprovado";
        System.out.println("### INFORMAÇÕES ###");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + curso);
        System.out.println("Situação: " + situacao + " com média " + df.format(mediaFinal));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(">>> INÍCIO SOFTWARE ALUNO <<<");

        System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Informe o sexo: ");
        String sexo = scanner.nextLine();

        System.out.print("Informe a data de nascimento: ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Informe o Curso: ");
        String curso = scanner.nextLine();

        System.out.print("Informe o ano de início: ");
        int anoInicio = Integer.parseInt(scanner.nextLine());

        System.out.print("Informe a Nota da Prova 1: ");
        double notaProva1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Informe a Nota da Prova 2: ");
        double notaProva2 = Double.parseDouble(scanner.nextLine());

        System.out.print("Informe a média dos Trabalhos: ");
        double mediaTrabalhos = Double.parseDouble(scanner.nextLine());

        Aluno aluno = new Aluno(nome, matricula, sexo, dataNascimento, curso, anoInicio, 
                                notaProva1, notaProva2, mediaTrabalhos);

        aluno.exibirSituacao();

        System.out.println(">> Fim da execução do software <<");
        scanner.close();
    }
}
