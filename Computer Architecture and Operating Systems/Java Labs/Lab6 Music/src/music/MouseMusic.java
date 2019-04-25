/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music;

/**
 *
 * @author N00150623
 */
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;

import org.jfugue.*;


public class MouseMusic implements Runnable {

	public Object lock = new Object();

	//what is this method ???????
	public MouseMusic() {

	}


	//what command causes this method to be run ????
	public void run() {
		while(true) {
			//what does synchronize do ????
			synchronized (lock) {
				while(MouseChecker.m) {
					try {
						lock.wait();
						//this thread waits until what happens????????
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			Player player = new Player();
			Point loc = MouseInfo.getPointerInfo().getLocation();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			double width = screenSize.getWidth();
			double height = screenSize.getHeight();
			int pitch = 127 - (int) (loc.y*127/height);
			int volume = (int) (loc.x*16383/width);
			player.play("X[Volume]=" + volume + " [" + pitch + "]");
		}
	}
}