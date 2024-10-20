package backend.service;

import org.springframework.stereotype.Service;

@Service
public class FareCalculatorService {

    public double calculateFare(String cabType, double distance) {
        double baseFare;

        // Definindo tarifas com base no tipo de cab
        switch (cabType.toLowerCase()) {
            case "economy":
                baseFare = 10.0;
                break;
            case "luxury":
                baseFare = 25.0;
                break;
            default:
                baseFare = 15.0;
                break;
        }

        // Calculando a tarifa total
        return baseFare + (distance * 2.5);
    }
}
