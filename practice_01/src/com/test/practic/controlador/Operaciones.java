package com.test.practic.controlador;

public class Operaciones {
	
	private Integer valor1;
	private Integer valor2;
	private Integer resultado;
	
	public Operaciones() {
		super();
		this.valor1 = 1;
		this.valor2 = 1;
		this.resultado = -1;
	}
	
	public Integer getSuma() {
		return valor1 + valor2;
	}
	
	public Integer getResta() {
		return valor1 - valor2;
	}
	
	public Integer getMultiplicacion() {
		return valor1 * valor2;
	}
	
	public Integer getDivision() {
		return valor1 / valor2;
	}
	
	public Integer getResultadoOpercion(Integer valor1, Integer valor2, Integer opercaion) {
		
		switch (opercaion) {
		case 1:
			this.setValor1(valor1);
			this.setValor2(valor2);
			this.resultado = this.getSuma();
			break;
		case 2:
			this.setValor1(valor1);
			this.setValor2(valor2);
			this.resultado = this.getResta();
			break;
		case 3:
			this.setValor1(valor1);
			this.setValor2(valor2);
			this.resultado = this.getMultiplicacion();
			break;
		case 4:
			this.setValor1(valor1);
			this.setValor2(valor2);
			this.resultado = this.getDivision();
			break;

		default:
			break;
		}
		
		
		return this.resultado;
	}
	
	public Integer getValor1() {
		return valor1;
	}

	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}

	public Integer getValor2() {
		return valor2;
	}

	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valor1 == null) ? 0 : valor1.hashCode());
		result = prime * result + ((valor2 == null) ? 0 : valor2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Operaciones other = (Operaciones) obj;
		if (valor1 == null) {
			if (other.valor1 != null)
				return false;
		} else if (!valor1.equals(other.valor1))
			return false;
		if (valor2 == null) {
			if (other.valor2 != null)
				return false;
		} else if (!valor2.equals(other.valor2))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Operaciones [valor1=" + valor1 + ", valor2=" + valor2 + "]";
	}	

}
