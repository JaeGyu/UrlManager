package me.jaegyu.url.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.Data;

@Data
public class UrlInfo {
	private Long id;
	private String url;
	private String desc;
	private Long createTime;
	private Long modifyTime;
	

	public UrlInfo() {
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		LocalDateTime ldt = LocalDateTime.now();
		this.createTime = Long.valueOf(formatter.format(ldt));
		this.modifyTime = Long.valueOf(formatter.format(ldt));
	}

	public UrlInfo(String url, String desc) {
		this();
		this.url = url;
		this.desc = desc;
	}

}
