package me.jaegyu.url.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import me.jaegyu.url.mapper.TestMapper;
import me.jaegyu.url.model.Test;

@RestController
public class UrlManagerController {

	@Autowired
	private TestMapper mapper;

	@GetMapping("/test")
	public String getTest() {
		return "Test";
	}

	@GetMapping("/all/test")
	public ResponseEntity<List<Test>> getAll() throws Exception {
		List<Test> findAll = mapper.findAll();
		return new ResponseEntity<>(findAll, HttpStatus.OK);
	}
}
