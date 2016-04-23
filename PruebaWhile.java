class PruebaWhile {

    public static void main(String[] args) {

        int suma = 0;
        int contador = 1;

        while (contador <= 10) {

            suma += contador;
            contador++;

            System.out.println(contador);
        }

        System.out.println("La suma es: " + suma);
    }
}