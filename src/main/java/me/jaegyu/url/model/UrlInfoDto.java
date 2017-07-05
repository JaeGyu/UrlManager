package me.jaegyu.url.model;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

/*
 * DTO기 때문에 필요한 정보만 담는다.
 * */
public class UrlInfoDto {

	@Data
	public static class Create {

		@NotEmpty
		private String url;
		private String desc;
	}

	@Data
	public static class Response {
		private Long id;
		private String url;
		private String desc;
		private Long create_time;
		private Long modify_time;
	}
}
