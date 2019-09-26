package interfaz;

//Esta clase es la interfaz de la ventana que se abre cuando se genera la tabla de verdad.

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import estructuras.Variable;

import estructuras.Components;
@SuppressWarnings("serial")
public class Ventanita extends JFrame {
	JLabel entrada1, entrada2, label,k;
	JTextField entra1, entra2;
	public Ventanita(String name, List<Components> l1,List<Variable> l2, List<Variable> l3) {
		super(name);
		
		JButton generar = new JButton("Generar");
		
		//Hace que el boton genere la tabla de verdad.
		
		generar.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	int size = l1.size();
		    	int var = 0;
		    	String letra = "";
		    	l2.get(0).setValue(Integer.parseInt(entra1.getText()));
		    	l2.get(1).setValue(Integer.parseInt(entra2.getText()));
		    	while (var < size) {
		    		if(l1.get(var).getName()=="and")	
		    			letra+=("AND : "+Integer.toString((l2.get(0).getValue()&l2.get(1).getValue()))+"<br/>");
		        
		    		else if(l1.get(var).getName()=="nand"){
		    			if((l2.get(0).getValue() == 1 && l2.get(1).getValue() == 1))
		    				letra+=("NAND : 0<br/>");
		    			else
		    				letra+=("NAND : 1<br/>");
		    			}
		    		else if(l1.get(var).getName()=="or")	
		    			letra+=("Or : "+Integer.toString((l2.get(0).getValue()|l2.get(1).getValue()))+"<br/>");
		    		else if(l1.get(var).getName()=="nor"){
		    			if((l2.get(0).getValue() == 0 && l2.get(1).getValue() == 0) )
		    				letra+=("NOR : 1<br/>");
		    			else
		    				letra+=("NOR : 0<br/>");
		    			}
		    		else if(l1.get(var).getName()=="not"){
		    			if((l2.get(0).getValue() == 1)  )
		    				letra+=("NOT : 0<br/>");
		    			else
		    				letra+=("NOT : 1<br/>");
		    			}
		    		else if(l1.get(var).getName()=="xor"){
		    			if(((l2.get(0).getValue() == 1 && l2.get(1).getValue() == 1) ) || ( (l2.get(0).getValue() == 0 && l2.get(1).getValue() == 0) ))
		    				letra+=("XOR : 0<br/>");
		    			else
		    				letra+=("XOR : 1<br/>");
		    			}
		    		else if(l1.get(var).getName()=="xnor"){
		    			if(( (l2.get(0).getValue() == 0 && l2.get(1).getValue() == 1)) || ( (l2.get(0).getValue() == 1 && l2.get(1).getValue() == 0)))
		    				letra+=("XNOR : 0<br/>");
		    			else
		    				letra+=("XNOR : 1<br/>");
		    			}
		    	var++;
		    	}
		    	label.setText("<html>"+letra + "</html>");
		    	entra1.setText("");
		    	entra2.setText("");
		    }
		});
				
		generar.setBounds(250, 10, 90, 40);
		add(generar);
		
		entrada1 = new JLabel("Entrada1:");
		entrada2 = new JLabel("Entrada2:");
		label = new JLabel();
		entra1 = new JTextField();
		entra2 = new JTextField();
		k = new JLabel();
		
		entrada1.setBounds(10, 10, 80, 30);
		entrada2.setBounds(120, 10, 80, 30);
		label.setBounds(10, 50, 360, 310);
		entra1.setBounds(80,10,30,30);
		entra2.setBounds(200,10,30,30);
		
		add(entrada1);
        add(entrada2);
        add(label);
        add(entra1);
        add(entra2);
        add(k);
        
		setSize(400,400);
		setResizable(false);
		setVisible(true);
		setLayout(null);
	}
}
