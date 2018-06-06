//демонстрация нажатия кнопки и обработки событий действия
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonDemo implements ActionListener {
	JLabel jlab;
	
	ButtonDemo() {
		//создание нового контейнера
		JFrame jfrm = new JFrame("A Button Example");
		
		//установить диспетчер компановки FlowLayout
		jfrm.setLayout(new FlowLayout());
		
		//установка начальных размеров окна
		jfrm.setSize(220, 90);
		
		//завершение программы при закрытии окна
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//создание двух кнопок
		JButton jbtnUp = new JButton("Up");
		JButton jbtnDown = new JButton("Down");
		
		//добавление приёмников событий от кнопки
		jbtnUp.addActionListener(this);
		jbtnDown.addActionListener(this);
		
		//добавление кнопок на панель содержимого
		jfrm.add(jbtnUp);
		jfrm.add(jbtnDown);
		
		//создать метку
		jlab = new JLabel("Press a button.");
		
		//добавить метку в рамке окна
		jfrm.add(jlab);
		
		//отображение рамки окна
		jfrm.setVisible(true);
	}
	
	//обработка событий от кнопки
	public void actionPerformed(ActionEvent ae) {
		//для определения нажатой кнопки используется команда действия
		if(ae.getActionCommand().equals("Up"))
			jlab.setText("You pressed Up.");
		else
			jlab.setText("You pressed Down.");
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ButtonDemo();
			}
		});
	}
}
