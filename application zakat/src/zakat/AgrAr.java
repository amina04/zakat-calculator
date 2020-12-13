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
public class AgrAr implements MouseListener {
	private JPanel pan_prin ;
	private JLabel agr_art,agr_ntrl,retour,ble,image,resqte;
	private JButton calc;
	private JTextField qte,afch;
	private JFrame fen;
	private JComboBox combo;
	int i=0;
	public AgrAr() {

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
		fen.setTitle("المحاصبل الزراعية");
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
		 Font p1 = new Font("Papyrus", Font.BOLD, 20);
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
		
		agr_art=new JLabel();
		Image art=new ImageIcon(this.getClass().getResource("/argart-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
		agr_art.setIcon(new ImageIcon(art));
		agr_art.setBounds(20,50,90,90);
		
		agr_ntrl=new JLabel();
		Image ntr=new ImageIcon(this.getClass().getResource("/agrntrl-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
		agr_ntrl.setIcon(new ImageIcon(ntr));
		agr_ntrl.setBounds(20,50+90,90,90);
		
		ble=new JLabel();
		Image bl=new ImageIcon(this.getClass().getResource("/ble-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
		ble.setIcon(new ImageIcon(bl));
		ble.setBounds(20,50+180,90,90);
			
			ble.addMouseListener(this);
			agr_ntrl.addMouseListener(this);
			agr_art.addMouseListener(this);
		agr_ntrl.setFocusable(false);
		agr_art.setFocusable(false);
		String[] tab = {"ري طبيعي", "ري اصطناعي"};
		combo = new JComboBox(tab);
		combo.setBounds(400, 100, 160, 30);
		combo.setBackground(new Color(120,160,63).brighter());
		combo.setForeground(Color.white);
		ble.setFocusable(false);
		calc.setFocusable(false);
		retour.setFocusable(false);
		calc.addActionListener(new ActionListener() {
			private double  val;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				val =Double.parseDouble(qte.getText());
			if(i==1) {
					combo.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(e.getSource().equals(combo)) {
					 if(combo.getSelectedItem().equals("ري طبيعي"))
						{
									
									 if(val<675) {afch.setText("0");}
								     if(val>=675){double i=0; i=val*0.1; afch.setText(""+i);}
								}
					 if(combo.getSelectedItem().equals("ري اصطناعي"))
						{
									 if(val<675) {afch.setText("0");}
								     if(val>=675){double i=0;i=val*0.05; afch.setText(""+i);
								}
								}}}
							});}
			if(i==2) {
				double i=0;i=val*0.1; afch.setText(""+i);
			}
			if(i==3) { double i=0;
			i = val*0.05 ;
			afch.setText(""+i);}
					 
				}
					
		});
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
	private void draw() {
		
			pan_prin.add(resqte);
		pan_prin.add(agr_art);
		pan_prin.add(agr_ntrl);
		
		pan_prin.add(ble);
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
		if(e.getSource()==ble)
        {qte.setText("");
        afch.setText("");
			agr_art.setIcon(new ImageIcon(new ImageIcon("images\\argart-01.png").getImage().getScaledInstance(90, 90,Image.SCALE_FAST)));
			 Image art=new ImageIcon(this.getClass().getResource("/argart-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
			  agr_art.setIcon(new ImageIcon(art));
			  agr_art.setBounds(20,50,90,90);
			  Image ntr=new ImageIcon(this.getClass().getResource("/agrntrl-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
			  agr_ntrl.setIcon(new ImageIcon(ntr));
			  agr_ntrl.setBounds(20,50+90,90,90);
			
			  Image bl=new ImageIcon(this.getClass().getResource("/clcble-01.png")).getImage().getScaledInstance(140,90,Image.SCALE_FAST);
			  ble.setIcon(new ImageIcon(bl));
			  ble.setBounds(20,50+180,140,90);
			  Image bg=new ImageIcon(this.getClass().getResource("/bgble-01.png")).getImage().getScaledInstance(720, 510,Image.SCALE_FAST);
				image.setIcon(new ImageIcon(bg));
				image.setBounds(0,0,720,510);
		i=1;
			pan_prin.add(combo);
			
        }
		if(e.getSource()==agr_ntrl)
        {
			qte.setText("");
            afch.setText("");
            pan_prin.remove(combo);
            Image ntr=new ImageIcon(this.getClass().getResource("/agrntrlcalc-01.png")).getImage().getScaledInstance(140,90,Image.SCALE_FAST);
            agr_ntrl.setIcon(new ImageIcon(ntr));
            agr_ntrl.setBounds(20,50+90,140,90);
            Image bl=new ImageIcon(this.getClass().getResource("/ble-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
            ble.setIcon(new ImageIcon(bl));
            ble.setBounds(20,50+180,90,90);
            Image art=new ImageIcon(this.getClass().getResource("/argart-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
            agr_art.setIcon(new ImageIcon(art));
            agr_art.setBounds(20,50,90,90);
            Image bg=new ImageIcon(this.getClass().getResource("/bgagrntrl-01.png")).getImage().getScaledInstance(720, 510,Image.SCALE_FAST);
			image.setIcon(new ImageIcon(bg));
			image.setBounds(0,0,720,510);
			

				i=2;
			
        }
		if(e.getSource()==agr_art)
        {
			qte.setText("");
            afch.setText("");
            pan_prin.remove(combo);
            Image ntr=new ImageIcon(this.getClass().getResource("/agrntrl-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
            agr_ntrl.setIcon(new ImageIcon(ntr));
            agr_ntrl.setBounds(20,50+90,90,90);
            Image bl=new ImageIcon(this.getClass().getResource("/ble-01.png")).getImage().getScaledInstance(90,90,Image.SCALE_FAST);
            ble.setIcon(new ImageIcon(bl));
            ble.setBounds(20,50+180,90,90);
            Image art=new ImageIcon(this.getClass().getResource("/argartcalc-01.png")).getImage().getScaledInstance(140,90,Image.SCALE_FAST);
            agr_art.setIcon(new ImageIcon(art));
            agr_art.setBounds(20,50,140,90);
            Image bg=new ImageIcon(this.getClass().getResource("/argartbg-01.png")).getImage().getScaledInstance(720, 510,Image.SCALE_FAST);
			image.setIcon(new ImageIcon(bg));
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
