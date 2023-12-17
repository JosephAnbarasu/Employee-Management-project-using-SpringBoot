package com.employee.management.model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {

    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long user_ID;
    private String username;
    private String password;
    private String role;

    
    public User() {
		super();
	}

	public User(Long user_ID) {
		super();
	this.user_ID=user_ID;
	}

	public User(Long user_ID, String username, String password, String role) {
		super();
		this.user_ID = user_ID;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	@Override
    public String toString() {
        return "User{" +
                "id=" + user_ID +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public Long getId() {
        return user_ID;
    }

    public void setId(Long user_ID) {
        this.user_ID = user_ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}