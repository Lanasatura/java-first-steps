//демонстрация флажков
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CBDemo implements ItemListener {
	JLabel jlabSelected;
	JLabel jlabChanged;
	JCheckBox jcbAlpha;
	JCheckBox jcbBeta;
	JCheckBox jcbGamma;
	
	CBDemo() {
		//создание нового контейнера
		JFrame jfrm = new JFrame("Demonstrate Check Boxes");
		
		//установить диспетчер компановки FlowLayout
		jfrm.setLayout(new FlowLayout());
		
		//установка начальных размеров окна
		jfrm.setSize(280, 120);
		
		//завершение программы при закрытии окна
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//создание пустые метки
		jlabSelected = new JLabel("");
		jlabChanged = new JLabel("");
		
		//создание флажков
		jcbAlpha = new JCheckBox("Alpha");
		jcbBeta = new JCheckBox("Beta");
		jcbGamma = new JCheckBox("Gamma");
		
		//события, формируемые компонентами JCheckBox, обрабатываются одним методом itemStateChanged()
		jcbAlpha.addItemListener(this);
		jcbBeta.addItemListener(this);
		jcbGamma.addItemListener(this);
		
		//добавить флажки и метки на панель содержимого
		jfrm.add(jcbAlpha);
		jfrm.add(jcbBeta);
		jfrm.add(jcbGamma);
		jfrm.add(jlabSelected);
		jfrm.add(jlabChanged);
		
		//отображение рамки окна
		jfrm.setVisible(true);
	}
	
	//обработчик событий от элементов
	public void itemStateChanged(ItemEvent ie) {
		String str = "";
		
		//получение ссылки на компонент флажка, сформировавший событие
		JCheckBox cb = (JCheckBox) ie.getItem();
		
		//сообщить об изменении состояния флажка
		if(cb.isSelected())
			jlabChanged.setText(cb.getText() + " was just selected.");
		else
			jlabChanged.setText(cb.getText() + " was just cleared.");
		
		//сообщить обо всех установленных флажках
		if(jcbAlpha.isSelected()) {
			str += "Alpha ";
		}
		if(jcbBeta.isSelected()) {
			str += "Beta ";
		}
		if(jcbGamma.isSelected()) {
			str += "Gamma ";
		}
		
		jlabSelected.setText("Selected check boxes: " + str);
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new CBDemo();
			}
		});
	}
}