package com.learn.springBoot.springPractice.models;

public class Course {
	private int courceId;
	private String courceName;
	private String courceSite;
	
	public Course(int courceId, String courceName, String courceSite) {
		super();
		this.courceId = courceId;
		this.courceName = courceName;
		this.courceSite = courceSite;
	}

	public int getCourceId() {
		return courceId;
	}

	public void setCourceId(int courceId) {
		this.courceId = courceId;
	}

	public String getCourceName() {
		return courceName;
	}

	public void setCourceName(String courceName) {
		this.courceName = courceName;
	}

	public String getCourceSite() {
		return courceSite;
	}

	public void setCourceSite(String courceSite) {
		this.courceSite = courceSite;
	}
}
