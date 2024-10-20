package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
