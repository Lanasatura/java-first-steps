//простая Swing-программа
import javax.swing.*;

class SwingDemo {
	
	SwingDemo() {

		//создание нового контейнера
		JFrame jfrm = new JFrame("A Simple Swing Application");
		
		//установка начальных размеров окна
		jfrm.setSize(275, 100);
		
		//завершение программы при закрытии окна
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//создание текстовой метки
		JLabel jlab = new JLabel(" Swing defines the modern Java GUI. ");
		
		//добавление метки на панель содержимого
		jfrm.add(jlab);
		
		//отображение рамки окна
		jfrm.setVisible(true);
	}
	
	public static void main(String args[]) {
		//объект SwingDemo должен быть создан в потоке диспетчеризации событий
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingDemo();
			}
		});
	}
}