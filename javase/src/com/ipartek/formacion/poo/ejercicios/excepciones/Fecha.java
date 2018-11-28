package com.ipartek.formacion.poo.ejercicios.excepciones;

public class Fecha {
	private int a�o = 0;
	private int mes = 1;
	private int dia = 1;
	
	public static final int MESES_A�O = 12;
	
	public static boolean esBisiesto(int a�o) {
		if ((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0))) {
			return true;
		}else {
			return false;
		}
	}
	
	public Fecha() {}
	
	public Fecha(int a�o, int mes, int dia) {
		setA�o(a�o);
		setMes(mes);
		setDia(dia);
	}
	
	public Fecha(Fecha f) {
		set(f);
	}
	
	public boolean esBisiesto() {
		if ((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0))) {
			return true;
		}else {
			return false;
		}
		
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
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
			throw new FechaExcepcion("El d�a debe estar entre 1 y 31");
		}else {
			this.dia = dia;
		}
	}
	
	public void set(int a�o, int mes, int dia) {
		setA�o(a�o);
		setMes(mes);
		setDia(dia);
	}
	
	public void set(Fecha f) {
		set(f);
	}

	@Override
	public String toString() {
		return "Fecha [a�o=" + a�o + ", mes=" + mes + ", dia=" + dia + "]";
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
		if (a�o != other.a�o)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
	
	
}
