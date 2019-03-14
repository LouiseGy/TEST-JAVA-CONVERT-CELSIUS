
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Frame extends JFrame {

	Frame(){
		super();
		build();
	}
	
	void build()
	{
		setTitle("Convert Celsius to Fahrenheit");
		setPreferredSize(new Dimension(500, 400));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(buildContentPane());
	}
	
	Container buildContentPane()
	{	
		this.setLayout(new FlowLayout());
		
		//on ajoute les composants a la frame
		
		JTextField textField = new JTextField(4);
		getContentPane().add(textField);
		
		JLabel label = new JLabel("Celsius");
		getContentPane().add(label);
		
		
		JButton button = new JButton("convert");
		getContentPane().add(button);
		
		JLabel label2 = new JLabel("Farhenheit");
		getContentPane().add(label2);

		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String text;
				int celsius;

				// on récupère la chaine de caractère du textfield
				text = textField .getText();
				
				//on traduit la chaine de caractère en entier
				celsius = Integer.parseInt(text);

				//on utilise des double car il y a des quotient dans le calcul
				double fahrenheit = ConvertorDegree.convertor(celsius);
				
				// on convertit le résultat en double en type String
				String result = String.valueOf(fahrenheit);
				
				// on actualise le label
				label2.setText(result + " Fahrenheit");
				
				
			}
		});
		
		
		
		
		pack();
		return getContentPane();
	}
	
}
