package zakat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class menu {
	private JPanel pan_prin;
	private JLabel l,retour,image;	
	private JButton btl,pr_agr,or_arg,num;
	private JFrame fen;
	public menu() {
		init();
		draw();
		
	}
	private void init() {
		fen=new JFrame();
		fen.setBounds(20, 20, 720, 550);
		fen.setDefaultCloseOperation(3);//exit on close val=3
		//this.setResizable(false);
		fen.setLayout(null);
		fen.setUndecorated(true);
		fen.setLocationRelativeTo(null);
		fen.setTitle("menu");
		pan_prin =new JPanel();
		pan_prin.setBounds(0, 0, 720, 550);
		pan_prin.setBackground(Color.white);
		pan_prin.setLayout(null);
		image=new JLabel();
		Image img2=new ImageIcon(this.getClass().getResource("/back-01.png")).getImage().getScaledInstance(720, 550,Image.SCALE_FAST);
		image.setIcon(new ImageIcon(img2));
		image.setBounds(0,0,720,550);
		/*titre*/
		l=new JLabel("Menu de zakat");l.setBounds(720/2-100,10,200,40);
		l.setForeground(Color.green.darker());  
		Font police = new Font("Papyrus", Font.BOLD, 28);  //On l'applique au JLabel 
		l.setFont(police); 
		/*les boutons*/
		btl=new JButton();
		Image btl1=new ImageIcon(this.getClass().getResource("/btls-01-01.png")).getImage(); 
		btl.setIcon(new ImageIcon(btl1));
		
		or_arg=new JButton();
		Image or=new ImageIcon(this.getClass().getResource("/or btn-01-01.png")).getImage(); 
		or_arg.setIcon(new ImageIcon(or));
		
		pr_agr=new JButton();
		Image agr=new ImageIcon(this.getClass().getResource("/agr-01-01.png")).getImage(); 
		pr_agr.setIcon(new ImageIcon(agr));
		 num=new JButton();
		Image nm=new ImageIcon(this.getClass().getResource("/numr-01-01-01.png")).getImage(); 
		 num.setIcon(new ImageIcon(nm));
		btl.setBounds(100,310,200,200);
		btl.setBackground(Color.white);
		btl.setForeground(Color.WHITE);
		btl.setBorder(new RoundedBorder(50));
		pr_agr.setBounds(100,80,200,200);
		or_arg.setBounds(720/2+50,80,200,200);
		or_arg.setBackground(Color.white);
		or_arg.setForeground(Color.WHITE);
		pr_agr.setBackground(Color.white);
		pr_agr.setForeground(Color.WHITE);
		num.setBounds(720/2+50,300,200,200);
		num.setBackground(Color.white);
		num.setForeground(Color.WHITE);
		num.setBorder(new RoundedBorder(50));
		retour=new JLabel();
		Image rt=new ImageIcon(this.getClass().getResource("/left-arrow.png")).getImage().getScaledInstance(33, 33,Image.SCALE_FAST);
		retour.setIcon(new ImageIcon(rt));
		retour.setBounds(10,10,40,35);
		or_arg.setBorder(new RoundedBorder(50));
		pr_agr.setBorder(new RoundedBorder(50));
		//retour.setBounds(0, 0,0, 0);
		btl.setFocusable(false);
		pr_agr.setFocusable(false);
		or_arg.setFocusable(false);
		num.setFocusable(false);
		retour.setFocusable(false);
		retour.addMouseListener(new MouseListener() {
			
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
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Page_lng();
				fen. dispose();
				
			}
		});
		btl.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				new Betails();
				fen. dispose();
				
			}
		});
or_arg.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				new Argor();
				fen.dispose();
			}
		});

	
	pr_agr.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			new Agriculture();
			fen.dispose();
			
		}
	});


num.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			new Numr();
			fen.setVisible(false);
			
		}
	});

}
	
	void draw() {
		pan_prin.add(btl);
		pan_prin.add(pr_agr);
		pan_prin.add(or_arg);
		pan_prin.add(num);
		pan_prin.add(retour);
		pan_prin.add(l);
		pan_prin.add(image);
		fen.add(pan_prin);
		fen.setVisible(true);
	}
}

	
