package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller // Adds Alien Object to the Spring Container of Alien.class type
@Scope(value="prototype") // Creates new object every time when beans returns. Otherwise object only created once and beans returns the same object.
public class Alien {
	private int aid;
	private String aname;
	private String tech;
	@Autowired // Wires the matching object of Laptop.class type in the Spring container
	@Qualifier("lap") // Searches the object with respect to given name in Spring Container
	private Laptop laptop;
	
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Alien() {
		super();
		System.out.println("Alien Object has been created");
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public void show() {
		System.out.println("In Show");
		laptop.compile();
	}
}
