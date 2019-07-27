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

import javazoom.jl.decoder.*;
import javazoom.jl.player.advanced.*;

public class GUI extends JFrame {

	private static JPanel contentPane;
	private JPanel panel;
	ImageIcon overwatch = new ImageIcon(getClass().getResource("overwatch.png"));
	ImageIcon question = new ImageIcon (getClass().getResource("question.png"));
	ImageIcon damageicon = new ImageIcon (getClass().getResource("damageicon.png"));
	ImageIcon tankicon = new ImageIcon (getClass().getResource("tankicon.png"));
	ImageIcon info12 = new ImageIcon(getClass().getResource("info12.png"));
	ImageIcon delete = new ImageIcon (getClass().getResource("delete.png"));
	ImageIcon reinicon = new ImageIcon(getClass().getResource("reinicon.png"));
	ImageIcon winicon = new ImageIcon(getClass().getResource("winicon.png"));
	ImageIcon dvaicon = new ImageIcon (getClass().getResource("dvaicon.png"));
	ImageIcon orisaicon = new ImageIcon (getClass().getResource("orisaicon.png"));
	ImageIcon hogicon = new ImageIcon (getClass().getResource("hogicon.png"));
	ImageIcon wreckicon = new ImageIcon (getClass().getResource("wreckicon.png"));
	ImageIcon zaryaicon = new ImageIcon (getClass().getResource("zaryaicon.png"));
	ImageIcon genjicon = new ImageIcon (getClass().getResource("genjicon.png"));
	ImageIcon torbicon = new ImageIcon (getClass().getResource("torbicon.png"));
	ImageIcon hanzoicon = new ImageIcon (getClass().getResource("hanzoicon.png"));
	ImageIcon doomicon = new ImageIcon (getClass().getResource("doomicon.png"));
	ImageIcon junkicon = new ImageIcon (getClass().getResource("junkicon.png"));
	ImageIcon mcicon = new ImageIcon (getClass().getResource("mcicon.png"));
	ImageIcon meicon = new ImageIcon (getClass().getResource("meicon.png"));
	ImageIcon pharicon = new ImageIcon (getClass().getResource("pharicon.png"));
	ImageIcon reapicon = new ImageIcon (getClass().getResource("reapicon.png"));


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
	private JScrollPane scrollPane_2;
	private JPanel panel_4;
	private JTable table_2;
	private JLabel lblSuoniDva;
	private JMenuItem mntmLicenza;
	private JScrollPane scrollPane_3;
	private JPanel panel_5;
	private JTable table_3;
	private JLabel lblSuoniOrisa;
	private JScrollPane scrollPane_4;
	private JPanel panel_6;
	private JTable table_4;
	private JLabel lblSuoniHog;
	private JScrollPane scrollPane_5;
	private JPanel panel_7;
	private JTable table_5;
	private JLabel lblSuoniWreck;
	private JScrollPane scrollPane_6;
	private JPanel panel_8;
	private JTable table_6;
	private JLabel lblSuoniZarya;
	private JScrollPane scrollPane_7;
	private JPanel panel_9;
	private JTable table_7;
	private JLabel lblSuoniGenji;
	private JScrollPane scrollPane_8;
	private JPanel panel_10;
	private JTable table_8;
	private JLabel lblSuoniTorbjon;
	private JScrollPane scrollPane_9;
	private JPanel panel_11;
	private JTable table_9;
	private JLabel lblSuoniHanzo;
	private JScrollPane scrollPane_10;
	private JPanel panel_12;
	private JTable table_10;
	private JLabel lblSuoniDoom;
	private JScrollPane scrollPane_11;
	private JPanel panel_13;
	private JTable table_11;
	private JLabel lblSuoniJunk;
	private JScrollPane scrollPane_12;
	private JPanel panel_14;
	private JTable table_12;
	private JLabel lblSuoniMc;
	private JScrollPane scrollPane_13;
	private JPanel panel_15;
	private JTable table_13;
	private JLabel lblSuoniMei;
	private JScrollPane scrollPane_14;
	private JPanel panel_16;
	private JTable table_14;
	private JLabel lblSuoniPhar;
	private JScrollPane scrollPane_15;
	private JPanel panel_17;
	private JTable table_15;
	private JLabel lblSuoniReap;
	private JMenu mnTank;
	private JMenu mnDps;
	private JMenuItem mntmReinhardt;
	private JMenuItem mntmWinston;
	private JMenuItem mntmDva;
	private JMenuItem mntmOrisa;
	private JMenuItem mntmRoadhog;
	private JMenuItem mntmWreckingBall;
	private JMenuItem mntmZarya;

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
		setTitle("Overwatch Voice Lines Compilation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 587);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu menu = new JMenu("");
		menu.setIcon(question);
		menu.setHorizontalTextPosition(SwingConstants.CENTER);
		menu.setHorizontalAlignment(SwingConstants.CENTER);
		menu.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		menuBar.add(Box.createHorizontalGlue());
		
		mnTank = new JMenu("Tank");
		mnTank.setIcon(tankicon);
		menuBar.add(mnTank);
		
		mntmReinhardt = new JMenuItem("Reinhardt");
		mntmReinhardt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		mnTank.add(mntmReinhardt);
		
		mntmWinston = new JMenuItem("Winston");
		mntmWinston.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		mnTank.add(mntmWinston);
		
		mntmDva = new JMenuItem("D.va");
		mntmDva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		mnTank.add(mntmDva);
		
		mntmOrisa = new JMenuItem("Orisa");
		mntmOrisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		mnTank.add(mntmOrisa);
		
		mntmRoadhog = new JMenuItem("Roadhog");
		mntmRoadhog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		mnTank.add(mntmRoadhog);
		
		mntmWreckingBall = new JMenuItem("Wrecking Ball");
		mntmWreckingBall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(5);
			}
		});
		mnTank.add(mntmWreckingBall);
		
		mntmZarya = new JMenuItem("Zarya");
		mntmZarya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(6);
			}
		});
		mnTank.add(mntmZarya);
		
		mnDps = new JMenu("Attaccanti");
		mnDps.setIcon(damageicon);
		menuBar.add(mnDps);
		menuBar.add(menu);
		
		JMenuItem mntmCredits = new JMenuItem("Informazioni");
		mntmCredits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(contentPane, "Overwatch Voice Lines Compilation v0.07a\nSviluppatore: Simone Mallia\nDisclaimer: I contenuti dell'applicazione (suoni, immagini e loghi di Overwatch)\nappartengono alla Blizzard Entertainment, Inc.\nIcone fornite da Icons8.com", "Informazioni", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menu.add(mntmCredits);
		
		JMenuItem mntmVaiAlSito = new JMenuItem("Vai al sito web");
		mntmVaiAlSito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					URI sitoweb = new URI("https://github.com/simonemallia/overwatchvoicelines_it");
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
		
		mntmLicenza = new JMenuItem("Licenza");
		mntmLicenza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Image iconlicense = Toolkit.getDefaultToolkit().getImage(getClass().getResource("license.png"));
				License licenza = new License ();
				licenza.setIconImage(iconlicense);
				licenza.setLocationRelativeTo(contentPane);
				licenza.setVisible(true);
			}
		});
		menu.add(mntmLicenza);
		menu.add(mntmVaiAlSito);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 110));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		label = new JLabel("");
		label.setAlignmentX(0.5f);
		label.setIcon(overwatch);
		panel.add(label);
		
		label_1 = new JLabel("Overwatch Voice Lines Compilation");
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
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
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
                    new Thread(){	
					public void run() {
				
				           try {
				            	int index = table.getSelectedRow();
				            	int convertrow = table.convertRowIndexToModel(index);
				                String value = modelrein.getValueAt(convertrow, 0).toString();
				                AdvancedPlayer audio = new AdvancedPlayer (getClass().getClassLoader().getResourceAsStream("reinhardt/" + value));			
								audio.setPlayBackListener(new PlaybackListener() {
			                        @Override
			                        public void playbackStarted(PlaybackEvent evt){
			                        	riproduzione.setLocationRelativeTo(contentPane);
										riproduzione.setVisible(true);
										  riproduzione.lblStop.addMouseListener(new MouseAdapter() {
					    						@Override
					    						public void mouseClicked(MouseEvent e) {
					    						audio.stop();
					    						}
					    					});
			                        	
			                        }
			                        public void playbackFinished(PlaybackEvent event) {
			                        	riproduzione.dispose();
			                        }
									});   
			                        audio.play();
			                       	                        
								    
								} catch (ArrayIndexOutOfBoundsException e1) {
									JOptionPane.showMessageDialog(scrollPane, "Per riprodurre il file clicca sul nome presente nella tabella", "Errore", JOptionPane.ERROR_MESSAGE);
								} catch (JavaLayerException e1) {
									e1.printStackTrace();
								}

					}
			        }.start();                  	        
			}
				
		});
		panel_2.add(table);
		
		int suonirein = table.getRowCount();
		lblSuoniRein = new JLabel("Suoni presenti: " + Integer.toString(suonirein) + " - Doppiatore: Paolo Marchese");
		lblSuoniRein.setIcon(info12);
		lblSuoniRein.setFont(new Font("Dialog", Font.BOLD, 11));
		
		lblSuoniRein.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblSuoniRein, BorderLayout.NORTH);
		
        scrollPane_1 = new JScrollPane();
        scrollPane_1.getVerticalScrollBar().setUnitIncrement(16);
        tabbedPane.addTab("Winston", winicon, scrollPane_1, null);
		
		panel_3 = new JPanel();
		scrollPane_1.setViewportView(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		//Start Winston Table
		
		table_1 = new JTable();
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
		brwin.close();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Popup riproduzione = new Popup();		 
                new Thread(){	
				public void run() {
			
			           try {
			            	int index = table_1.getSelectedRow();
			            	int convertrow = table_1.convertRowIndexToModel(index);
			                String value = modelwinston.getValueAt(convertrow, 0).toString();
			                AdvancedPlayer audio = new AdvancedPlayer (getClass().getClassLoader().getResourceAsStream("winston/" + value));			
							audio.setPlayBackListener(new PlaybackListener() {
		                        @Override
		                        public void playbackStarted(PlaybackEvent evt){
		                        	riproduzione.setLocationRelativeTo(contentPane);
									riproduzione.setVisible(true);
									  riproduzione.lblStop.addMouseListener(new MouseAdapter() {
				    						@Override
				    						public void mouseClicked(MouseEvent e) {
				    						audio.stop();
				    						}
				    					});
		                        	
		                        }
		                        public void playbackFinished(PlaybackEvent event) {
		                        	riproduzione.dispose();
		                        }
								});   
		                        audio.play();
		                       	                        
							    
							} catch (ArrayIndexOutOfBoundsException e1) {
								JOptionPane.showMessageDialog(scrollPane_1, "Per riprodurre il file clicca sul nome presente nella tabella", "Errore", JOptionPane.ERROR_MESSAGE);
							} catch (JavaLayerException e1) {
								e1.printStackTrace();
							}

				}
		        }.start();                  	        
		}
			
	});
		panel_3.add(table_1);

		int suoniwinston = table_1.getRowCount();
		lblSuoniWinston = new JLabel("Suoni presenti: " + Integer.toString(suoniwinston) + " - Doppiatore: Dario Oppido");
		lblSuoniWinston.setIcon(info12);
		lblSuoniWinston.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuoniWinston.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_3.add(lblSuoniWinston, BorderLayout.NORTH);
		
		scrollPane_2 = new JScrollPane();
        scrollPane_2.getVerticalScrollBar().setUnitIncrement(16);
		tabbedPane.addTab("D.va", dvaicon, scrollPane_2, null);
		
		panel_4 = new JPanel();
		scrollPane_2.setViewportView(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		//Start Dva Table
		table_2 = new JTable();		
		DefaultTableModel modeldva = new DefaultTableModel() {
			@Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		table_2.setModel(modeldva);
    	modeldva.setColumnIdentifiers(new String [] {"Suoni"});
    	InputStream inputdva = getClass().getClassLoader().getResourceAsStream("dva/masterlistdva.txt");
    	InputStreamReader inputdvareader = new InputStreamReader (inputdva);
    	BufferedReader brdva = new BufferedReader (inputdvareader);
		Object[] rowdva = new Object[1];
		for (String line3 = brdva.readLine(); line3 != null; line3 = brdva.readLine()) {
		rowdva[0] = line3;
		modeldva.addRow(rowdva);
		}
		brdva.close();
		table_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Popup riproduzione = new Popup();		 
                new Thread(){	
				public void run() {
			
			           try {
			            	int index = table_2.getSelectedRow();
			            	int convertrow = table_2.convertRowIndexToModel(index);
			                String value = modeldva.getValueAt(convertrow, 0).toString();
			                AdvancedPlayer audio = new AdvancedPlayer (getClass().getClassLoader().getResourceAsStream("dva/" + value));			
							audio.setPlayBackListener(new PlaybackListener() {
		                        @Override
		                        public void playbackStarted(PlaybackEvent evt){
		                        	riproduzione.setLocationRelativeTo(contentPane);
									riproduzione.setVisible(true);
									  riproduzione.lblStop.addMouseListener(new MouseAdapter() {
				    						@Override
				    						public void mouseClicked(MouseEvent e) {
				    						audio.stop();
				    						}
				    					});
		                        	
		                        }
		                        public void playbackFinished(PlaybackEvent event) {
		                        	riproduzione.dispose();
		                        }
								});   
		                        audio.play();
		                       	                        
							    
							} catch (ArrayIndexOutOfBoundsException e1) {
								JOptionPane.showMessageDialog(scrollPane_2, "Per riprodurre il file clicca sul nome presente nella tabella", "Errore", JOptionPane.ERROR_MESSAGE);
							} catch (JavaLayerException e1) {
								e1.printStackTrace();
							}

				}
		        }.start();                  	        
		}
			
	});
		
		panel_4.add(table_2, BorderLayout.CENTER);
		
		
		int suonidva = table_2.getRowCount();
		lblSuoniDva = new JLabel("Suoni presenti: " + Integer.toString(suonidva) + " - Doppiatrice: Martina Felli");
		lblSuoniDva.setIcon(info12);
		lblSuoniDva.setFont(new Font("Dialog", Font.BOLD, 11));
		lblSuoniDva.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblSuoniDva, BorderLayout.NORTH);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.getVerticalScrollBar().setUnitIncrement(16);
		tabbedPane.addTab("Orisa", orisaicon, scrollPane_3, null);
		
		panel_5 = new JPanel();
		scrollPane_3.setViewportView(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		//Start Orisa table
		table_3 = new JTable();
		DefaultTableModel modelorisa = new DefaultTableModel() {
			@Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		table_3.setModel(modelorisa);
    	modelorisa.setColumnIdentifiers(new String [] {"Suoni"});
    	InputStream inputorisa = getClass().getClassLoader().getResourceAsStream("orisa/masterlistorisa.txt");
    	InputStreamReader inputorisareader = new InputStreamReader (inputorisa);
    	BufferedReader brorisa = new BufferedReader (inputorisareader);
		Object[] roworisa = new Object[1];
		for (String line4 = brorisa.readLine(); line4 != null; line4 = brorisa.readLine()) {
		roworisa[0] = line4;
		modelorisa.addRow(roworisa);
		}
		brorisa.close();
		table_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Popup riproduzione = new Popup();		 
                new Thread(){	
				public void run() {
			
			           try {
			            	int index = table_3.getSelectedRow();
			            	int convertrow = table_3.convertRowIndexToModel(index);
			                String value = modelorisa.getValueAt(convertrow, 0).toString();
			                AdvancedPlayer audio = new AdvancedPlayer (getClass().getClassLoader().getResourceAsStream("orisa/" + value));			
							audio.setPlayBackListener(new PlaybackListener() {
		                        @Override
		                        public void playbackStarted(PlaybackEvent evt){
		                        	riproduzione.setLocationRelativeTo(contentPane);
									riproduzione.setVisible(true);
									  riproduzione.lblStop.addMouseListener(new MouseAdapter() {
				    						@Override
				    						public void mouseClicked(MouseEvent e) {
				    						audio.stop();
				    						}
				    					});
		                        	
		                        }
		                        public void playbackFinished(PlaybackEvent event) {
		                        	riproduzione.dispose();
		                        }
								});   
		                        audio.play();
		                       	                        
							    
							} catch (ArrayIndexOutOfBoundsException e1) {
								JOptionPane.showMessageDialog(scrollPane_3, "Per riprodurre il file clicca sul nome presente nella tabella", "Errore", JOptionPane.ERROR_MESSAGE);
							} catch (JavaLayerException e1) {
								e1.printStackTrace();
							}

				}
		        }.start();                  	        
		}
			
	});
		
		panel_5.add(table_3, BorderLayout.CENTER);
		
		int suoniorisa = table_3.getRowCount();
		lblSuoniOrisa = new JLabel("Suoni presenti: " + Integer.toString(suoniorisa) + " - Doppiatrice: Elisabetta Spinelli");
		lblSuoniOrisa.setIcon(info12);
		lblSuoniOrisa.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuoniOrisa.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_5.add(lblSuoniOrisa, BorderLayout.NORTH);
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.getVerticalScrollBar().setUnitIncrement(16);
		tabbedPane.addTab("Roadhog", hogicon, scrollPane_4, null);
		
		panel_6 = new JPanel();
		scrollPane_4.setViewportView(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		//Start Roadhog table
		table_4 = new JTable();
		DefaultTableModel modelhog = new DefaultTableModel() {
			@Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		table_4.setModel(modelhog);
    	modelhog.setColumnIdentifiers(new String [] {"Suoni"});
    	InputStream inputhog = getClass().getClassLoader().getResourceAsStream("roadhog/masterlisthog.txt");
    	InputStreamReader inputhogreader = new InputStreamReader (inputhog);
    	BufferedReader brhog = new BufferedReader (inputhogreader);
		Object[] rowhog = new Object[1];
		for (String line5 = brhog.readLine(); line5 != null; line5 = brhog.readLine()) {
		rowhog[0] = line5;
		modelhog.addRow(rowhog);
		}
		brhog.close();
		table_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Popup riproduzione = new Popup();		 
                new Thread(){	
				public void run() {
			
			           try {
			            	int index = table_4.getSelectedRow();
			            	int convertrow = table_4.convertRowIndexToModel(index);
			                String value = modelhog.getValueAt(convertrow, 0).toString();
			                AdvancedPlayer audio = new AdvancedPlayer (getClass().getClassLoader().getResourceAsStream("roadhog/" + value));			
							audio.setPlayBackListener(new PlaybackListener() {
		                        @Override
		                        public void playbackStarted(PlaybackEvent evt){
		                        	riproduzione.setLocationRelativeTo(contentPane);
									riproduzione.setVisible(true);
									  riproduzione.lblStop.addMouseListener(new MouseAdapter() {
				    						@Override
				    						public void mouseClicked(MouseEvent e) {
				    						audio.stop();
				    						}
				    					});
		                        	
		                        }
		                        public void playbackFinished(PlaybackEvent event) {
		                        	riproduzione.dispose();
		                        }
								});   
		                        audio.play();
		                       	                        
							    
							} catch (ArrayIndexOutOfBoundsException e1) {
								JOptionPane.showMessageDialog(scrollPane_4, "Per riprodurre il file clicca sul nome presente nella tabella", "Errore", JOptionPane.ERROR_MESSAGE);
							} catch (JavaLayerException e1) {
								e1.printStackTrace();
							}

				}
		        }.start();                  	        
		}
			
	});
		panel_6.add(table_4, BorderLayout.CENTER);
		
		int suonihog = table_4.getRowCount();
		lblSuoniHog = new JLabel("Suoni presenti: " + Integer.toString(suonihog) + " - Doppiatore: Renzo Ferrini");
		lblSuoniHog.setIcon(info12);
		lblSuoniHog.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuoniHog.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_6.add(lblSuoniHog, BorderLayout.NORTH);
		
		scrollPane_5 = new JScrollPane();
		scrollPane_5.getVerticalScrollBar().setUnitIncrement(16);
		tabbedPane.addTab("Wrecking Ball", wreckicon, scrollPane_5, null);
		
		panel_7 = new JPanel();
		scrollPane_5.setViewportView(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		//Start Wreck Table
		table_5 = new JTable();
		DefaultTableModel modelwreck = new DefaultTableModel() {
			@Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		table_5.setModel(modelwreck);
    	modelwreck.setColumnIdentifiers(new String [] {"Suoni"});
    	InputStream inputwreck = getClass().getClassLoader().getResourceAsStream("wreckingball/masterlistwreck.txt");
    	InputStreamReader inputwreckreader = new InputStreamReader (inputwreck);
    	BufferedReader brwreck = new BufferedReader (inputwreckreader);
		Object[] rowwreck = new Object[1];
		for (String line6 = brwreck.readLine(); line6 != null; line6 = brwreck.readLine()) {
		rowwreck[0] = line6;
		modelwreck.addRow(rowwreck);
		}
		brwreck.close();
		table_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Popup riproduzione = new Popup();		 
                new Thread(){	
				public void run() {
			
			           try {
			            	int index = table_5.getSelectedRow();
			            	int convertrow = table_5.convertRowIndexToModel(index);
			                String value = modelwreck.getValueAt(convertrow, 0).toString();
			                AdvancedPlayer audio = new AdvancedPlayer (getClass().getClassLoader().getResourceAsStream("wreckingball/" + value));			
							audio.setPlayBackListener(new PlaybackListener() {
		                        @Override
		                        public void playbackStarted(PlaybackEvent evt){
		                        	riproduzione.setLocationRelativeTo(contentPane);
									riproduzione.setVisible(true);
									  riproduzione.lblStop.addMouseListener(new MouseAdapter() {
				    						@Override
				    						public void mouseClicked(MouseEvent e) {
				    						audio.stop();
				    						}
				    					});
		                        	
		                        }
		                        public void playbackFinished(PlaybackEvent event) {
		                        	riproduzione.dispose();
		                        }
								});   
		                        audio.play();
		                       	                        
							    
							} catch (ArrayIndexOutOfBoundsException e1) {
								JOptionPane.showMessageDialog(scrollPane_5, "Per riprodurre il file clicca sul nome presente nella tabella", "Errore", JOptionPane.ERROR_MESSAGE);
							} catch (JavaLayerException e1) {
								e1.printStackTrace();
							}

				}
		        }.start();                  	        
		}
			
	});
		panel_7.add(table_5, BorderLayout.CENTER);
		
		int suoniwreck = table_5.getRowCount();
		lblSuoniWreck = new JLabel("Suoni presenti: " + Integer.toString(suoniwreck) + " - Doppiatore non individuato");
		lblSuoniWreck.setIcon(info12);
		lblSuoniWreck.setFont(new Font("Dialog", Font.BOLD, 11));
		lblSuoniWreck.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblSuoniWreck, BorderLayout.NORTH);
		
		scrollPane_6 = new JScrollPane();
		scrollPane_6.getVerticalScrollBar().setUnitIncrement(16);
		tabbedPane.addTab("Zarya", zaryaicon, scrollPane_6, null);
		
		panel_8 = new JPanel();
		scrollPane_6.setViewportView(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		//Start Zarya Table
		table_6 = new JTable();
		DefaultTableModel modelzarya = new DefaultTableModel() {
			@Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		table_6.setModel(modelzarya);
    	modelzarya.setColumnIdentifiers(new String [] {"Suoni"});
    	InputStream inputzarya = getClass().getClassLoader().getResourceAsStream("zarya/masterlistzarya.txt");
    	InputStreamReader inputzaryareader = new InputStreamReader (inputzarya);
    	BufferedReader brzarya = new BufferedReader (inputzaryareader);
		Object[] rowzarya = new Object[1];
		for (String line7 = brzarya.readLine(); line7 != null; line7 = brzarya.readLine()) {
		rowzarya[0] = line7;
		modelzarya.addRow(rowzarya);
		}
		brzarya.close();
		table_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Popup riproduzione = new Popup();		 
                new Thread(){	
				public void run() {
			
			           try {
			            	int index = table_6.getSelectedRow();
			            	int convertrow = table_6.convertRowIndexToModel(index);
			                String value = modelzarya.getValueAt(convertrow, 0).toString();
			                AdvancedPlayer audio = new AdvancedPlayer (getClass().getClassLoader().getResourceAsStream("zarya/" + value));			
							audio.setPlayBackListener(new PlaybackListener() {
		                        @Override
		                        public void playbackStarted(PlaybackEvent evt){
		                        	riproduzione.setLocationRelativeTo(contentPane);
									riproduzione.setVisible(true);
									  riproduzione.lblStop.addMouseListener(new MouseAdapter() {
				    						@Override
				    						public void mouseClicked(MouseEvent e) {
				    						audio.stop();
				    						}
				    					});
		                        	
		                        }
		                        public void playbackFinished(PlaybackEvent event) {
		                        	riproduzione.dispose();
		                        }
								});   
		                        audio.play();
		                       	                        
							    
							} catch (ArrayIndexOutOfBoundsException e1) {
								JOptionPane.showMessageDialog(scrollPane_6, "Per riprodurre il file clicca sul nome presente nella tabella", "Errore", JOptionPane.ERROR_MESSAGE);
							} catch (JavaLayerException e1) {
								e1.printStackTrace();
							}

				}
		        }.start();                  	        
		}
			
	});
		panel_8.add(table_6, BorderLayout.CENTER);
		
		int suonizarya = table_6.getRowCount();
		lblSuoniZarya = new JLabel("Suoni presenti: " + Integer.toString(suonizarya) + " - Doppiatrice: Maddalena Vadacca");
		lblSuoniZarya.setIcon(info12);
		lblSuoniZarya.setFont(new Font("Dialog", Font.BOLD, 11));
		lblSuoniZarya.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblSuoniZarya, BorderLayout.NORTH);
		
		scrollPane_7 = new JScrollPane();
		scrollPane_7.getVerticalScrollBar().setUnitIncrement(16);
		tabbedPane.addTab("Genji", genjicon, scrollPane_7, null);
		
		panel_9 = new JPanel();
		scrollPane_7.setViewportView(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		//Start Genji Table
		table_7 = new JTable();
		DefaultTableModel modelgenji = new DefaultTableModel() {
			@Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		table_7.setModel(modelgenji);
    	modelgenji.setColumnIdentifiers(new String [] {"Suoni"});
    	InputStream inputgenji = getClass().getClassLoader().getResourceAsStream("genji/masterlistgenji.txt");
    	InputStreamReader inputgenjireader = new InputStreamReader (inputgenji);
    	BufferedReader brgenji = new BufferedReader (inputgenjireader);
		Object[] rowgenji = new Object[1];
		for (String line8 = brgenji.readLine(); line8 != null; line8 = brgenji.readLine()) {
		rowgenji[0] = line8;
		modelgenji.addRow(rowgenji);
		}
		brgenji.close();
		table_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Popup riproduzione = new Popup();		 
                new Thread(){	
				public void run() {
			
			           try {
			            	int index = table_7.getSelectedRow();
			            	int convertrow = table_7.convertRowIndexToModel(index);
			                String value = modelgenji.getValueAt(convertrow, 0).toString();
			                AdvancedPlayer audio = new AdvancedPlayer (getClass().getClassLoader().getResourceAsStream("genji/" + value));			
							audio.setPlayBackListener(new PlaybackListener() {
		                        @Override
		                        public void playbackStarted(PlaybackEvent evt){
		                        	riproduzione.setLocationRelativeTo(contentPane);
									riproduzione.setVisible(true);
									  riproduzione.lblStop.addMouseListener(new MouseAdapter() {
				    						@Override
				    						public void mouseClicked(MouseEvent e) {
				    						audio.stop();
				    						}
				    					});
		                        	
		                        }
		                        public void playbackFinished(PlaybackEvent event) {
		                        	riproduzione.dispose();
		                        }
								});   
		                        audio.play();
		                       	                        
							    
							} catch (ArrayIndexOutOfBoundsException e1) {
								JOptionPane.showMessageDialog(scrollPane_7, "Per riprodurre il file clicca sul nome presente nella tabella", "Errore", JOptionPane.ERROR_MESSAGE);
							} catch (JavaLayerException e1) {
								e1.printStackTrace();
							}

				}
		        }.start();                  	        
		}
			
	});
		panel_9.add(table_7, BorderLayout.CENTER);
		
		int suonigenji = table_7.getRowCount();
		lblSuoniGenji = new JLabel("Suoni presenti: " + Integer.toString(suonigenji) + " - Doppiatore: Paolo De Santis");
		lblSuoniGenji.setIcon(info12);
		lblSuoniGenji.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuoniGenji.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_9.add(lblSuoniGenji, BorderLayout.NORTH);
		
		scrollPane_8 = new JScrollPane();
		scrollPane_8.getVerticalScrollBar().setUnitIncrement(16);
		tabbedPane.addTab("Torbjorn", torbicon, scrollPane_8, null);
		
		panel_10 = new JPanel();
		scrollPane_8.setViewportView(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		//Start Torbjorn Table
		table_8 = new JTable();
		DefaultTableModel modeltorb = new DefaultTableModel() {
			@Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		table_8.setModel(modeltorb);
    	modeltorb.setColumnIdentifiers(new String [] {"Suoni"});
    	InputStream inputtorb = getClass().getClassLoader().getResourceAsStream("torbjorn/masterlisttorb.txt");
    	InputStreamReader inputtorbreader = new InputStreamReader (inputtorb);
    	BufferedReader brtorb = new BufferedReader (inputtorbreader);
		Object[] rowtorb = new Object[1];
		for (String line9 = brtorb.readLine(); line9 != null; line9 = brtorb.readLine()) {
		rowtorb[0] = line9;
		modeltorb.addRow(rowtorb);
		}
		brtorb.close();
		table_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Popup riproduzione = new Popup();		 
                new Thread(){	
				public void run() {
			
			           try {
			            	int index = table_8.getSelectedRow();
			            	int convertrow = table_8.convertRowIndexToModel(index);
			                String value = modeltorb.getValueAt(convertrow, 0).toString();
			                AdvancedPlayer audio = new AdvancedPlayer (getClass().getClassLoader().getResourceAsStream("torbjorn/" + value));			
							audio.setPlayBackListener(new PlaybackListener() {
		                        @Override
		                        public void playbackStarted(PlaybackEvent evt){
		                        	riproduzione.setLocationRelativeTo(contentPane);
									riproduzione.setVisible(true);
									  riproduzione.lblStop.addMouseListener(new MouseAdapter() {
				    						@Override
				    						public void mouseClicked(MouseEvent e) {
				    						audio.stop();
				    						}
				    					});
		                        	
		                        }
		                        public void playbackFinished(PlaybackEvent event) {
		                        	riproduzione.dispose();
		                        }
								});   
		                        audio.play();
		                       	                        
							    
							} catch (ArrayIndexOutOfBoundsException e1) {
								JOptionPane.showMessageDialog(scrollPane_8, "Per riprodurre il file clicca sul nome presente nella tabella", "Errore", JOptionPane.ERROR_MESSAGE);
							} catch (JavaLayerException e1) {
								e1.printStackTrace();
							}

				}
		        }.start();                  	        
		}
			
	});
		panel_10.add(table_8, BorderLayout.CENTER);
		
		int suonitorb = table_8.getRowCount();
		lblSuoniTorbjon = new JLabel("Suoni presenti: " + Integer.toString(suonitorb) + " - Doppiatore: Mario Scarabelli");
		lblSuoniTorbjon.setIcon(info12);
		lblSuoniTorbjon.setFont(new Font("Dialog", Font.BOLD, 11));
		lblSuoniTorbjon.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblSuoniTorbjon, BorderLayout.NORTH);
		
		scrollPane_9 = new JScrollPane();
		scrollPane_9.getVerticalScrollBar().setUnitIncrement(16);

		tabbedPane.addTab("Hanzo", hanzoicon, scrollPane_9, null);
		
		panel_11 = new JPanel();
		scrollPane_9.setViewportView(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		//Start Hanzo Table
		table_9 = new JTable();
		DefaultTableModel modelhanzo = new DefaultTableModel() {
			@Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		table_9.setModel(modelhanzo);
    	modelhanzo.setColumnIdentifiers(new String [] {"Suoni"});
    	InputStream inputhanzo = getClass().getClassLoader().getResourceAsStream("hanzo/masterlisthanzo.txt");
    	InputStreamReader inputhanzoreader = new InputStreamReader (inputhanzo);
    	BufferedReader brhanzo = new BufferedReader (inputhanzoreader);
		Object[] rowhanzo = new Object[1];
		for (String line10 = brhanzo.readLine(); line10 != null; line10 = brhanzo.readLine()) {
		rowhanzo[0] = line10;
		modelhanzo.addRow(rowhanzo);
		}
		brhanzo.close();
		table_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Popup riproduzione = new Popup();		 
                new Thread(){	
				public void run() {
			
			           try {
			            	int index = table_9.getSelectedRow();
			            	int convertrow = table_9.convertRowIndexToModel(index);
			                String value = modelhanzo.getValueAt(convertrow, 0).toString();
			                AdvancedPlayer audio = new AdvancedPlayer (getClass().getClassLoader().getResourceAsStream("hanzo/" + value));			
							audio.setPlayBackListener(new PlaybackListener() {
		                        @Override
		                        public void playbackStarted(PlaybackEvent evt){
		                        	riproduzione.setLocationRelativeTo(contentPane);
									riproduzione.setVisible(true);
									  riproduzione.lblStop.addMouseListener(new MouseAdapter() {
				    						@Override
				    						public void mouseClicked(MouseEvent e) {
				    						audio.stop();
				    						}
				    					});
		                        	
		                        }
		                        public void playbackFinished(PlaybackEvent event) {
		                        	riproduzione.dispose();
		                        }
								});   
		                        audio.play();
		                       	                        
							    
							} catch (ArrayIndexOutOfBoundsException e1) {
								JOptionPane.showMessageDialog(scrollPane_9, "Per riprodurre il file clicca sul nome presente nella tabella", "Errore", JOptionPane.ERROR_MESSAGE);
							} catch (JavaLayerException e1) {
								e1.printStackTrace();
							}

				}
		        }.start();                  	        
		}
			
	});
		panel_11.add(table_9, BorderLayout.CENTER);
		
		int suonihanzo = table_9.getRowCount();
		lblSuoniHanzo = new JLabel("Suoni presenti: " + Integer.toString(suonihanzo) + " - Doppiatore: Lorenzo Scattorin");
		lblSuoniHanzo.setIcon(info12);
		lblSuoniHanzo.setFont(new Font("Dialog", Font.BOLD, 11));
		lblSuoniHanzo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblSuoniHanzo, BorderLayout.NORTH);
		
		scrollPane_10 = new JScrollPane();
		scrollPane_10.getVerticalScrollBar().setUnitIncrement(16);
		tabbedPane.addTab("Doomfist", doomicon, scrollPane_10, null);
		
		panel_12 = new JPanel();
		scrollPane_10.setViewportView(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		//Start Doom Table
		table_10 = new JTable();
		DefaultTableModel modeldoom = new DefaultTableModel() {
			@Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		table_10.setModel(modeldoom);
    	modeldoom.setColumnIdentifiers(new String [] {"Suoni"});
    	InputStream inputdoom = getClass().getClassLoader().getResourceAsStream("doomfist/masterlistdoom.txt");
    	InputStreamReader inputdoomreader = new InputStreamReader (inputdoom);
    	BufferedReader brdoom = new BufferedReader (inputdoomreader);
		Object[] rowdoom = new Object[1];
		for (String line11 = brdoom.readLine(); line11 != null; line11 = brdoom.readLine()) {
		rowdoom[0] = line11;
		modeldoom.addRow(rowdoom);
		}
		brdoom.close();
		table_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Popup riproduzione = new Popup();		 
                new Thread(){	
				public void run() {
			
			           try {
			            	int index = table_10.getSelectedRow();
			            	int convertrow = table_10.convertRowIndexToModel(index);
			                String value = modeldoom.getValueAt(convertrow, 0).toString();
			                AdvancedPlayer audio = new AdvancedPlayer (getClass().getClassLoader().getResourceAsStream("doomfist/" + value));			
							audio.setPlayBackListener(new PlaybackListener() {
		                        @Override
		                        public void playbackStarted(PlaybackEvent evt){
		                        	riproduzione.setLocationRelativeTo(contentPane);
									riproduzione.setVisible(true);
									  riproduzione.lblStop.addMouseListener(new MouseAdapter() {
				    						@Override
				    						public void mouseClicked(MouseEvent e) {
				    						audio.stop();
				    						}
				    					});
		                        	
		                        }
		                        public void playbackFinished(PlaybackEvent event) {
		                        	riproduzione.dispose();
		                        }
								});   
		                        audio.play();
		                       	                        
							    
							} catch (ArrayIndexOutOfBoundsException e1) {
								JOptionPane.showMessageDialog(scrollPane_10, "Per riprodurre il file clicca sul nome presente nella tabella", "Errore", JOptionPane.ERROR_MESSAGE);
							} catch (JavaLayerException e1) {
								e1.printStackTrace();
							}

				}
		        }.start();                  	        
		}
			
	});
		panel_12.add(table_10, BorderLayout.CENTER);
		
		int suonidoom = table_10.getRowCount();
		lblSuoniDoom = new JLabel("Suoni presenti: " + Integer.toString(suonidoom) + " - Doppiatore: Massimo Corvo");
		lblSuoniDoom.setIcon(info12);
		lblSuoniDoom.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuoniDoom.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_12.add(lblSuoniDoom, BorderLayout.NORTH);
		
		scrollPane_11 = new JScrollPane();
		scrollPane_11.getVerticalScrollBar().setUnitIncrement(16);
		tabbedPane.addTab("Junkrat", junkicon, scrollPane_11, null);
		
		panel_13 = new JPanel();
		scrollPane_11.setViewportView(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		//Start Junkrat Table
		table_11 = new JTable();
		DefaultTableModel modeljunk = new DefaultTableModel() {
			@Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		table_11.setModel(modeljunk);
    	modeljunk.setColumnIdentifiers(new String [] {"Suoni"});
    	InputStream inputjunk = getClass().getClassLoader().getResourceAsStream("junkrat/masterlistjunk.txt");
    	InputStreamReader inputjunkreader = new InputStreamReader (inputjunk);
    	BufferedReader brjunk = new BufferedReader (inputjunkreader);
		Object[] rowjunk = new Object[1];
		for (String line12 = brjunk.readLine(); line12 != null; line12 = brjunk.readLine()) {
		rowjunk[0] = line12;
		modeljunk.addRow(rowjunk);
		}
		brjunk.close();
		table_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Popup riproduzione = new Popup();		 
                new Thread(){	
				public void run() {
			
			           try {
			            	int index = table_11.getSelectedRow();
			            	int convertrow = table_11.convertRowIndexToModel(index);
			                String value = modeljunk.getValueAt(convertrow, 0).toString();
			                AdvancedPlayer audio = new AdvancedPlayer (getClass().getClassLoader().getResourceAsStream("junkrat/" + value));			
							audio.setPlayBackListener(new PlaybackListener() {
		                        @Override
		                        public void playbackStarted(PlaybackEvent evt){
		                        	riproduzione.setLocationRelativeTo(contentPane);
									riproduzione.setVisible(true);
									  riproduzione.lblStop.addMouseListener(new MouseAdapter() {
				    						@Override
				    						public void mouseClicked(MouseEvent e) {
				    						audio.stop();
				    						}
				    					});
		                        	
		                        }
		                        public void playbackFinished(PlaybackEvent event) {
		                        	riproduzione.dispose();
		                        }
								});   
		                        audio.play();
		                       	                        
							    
							} catch (ArrayIndexOutOfBoundsException e1) {
								JOptionPane.showMessageDialog(scrollPane_11, "Per riprodurre il file clicca sul nome presente nella tabella", "Errore", JOptionPane.ERROR_MESSAGE);
							} catch (JavaLayerException e1) {
								e1.printStackTrace();
							}

				}
		        }.start();                  	        
		}
			
	});
		panel_13.add(table_11, BorderLayout.CENTER);
		
		int suonijunk = table_11.getRowCount();
		lblSuoniJunk = new JLabel("Suoni presenti: " + Integer.toString(suonijunk) + " - Doppiatore: Matteo Zanotti");
		lblSuoniJunk.setIcon(info12);
		lblSuoniJunk.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuoniJunk.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_13.add(lblSuoniJunk, BorderLayout.NORTH);
		
		scrollPane_12 = new JScrollPane();
		scrollPane_12.getVerticalScrollBar().setUnitIncrement(16);
		tabbedPane.addTab("McCree", mcicon, scrollPane_12, null);
		
		panel_14 = new JPanel();
		scrollPane_12.setViewportView(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		//Start McCree Table
		table_12 = new JTable();
		DefaultTableModel modelmc = new DefaultTableModel() {
			@Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		table_12.setModel(modelmc);
    	modelmc.setColumnIdentifiers(new String [] {"Suoni"});
    	InputStream inputmc = getClass().getClassLoader().getResourceAsStream("mccree/masterlistmc.txt");
    	InputStreamReader inputmcreader = new InputStreamReader (inputmc);
    	BufferedReader brmc = new BufferedReader (inputmcreader);
		Object[] rowmc = new Object[1];
		for (String line13 = brmc.readLine(); line13 != null; line13 = brmc.readLine()) {
		rowmc[0] = line13;
		modelmc.addRow(rowmc);
		}
		brmc.close();
		table_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Popup riproduzione = new Popup();		 
                new Thread(){	
				public void run() {
			
			           try {
			            	int index = table_12.getSelectedRow();
			            	int convertrow = table_12.convertRowIndexToModel(index);
			                String value = modelmc.getValueAt(convertrow, 0).toString();
			                AdvancedPlayer audio = new AdvancedPlayer (getClass().getClassLoader().getResourceAsStream("mccree/" + value));			
							audio.setPlayBackListener(new PlaybackListener() {
		                        @Override
		                        public void playbackStarted(PlaybackEvent evt){
		                        	riproduzione.setLocationRelativeTo(contentPane);
									riproduzione.setVisible(true);
									  riproduzione.lblStop.addMouseListener(new MouseAdapter() {
				    						@Override
				    						public void mouseClicked(MouseEvent e) {
				    						audio.stop();
				    						}
				    					});
		                        	
		                        }
		                        public void playbackFinished(PlaybackEvent event) {
		                        	riproduzione.dispose();
		                        }
								});   
		                        audio.play();
		                       	                        
							    
							} catch (ArrayIndexOutOfBoundsException e1) {
								JOptionPane.showMessageDialog(scrollPane_12, "Per riprodurre il file clicca sul nome presente nella tabella", "Errore", JOptionPane.ERROR_MESSAGE);
							} catch (JavaLayerException e1) {
								e1.printStackTrace();
							}

				}
		        }.start();                  	        
		}
			
	});
		panel_14.add(table_12, BorderLayout.CENTER);
		
		int suonimc = table_12.getRowCount();
		lblSuoniMc = new JLabel("Suoni presenti: " + Integer.toString(suonimc) + " - Doppiatore: Alessandro D'Errico");
		lblSuoniMc.setIcon(info12);
		lblSuoniMc.setFont(new Font("Dialog", Font.BOLD, 11));
		lblSuoniMc.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblSuoniMc, BorderLayout.NORTH);
		
		scrollPane_13 = new JScrollPane();
		scrollPane_13.getVerticalScrollBar().setUnitIncrement(16);
		tabbedPane.addTab("Mei", meicon, scrollPane_13, null);
		
		panel_15 = new JPanel();
		scrollPane_13.setViewportView(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		//Start Mei Table
		table_13 = new JTable();
		DefaultTableModel modelmei = new DefaultTableModel() {
			@Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		table_13.setModel(modelmei);
    	modelmei.setColumnIdentifiers(new String [] {"Suoni"});
    	InputStream inputmei = getClass().getClassLoader().getResourceAsStream("mei/masterlistmei.txt");
    	InputStreamReader inputmeireader = new InputStreamReader (inputmei);
    	BufferedReader brmei = new BufferedReader (inputmeireader);
		Object[] rowmei = new Object[1];
		for (String line14 = brmei.readLine(); line14 != null; line14 = brmei.readLine()) {
		rowmei[0] = line14;
		modelmei.addRow(rowmei);
		}
		brmei.close();
		table_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Popup riproduzione = new Popup();		 
                new Thread(){	
				public void run() {
			
			           try {
			            	int index = table_13.getSelectedRow();
			            	int convertrow = table_13.convertRowIndexToModel(index);
			                String value = modelmei.getValueAt(convertrow, 0).toString();
			                AdvancedPlayer audio = new AdvancedPlayer (getClass().getClassLoader().getResourceAsStream("mei/" + value));			
							audio.setPlayBackListener(new PlaybackListener() {
		                        @Override
		                        public void playbackStarted(PlaybackEvent evt){
		                        	riproduzione.setLocationRelativeTo(contentPane);
									riproduzione.setVisible(true);
									  riproduzione.lblStop.addMouseListener(new MouseAdapter() {
				    						@Override
				    						public void mouseClicked(MouseEvent e) {
				    						audio.stop();
				    						}
				    					});
		                        	
		                        }
		                        public void playbackFinished(PlaybackEvent event) {
		                        	riproduzione.dispose();
		                        }
								});   
		                        audio.play();
		                       	                        
							    
							} catch (ArrayIndexOutOfBoundsException e1) {
								JOptionPane.showMessageDialog(scrollPane_13, "Per riprodurre il file clicca sul nome presente nella tabella", "Errore", JOptionPane.ERROR_MESSAGE);
							} catch (JavaLayerException e1) {
								e1.printStackTrace();
							}

				}
		        }.start();                  	        
		}
			
	});
		panel_15.add(table_13, BorderLayout.CENTER);
		
		int suonimei = table_13.getRowCount();
		lblSuoniMei = new JLabel("Suoni presenti: " + Integer.toString(suonimei) + " - Doppiatrice: Katia Sorrentino");
		lblSuoniMei.setIcon(info12);
		lblSuoniMei.setFont(new Font("Dialog", Font.BOLD, 11));
		lblSuoniMei.setHorizontalAlignment(SwingConstants.CENTER);
		panel_15.add(lblSuoniMei, BorderLayout.NORTH);
		
		scrollPane_14 = new JScrollPane();
		scrollPane_14.getVerticalScrollBar().setUnitIncrement(16);
		tabbedPane.addTab("Pharah", pharicon, scrollPane_14, null);
		
		panel_16 = new JPanel();
		scrollPane_14.setViewportView(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		//Start Pharah Table
		table_14 = new JTable();
		DefaultTableModel modelphar = new DefaultTableModel() {
			@Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		table_14.setModel(modelphar);
    	modelphar.setColumnIdentifiers(new String [] {"Suoni"});
    	InputStream inputphar = getClass().getClassLoader().getResourceAsStream("pharah/masterlistpharah.txt");
    	InputStreamReader inputpharreader = new InputStreamReader (inputphar);
    	BufferedReader brphar = new BufferedReader (inputpharreader);
		Object[] rowphar = new Object[1];
		for (String line15 = brphar.readLine(); line15 != null; line15 = brphar.readLine()) {
		rowphar[0] = line15;
		modelphar.addRow(rowphar);
		}
		brphar.close();
		table_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Popup riproduzione = new Popup();		 
                new Thread(){	
				public void run() {
			
			           try {
			            	int index = table_14.getSelectedRow();
			            	int convertrow = table_14.convertRowIndexToModel(index);
			                String value = modelphar.getValueAt(convertrow, 0).toString();
			                AdvancedPlayer audio = new AdvancedPlayer (getClass().getClassLoader().getResourceAsStream("pharah/" + value));			
							audio.setPlayBackListener(new PlaybackListener() {
		                        @Override
		                        public void playbackStarted(PlaybackEvent evt){
		                        	riproduzione.setLocationRelativeTo(contentPane);
									riproduzione.setVisible(true);
									  riproduzione.lblStop.addMouseListener(new MouseAdapter() {
				    						@Override
				    						public void mouseClicked(MouseEvent e) {
				    						audio.stop();
				    						}
				    					});
		                        	
		                        }
		                        public void playbackFinished(PlaybackEvent event) {
		                        	riproduzione.dispose();
		                        }
								});   
		                        audio.play();
		                       	                        
							    
							} catch (ArrayIndexOutOfBoundsException e1) {
								JOptionPane.showMessageDialog(scrollPane_14, "Per riprodurre il file clicca sul nome presente nella tabella", "Errore", JOptionPane.ERROR_MESSAGE);
							} catch (JavaLayerException e1) {
								e1.printStackTrace();
							}

				}
		        }.start();                  	        
		}
			
	});
		panel_16.add(table_14, BorderLayout.CENTER);
		
		int suoniphar = table_14.getRowCount();
		lblSuoniPhar = new JLabel("Suoni presenti: " + Integer.toString(suoniphar) + " - Doppiatrice: Deborah Magnaghi");
		lblSuoniPhar.setIcon(info12);
		lblSuoniPhar.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuoniPhar.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_16.add(lblSuoniPhar, BorderLayout.NORTH);
		
		scrollPane_15 = new JScrollPane();
		scrollPane_15.getVerticalScrollBar().setUnitIncrement(16);
		tabbedPane.addTab("Reaper", reapicon, scrollPane_15, null);
		
		panel_17 = new JPanel();
		scrollPane_15.setViewportView(panel_17);
		panel_17.setLayout(new BorderLayout(0, 0));
		
		//Start Reaper Table
		table_15 = new JTable();
		DefaultTableModel modelreap = new DefaultTableModel() {
			@Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};
		table_15.setModel(modelreap);
    	modelreap.setColumnIdentifiers(new String [] {"Suoni"});
    	InputStream inputreap = getClass().getClassLoader().getResourceAsStream("reaper/masterlistreaper.txt");
    	InputStreamReader inputreapreader = new InputStreamReader (inputreap);
    	BufferedReader brreap = new BufferedReader (inputreapreader);
		Object[] rowreap = new Object[1];
		for (String line16 = brreap.readLine(); line16 != null; line16 = brreap.readLine()) {
		rowreap[0] = line16;
		modelreap.addRow(rowreap);
		}
		brreap.close();
		table_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Popup riproduzione = new Popup();		 
                new Thread(){	
				public void run() {
			
			           try {
			            	int index = table_15.getSelectedRow();
			            	int convertrow = table_15.convertRowIndexToModel(index);
			                String value = modelreap.getValueAt(convertrow, 0).toString();
			                AdvancedPlayer audio = new AdvancedPlayer (getClass().getClassLoader().getResourceAsStream("reaper/" + value));			
							audio.setPlayBackListener(new PlaybackListener() {
		                        @Override
		                        public void playbackStarted(PlaybackEvent evt){
		                        	riproduzione.setLocationRelativeTo(contentPane);
									riproduzione.setVisible(true);
									  riproduzione.lblStop.addMouseListener(new MouseAdapter() {
				    						@Override
				    						public void mouseClicked(MouseEvent e) {
				    						audio.stop();
				    						}
				    					});
		                        	
		                        }
		                        public void playbackFinished(PlaybackEvent event) {
		                        	riproduzione.dispose();
		                        }
								});   
		                        audio.play();
		                       	                        
							    
							} catch (ArrayIndexOutOfBoundsException e1) {
								JOptionPane.showMessageDialog(scrollPane_15, "Per riprodurre il file clicca sul nome presente nella tabella", "Errore", JOptionPane.ERROR_MESSAGE);
							} catch (JavaLayerException e1) {
								e1.printStackTrace();
							}

				}
		        }.start();                  	        
		}
			
	});
		panel_17.add(table_15, BorderLayout.CENTER);
		
		int suonireap = table_15.getRowCount();
		lblSuoniReap = new JLabel("Suoni presenti: " + Integer.toString(suonireap) + " - Doppiatore: Oliviero Corbetta");
		lblSuoniReap.setIcon(info12);
		lblSuoniReap.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuoniReap.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_17.add(lblSuoniReap, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		textField = new JTextField();
		
		TableRowSorter<DefaultTableModel>filter  = new TableRowSorter<DefaultTableModel> ((DefaultTableModel) table.getModel());
	    TableRowSorter<DefaultTableModel>filter1 = new TableRowSorter<DefaultTableModel> ((DefaultTableModel) table_1.getModel());
	    TableRowSorter<DefaultTableModel>filter2 = new TableRowSorter<DefaultTableModel> ((DefaultTableModel) table_2.getModel());
	    TableRowSorter<DefaultTableModel>filter3 = new TableRowSorter<DefaultTableModel> ((DefaultTableModel) table_3.getModel());
	    TableRowSorter<DefaultTableModel>filter4 = new TableRowSorter<DefaultTableModel> ((DefaultTableModel) table_4.getModel());
	    TableRowSorter<DefaultTableModel>filter5 = new TableRowSorter<DefaultTableModel> ((DefaultTableModel) table_5.getModel());
	    TableRowSorter<DefaultTableModel>filter6 = new TableRowSorter<DefaultTableModel> ((DefaultTableModel) table_6.getModel());
	    TableRowSorter<DefaultTableModel>filter7 = new TableRowSorter<DefaultTableModel> ((DefaultTableModel) table_7.getModel());
	    TableRowSorter<DefaultTableModel>filter8 = new TableRowSorter<DefaultTableModel> ((DefaultTableModel) table_8.getModel());
	    TableRowSorter<DefaultTableModel>filter9 = new TableRowSorter<DefaultTableModel> ((DefaultTableModel) table_9.getModel());
	    TableRowSorter<DefaultTableModel>filter10 = new TableRowSorter<DefaultTableModel> ((DefaultTableModel) table_10.getModel());
	    TableRowSorter<DefaultTableModel>filter11 = new TableRowSorter<DefaultTableModel> ((DefaultTableModel) table_11.getModel());
	    TableRowSorter<DefaultTableModel>filter12 = new TableRowSorter<DefaultTableModel> ((DefaultTableModel) table_12.getModel());
	    TableRowSorter<DefaultTableModel>filter13 = new TableRowSorter<DefaultTableModel> ((DefaultTableModel) table_13.getModel());
	    TableRowSorter<DefaultTableModel>filter14 = new TableRowSorter<DefaultTableModel> ((DefaultTableModel) table_14.getModel());
	    TableRowSorter<DefaultTableModel>filter15 = new TableRowSorter<DefaultTableModel> ((DefaultTableModel) table_15.getModel());


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
			       
			       //Dva
			       table_2.setRowSorter(filter2);
			       String text2 = textField.getText();
			       filter2.setRowFilter(RowFilter.regexFilter(text2)); 
			       
			       //Orisa
			       table_3.setRowSorter(filter3);
			       String text3 = textField.getText();
			       filter3.setRowFilter(RowFilter.regexFilter(text3)); 
			       
			       //Roadhog
			       table_4.setRowSorter(filter4);
			       String text4 = textField.getText();
			       filter4.setRowFilter(RowFilter.regexFilter(text4));
			       
			       //Wreck
			       table_5.setRowSorter(filter5);
			       String text5 = textField.getText();
			       filter5.setRowFilter(RowFilter.regexFilter(text5));
			       
			       //Zarya
			       table_6.setRowSorter(filter6);
			       String text6 = textField.getText();
			       filter6.setRowFilter(RowFilter.regexFilter(text6));
			       
			       //Genji
			       table_7.setRowSorter(filter7);
			       String text7 = textField.getText();
			       filter7.setRowFilter(RowFilter.regexFilter(text7));
			       
			       //Torbjorn
			       table_8.setRowSorter(filter8);
			       String text8 = textField.getText();
			       filter8.setRowFilter(RowFilter.regexFilter(text8));
			       
			       //Hanzo
			       table_9.setRowSorter(filter9);
			       String text9 = textField.getText();
			       filter9.setRowFilter(RowFilter.regexFilter(text9));
			       
			       //Doom
			       table_10.setRowSorter(filter10);
			       String text10 = textField.getText();
			       filter10.setRowFilter(RowFilter.regexFilter(text10));
			       
			       //Junkrat
			       table_11.setRowSorter(filter11);
			       String text11 = textField.getText();
			       filter11.setRowFilter(RowFilter.regexFilter(text11));
			       
			       //McCree
			       table_12.setRowSorter(filter12);
			       String text12 = textField.getText();
			       filter12.setRowFilter(RowFilter.regexFilter(text12));
			       
			       //Mei
			       table_13.setRowSorter(filter13);
			       String text13 = textField.getText();
			       filter13.setRowFilter(RowFilter.regexFilter(text13));
			       
			       //Pharah
			       table_14.setRowSorter(filter14);
			       String text14 = textField.getText();
			       filter14.setRowFilter(RowFilter.regexFilter(text14));
			       
			       //Reaper
			       table_15.setRowSorter(filter15);
			       String text15 = textField.getText();
			       filter15.setRowFilter(RowFilter.regexFilter(text15));
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
			    filter2.setRowFilter(RowFilter.regexFilter(""));
			    filter3.setRowFilter(RowFilter.regexFilter(""));
			    filter4.setRowFilter(RowFilter.regexFilter(""));
			    filter5.setRowFilter(RowFilter.regexFilter(""));
			    filter6.setRowFilter(RowFilter.regexFilter(""));
			    filter7.setRowFilter(RowFilter.regexFilter(""));
			    filter8.setRowFilter(RowFilter.regexFilter(""));
			    filter9.setRowFilter(RowFilter.regexFilter(""));
			    filter10.setRowFilter(RowFilter.regexFilter(""));
			    filter11.setRowFilter(RowFilter.regexFilter(""));
			    filter12.setRowFilter(RowFilter.regexFilter(""));
			    filter13.setRowFilter(RowFilter.regexFilter(""));
			    filter14.setRowFilter(RowFilter.regexFilter(""));
			    filter15.setRowFilter(RowFilter.regexFilter(""));


			}
		});
		lblCancella.setIcon(delete);
		
		panel_1.add(lblCancella);	
		
	}

}
