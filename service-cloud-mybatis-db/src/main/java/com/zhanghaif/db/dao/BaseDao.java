package com.zhanghaif.db.dao;

import java.util.List;

import com.zhanghaif.db.entity.BaseEntity;

public interface BaseDao <T extends BaseEntity>{

	List<T> findAll();

	int delete(String id);

	T get(String id);

	int insert(T record);

	int update(T record);
	
}
