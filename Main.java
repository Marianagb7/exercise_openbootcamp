public class Main {
    public static void main(String[] args){
        suma(70, 102, 38);

        Coche miCoche =  new Coche();
        miCoche.adicionarPuertas();
        System.out.println("Número de puertas del coche: "+ miCoche.numeroPuertas);

    }

    public static void suma(int numero1, int numero2, int numero3){
        int resultado;
        resultado = numero1 + numero2 + numero3;
        System.out.println("El resultado de la suma es: " +resultado);
    }
}
