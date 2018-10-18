package com.app.models;

public class tarea {
	private int tid;
	private String descripcion;
	private int duracion;
	private int proyecto;
	
	public tarea(int tid, String descripcion, int duracion, int proyecto) {
		super();
		this.tid = tid;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.proyecto = proyecto;
	}
	public tarea() {
		
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getProyecto() {
		return proyecto;
	}

	public void setProyecto(int proyecto) {
		this.proyecto = proyecto;
	}
	
}
