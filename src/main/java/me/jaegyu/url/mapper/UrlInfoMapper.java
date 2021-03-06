package me.jaegyu.url.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import me.jaegyu.url.model.UrlInfo;

public interface UrlInfoMapper {
	public List<UrlInfo> findAll();

	public List<UrlInfo> findLimitFive();

	public void save(UrlInfo info);
	
	public UrlInfo findByUrl(@Param("url") String url);
	
}
