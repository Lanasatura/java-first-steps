//рисование прямой линии следа от мыши
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code = "ExcDrawLine" width = 300 height = 100>
</applet >
*/

public class ExcDrawLine extends Applet implements MouseListener, MouseMotionListener {
	int mouseX1 = 0, mouseY1 = 0; //координаты точки нажатия кнопки мыши
	int mouseX2 = 0, mouseY2 = 0; //координаты точки перемещения кнопки мыши
	int stop = 0;
	
	public void init() {
		//этот класс регистрируется в качестве приёмника событий от мыши
		addMouseListener(this);
		addMouseMotionListener(this);
	}
		
	//обработать событие, наступающее при нажатии кнопки мыши
	public void mousePressed(MouseEvent me) {
		stop = 0;
		//сохранить координаты текущего положения курсора
		mouseX1 = me.getX();
		mouseY1 = me.getY();
		//repaint();
	}

	//обработать событие, наступающее при отпускании кнопки мыши
	public void mouseReleased(MouseEvent me) {
		//сохранить координаты текущего положения курсора
		stop = 1;
		//repaint();
	}
	
	//обработать событие, наступающее при перетаскивании курсора мыши
	public void mouseDragged(MouseEvent me) {
		//сохранить координаты текущего положения курсора
		mouseX2 = me.getX();
		mouseY2 = me.getY();
		repaint();
	}
	
	//обработать событие, наступающее при наведении курсора мыши на компонент пользовательского интерфейса
	public void mouseEntered(MouseEvent me) {
	}
	
	//обработать событие, наступающее при отведении курсора мыши от компонента пользовательского интерфейса
	public void mouseExited(MouseEvent me) {
	}

	//обработать событие, наступающее по щелчку мыши
	public void mouseClicked(MouseEvent me) {
	}
	
	//обработать событие, наступающее при перемещении курсора мыши
	public void mouseMoved(MouseEvent me) {
	}	
	
	//нарисовать линию при нажатии и перетаскивании мыши
	public void paint(Graphics g) {
		if(stop != 1)
			g.drawLine(mouseX1, mouseY1, mouseX2, mouseY2);
	}
}