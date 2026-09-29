package org.example.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MainApp {
    public static void main(String[] args) {
        // Menjalankan Spring Container
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MainApp.class);

        // Eksekusi Soal 2
        JohnTravolta john = context.getBean(JohnTravolta.class);
        john.tampilkanAksi();

        // Eksekusi Soal 3
        PersamaanKuadratService kuadrat = context.getBean(PersamaanKuadratService.class);
        kuadrat.hitungAkar(1, -5, 6);

        context.close();
    }
}