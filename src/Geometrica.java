public class Geometrica extends Disciplina implements ICalcMedia {
    private double media;
    @Override
    public double CalculaMedia(double p1, double p2) {
        media = Math.sqrt(p1 * p2);
        return media;
    }

    @Override
    public String Situacao(String situacao) {
        if(media > 7){
            setSituacao("Aprovado!");
        }
        else {
            setSituacao("Reprovado!");
        }
        return getSituacao();
    }
}
