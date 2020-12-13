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
import javax.swing.JTextField;
import javax.swing.border.Border;


public class BetailsAr implements MouseListener{

private JPanel pan_prin ;
private JLabel retour,bvn,ovn,chm,image,resqte;
private JButton calc;
private JTextField qte,afch;
private JFrame fen;
int i=0;
	public BetailsAr() {
		init();
		draw();
	}
	private void init() {
		fen=new JFrame();
		fen.setBounds(20, 20, 720, 550);
		fen.setDefaultCloseOperation(3);//exit on close val=3
		//this.setResizable(false);
		fen.setLayout(null);
		fen.setUndecorated(false);
		fen.setTitle("الانعام");
		fen.setLocationRelativeTo(null);
		pan_prin =new JPanel();
		pan_prin.setBounds(0, 0, 720, 550);
		pan_prin.setBackground(Color.white);
		pan_prin.setLayout(null);
		image=new JLabel();
		Image bg=new ImageIcon(this.getClass().getResource("/btlbg-01-01-01.png")).getImage().getScaledInstance(720, 550,Image.SCALE_FAST);
		image.setIcon(new ImageIcon(bg));
		image.setBounds(0,0,720,550);
		
		Font p1 = new Font("Papyrus", Font.BOLD, 20);
		 qte = new  JTextField();qte.setBounds(200, 40, 200, 40);
		 qte.setForeground(new Color(234,83,17));
		 
		 Font police = new Font("TraditionalArabic", Font.BOLD, 20);  //On l'applique au JLabel 
			qte.setFont(p1); 
		afch = new  JTextField();afch.setBounds(200, 170, 200, 40);
		afch.setForeground(new Color(234,83,17));
		 
		 afch.setFont(p1); 
		 calc=new JButton();
		 Image cl=new ImageIcon(this.getClass().getResource("/calculerar.png")).getImage(); 
		 calc.setIcon(new ImageIcon(cl));
		 calc.setBounds(250, 100, 100, 30);
		retour=new JLabel();
		Image rt=new ImageIcon(this.getClass().getResource("/left-arrow.png")).getImage().getScaledInstance(33, 33,Image.SCALE_FAST);
		retour.setIcon(new ImageIcon(rt));
		retour.setBounds(10,10,40,35);
	
		resqte=new JLabel("زكاتك هي");
		resqte.setBounds(200,140,200,30);
		
		resqte.setFont(police);
		resqte.setForeground(new Color(120,160,63));
		
		bvn=new JLabel();
		Image bn=new ImageIcon(this.getClass().getResource("/cow-01-01-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
		bvn.setIcon(new ImageIcon(bn));
		bvn.setBounds(20,50,90,90);
		
		ovn=new JLabel();
		Image on=new ImageIcon(this.getClass().getResource("/sheep-01-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
		ovn.setIcon(new ImageIcon(on));
		ovn.setBounds(20,50+90,90,90);
		
		chm=new JLabel();
		Image ch=new ImageIcon(this.getClass().getResource("/camel-01-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
		chm.setIcon(new ImageIcon(ch));
		chm.setBounds(20,50+180,90,90);
		
		
		    bvn.addMouseListener(this);
	        ovn.addMouseListener(this);
	        chm.addMouseListener(this);
	
		bvn.setFocusable(false);
		ovn.setFocusable(false);
		chm.setFocusable(false);
		calc.setFocusable(false);
		retour.setFocusable(false);
calc.addActionListener(new ActionListener() {
			
			private int val;

			@Override
			public void actionPerformed(ActionEvent arg0) {
				val =Integer.parseInt(qte.getText());
			
				if(i==1) {
				
				if(val<30) {afch.setText("0");}
				if(val>=30 && val<=39) { afch.setText("T");}
				if(val>=40 && val<=59) { afch.setText("Mo");}
				if(val>=60 && val<=69) { afch.setText("2T");}
				if(val>=70 && val<=79) { afch.setText("Mo+T");}
				if(val>=80 && val<=89) { afch.setText("2Mo");}
				if(val>=90 && val<=99) { afch.setText("3T");}
				if(val>=100 && val<=119) { afch.setText("Mo+2T");}
				if(val>=120) { int i =val /40;
				             int j=val/30;
				afch.setText(i+"Mo ou  "+j+"T");}}
				if(i==2) {
					
					if(val<40) {afch.setText("0");}
					if(val>=40 && val<=120) { afch.setText("1C");}
					if(val>=121 && val<=200) { afch.setText("2C");}
					if(val>=201 && val<=399) { afch.setText("3C");}
					if(val>399) { int i =val/100;afch.setText(i+"C");
				}}
				if(i==3) {
					if(val<5) {afch.setText("0");}
				
				if(val>=5 && val<=24) {int i =val/5; afch.setText(i+"C");}
				if(val>=25 && val<=35) { afch.setText("M");}
				if(val>=36 && val<=45) { afch.setText("L");}
				if(val>=46 && val<=60) { afch.setText("H");}
				if(val>=61 && val<=75) { afch.setText("J");}
				if(val>=76 && val<=90) { afch.setText("2L");}
				if(val>=91 && val<=120) { afch.setText("2H");}
				if(val>120) {
					int h =val/50;
					int res =val %50;
					int l = res/40;
					if(h==0) {afch.setText(l+"L");}
					else{if(l==0) {afch.setText(h+"H");}
					else{
						afch.setText(h+"H + "+l+" L");}
					
					}}
			}
				}});
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
				new menuAr();
				fen.dispose();
				i=0;
				
			}
		});
		
		
	}
	 void draw() {
		
			pan_prin.add(resqte);
		pan_prin.add(bvn);
		pan_prin.add(ovn);
		pan_prin.add(chm);
		pan_prin.add(calc);
		pan_prin.add(qte);
		pan_prin.add(afch);
		pan_prin.add(retour);
		pan_prin.add(image);
		
		fen.add(pan_prin);
		fen.setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bvn)
        {
			afch.setText(null);
			qte.setText(null);
			Image bn=new ImageIcon(this.getClass().getResource("/clccow-01.png")).getImage().getScaledInstance(140, 90,Image.SCALE_FAST);
			bvn.setIcon(new ImageIcon(bn));
			bvn.setBounds(20,50,140,90);
			Image on=new ImageIcon(this.getClass().getResource("/sheep-01-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
			ovn.setIcon(new ImageIcon(on));
			ovn.setBounds(20,50+90,90,90);
			Image ch=new ImageIcon(this.getClass().getResource("/camel-01-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
			chm.setIcon(new ImageIcon(ch));
			chm.setBounds(20,50+180,90,90);
			Image bg=new ImageIcon(this.getClass().getResource("/bgcow-01.png")).getImage().getScaledInstance(720, 510,Image.SCALE_FAST);
			image.setIcon(new ImageIcon(bg));
			image.setBounds(0,0,720,510);
i=1;
			
			
        }
		
        
        	if(e.getSource()==ovn)
        	{
        		afch.setText(null);
			qte.setText(null);
			{
				Image on=new ImageIcon(this.getClass().getResource("/calcsheep-01.png")).getImage().getScaledInstance(140, 90,Image.SCALE_FAST);
				ovn.setIcon(new ImageIcon(on));
				ovn.setBounds(20,50+90,140,90);
				Image bn=new ImageIcon(this.getClass().getResource("/cow-01-01-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
				bvn.setIcon(new ImageIcon(bn));
				bvn.setBounds(20,50,90,90);
				Image ch=new ImageIcon(this.getClass().getResource("/camel-01-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
				chm.setIcon(new ImageIcon(ch));
				chm.setBounds(20,50+180,90,90);
				Image bg=new ImageIcon(this.getClass().getResource("/bgsheep-01.png")).getImage().getScaledInstance(720, 510,Image.SCALE_FAST);
				image.setIcon(new ImageIcon(bg));
				image.setBounds(0,0,720,510);
				
    i=2;
			
			
			}
        	
        	}
        	
			if(e.getSource()==chm) {
				afch.setText(null);
				qte.setText(null);
				
				Image ch=new ImageIcon(this.getClass().getResource("/calccamel-01.png")).getImage().getScaledInstance(140, 90,Image.SCALE_FAST);
				chm.setIcon(new ImageIcon(ch));
				chm.setBounds(20,50+180,140,90);
				Image bn=new ImageIcon(this.getClass().getResource("/cow-01-01-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
				bvn.setIcon(new ImageIcon(bn));
				bvn.setBounds(20,50,90,90);
				Image on=new ImageIcon(this.getClass().getResource("/sheep-01-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
				ovn.setIcon(new ImageIcon(on));
				ovn.setBounds(20,50+90,90,90);
				Image bg=new ImageIcon(this.getClass().getResource("/bgcamel-01.png")).getImage().getScaledInstance(720, 510,Image.SCALE_FAST);
				image.setIcon(new ImageIcon(bg));
				image.setBounds(0,0,720,510);
				image.setBounds(0,0,720,510);
i=3;
			
			}
			
				
			
		}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		
	
}

