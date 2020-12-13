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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Argor implements MouseListener {
	private JPanel pan_prin ;
	private JLabel retour,resqte,arg,or,image;
	private JButton calc;
	private JTextField qte,afch;
	private JFrame fen;
	private JComboBox combo;
	int i=0;
	public Argor() {
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
		fen.setTitle("Argent et Or");
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
		 
		 Font police = new Font("Papyrus", Font.BOLD, 20);  //On l'applique au JLabel 
			qte.setFont(police); 
		afch = new  JTextField();afch.setBounds(200, 170, 200, 40);
		afch.setForeground(new Color(234,83,17));
		 
		 afch.setFont(police); 
		 calc=new JButton();
		 Image cl=new ImageIcon(this.getClass().getResource("/calc-01.png")).getImage(); 
		 calc.setIcon(new ImageIcon(cl));
		 calc.setBounds(250, 100, 100, 30);
		retour=new JLabel();
		Image rt=new ImageIcon(this.getClass().getResource("/left-arrow.png")).getImage().getScaledInstance(33, 33,Image.SCALE_FAST);
		retour.setIcon(new ImageIcon(rt));
		retour.setBounds(10,10,40,35);
        resqte=new JLabel("votre zakat est:");
		resqte.setBounds(200,140,200,30);
		resqte.setFont(police);
		resqte.setForeground(new Color(120,160,63));

		arg=new JLabel();
		Image ar=new ImageIcon(this.getClass().getResource("/arg-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
		arg.setIcon(new ImageIcon(ar));
		arg.setBounds(20,50,90,90);
		
		or=new JLabel();
		Image o=new ImageIcon(this.getClass().getResource("/or-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
		or.setIcon(new ImageIcon(o));
		or.setBounds(20,50+90,90,90);
		
		arg.setFocusable(false);
		or.setFocusable(false);
		
		calc.setFocusable(false);
		retour.setFocusable(false);
		String[] tab = {"24 carats", "21 carats", "18 carats"};
		combo = new JComboBox(tab);
		combo.setBounds(400, 100, 80, 30);
		combo.setBackground(new Color(120,160,63).brighter());
		combo.setForeground(Color.white);
		
		calc.addActionListener(new ActionListener() {
			
			private double val;

			@Override
			public void actionPerformed(ActionEvent arg0) {
				val =Double.parseDouble(qte.getText());
				if(i==1) {
				 if(val<595) {afch.setText("0");}
			     if(val>=595){double i=(val*2.5)/100; afch.setText(""+i);}}
			     if(i==2) {combo.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(e.getSource().equals(combo)) {
					 if(combo.getSelectedItem().equals("24 carats"))
						{
						 if(val<85) {afch.setText("0");}
					     if(val>=85){double i=(val*2.5)/100; afch.setText(""+i);}
								}
					 if(combo.getSelectedItem().equals("21 carats"))
						{
						 if(val<97) {afch.setText("0");}
					     if(val>=97){double i=(val*2.5)/100; afch.setText(""+i);
					}}
					     if(combo.getSelectedItem().equals("18 carats"))
							{
					    	 if(val<113) {afch.setText("0");}
						     if(val>=113){double i=(val*2.5)/100; afch.setText(""+i);
						     }}
								}}});
			}}
		});
		
		
		
		arg.addMouseListener(this);
		or.addMouseListener(this);
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
				new menu();
				fen.dispose();
				i=0;
				
			}
		});
		
		}
	private void draw() {
			pan_prin.add(resqte);
		pan_prin.add(arg);
		pan_prin.add(or);
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
		if(e.getSource()==arg)
        {    qte.setText("");
             afch.setText("");
             Image ar=new ImageIcon(this.getClass().getResource("/argcalc-01.png")).getImage().getScaledInstance(140, 90,Image.SCALE_FAST);
     		 arg.setIcon(new ImageIcon(ar));
     		 arg.setBounds(20,50,140,90);
     		 Image o=new ImageIcon(this.getClass().getResource("/or-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
     		 or.setIcon(new ImageIcon(o));
     		 or.setBounds(20,50+90,90,90);
     		Image bg=new ImageIcon(this.getClass().getResource("/argbg-01.png")).getImage().getScaledInstance(720, 510,Image.SCALE_FAST);
    		image.setIcon(new ImageIcon(bg));
    		image.setBounds(0,0,720,510);
			pan_prin.remove(combo);
			i=1;
			
        }
		if(e.getSource()==or)
        {  qte.setText("");
        afch.setText("");
        Image o=new ImageIcon(this.getClass().getResource("/orcalc-01.png")).getImage().getScaledInstance(140, 90,Image.SCALE_FAST);
		or.setIcon(new ImageIcon(o));
		or.setBounds(20,50+90,140,90);
		Image ar=new ImageIcon(this.getClass().getResource("/arg-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
		arg.setIcon(new ImageIcon(ar));
		arg.setBounds(20,50,90,90);
		Image bg=new ImageIcon(this.getClass().getResource("/bgor-01.png")).getImage().getScaledInstance(720, 510,Image.SCALE_FAST);
		image.setIcon(new ImageIcon(bg));
		image.setBounds(0,0,720,510);
			pan_prin.add(combo);
			
			
			i=2;
        }}
		// TODO Auto-generated method stub
		
	
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
