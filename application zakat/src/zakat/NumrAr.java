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
public class NumrAr implements MouseListener {
	private JPanel pan_prin ;
	private JLabel retour,image,num,resqte;
	private JButton calc;
	private JTextField qte,afch;
	private JFrame fen;
	public NumrAr() {

		init();
		draw();
	}
	private void init(){
		fen=new JFrame();
		fen.setBounds(20, 20, 720, 550);
		fen.setDefaultCloseOperation(3);//exit on close val=3
		//this.setResizable(false);
		fen.setLayout(null);
		fen.setUndecorated(false);
		fen.setTitle("الاموال");
		fen.setLocationRelativeTo(null);
		pan_prin =new JPanel();
		pan_prin.setBounds(0, 0, 720, 550);
		pan_prin.setBackground(Color.white);
		pan_prin.setLayout(null);
		
		image=new JLabel();
		Image bg=new ImageIcon(this.getClass().getResource("/btlbg-01-01-01.png")).getImage().getScaledInstance(720, 550,Image.SCALE_FAST);
		image.setIcon(new ImageIcon(bg));
		image.setBounds(0,0,720,550);
		

		 qte = new  JTextField();qte.setBounds(200, 40, 200, 40);
		 qte.setForeground(new Color(234,83,17));
		 
		 Font police = new Font("TraditionalArabic", Font.BOLD, 20);  //On l'applique au JLabel 
		 Font p1 = new Font("Papyrus", Font.BOLD, 20);
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
		
		num=new JLabel();
		Image n=new ImageIcon(this.getClass().getResource("/num-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
		num.setIcon(new ImageIcon(n));
		num.setBounds(20,50,90,90);
		
		num.setFocusable(false);
		
		calc.setFocusable(false);
		retour.setFocusable(false);
		num.addMouseListener(this);
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
				
			}
		});
		
		}
	private void draw() {
			pan_prin.add(resqte);
		pan_prin.add(num);
		
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
		if(e.getSource()==num)
        {
			qte.setText("");
	        afch.setText("");
			
			Image n=new ImageIcon(this.getClass().getResource("/calcnum-01.png")).getImage().getScaledInstance(140,90,Image.SCALE_FAST);
			num.setIcon(new ImageIcon(n));
			num.setBounds(20,50,140,90);
			Image bg=new ImageIcon(this.getClass().getResource("/bgnum-01-01.png")).getImage().getScaledInstance(720, 510,Image.SCALE_FAST);
			image.setIcon(new ImageIcon(bg));
			image.setBounds(0,0,720,510);
calc.addActionListener(new ActionListener() {
				
				private int val;

				@Override
				public void actionPerformed(ActionEvent arg0) {
					val =Integer.parseInt(qte.getText());
					if(val<552500) {afch.setText("0 DA");}
					if(val>=552500) {double i=(val*2.5)/100; afch.setText(i+"DA");}
					
				}
			});
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
