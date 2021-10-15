package br.com.felippeneves.factory.database.model;

import java.util.List;

public interface Database {
    List<String> query(String sql);
	int insert(List<Object> list);
	int update(String sql);
	int delete(String sql);
}
