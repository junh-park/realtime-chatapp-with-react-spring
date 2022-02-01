package com.jun.chatapp.domain.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.jun.chatapp.domain.model.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity @Table(name = "USER")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class UserEntity implements Serializable {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int id;
	@NotNull @NonNull
	private String username;
	@NotNull @NonNull
	private String password;
	private String firstName;
	private String lastName;
	@Email
	private String email;
	@ElementCollection(fetch = FetchType.EAGER)
	private Set<Role> roles = new HashSet<>();
	private boolean enabled;
}
