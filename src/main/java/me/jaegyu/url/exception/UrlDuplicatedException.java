package me.jaegyu.url.exception;

public class UrlDuplicatedException extends RuntimeException {
	private String url;

	public UrlDuplicatedException(String url) {
		this.url = url;
	}
}
