package com.app.models;

public class proyecto {
	private int pid;
	private String titulo;
	
	
	public proyecto(int pid, String titulo) {
		super();
		this.pid = pid;
		this.titulo = titulo;
	}
	public proyecto() {}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
