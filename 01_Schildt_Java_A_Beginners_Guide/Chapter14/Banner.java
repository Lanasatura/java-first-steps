/*простой апплет, отображающий баннер*/
import java.awt.*;
import java.applet.*;

/*
<applet code = "Banner" width = 300 height = 50>
</applet>
*/

public class Banner extends Applet implements Runnable {
	String msg = " Java rules the Web ";
	Thread t;
	boolean stopFlag;
	
	public void init() {  //инициализировать переменную t пустым значением null
		t = null;
	}
	
	public void start() {  //запустить поток
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}
	
	public void run() {  //точка входа в поток, маниуплирующий баннером
		for( ; ; ) {
			try {        //отобразить крупный заголовок снова
				repaint();
				Thread.sleep(250);
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