package com.test.practic;

import javax.swing.JOptionPane;

import com.test.practic.controlador.Operaciones;

public class Init {

	public static void main(String[] args) {
		
		Operaciones operaciones = new Operaciones(); 
		
		Integer count = 0;

		do {
			
			count = Integer.valueOf(JOptionPane.showInputDialog(
					"Calculadora Basica \n"
					+ "1. Suma \n"
					+ "2. Resta \n"
					+ "3. Multiplicacion \n"
					+ "4. Division \n"
					+ "5. Salir \n"
					));
			
			Integer valor1 = 0;
			Integer valor2 = 0;
			
			if (count != 5) {
				
				 valor1 = Integer.valueOf(JOptionPane.showInputDialog(
						"Dame el valor 1: "
								));
				 valor2 = Integer.valueOf(JOptionPane.showInputDialog(
						"Dame el valor 2: "
						));
				
			}
			
			Integer resultado = operaciones.getResultadoOpercion(valor1, valor2, count);
			
			if (resultado != -1) {
				JOptionPane.showMessageDialog(null, resultado);
			}
				
			
		} while (count != 5);
		

	}

}
