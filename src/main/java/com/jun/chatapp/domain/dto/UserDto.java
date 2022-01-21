package com.jun.chatapp.domain.dto;

import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class UserDto {
	private int id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
}
