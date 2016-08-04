package com.pedroDelg.reporte;

import java.util.Collection;
import java.util.Vector;

public class Datos {
	private String nombreCompleto;
	private String ubicacionAdmin;
	private int cedula;
	private int codigo;


	public Datos() {
		super();
	}
	
	public Datos(String nombreCompleto, String ubicacionAdmin, int cedula, int codigo) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.ubicacionAdmin = ubicacionAdmin;
		this.cedula = cedula;
		this.codigo = codigo;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getUbicacionAdmin() {
		return ubicacionAdmin;
	}

	public void setUbicacionAdmin(String ubicacionAdmin) {
		this.ubicacionAdmin = ubicacionAdmin;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public static Collection<Datos> getDatosList() {
		Vector<Datos> datos = new Vector<Datos>();
		try {
			Datos datos2 = new Datos();
			datos2.setNombreCompleto("José Rodriguez");
			datos2.setUbicacionAdmin("Coordinacio funcional");
			datos2.setCedula(245682);
			datos2.setCodigo(16578);
			datos.add(datos2);
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return datos;
	}

}
