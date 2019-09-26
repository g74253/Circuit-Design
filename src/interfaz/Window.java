package interfaz;

// Crea una interfaz que permite el drag and drop de los items especificados. 

import javax.swing.*;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import estructuras.Components;
import interfaz.Ventanita;
import estructuras.Variable;

@SuppressWarnings("serial")
public class Window extends JFrame {
	JLabel e1,e2,s1,pic1,pic2,pic3,pic4,pic5,pic6,pic7,pic8,pic9,pic10,pic11,pic12,pic13,pic14,pic15,pic16,pic17,pic18,pic19,pic20,pic21,pic22,pic23,pic24,pic25,k;
	List<Components> l1 = new ArrayList<Components>(); 
	List<Variable> l2 = new ArrayList<Variable>();
	List<Variable> l3 = new ArrayList<Variable>();
	JTextField texto, texto1,texto2;
	Ventanita v;
	public Window() {
		super("Circuit Designer");
		
		// Boton para tabla de verdad
		JButton tabla = new JButton("Tabla Verdad");
		tabla.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	if (l1.size() != 0)
		    		new Ventanita("Tabla Verdad",l1,l2,l3);
		    }
		});
		tabla.setBounds(10, 650, 120, 40);
		add(tabla);
		
		
		
		JSeparator s = new JSeparator(); 
        s.setOrientation(SwingConstants.VERTICAL);
        s.setBounds(135, 0, 1, 700);
        
		
		k = new JLabel();
		e1 = new JLabel("Entrada1:");
		e2 = new JLabel("Entrada2:");
		s1 = new JLabel("Salida1:");
		pic1 = new JLabel();
		pic2 = new JLabel();
		pic3 = new JLabel();
		pic4 = new JLabel();
		pic5 = new JLabel();
		pic6 = new JLabel();
		pic7 = new JLabel();
		pic8 = new JLabel();
		pic9 = new JLabel();
		texto = new JTextField();
		texto1 = new JTextField();
		texto2 = new JTextField();
		pic10 = new JLabel();
		pic11= new JLabel();
		pic12 = new JLabel();
		pic13 = new JLabel();
		pic14 = new JLabel();
		pic15 = new JLabel();
		pic16 = new JLabel();
		pic17= new JLabel();
		pic18 = new JLabel();
		pic19 = new JLabel();
		pic20 = new JLabel();
		pic21 = new JLabel();
		pic22 = new JLabel();
		pic23= new JLabel();
		pic24 = new JLabel();
		pic25 = new JLabel();
		e1.setBounds(150, 520, 100, 100);
		e2.setBounds(150, 560, 100, 100);
		s1.setBounds(150, 595, 100, 100);
		pic1.setBounds(10, 10, 100, 100);
		pic2.setBounds(10, 90, 100, 100);
		pic3.setBounds(10, 170, 100, 100);
		pic4.setBounds(10, 250, 100, 100);
		pic5.setBounds(10, 330, 100, 100);
		pic6.setBounds(10, 410, 100, 100);
		pic7.setBounds(10, 490, 100, 100);
		
		pic8.setBounds(180, 10, 100, 100);
		pic9.setBounds(180, 90, 100, 100);
		texto.setBounds(220,560,80,30);
		texto1.setBounds(220,600,80,30);
		texto2.setBounds(220,640,80,30);
		pic10.setBounds(180, 170, 100, 100);
		pic11.setBounds(180, 250, 100, 100);
		pic12.setBounds(180, 330, 100, 100);
		pic13.setBounds(180, 410, 100, 100);
		pic14.setBounds(340, 10, 100, 100);
		pic15.setBounds(340, 90, 100, 100);
		pic16.setBounds(340, 170, 100, 100);
		pic17.setBounds(340, 250, 100, 100);
		pic18.setBounds(340, 330, 100, 100);
		pic19.setBounds(340, 410, 100, 100);
		pic20.setBounds(500, 410, 100, 100);
		pic21.setBounds(500, 10, 100, 100);
		pic22.setBounds(500, 90, 100, 100);
		pic23.setBounds(500, 170, 100, 100);
		pic24.setBounds(500, 250, 100, 100);
		pic25.setBounds(500, 330, 100, 100);
	
	
		
		
		pic1.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\and1.png"));
        pic2.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\nand1.png"));
        pic3.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\or1.png"));
        pic4.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\nor1.png"));
        pic5.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\not1.png"));
        pic6.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\xor1.png"));
        pic7.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\xnor1.png"));
        pic8.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\blanc.png"));
        pic9.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\blanc.png"));
        pic10.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\blanc.png"));
        pic11.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\blanc.png"));
        pic12.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\blanc.png"));
        pic13.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\blanc.png"));
        pic14.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\blanc.png"));
        pic15.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\blanc.png"));
        pic16.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\blanc.png"));
        pic17.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\blanc.png"));
        pic18.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\blanc.png"));
        pic19.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\blanc.png"));
        pic20.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\blanc.png"));
        pic21.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\blanc.png"));
        pic22.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\blanc.png"));
        pic23.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\blanc.png"));
        pic24.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\blanc.png"));
        pic25.setIcon(new ImageIcon("C:\\Users\\grero\\eclipse-workspace\\Circuit Designer\\src\\imagenes\\blanc.png"));
        
        // Esto permite el drag and drop y la adicion de archivos a la lista.
        MouseListener ml = new MouseListener() {


			@Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            	
                JComponent jc = (JComponent)e.getSource();
                TransferHandler th = jc.getTransferHandler();
                th.exportAsDrag(jc, e, TransferHandler.COPY);
                
                System.out.println(texto.getText());
                System.out.println(texto1.getText());
                
                if (texto.getText() != "") {
                	System.out.println("yes");
                }else {
                	System.out.println("no");}
                
               l2.add(new Variable(texto.getText(),-1));
               l2.add(new Variable(texto1.getText(),-1));
               l3.add(new Variable(texto2.getText(),-1));
             
                if (e.getXOnScreen() >= 10 && e.getXOnScreen() <= 110) {
                	if (e.getYOnScreen() >= 10 && e.getYOnScreen() <= 110) {
                		l1.add(new Components("and",texto.getText(),texto1.getText(),texto2.getText()));
                	}else if (e.getYOnScreen() >= 90 && e.getYOnScreen() <= 190) {
                		l1.add(new Components("nand",texto.getText(),texto1.getText(),texto2.getText()));
                	}else if (e.getYOnScreen() >= 170 && e.getYOnScreen() <= 270) {
                		l1.add(new Components("or",texto.getText(),texto1.getText(),texto2.getText()));
                	}else if (e.getYOnScreen() >= 250 && e.getYOnScreen() <= 350) {
                		l1.add(new Components("nor",texto.getText(),texto1.getText(),texto2.getText()));
                	}else if (e.getYOnScreen() >= 330 && e.getYOnScreen() <= 430) {
                		l1.add(new Components("not",texto.getText(),texto1.getText(),texto2.getText()));
                	}else if (e.getYOnScreen() >= 410 && e.getYOnScreen() <= 510) {
                		l1.add(new Components("xor",texto.getText(),texto1.getText(),texto2.getText()));
                	}else if (e.getYOnScreen() >= 490 && e.getYOnScreen() <= 590) {
                		l1.add(new Components("xnor",texto.getText(),texto1.getText(),texto2.getText()));
                	}
                }
                texto.setText("");
                texto1.setText("");
                texto2.setText("");
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            } 
        };
        
        pic1.addMouseListener(ml);
        pic2.addMouseListener(ml);
        pic3.addMouseListener(ml);
        pic4.addMouseListener(ml);
        pic5.addMouseListener(ml);
        pic6.addMouseListener(ml);
        pic7.addMouseListener(ml);
        pic8.addMouseListener(ml);
        pic9.addMouseListener(ml);
        pic10.addMouseListener(ml);
        pic11.addMouseListener(ml);
        pic12.addMouseListener(ml);
        pic13.addMouseListener(ml);
        pic14.addMouseListener(ml);
        pic15.addMouseListener(ml);
        pic16.addMouseListener(ml);
        pic17.addMouseListener(ml);
        pic18.addMouseListener(ml);
        pic19.addMouseListener(ml);
        pic20.addMouseListener(ml);
        pic21.addMouseListener(ml);
        pic22.addMouseListener(ml);
        pic23.addMouseListener(ml);
        pic24.addMouseListener(ml);
        pic25.addMouseListener(ml);
        
        pic1.setTransferHandler(new TransferHandler("icon"));
        pic2.setTransferHandler(new TransferHandler("icon"));
        pic3.setTransferHandler(new TransferHandler("icon"));
        pic4.setTransferHandler(new TransferHandler("icon"));
        pic5.setTransferHandler(new TransferHandler("icon"));
        pic6.setTransferHandler(new TransferHandler("icon"));
        pic7.setTransferHandler(new TransferHandler("icon"));
        pic8.setTransferHandler(new TransferHandler("icon"));
        pic9.setTransferHandler(new TransferHandler("icon"));
        pic10.setTransferHandler(new TransferHandler("icon"));
        pic11.setTransferHandler(new TransferHandler("icon"));
        pic12.setTransferHandler(new TransferHandler("icon"));
        pic13.setTransferHandler(new TransferHandler("icon"));
        pic14.setTransferHandler(new TransferHandler("icon"));
        pic15.setTransferHandler(new TransferHandler("icon"));
        pic16.setTransferHandler(new TransferHandler("icon"));
        pic17.setTransferHandler(new TransferHandler("icon"));
        pic18.setTransferHandler(new TransferHandler("icon"));
        pic19.setTransferHandler(new TransferHandler("icon"));
        pic20.setTransferHandler(new TransferHandler("icon"));
        pic21.setTransferHandler(new TransferHandler("icon"));
        pic22.setTransferHandler(new TransferHandler("icon"));
        pic23.setTransferHandler(new TransferHandler("icon"));
        pic24.setTransferHandler(new TransferHandler("icon"));
        pic25.setTransferHandler(new TransferHandler("icon"));
        add(e1);
        add(e2);
        add(s1);
        add(pic1);
        add(pic2);
        add(pic3);
        add(pic4);
        add(pic5);
        add(pic6);
        add(pic7);
        add(s);
        add(pic8);
        add(pic9);
        add(texto);
        add(texto1);
        add(texto2);
        add(pic10);
        add(pic11);
        add(pic12);
        add(pic13);
        add(pic14);
        add(pic15);
        add(pic16);
        add(pic17);
        add(pic18);
        add(pic19);
        add(pic20);
        add(pic21);
        add(pic22);
        add(pic23);
        add(pic24);
        add(pic25);
        
        
        add(k);
        
        setExtendedState(Frame.MAXIMIZED_BOTH);
		setResizable(false);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	// Esta funcion es el Main
	public static void main(String[] args) {
		new Window();

	}
}