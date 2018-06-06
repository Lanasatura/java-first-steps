//простой Swing-апплет
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
<object code = "MySwingApplet" width = 200 height = 80>
	<param name = author value = "Denisenko s.">
	<param name = purpose value = "Demonstrate Swing Applet">
	<param name = aftermath value = "Thanks Herb!">
</object>
*/

public class MySwingApplet extends JApplet {
	JButton jbtnUp;
	JButton jbtnDown;
	
	JLabel jlab;
	
	//инициализация апплета
	public void init() {
		try {
			//для создания GUI апплета используется метод invokeAndWait()
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					makeGUI();
				}
			});
		}
		catch (Exception exc) {
			System.out.println("Can't create because of " + exc);
		}
	}
	
	//установить и инициализировать графический интерфейс
	private void makeGUI() {
		setLayout(new FlowLayout());
		
		jbtnUp = new JButton("Up");
		jbtnDown = new JButton("Down");
		
		//для обработки событий от кнопки Up используется анонимный внутренний класс
		jbtnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("You pressed Up.");
			}
		});
		
		//для обработки событий от кнопки Down используется анонимный внутренний класс
		jbtnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("You pressed Down.");
			}
		});
		
		add(jbtnUp);
		add(jbtnDown);
		
		jlab = new JLabel("Press a button.");
		
		add(jlab);
	}
}