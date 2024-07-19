package hibernatecrud.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable=false)
	private String name;
	@Column(unique = true,nullable=false, length=10)
	private long phno;
	private char gender;
	@Lob
	private byte[] image;
	@CreationTimestamp
	private Date objectTime;
	@UpdateTimestamp
	private Date updateTime;
//	dfghjkl;
}