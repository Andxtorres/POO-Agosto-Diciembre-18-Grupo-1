import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ventana extends JFrame{
	private Todo todo;
	private JPanel panelTodos,panelForma;
	private JButton botonSave;
	private JLabel todoLabel;
	private JTextField todoTextField;
	private JScrollPane scoll;

	public Ventana(){
		todo= new Todo();
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		initComponents();
		setVisible(true);
	}

	public void initComponents(){
		panelTodos= new JPanel();
		panelTodos.setLayout(new BoxLayout(panelTodos,BoxLayout.Y_AXIS));
		scoll= new JScrollPane(panelTodos);
		panelForma= new JPanel();
		panelForma.setLayout(new FlowLayout());
		todoLabel= new JLabel("Todo:");
		todoTextField= new JTextField(30);
		botonSave= new JButton("Guardar");
		panelForma.add(todoLabel);
		panelForma.add(todoTextField);
		panelForma.add(botonSave);
		printTodos();
		botonSave.addActionListener(new BotonListener());
		add(scoll);
		add(panelForma);

	}

	public void printTodos(){
		panelTodos.removeAll();
		for(int i=0;i<todo.getTodos().length;i++){
			if(todo.getTodos()[i]==null){
				panelTodos.add(new JLabel("Nada que hacer"));
			}else{
				panelTodos.add(new JLabel(todo.getTodos()[i]));
			}
		}
		revalidate();
		repaint();

	}

	public class BotonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			for(int i=0;i<todo.getTodos().length;i++){
				if(todo.getTodos()[i]==null){
					todo.getTodos()[i]=todoTextField.getText();
					printTodos();
					return;
				}
			}			
		}
	}







}