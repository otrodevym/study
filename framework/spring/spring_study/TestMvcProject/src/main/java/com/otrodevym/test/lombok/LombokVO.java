package com.otrodevym.test.lombok;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)

public class LombokVO {
	private String id;
	private String name;
	private String job;
	
	@Builder
	public LombokVO(String id, String name, String job) {
		this.id = id;
		this.name = name;
		this.job = job;
	}
}
