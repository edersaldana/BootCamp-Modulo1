public class Array {
    public static void main(String[] args) {

        double [] listNotas = {12.5, 15.5, 18.6, 5.0, 12.0, 16.6, 15.7, 10.1, 14.6};
        double total = 0;

        for (double valor : listNotas)
        {
            total += valor;
        }

        System.out.println("EL promedio es: " + total/listNotas.length);
    }
}
