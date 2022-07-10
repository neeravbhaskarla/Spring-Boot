package com.frankmoley.lil.learningspring.util;

//import java.util.Date;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.frankmoley.lil.learningspring.data.Reservation;
import com.frankmoley.lil.learningspring.data.ReservationRepository;
import com.frankmoley.lil.learningspring.data.Room;
import com.frankmoley.lil.learningspring.data.RoomRepository;
import com.frankmoley.lil.learningspring.data.Guest;
import com.frankmoley.lil.learningspring.data.GuestRepository;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent>{
	private final RoomRepository roomRepository;
	private final ReservationRepository reservationRepository;
	private final GuestRepository guestRepository;

	public AppStartupEvent(RoomRepository roomRepository, ReservationRepository reservationRepository, GuestRepository guestRepository) {
		this.roomRepository = roomRepository;
		this.reservationRepository = reservationRepository;
		this.guestRepository = guestRepository;
	}
	
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		// TODO Auto-generated method stub
		Iterable<Room> rooms = this.roomRepository.findAll();
		rooms.forEach(System.out::println);
		Iterable<Reservation> reservations = this.reservationRepository.findAll();
		reservations.forEach(System.out::println);
		Iterable<Guest> guests = this.guestRepository.findAll();
		guests.forEach(System.out::println);
//		System.out.println(this.reservationRepository.getByReservationDate("2022-01-01"));
	}
	
	

}
