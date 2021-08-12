
package Clases;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Salas extends JLabel {
    
    private boolean reservado;
    
	public final int VALOR;
	
	public Salas(String nombre, int valor) {
		super(nombre);
		VALOR = valor;
		reservado = false;
		setHorizontalAlignment(SwingConstants.CENTER);
		setFont(new Font("Verdana", Font.BOLD, 20));
		setOpaque(true);
		setBackground(Color.WHITE);
		setForeground(new Color(16, 175, 5));
		setBorder(
				BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(5,5,5,5, new Color(16,175,5)),
				BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		setToolTipText("Disponible, valor: " + VALOR);
	}
	
	public boolean estaReservado() {
		return reservado;
	}

	public void reservar() {
		reservado = true;
		setForeground(Color.RED);
		setToolTipText("Reservado");
		setBorder(null);
		setBorder(
				BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.RED),
				BorderFactory.createEmptyBorder(10, 10, 10, 10)));
	}
	
}