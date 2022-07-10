package com.frankmoley.lil.learningspring.data;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	public Iterable<Reservation> findReservationByReservationDate(Date date);
}
