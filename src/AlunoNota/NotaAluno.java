package AlunoNota;

import AlunoMedia.*;

public class NotaAluno {
    public static void main(String[] args) {
        // Enviar os Dados Dados para o Objeto MediaAluno
        MediaAluno aluno = new MediaAluno("ANA",14, new double[]{6d,5d,8d,8d});
        // Inprimir Todos os Dados Junto com a Media
        aluno.inprimir();

    }
}