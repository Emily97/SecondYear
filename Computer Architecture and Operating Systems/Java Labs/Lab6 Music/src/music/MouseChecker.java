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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MouseChecker extends JPanel implements MouseListener, Runnable{

	private static final long serialVersionUID = 1L;

	//what is a static variable ????
	public static boolean m = true;

	public MouseMusic music;

	public MouseChecker() {
	}

	public void mousePressed(MouseEvent e) {
		m = false;
		synchronized (music.lock) {
			music.lock.notifyAll();
		}
	}

	public void mouseReleased(MouseEvent e) {
		m = true;
		synchronized (music.lock) {
			music.lock.notifyAll();
		}
	}


	public void mouseClicked(MouseEvent paramMouseEvent) {
	}


	public void mouseEntered(MouseEvent paramMouseEvent) {
	}


	public void mouseExited(MouseEvent paramMouseEvent) {
	}


	public void run() {
		JFrame frame = new JFrame("MouseMusic");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent newContentPane = this;
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
		addMouseListener(this);
		music = new MouseMusic();
		//what does the following command do ????
		new Thread(music).start();
	}
}