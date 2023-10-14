public class Aritmetica extends Disciplina implements ICalcMedia{

    private double media;

    public Aritmetica() {
        super();
    }

    @Override
    public double CalculaMedia() {
        media = (getP1() + getP2())/2;
        return media;
    }

    @Override
    public String Situacao() {
        if(media > 5){
            setSituacao("Aprovado!");
        }
        else {
            setSituacao("Reprovado!");
        }
        return getSituacao();
    }
}
