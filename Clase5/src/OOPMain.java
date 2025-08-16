import models.Transaction;

import java.time.LocalDateTime;
import java.util.Scanner;

public class OOPMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Crear Objeto de transacion
        Transaction transaction1 = new Transaction();
        transaction1.setNombre("Transaccion Codigo");
        System.out.println(transaction1.getNombre());

        Transaction transaction2 = new Transaction(
                2,
                "Transacion dos",
                25.50,
                LocalDateTime.now(),
                "Yape",
                "ChinaWork"
        );

        System.out.println(transaction2.getTipoPago());

    }
}
