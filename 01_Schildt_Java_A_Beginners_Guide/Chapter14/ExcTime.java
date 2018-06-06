/*простой апплет, отображающий текущее время*/
import java.awt.*;
import java.applet.*;
import java.util.*;

/*
<applet code = "ExcTime" width = 400 height = 100>
</applet>
*/

public class ExcTime extends Applet implements Runnable {
	String msg1, msg2;
	Thread t;
	boolean stopFlag;
	Calendar cld;
	
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
				Thread.sleep(1000);
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
		cld = Calendar.getInstance();
		
		msg1 = cld.getTime().toString();		
		g.drawString(msg1, 50, 30);
				
		msg2 = "So current time is " + Integer.toString(cld.get(Calendar.HOUR_OF_DAY));
		msg2 = msg2 + ":" + Integer.toString(cld.get(Calendar.MINUTE));
		msg2 = msg2 + ":" + Integer.toString(cld.get(Calendar.SECOND));
		g.drawString(msg2, 50, 60);
	}	
}