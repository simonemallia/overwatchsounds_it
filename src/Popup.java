import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Cursor;

public class Popup extends JDialog {
	
	ImageIcon riproduzione = new ImageIcon(getClass().getResource("riproduzione.png"));

	private final JPanel contentPanel = new JPanel();
	public JLabel lblIcon;
	public JLabel lblStop;

	public Popup() {
		setAlwaysOnTop(true);
		setUndecorated(true);
		setBounds(100, 100, 81, 80);
		getContentPane().setLayout(new BorderLayout());
		FlowLayout fl_contentPanel = new FlowLayout();
		fl_contentPanel.setHgap(10);
		contentPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPanel.setLayout(fl_contentPanel);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		lblIcon = new JLabel("");
		
		lblIcon.setIcon(riproduzione);
		contentPanel.add(lblIcon);
		
		lblStop = new JLabel("STOP");
		lblStop.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblStop.setForeground(new Color(0, 128, 128));
		contentPanel.add(lblStop);
	}

}
