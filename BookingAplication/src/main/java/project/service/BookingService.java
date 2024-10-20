package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import project.entity.Booking;
import project.repository.BookingRepository;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private RestTemplate restTemplate; // Usado para fazer chamadas entre microserviços

    public Booking bookCab(Booking booking, double distance) {
        // Chamar o serviço de cálculo de tarifa para obter o valor com base no tipo de cab e distância
        String fareServiceUrl = "http://localhost:9494/api/fare/calculate?cabType=" + booking.getCabType() + "&distance=" + distance;
        double fare = restTemplate.getForObject(fareServiceUrl, Double.class);

        // Definir o valor calculado no objeto booking
        booking.setFare(fare);

        // Salvar a reserva no banco de dados
        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}