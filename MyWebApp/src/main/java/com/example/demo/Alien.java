package com.example.demo;

import javax.persistence.*;

@Entity
@Table
public class Alien {
	@Id
	@Column
	private int aid;
	@Column
	private String aname;
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
}
