//демонстрация обработки событий от мыши
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code = "MouseEvents" width = 300 height = 100>
</applet >
*/

public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {
	String msg = "";
	int mouseX = 0, mouseY = 0; //координаты курсора мыши
	
	public void init() {
		//этот класс регистрируется в качестве приёмника событий от мыши
		addMouseListener(this);
		addMouseMotionListener(this);		
	}
	
	//обработать событие, наступающее по щелчку мыши
	public void mouseClicked(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse clicked.";
		repaint();
	}
	
	//обработать событие, наступающее при наведении курсора мыши на компонент пользовательского интерфейса
	public void mouseEntered(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse entered.";
		repaint();
	}
	
	//обработать событие, наступающее при отведении курсора мыши от компонента пользовательского интерфейса
	public void mouseExited(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse exited.";
		repaint();		
	}
	
	//обработать событие, наступающее при нажатии кнопки мыши
	public void mousePressed(MouseEvent me) {
		//сохранить координаты текущего положения курсора
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Down.";
		repaint();		
	}

	//обработать событие, наступающее при отпускании кнопки мыши
	public void mouseReleased(MouseEvent me) {
		//сохранить координаты текущего положения курсора
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Up.";
		repaint();		
	}
	
	//обработать событие, наступающее при перетаскивании курсора мыши
	public void mouseDragged(MouseEvent me) {
		//сохранить координаты текущего положения курсора
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "*";
		showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
		repaint();		
	}
	
	//обработать событие, наступающее при перемещении курсора мыши
	public void mouseMoved(MouseEvent me) {
		//отобразить текущее положение курсора в строке состояния
		showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
	}
	
	//отобразить сообщение из переменной msg в окне апплета
    //по координатам текущего положения курсора
	public void paint(Graphics g) {
		g.drawString(msg, mouseX, mouseY);
	}
}