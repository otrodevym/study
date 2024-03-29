package com.otrodevym.web.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.otrodevym.web.domain.enums.SocialType;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table
public class User implements Serializable{

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idx;
	
	@Column
	private String name;
	
	@Column
	@JsonIgnore
	private String password;
	
	@Column
	private String email;
	
	@Column
	private String principal;
	
	@Column
	@Enumerated(EnumType.STRING)
	private SocialType socialType;
	
	@Column
	private LocalDateTime createdDate;
	
	@Column
	private LocalDateTime updateDate;

	@Builder
	public User(Long idx, String name, String password, String email, String principal, SocialType socialType,
			LocalDateTime createdDate, LocalDateTime updateDate) {
		super();
		this.idx = idx;
		this.name = name;
		this.password = password;
		this.email = email;
		this.principal = principal;
		this.socialType = socialType;
		this.createdDate = createdDate;
		this.updateDate = updateDate;
	}

	

	
	
	
	
	
}
