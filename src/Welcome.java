import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Component;

public class Welcome extends JDialog {

	private final JPanel contentPanel = new JPanel();
	ImageIcon workinprogress = new ImageIcon (getClass().getResource("workinprogress.png"));

	public Welcome() {
		setResizable(false);
		Image overwatch2 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("overwatch2.png"));
		setIconImage(overwatch2);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 366, 196);
		setTitle("Benvenuto");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
		{
			JLabel lblIcon = new JLabel("");
			lblIcon.setAlignmentX(Component.CENTER_ALIGNMENT);
			lblIcon.setIcon(workinprogress);
			contentPanel.add(lblIcon);
		}
		{
			JLabel lblBenvenutoInOverwatch = new JLabel("Benvenuto in Overwatch Sounds");
			lblBenvenutoInOverwatch.setAlignmentX(Component.CENTER_ALIGNMENT);
			contentPanel.add(lblBenvenutoInOverwatch);
		}
		{
			JLabel lblQuestaApplicazioneContiene = new JLabel("Questa applicazione è ancora in corso di sviluppo");
			lblQuestaApplicazioneContiene.setAlignmentX(Component.CENTER_ALIGNMENT);
			contentPanel.add(lblQuestaApplicazioneContiene);
		}
		{
			JLabel lblEAncoraIn = new JLabel("Presto verranno aggiunti altri eroi");
			lblEAncoraIn.setAlignmentX(Component.CENTER_ALIGNMENT);
			contentPanel.add(lblEAncoraIn);
		}
	}

}
