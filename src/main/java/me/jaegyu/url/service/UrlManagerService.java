package me.jaegyu.url.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.jaegyu.url.exception.UrlDuplicatedException;
import me.jaegyu.url.mapper.UrlInfoMapper;
import me.jaegyu.url.model.UrlInfo;
import me.jaegyu.url.model.UrlInfoDto;

@Service
public class UrlManagerService {

	@Autowired
	private UrlInfoMapper mapper;

	@Autowired
	private ModelMapper modelMapper;

	/*
	 * 저장 후 조회를 한다.
	 */
	public List<UrlInfo> createUrl(UrlInfoDto.Create dto) {
		UrlInfo info = modelMapper.map(dto, UrlInfo.class);

		// url이 중복되면 다른 조치를 취한다.
		String url = dto.getUrl();
		if (mapper.findByUrl(url) != null) {
			throw new UrlDuplicatedException(url);
		}

		System.out.println("저장 전 : " + info);
		// 1) 저장
		mapper.save(info);
		System.out.println("저장 후 : " + info);
		// 2) limit5 조회
		return mapper.findLimitFive();
	}

}
