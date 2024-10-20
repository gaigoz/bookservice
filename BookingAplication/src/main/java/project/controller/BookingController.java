package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.entity.Booking;
import project.service.BookingService;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @PostMapping("/createBook")
    public Booking createBooking(@RequestBody Booking booking, @RequestParam double distance) {
        return bookingService.bookCab(booking, distance);
    }
}