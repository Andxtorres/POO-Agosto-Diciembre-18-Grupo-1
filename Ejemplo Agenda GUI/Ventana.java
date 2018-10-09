import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ventana extends JFrame{
	private Agenda agenda;
	private JPanel panelListaContactos,panelDetalleContacto,formaContactoPanel;
	private JLabel nombreL,telefonoL,posL;
	private JTextField nombreT,telefonoT,posT;
	private JButton addContactoButton,removeContactoButton;
	private JScrollPane scrollPane;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem archivoItem;

	public Ventana(){
		agenda= new Agenda();
		agenda.contactos[20]= new Contacto("Andrés","5541302205");
		agenda.contactos[21]= new Contacto("Aaron","6231673");
		setSize(500,500);
		setLayout(new GridLayout(1,2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
		setVisible(true);
	}

	public void initComponents(){
		menuBar= new JMenuBar();
		menu= new JMenu("Archivo");
		archivoItem= new JMenuItem("Crear Contacto");
		menu.add(archivoItem);
		archivoItem.addActionListener(new CrearContactoListener());
		menuBar.add(menu);
		setJMenuBar(menuBar);
		formaContactoPanel= new JPanel();
		nombreT= new JTextField(30);
		telefonoT= new JTextField(30);
		posT= new JTextField(30);
		nombreL= new JLabel("Nombre: ");
		telefonoL= new JLabel("Teléfono: ");
		posL= new JLabel("Pos: ");
		addContactoButton= new JButton("Agregar");
		addContactoButton.addActionListener(new AddContactoListener());
		formaContactoPanel.add(nombreL);
		formaContactoPanel.add(nombreT);
		formaContactoPanel.add(telefonoL);
		formaContactoPanel.add(telefonoT);
		formaContactoPanel.add(posL);
		formaContactoPanel.add(posT);
		formaContactoPanel.add(addContactoButton);
		panelListaContactos= new JPanel();
		panelListaContactos.add(new JLabel("Lista contactos"));
		panelListaContactos.setLayout(new BoxLayout(panelListaContactos,BoxLayout.Y_AXIS));
		panelDetalleContacto= new JPanel();
		panelDetalleContacto.add(new JLabel("Detalle contacto"));
		imprimeContactos();
		scrollPane= new JScrollPane(panelListaContactos);
		add(scrollPane);
		add(panelDetalleContacto);
	}

	public void imprimeContactos(){
		panelListaContactos.removeAll();
		for(int i=0;i<agenda.contactos.length;i++){
			if(agenda.contactos[i]==null){
				panelListaContactos.add(new JLabel(i+".- Vacío"));
			}else{
				JButton contactoButton = new JButton(i+".- "+agenda.contactos[i].nombre);
				contactoButton.addActionListener(new ContactoButtonListener(agenda.contactos[i],i));
				panelListaContactos.add(contactoButton);
			}
		}
	}

	public void imprimeContacto(Contacto contacto,int pos){
		panelDetalleContacto.removeAll();
		panelDetalleContacto.add(new JLabel("Nombre: "+contacto.nombre));
		panelDetalleContacto.add(new JLabel("Teléfono: "+contacto.telefono));
		JButton botonRemove= new JButton("Quitar");
		botonRemove.addActionListener(new RemoveContactoListener(pos));
		panelDetalleContacto.add(botonRemove);
		panelDetalleContacto.revalidate();
		panelDetalleContacto.repaint();
	}
	public class ContactoButtonListener implements ActionListener{
		private Contacto contacto;
		private int pos;
		public ContactoButtonListener(Contacto contacto, int pos){
			this.contacto=contacto;
			this.pos=pos;
		}
		public void actionPerformed(ActionEvent e){
			imprimeContacto(contacto,pos);
			System.out.println("Presionaste: "+ contacto.nombre);
		}
	}
	public class CrearContactoListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			remove(scrollPane);
			remove(panelDetalleContacto);
			add(formaContactoPanel);
			revalidate();
			repaint();
		}
	}

	public class AddContactoListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Contacto c= new Contacto(nombreT.getText(),telefonoT.getText());
			agenda.contactos[Integer.parseInt(posT.getText())]=c;
			remove(formaContactoPanel);
			imprimeContactos();
			add(scrollPane);
			add(panelDetalleContacto);
			revalidate();
			repaint();
		}
	}

	public class RemoveContactoListener implements ActionListener{
		private int pos;
		public RemoveContactoListener(int pos){
			this.pos=pos;
		}
		public void actionPerformed(ActionEvent e){
			agenda.contactos[pos]=null;
			remove(formaContactoPanel);
			imprimeContactos();
			add(scrollPane);
			panelDetalleContacto.removeAll();
			add(panelDetalleContacto);
			revalidate();
			repaint();
		}		
	}



}