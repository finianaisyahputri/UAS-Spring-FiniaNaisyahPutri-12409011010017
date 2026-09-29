package org.example.example;

import org.springframework.stereotype.Component;

@Component
class DanceRole {
    public void dansa() {
        System.out.println("John Travolta sedang menari tarian khas Saturday Night Fever!");
    }
}

@Component
public class JohnTravolta {
    private final DanceRole danceRole;

    // Dependency Injection via Constructor
    public JohnTravolta(DanceRole danceRole) {
        this.danceRole = danceRole;
    }

    public void tampilkanAksi() {
        System.out.println("=== SOAL 2: JOHN TRAVOLTA (SPRING DI) ===");
        danceRole.dansa();
    }
}
