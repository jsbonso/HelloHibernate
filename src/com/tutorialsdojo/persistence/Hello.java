package com.tutorialsdojo.persistence;

public class Hello implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	
	//Constructors
	
	public Hello(){		
	}
	
	public Hello(String message){
		this.name = name;
	}
	
	//Getters & Setters
	
	public long getId(){
		return this.id;
	}
	
	public void setId(long id){
		this.id = id;
	}
	
	public String getName(){
		return this.name;
	}
		
	public void setName(String name){
		this.name = name;
	}

}
