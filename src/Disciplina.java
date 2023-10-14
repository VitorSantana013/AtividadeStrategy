public class Disciplina{
   private ICalcMedia calcMedia;
   private double Media;
   private String Nome;
   private double P1;
   private double P2;
   private String situacao;

    public Disciplina(){
    }
    public Disciplina(ICalcMedia calcMedia){
        this.calcMedia = calcMedia;
    }
   public void CalcularMedia(){
        Media = calcMedia.CalculaMedia(P1,P2);
        situacao = calcMedia.Situacao(situacao);
   }

    //Getters e Setters

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double p1) {
        P1 = p1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double p2) {
        P2 = p2;
    }

    public double getMedia() {
        return Media;
    }

    public void setMedia(double media) {
        Media = media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
