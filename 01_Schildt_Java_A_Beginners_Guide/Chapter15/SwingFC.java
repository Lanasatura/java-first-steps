//утилита сравнения файлов
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class SwingFC implements ActionListener {
	JTextField jtfFirst;
	JTextField jtfSecond;
	
	JButton jbtnComp;
	
	JLabel jlabFirst, jlabSecond;
	JLabel jlabResult;
	
	SwingFC() {
		//создание нового контейнера
		JFrame jfrm = new JFrame("Compare Files");
		
		//установить диспетчер компановки FlowLayout
		jfrm.setLayout(new FlowLayout());
		
		//установка начальных размеров окна
		jfrm.setSize(200, 190);
		
		//завершение программы при закрытии окна
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//создать поля для ввода имён файлов
		jtfFirst = new JTextField(14);
		jtfSecond = new JTextField(14);
		
		//установить команды действия для полей ввода текста
		jtfFirst.setActionCommand("fileA");
		jtfSecond.setActionCommand("fileB");
		
		//создать кнопку Compare
		jbtnComp = new JButton("Compare");
		
		//добавить приёмник событий действия от кнопки Compare
		jbtnComp.addActionListener(this);
		
		//создать метки
		jlabFirst = new JLabel("First file: ");
		jlabSecond = new JLabel("Second file: ");
		jlabResult = new JLabel("");
		
		//добавить компоненты на панель содержимого
		jfrm.add(jlabFirst);
		jfrm.add(jtfFirst);
		jfrm.add(jlabSecond);
		jfrm.add(jtfSecond);
		jfrm.add(jbtnComp);
		jfrm.add(jlabResult);
		
		//отобразить рамку окна
		jfrm.setVisible(true);
	}
	
	//сравнить файлы после нажатия кнопки Compare
	public void actionPerformed(ActionEvent ae) {
		int i = 0, j = 0;
		
		if(jtfFirst.getText().equals("")) {
			jlabResult.setText("First file name missing.");
			return;
		}
		if(jtfSecond.getText().equals("")) {
			jlabResult.setText("Second file name missing.");
			return;
		}
		
		//сравнить файлы использую оператор try с ресурсами
		try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
			 FileInputStream f2 = new FileInputStream(jtfSecond.getText())) {
			//проверить содержимое каждого файла
			do {
				i = f1.read();
				j = f2.read();
				if(i != j) break;
			} while(i != -1 && j != -1);
		
			if(i != j)
				jlabResult.setText("Files are not the same.");
			else
				jlabResult.setText("Files compare equal.");				 
		} catch(IOException exc) {
			jlabResult.setText("File Error");
		}
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingFC();
			}
		});
	}
}

