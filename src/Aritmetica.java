public class Aritmetica extends Disciplina implements ICalcMedia{
    private double media;
    @Override
    public double CalculaMedia(double p1, double p2) {

        media = (p1 + p2)/2;
        return media;
    }

    @Override
    public String Situacao(String situacao) {
        if(media > 5){
            setSituacao("Aprovado!");
        }
        else {
            setSituacao("Reprovado!");
        }
        return getSituacao();
    }
}
