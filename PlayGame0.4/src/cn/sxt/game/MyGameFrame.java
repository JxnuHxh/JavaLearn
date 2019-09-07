package cn.sxt.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

import javax.swing.JFrame;

public class MyGameFrame extends JFrame {

	
Image planeImg = GameUtil.getImage("images/plane.png");
Image bg = GameUtil.getImage("images/bg.jpg");
Plane plane=new Plane(planeImg,300,300);
Shell[] shells=new Shell[50];
Explode bao;
Date startTime=new Date();
Date endTime;
int period;
	public void paint(Graphics g) {
		
		
		g.drawImage(bg, 0, 0, null);
		plane.drawSelf(g);
		
		for(int i=0;i<shells.length;i++)
		{
		shells[i].draw(g);
		boolean peng = shells[i].getRect().intersects(plane.getRect());
		if(peng) {
			plane.live=false;
			if(bao==null)
			{bao=new Explode(plane.x,plane.y);
			  endTime=new Date();
			  period=((int)(endTime.getTime()-startTime.getTime())/1000);
			  
			}
			
			bao.draw(g);
		}
		if(!plane.live) {
		
		g.setColor(Color.green);
		Font f=new Font("宋体",Font.BOLD,40);
		g.setFont(f);
		g.drawString("时间:"+period+"秒", (int)plane.x, (int)plane.y);
		}
		}
		
	}

	
	class PaintTread extends Thread{
		public void run() {
			while(true) {
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//键盘监听
	class KeyMonitor extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			plane.addDirection(e);
		}
		@Override
		public void keyReleased(KeyEvent e) {
			plane.minusDirection(e);
		}
	}
	public void launchFrame() {
		this.setTitle("黄小华飞机大战");
		this.setVisible(true);
		this.setSize(Constant.GAME_WIDH, Constant.GAME_HEIGHT);
		this.setLocation(400, 200);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		new PaintTread().start();
		addKeyListener(new KeyMonitor());//增加键盘监听
		
		//初始化炮弹
		for(int i=0;i<shells.length;i++)
		{
			shells[i]=new Shell();
		}
	}
	
	public static void main(String[] args) {
		MyGameFrame f=new MyGameFrame();
		f.launchFrame();
	}
	private Image offScreenImage = null;
	 
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(Constant.GAME_WIDH,Constant.GAME_HEIGHT);
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}

}
