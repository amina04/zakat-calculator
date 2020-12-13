package zakat;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import sun.net.www.content.image.jpeg;
public class Page_lng extends JFrame {
	private JPanel pan_prin;
	private JLabel ar ,fr;
	JLabel image;
	private JFrame fen_lng;

	public Page_lng() {
		init();
		draw();
	}
	private void init() {
		
		this.setBounds(20, 20, 720, 550);
		this.setDefaultCloseOperation(3);//exit on close val=3
		//this.setResizable(false);
		this.setLayout(null);
		this.setUndecorated(false);
		this.setTitle("zakati");
		this.setLocationRelativeTo(null);
		pan_prin=new JPanel();
		pan_prin.setBounds(0, 0, 720, 550);
		pan_prin.setBackground(Color.white);
		pan_prin.setLayout(null);
		image=new JLabel();
		Image img2=new ImageIcon(this.getClass().getResource("/logo-01-01-01-01.png")).getImage().getScaledInstance(720, 550,Image.SCALE_FAST);
		image.setIcon(new ImageIcon(img2));
		image.setBounds(0,0,720,550);
		ar=new JLabel();
		Image arr=new ImageIcon(this.getClass().getResource("/arab-01-01-01.png")).getImage().getScaledInstance(180,90,Image.SCALE_FAST);
		ar.setIcon(new ImageIcon(arr));
		ar.setBounds(395,360,180,90);
		fr=new JLabel();
		Image frr=new ImageIcon(this.getClass().getResource("/français-01-01.png")).getImage().getScaledInstance(180,90,Image.SCALE_FAST);
		fr.setIcon(new ImageIcon(frr));
	    fr.setBounds(380-240,360,180,90);
		
		
		
		
			ar.setFocusable(false);
			fr.setFocusable(false);

			fr.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					fr.setBounds(380-240,360,180,90);
				}
				
				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					fr.setBounds(380-240,360,240,130);
					
				}
				
				@Override
				public void mouseClicked(MouseEvent arg0) {
					new menu();
				    dispose();
					
				}
			});
			
ar.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					ar.setBounds(395,360,180,90);
				}
				
				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
					ar.setBounds(395,360,240,130);
					
				}
				
				@Override
				public void mouseClicked(MouseEvent arg0) {
				
					new menuAr();
				    dispose();
				}
			});
			
		
	}
	public void draw() {
	   pan_prin .add(fr);
		pan_prin.add(ar);
		pan_prin.add(image);
		
		
		this.add(pan_prin);
		this.setVisible(true);
		
	}
	
}