public class Geometrica extends Disciplina implements ICalcMedia{

    private double media;

    public Geometrica() {
        super();
    }

    @Override
    public double CalculaMedia() {
        media = Math.sqrt((getP1()*getP2()));
        return media;
    }

    @Override
    public String Situacao() {
        if(media > 7){
            setSituacao("Aprovado!");
        }
        else {
            setSituacao("Reprovado!");
        }
        return getSituacao();
    }
}
