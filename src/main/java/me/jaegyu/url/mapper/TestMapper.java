package me.jaegyu.url.mapper;

import java.util.List;

import me.jaegyu.url.model.Test;

public interface TestMapper {
	public List<Test> findAll() throws Exception;
}
