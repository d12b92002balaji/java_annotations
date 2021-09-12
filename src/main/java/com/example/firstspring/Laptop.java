package com.example.firstspring;

import org.springframework.stereotype.Component;



@Component
public class Laptop
{
	private int lid;
	private String branch;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", branch=" + branch + "]";
	}
	public void compile()
	{
		System.out.println("compiling...");
		
	}
}
