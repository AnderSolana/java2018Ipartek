package com.ipartek.formacion.poo.ejercicios.excepciones;

public class Fecha {
	private int año = 0;
	private int mes = 1;
	private int dia = 1;
	
	public static final int MESES_AÑO = 12;
	
	public static boolean esBisiesto(int año) {
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
			return true;
		}else {
			return false;
		}
	}
	
	public Fecha() {}
	
	public Fecha(int año, int mes, int dia) {
		setAño(año);
		setMes(mes);
		setDia(dia);
	}
	
	public Fecha(Fecha f) {
		set(f);
	}
	
	public boolean esBisiesto() {
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
			return true;
		}else {
			return false;
		}
		
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes < 1 || mes > 12) {
			throw new FechaExcepcion("El mes debe estar entre 1 y 12");
		}else {
			this.mes = mes;
		}
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia < 1 || dia > 31) {
			throw new FechaExcepcion("El día debe estar entre 1 y 31");
		}else {
			this.dia = dia;
		}
	}
	
	public void set(int año, int mes, int dia) {
		setAño(año);
		setMes(mes);
		setDia(dia);
	}
	
	public void set(Fecha f) {
		set(f);
	}

	@Override
	public String toString() {
		return "Fecha [año=" + año + ", mes=" + mes + ", dia=" + dia + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		if (año != other.año)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
	
	
}
