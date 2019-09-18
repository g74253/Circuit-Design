package interfaz;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Main extends JFrame {
	
	public static void main(String[] args) {
		JFrame f=new JFrame("Circuit Designer"); 
		f.setExtendedState(Frame.MAXIMIZED_BOTH);
		f.setResizable(false);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JButton and = new JButton("AND",new ImageIcon("fotos de progra/and.png"));
		and.setSize(100,20);
		and.setLocation(300, 300);
		f.add(and);
		JButton nand = new JButton("NAND");
		nand.setSize(100,20);
		f.add(nand);
		nand.setLocation(0, 35);
		JButton  or= new JButton("OR");
		or.setSize(100,20);
		f.add(or);
		or.setLocation(0, 55);
		JButton nor = new JButton("NOR");
		nor.setSize(100,20);
		f.add(nor);
		nor.setLocation(0, 75);
		JButton not = new JButton("NOT");
		not.setSize(100,20);
		f.add(not);
		not.setLocation(0, 95);
		JButton xor = new JButton("XOR");
		xor.setSize(100,20);
		f.add(xor);
		xor.setLocation(0, 115);
		JButton xnor = new JButton("XNOR");
		xnor.setSize(100,20);
		xnor.setLocation(0, 135);
		f.add(xnor);
	}
}