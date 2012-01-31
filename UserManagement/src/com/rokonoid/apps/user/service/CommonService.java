package com.rokonoid.apps.user.service;

public interface CommonService<T> {
	public void create(T t);

	public void update(T t);

	public void delete(long id);

	public T get(long id);

	public void getAll();
}
