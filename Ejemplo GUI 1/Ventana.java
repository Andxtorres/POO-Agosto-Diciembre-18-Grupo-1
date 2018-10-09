import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
public class Ventana extends JFrame{

	private JLabel jlabel1,jlabel2,jlabel3,jlabel4;
	private JPanel panel1, panel2,panel3, panel4;
	private JButton boton1;
	public Ventana(){
		super("Mi ventana");
		setSize(500,500);
		setLayout(new GridLayout(2,2));
		initComponents();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void initComponents(){
		panel1= new JPanel();
		panel1.setLayout(new GridLayout(2,1));
		TitledBorder border1= new TitledBorder("Panel 1");
		panel1.setBorder(border1);
		panel2= new JPanel();
		TitledBorder border2= new TitledBorder("Panel 2");
		panel2.setBorder(border2);		
		panel3= new JPanel();
		TitledBorder border3= new TitledBorder("Panel 3");
		panel3.setBorder(border3);		
		panel4= new JPanel();
		TitledBorder border4= new TitledBorder("Panel 4");
		panel4.setBorder(border4);

		jlabel1= new JLabel("Label 1");
		panel1.add(jlabel1);
		jlabel2= new JLabel("Label 2");
		panel1.add(jlabel2);
		jlabel3= new JLabel("Label 3");
		panel1.add(jlabel3);
		ImageIcon image= new ImageIcon("assets/asset_botton.png");
		boton1= new JButton(image);
		boton1.setBorder(null);
		boton1.setBackground(null);
		boton1.addActionListener(new BotonListener());
		panel2.add(boton1);
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
				
	}

	public class BotonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			jlabel1.setText("Presionaste el botón");
		}
	}








}