package com.etoak.bean;

public class Greeting {
	private final long id;
	private final String conten;
	public Greeting(long id,String content) {
		this.id=id;
		this.conten=content;
	}
	public long getId() {
		return id;
	}
	public String getConten() {
		return conten;
	}

	
}
