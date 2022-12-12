public class Triangulo extends FormaBidimensional {
    private double base;
    private double altura;

    public Triangulo(){
    }

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double obterArea(){
        return (this.base*this.altura)/2;
    }

    public String descricao(){
        return "Triangulo";
    }

    public double obterVolume() {
        return 0;
    }
}