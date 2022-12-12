public class Quadrado extends FormaBidimensional {
    private double lado;

    public Quadrado(){
    }

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double obterArea(){
        return (this.lado*this.lado);
    }

    public String descricao() {
        return "Quadrado";
    }

    public double obterVolume() {
        return 0;
    }
}