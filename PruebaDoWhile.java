class PruebaDoWhile {
    
    public static void main(String[] args) {

        int suma = 0;
        int contador = 1;

        do {
            suma += contador;
            contador++;
        }
        while (contador <= 10);

        System.out.println("La suma es: " + suma);
    }
}