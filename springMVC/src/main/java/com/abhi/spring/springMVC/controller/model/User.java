package com.abhi.spring.springMVC.controller.model;

public class User {
	private String name;
	private int id;

	@Override
	public String toString() {
		return String.format("User [name=%s, id=%s]", getName(), id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
