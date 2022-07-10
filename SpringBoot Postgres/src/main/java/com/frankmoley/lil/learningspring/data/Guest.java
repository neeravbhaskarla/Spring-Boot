package com.frankmoley.lil.learningspring.data;
import javax.persistence.*;


@Entity
@Table(name="GUEST")
public class Guest {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="GUEST_ID")
	private long guest_id;
	
	@Column(name="FIRST_NAME")
	private String first_name;
	
	@Column(name="LAST_NAME")
	private String last_name;
	
	@Column(name="EMAIL_ADDRESS")
	private String email_addr;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="PHONE_NUMBER")
	private String ph_no;

	public long getGuest_id() {
		return guest_id;
	}

	public void setGuest_id(int guest_id) {
		this.guest_id = guest_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail_addr() {
		return email_addr;
	}

	public void setEmail_addr(String email_addr) {
		this.email_addr = email_addr;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPh_no() {
		return ph_no;
	}

	public void setPh_no(String ph_no) {
		this.ph_no = ph_no;
	}

	@Override
	public String toString() {
		return "Guest [guest_id=" + guest_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email_addr=" + email_addr + ", address=" + address + ", country=" + country + ", state=" + state
				+ ", ph_no=" + ph_no + "]";
	}
	
	
}
