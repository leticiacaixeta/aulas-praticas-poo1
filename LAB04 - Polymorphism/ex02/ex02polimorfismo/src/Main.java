public class Main {
    public static void main(String[] args) {
        Forma[] lista = new Forma[6];

        for(int i = 0; i < 6; i++) {
            lista[0] = new Circulo(5);
            lista[1] = new Quadrado(5);
            lista[2] = new Triangulo(5,2);
            lista[3] = new Esfera(2);
            lista[4] = new Cubo(5);
            lista[5] = new Tetraedro(10, 2, 3);
        }

        for(int i = 0; i < 6; i++) {

            if(lista[i] instanceof FormaBidimensional) {
                System.out.println("Forma: " + lista[i].descricao());
                System.out.println("Dimensionalidade: Bidimensional\n" + "Area da figura: " + lista[i].obterArea());
                System.out.println("_________________________________________");

            }else if(lista[i] instanceof FormaTridimensional) {
                System.out.println("Forma: " + lista[i].descricao());
                System.out.println("Dimensionalidade: Tridimensional\n" + "Area da figura: " + lista[i].obterArea() + "\n"+ "Volume da figura: " + lista[i].obterVolume());
                System.out.println("_________________________________________");
            }
        }
    }
}