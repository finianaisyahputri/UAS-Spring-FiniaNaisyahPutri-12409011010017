package org.example.example;

import org.springframework.stereotype.Service;

@Service
public class PersamaanKuadratService {

    public void hitungAkar(double a, double b, double c) {
        System.out.println("\n=== SOAL 3: PERSAMAAN KUADRAT ===");
        System.out.println("Persamaan: " + a + "x² + " + b + "x + " + c + " = 0");

        if (a == 0) {
            System.out.println("Bukan persamaan kuadrat (a tidak boleh 0).");
            return;
        }

        double D = (b * b) - (4 * a * c);
        System.out.println("Diskriminan (D) = " + D);

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.printf("Dua akar real berbeda: x1 = %.2f, x2 = %.2f\n", x1, x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.printf("Akar kembar real: x1 = x2 = %.2f\n", x);
        } else {
            System.out.println("Akar imajiner (kompleks).");
        }
    }
}