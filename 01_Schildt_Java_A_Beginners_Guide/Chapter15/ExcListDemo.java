//демонстрация простого компонента JList
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
//import java.util.*;

class ExcListDemo implements ListSelectionListener {
	JList<String> jlst;
	
	JLabel jlab;
	JScrollPane jscrlp;
	
	//создать массив имён
	String names[] = { "Cheryl", "Courtney", "Linda",
					   "Kalan", "Bernie", "Nick",
					   "Lana", "Andrew", "Galina" };
	
	ExcListDemo() {
		//создание нового контейнера
		JFrame jfrm = new JFrame("List Demo");
		
		//установить диспетчер компановки FlowLayout
		jfrm.setLayout(new FlowLayout());
		
		//установка начальных размеров окна
		jfrm.setSize(200, 160);
		
		//завершение программы при закрытии окна
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//создать компонент JList
		jlst = new JList<String>(names);  //создание списка имён
		
		//задать режим выбора элементов из списка
		jlst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		//добавить список на панель прокрутки, компонент списка помещается в контейнер
		jscrlp = new JScrollPane(jlst);
		
		//задать предпочтительные размеры панели прокрутки
		jscrlp.setPreferredSize(new Dimension(120, 90));
		
		//создать метку для отображения результатов выбора из списка
		jlab = new JLabel("Please choose a names");
		
		//добавить обработчик событий. приём событий, наступающих при выборе элементов из списка
		jlst.addListSelectionListener(this);
		
		//добавить список и метку на панель содержимого
		jfrm.add(jlst);
		jfrm.add(jlab);
		
		//отображение рамки окна
		jfrm.setVisible(true);
	}
	
	//обработать события, связанные с выбором элементов из списка
	public void valueChanged(ListSelectionEvent le) {
		//получить индекс того элемента, выбор которого был сделан или отменён
		//int idx = jlst.getSelectedIndex();
		String str = "";
				
		//получить список выбранных элементов
		java.util.List<String> namesList = jlst.getSelectedValuesList();
		String namesSel[] = namesList.toArray(new String[namesList.size()]);
		
		//отобразить результат выбора, если элементы были выбраны
		if(namesSel.length != 0) {
			str = "Current selection: ";
			
			for(int i = 0; i < namesSel.length; i++) {
				str += namesSel[i] + " ";
			}
			jlab.setText(str + ", " + namesList.size() + " names were selected.");
		}
		else
			jlab.setText("Please choose a names");
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ExcListDemo();
			}
		});
	}
}
