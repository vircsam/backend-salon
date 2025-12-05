package com.vircsam.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	@NotBlank(message="Name is mandatory")
	private String fullName;
	
	
	@NotBlank(message="username is mandatory")
	private String userName;
	
	@NotBlank(message="Email is mandatory")
	@Email
	private String email;
	
	@NotBlank(message="phone is mandatory")
	private String phone;
	
	@NotBlank(message="Role is mandatory")
	private String role;
	
	@NotBlank(message="password is mandatory")
	private String password;
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	
	
}
