package com.edu.ege.EGE.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_mainAssets")
public class EventoMainAsset {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private long idEvento;
	private String pathSrc;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPath() {
		return pathSrc;
	}
	public void setPath(String path) {
		this.pathSrc = path;
	}
	public long getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}
}
