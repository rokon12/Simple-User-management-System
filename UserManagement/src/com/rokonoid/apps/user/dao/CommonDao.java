package com.rokonoid.apps.user.dao;

import java.util.List;

public interface CommonDao<T> {
	public void create(T t);

	public void update(T t);

	public void delete(long id);

	public T get(long id);

	public List<T> getAll();
}
