//применение поля ввода текста
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TFDemo implements ActionListener {
	JTextField jtf;
	JButton jbtnRev;
	JLabel jlabPrompt, jlabContents;
	
	TFDemo() {
		//создание нового контейнера
		JFrame jfrm = new JFrame("Use a Text Field.");
		
		//установить диспетчер компановки FlowLayout
		jfrm.setLayout(new FlowLayout());
		
		//установка начальных размеров окна
		jfrm.setSize(240, 120);
		
		//завершение программы при закрытии окна
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//создание поля ввода текста шириной 10 символов
		jtf = new JTextField(10);
		
		//установка команды действия для поля ввода текста
		jtf.setActionCommand("myTF");
		
		//создать кнопку Reverse
		jbtnRev = new JButton("Reverse");
		
		//добавление приёмников событий от поля ввода и кнопки
		jtf.addActionListener(this);
		jbtnRev.addActionListener(this);
		
		//создать метки
		jlabPrompt = new JLabel("Enter text: ");
		jlabContents = new JLabel("");
		
		//добавить компоненты на панель содержимого
		jfrm.add(jlabPrompt);
		jfrm.add(jtf);
		jfrm.add(jbtnRev);
		jfrm.add(jlabContents);
		
		//отображение рамки окна
		jfrm.setVisible(true);
	}
	
	//обработка событий от кнопки и поля ввода текста
	public void actionPerformed(ActionEvent ae) {
		//для определения компонента, сформировавшего событие, используется команда действия
		if(ae.getActionCommand().equals("Reverse")) {
			//нажатие кнопки Reverse
			String orgStr = jtf.getText();
			String resStr = "";
			
			//обратить символьную строку в поле ввода текста
			for(int i = orgStr.length()-1; i >= 0; i--)
				resStr += orgStr.charAt(i);
			
			//сохранить обращённую строку в поле ввода текста
			jtf.setText(resStr);
		}
		else
			jlabContents.setText("You pressed ENTER. Text is: " + jtf.getText());
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TFDemo();
			}
		});
	}
}