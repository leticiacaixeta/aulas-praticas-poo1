public class Cubo extends FormaTridimensional {
    private double lado;

    public Cubo(){
    }

    public Cubo(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double obterArea(){
        return (6*(this.lado*this.lado));
    }

    public double obterVolume(){
        return (this.lado*this.lado*this.lado);
    }

    public String descricao() {
        return "Cubo";
    }
}