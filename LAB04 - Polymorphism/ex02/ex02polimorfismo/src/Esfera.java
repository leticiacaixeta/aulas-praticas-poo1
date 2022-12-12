public class Esfera extends FormaTridimensional {
    private double raio;
    private double PI = 3.14;

    public Esfera(){
    }

    public Esfera(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double obterArea(){
        return (4*(this.PI*(this.raio*this.raio)));
    }

    public double obterVolume(){
        return ((4.0/3.0)*(this.PI*(this.raio*this.raio*this.raio)));
    }

    public String descricao() {
        return "Esfera";
    }
}
