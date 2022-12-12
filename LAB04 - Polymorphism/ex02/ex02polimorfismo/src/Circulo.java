public class Circulo extends FormaBidimensional {
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double obterArea(){
        return (3.14*(this.raio*this.raio));
    }

    public String descricao(){
        return "Circulo";
    }

    public double obterVolume() {
        return 0;
    }
}