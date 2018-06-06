/*простой апплет, отображающий баннер*/
import java.awt.*;
import java.applet.*;

/*
<applet code = "ExcBanner" width = 300 height = 50>
	<param name = text value = " Java rules the Web ">
	<param name = delay value = 100>
</applet>
*/

public class ExcBanner extends Applet implements Runnable {
	String msg, temp;
	Thread t;
	boolean stopFlag;
	int d;
	
	public void init() {  //инициализировать переменную t пустым значением null
		t = null;
	}
	
	public void start() {  //запустить поток
		msg = getParameter("text");
		if(msg == null) msg = " Java rules the Web ";
		
		temp = getParameter("delay");
		try {
			if (temp != null)
				d = Integer.parseInt(temp);
			else
				d = 250;
		}
		catch(NumberFormatException exc) {
			d = 250;
		}
	
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}
	
	public void run() {  //точка входа в поток, маниуплирующий баннером
		for( ; ; ) {
			try {        //отобразить крупный заголовок снова
				repaint();
				Thread.sleep(d);
				if(stopFlag)
					break;
			}
			catch(InterruptedException exc) {}
		}
	}
	
	public void stop() {  //остановить выполнение апплета
		stopFlag = true;
		t = null;
	}
	
	public void paint(Graphics g) {
		char ch;
		ch = msg.charAt(0);
		msg = msg.substring(1, msg.length());
		msg += ch;
		g.drawString(msg, 50, 30);
	}	
}