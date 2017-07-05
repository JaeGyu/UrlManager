package me.jaegyu.url.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import me.jaegyu.url.mapper.UrlInfoMapper;
import me.jaegyu.url.model.UrlInfo;
import me.jaegyu.url.service.UrlManagerService;

@RestController
public class UrlManagerController {
	
	@Autowired
	private UrlManagerService service;
	
	@Autowired
	private UrlInfoMapper mapper;

	
	/*
	 * url정보를 생성하고 db에서 url정보 리스트를 5개 조회해서 응답한다.
	 * 클라이언트 쪽에서 넘어오는 VO를 DTO로 매핑 해서 사용할 것
	 * 필수 값 검증 할 것
	 * */
	@PostMapping("/create")
	public ResponseEntity<List<UrlInfo>> create(@RequestBody UrlInfo info) {
		List<UrlInfo> result = service.createUrl(info);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@GetMapping("/findLimitFive")
	public ResponseEntity<List<UrlInfo>> findLimitFive() {
		return new ResponseEntity<>(mapper.findLimitFive(), HttpStatus.OK);
	}
}
