package me.jaegyu.url.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.jaegyu.url.mapper.UrlInfoMapper;
import me.jaegyu.url.model.UrlInfo;

@Service
public class UrlManagerService {

	@Autowired
	private UrlInfoMapper mapper;
	
	/*
	 * 저장 후 조회를 한다. 
	 * */
	public List<UrlInfo> createUrl(UrlInfo info) {
		System.out.println("저장 전 : "+info);
		//1) 저장
		mapper.save(info);
		System.out.println("저장 후 : "+info);
		//2) limit5 조회
		return mapper.findLimitFive();
	}

	
}
