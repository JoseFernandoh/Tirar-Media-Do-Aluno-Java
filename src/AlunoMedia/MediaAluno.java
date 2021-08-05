package AlunoMedia;

public class MediaAluno {
    // Criação das Variaveis Privadas
    private String nome;
    private int idade;
    private double[] nota;
    private double media = 0d;

    // Construtor para Receber os Valores Direto
    // Pode Receber Quantas Notas O Usuario Quiser Tirar a Media;
    public MediaAluno(String nome, int idade, double... nota){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
    //Construtor Default
    public MediaAluno(){

    }
    // Tirar a media das notas Recebidas
    private double tirarMedia(double media){
        return this.media/=nota.length;
    }
    // Imprimir Nome Idade Todas as Notas e a Media
    public void inprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double aux : nota) {
            media+=aux;
            System.out.print(aux+" ");
        }
        if(tirarMedia(media)>6){
            System.out.println("\nAluno Aprovado com Media: "+media);
            return;
        }
        System.out.println("\nAluno Reprovado com Media: "+media);
    }
    // Set e Get das Variaveis Privada;
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setNota(double... nota){
        this.nota = nota; 
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public double[] getnota(){
        return this.nota;
    }
    public double getmedia(){
        return this.media;
    }
}
