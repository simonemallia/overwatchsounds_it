import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JMenu;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Cursor;

public class GUI extends JFrame {

	private static JPanel contentPane;
	private JPanel panel;
	ImageIcon overwatch = new ImageIcon(getClass().getResource("overwatch.png"));
	ImageIcon delete = new ImageIcon (getClass().getResource("delete.png"));
	ImageIcon reinicon = new ImageIcon(getClass().getResource("reinicon.png"));
	ImageIcon winicon = new ImageIcon(getClass().getResource("winicon.png"));
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JPanel panel_1;
	private JTextField textField;
	private JMenuBar menuBar;
	private JTabbedPane tabbedPane;
	private JScrollPane scrollPane;
	private JPanel panel_2;
	private JTable table;
	private JLabel lblC;
	private JScrollPane scrollPane_1;
	private JPanel panel_3;
	private JTable table_1;
	private JLabel lblSuoniRein;
	private JLabel lblSuoniWinston;
	private JLabel lblCancella;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Image overwatch2 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("overwatch2.png"));
					Welcome benvenuto = new Welcome ();
					GUI frame = new GUI();
					frame.setVisible(true);
					frame.setIconImage(overwatch2);
					benvenuto.setLocationRelativeTo(contentPane);
					benvenuto.setModal(true);
					benvenuto.setVisible(true);
					benvenuto.setIconImage(overwatch2);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws URISyntaxException 
	 * @throws IOException 
	 */
	public GUI() throws URISyntaxException, IOException {
		setTitle("Overwatch Sounds Compilation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 528);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu menu = new JMenu("?");
		menu.setHorizontalTextPosition(SwingConstants.CENTER);
		menu.setHorizontalAlignment(SwingConstants.CENTER);
		menu.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		menuBar.add(Box.createHorizontalGlue());
		menuBar.add(menu);
		
		JMenuItem mntmCredits = new JMenuItem("Credits");
		mntmCredits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(contentPane, "Overwatch Sounds Compilation v0.01a\nSviluppato da Simone Mallia\nGrazie per utilizzare la mia applicazione :)", "Informazioni", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menu.add(mntmCredits);
		
		JMenuItem mntmVaiAlSito = new JMenuItem("Vai al sito web");
		mntmVaiAlSito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					URI sitoweb = new URI("https://github.com/simonemallia/overwatchsounds_it");
					if (Desktop.isDesktopSupported()) {
						Desktop.getDesktop().browse(sitoweb);
					}
				} catch (URISyntaxException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		menu.add(mntmVaiAlSito);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 100));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		label = new JLabel("");
		label.setAlignmentX(0.5f);
		label.setIcon(overwatch);
		panel.add(label);
		
		label_1 = new JLabel("Overwatch Sounds Compilation");
		label_1.setHorizontalTextPosition(SwingConstants.CENTER);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Dialog", Font.BOLD, 25));
		label_1.setAlignmentY(0.5f);
		label_1.setAlignmentX(0.5f);
		panel.add(label_1);
		
		label_2 = new JLabel("Riproduci l'audio dei tuoi eroi preferiti!");
		label_2.setHorizontalTextPosition(SwingConstants.CENTER);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setAlignmentY(0.5f);
		label_2.setAlignmentX(0.5f);
		panel.add(label_2);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		scrollPane = new JScrollPane();
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		tabbedPane.addTab("Reinhardt", reinicon, scrollPane, null);
		
		panel_2 = new JPanel();
		scrollPane.setViewportView(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		//Start Rein Table
		
		table = new JTable();
		DefaultTableModel modelrein = new DefaultTableModel() {
			@Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		table.setModel(modelrein);
    	modelrein.setColumnIdentifiers(new String [] {"Suoni"});  
    	InputStream inputrein = getClass().getClassLoader().getResourceAsStream("reinhardt/masterlistrein.txt");
    	InputStreamReader inputreinreader = new InputStreamReader (inputrein);
    	BufferedReader br = new BufferedReader (inputreinreader);
		Object[] rowrein = new Object[1];
		for (String line = br.readLine(); line != null; line = br.readLine()) {	
		rowrein[0] = line;
		modelrein.addRow(rowrein);	
		}
		br.close();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Popup riproduzione = new Popup();
				LineListener listener = new LineListener() {
					@Override
					public void update(LineEvent event) {
						if (event.getType() == LineEvent.Type.START) {
							riproduzione.setLocationRelativeTo(contentPane);
							riproduzione.setVisible(true);
							
							
						} else if (event.getType() == LineEvent.Type.STOP) {
							riproduzione.dispose();
							
						}
					}
					
				};
				           try {
				            	int index = table.getSelectedRow();
				            	int convertrow = table.convertRowIndexToModel(index);
				                String value = modelrein.getValueAt(convertrow, 0).toString();
				                AudioInputStream audio;
								audio = AudioSystem.getAudioInputStream((getClass().getResource("/reinhardt/" + value)));			
								Clip clip = AudioSystem.getClip();
								clip.addLineListener(listener);
								clip.open(audio);
								clip.start();
								riproduzione.lblStop.addMouseListener(new MouseAdapter() {
									@Override
									public void mouseClicked(MouseEvent e) {
										clip.stop();
									}
								});
								} catch (UnsupportedAudioFileException | IOException e1) {
									e1.printStackTrace();
								} catch (LineUnavailableException e1) {
									e1.printStackTrace();
								} catch (ArrayIndexOutOfBoundsException e1) {
									JOptionPane.showMessageDialog(scrollPane, "Per riprodurre il file clicca sul nome presente nella tabella", "Errore", JOptionPane.ERROR_MESSAGE);
								}

					}
				
		});
		panel_2.add(table);
		
		int suonirein = table.getRowCount();
		lblSuoniRein = new JLabel("Suoni presenti: " + Integer.toString(suonirein));
		lblSuoniRein.setFont(new Font("Dialog", Font.BOLD, 11));
		
		lblSuoniRein.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblSuoniRein, BorderLayout.NORTH);
		
        scrollPane_1 = new JScrollPane();
        scrollPane_1.getVerticalScrollBar().setUnitIncrement(16);
        tabbedPane.addTab("Winston", winicon, scrollPane_1, null);
		
		panel_3 = new JPanel();
		scrollPane_1.setViewportView(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		table_1 = new JTable();
		
		//Start Winston Table
		
		DefaultTableModel modelwinston = new DefaultTableModel() {
			@Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		table_1.setModel(modelwinston);
    	modelwinston.setColumnIdentifiers(new String [] {"Suoni"});
    	InputStream inputwin = getClass().getClassLoader().getResourceAsStream("winston/masterlistwin.txt");
    	InputStreamReader inputwinreader = new InputStreamReader (inputwin);
    	BufferedReader brwin = new BufferedReader (inputwinreader);
		Object[] rowwin = new Object[1];
		for (String line2 = brwin.readLine(); line2 != null; line2 = brwin.readLine()) {
		rowwin[0] = line2;
		modelwinston.addRow(rowwin);
		}
		br.close();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Popup riproduzione = new Popup();
				LineListener listener = new LineListener() {
					@Override
					public void update(LineEvent event) {
						if (event.getType() == LineEvent.Type.START) {
							riproduzione.setLocationRelativeTo(contentPane);
							riproduzione.setVisible(true);
							
							
						} else if (event.getType() == LineEvent.Type.STOP) {
							riproduzione.setVisible(false);
							
						}
					}
					
				};
				           try {
				            	int index = table_1.getSelectedRow();
				            	int convertrow = table_1.convertRowIndexToModel(index);
				                String value = modelwinston.getValueAt(convertrow, 0).toString();
				                AudioInputStream audio;
								audio = AudioSystem.getAudioInputStream(getClass().getResource("/winston/" + value));
								Clip clip = AudioSystem.getClip();
								clip.addLineListener(listener);
								clip.open(audio);
								clip.start();
								riproduzione.lblStop.addMouseListener(new MouseAdapter() {
									@Override
									public void mouseClicked(MouseEvent e) {
										clip.stop();
									}
								});
								} catch (UnsupportedAudioFileException | IOException e1) {
									e1.printStackTrace();
								} catch (LineUnavailableException e1) {
									e1.printStackTrace();
								} catch (ArrayIndexOutOfBoundsException e1) {
									JOptionPane.showMessageDialog(scrollPane_1, "Per riprodurre il file clicca sul nome presente nella tabella", "Errore", JOptionPane.ERROR_MESSAGE);
								}

					}
				
		});
		panel_3.add(table_1);

		int suoniwinston = table_1.getRowCount();
		lblSuoniWinston = new JLabel("Suoni presenti: " + Integer.toString(suoniwinston));
		lblSuoniWinston.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuoniWinston.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_3.add(lblSuoniWinston, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		textField = new JTextField();
		
		TableRowSorter<DefaultTableModel>filter = new TableRowSorter<DefaultTableModel> ((DefaultTableModel) table.getModel());
	    TableRowSorter<DefaultTableModel>filter1 = new TableRowSorter<DefaultTableModel> ((DefaultTableModel) table_1.getModel());

		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) { 
				  
				   //Rein
			       table.setRowSorter(filter);
			       String text = textField.getText();
			       filter.setRowFilter(RowFilter.regexFilter(text)); 
			       
			       //Winston
			       table_1.setRowSorter(filter1);
			       String text1 = textField.getText();
			       filter1.setRowFilter(RowFilter.regexFilter(text1)); 
			       
			}
		});
		
		lblC = new JLabel("Cerca:");
		panel_1.add(lblC);
		panel_1.add(textField);
		textField.setColumns(10);
		
		lblCancella = new JLabel("");
		lblCancella.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCancella.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
				filter.setRowFilter(RowFilter.regexFilter(""));
			    filter1.setRowFilter(RowFilter.regexFilter(""));
			}
		});
		lblCancella.setIcon(delete);
		
		panel_1.add(lblCancella);	
		
	}

}
