package com.project.mail.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mailer")
public class Mailer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String from_email;
	@Column(nullable = false)
	private String to_email;
	@Column(nullable = false)
	private String subject_email;
	@Column(nullable = false)
	private String message_email;
	@Column(name = "created_at")
	private Date createdAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom_email() {
		return from_email;
	}

	public void setFrom_email(String from_email) {
		this.from_email = from_email;
	}

	public String getTo_email() {
		return to_email;
	}

	public void setTo_email(String to_email) {
		this.to_email = to_email;
	}

	public String getSubject_email() {
		return subject_email;
	}

	public void setSubject_email(String subject_email) {
		this.subject_email = subject_email;
	}

	public String getMessage_email() {
		return message_email;
	}

	public void setMessage_email(String message_email) {
		this.message_email = message_email;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
