package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.border.LineBorder;
import javax.swing.JSplitPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Schach extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3648969693622900457L;
	private String test = "";
	private JLabel test2 = new JLabel("1");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Schach frame = new Schach();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void move(JPanel x) {
		if (x.getComponentCount()>0)((JLabel) x.getComponent(0)).setText(test);
		else {x.add(test2);x.revalidate();x.repaint();System.out.println(test2.toString());}
		
	}

	/**
	 * Create the frame.
	 */
	public Schach() {

		setResizable(false);
		setTitle("Schach");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 481);
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel xcord = new JPanel();
		getContentPane().add(xcord, BorderLayout.SOUTH);
		GridBagLayout gbl_xcord = new GridBagLayout();
		gbl_xcord.columnWidths = new int[] { 24, 49, 49, 49, 49, 49, 49, 49, 50, 41, 0 };
		gbl_xcord.rowHeights = new int[] { 15, 0 };
		gbl_xcord.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_xcord.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		xcord.setLayout(gbl_xcord);

		JLabel lblNewLabel = new JLabel(" ");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		xcord.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblA = new JLabel("A");
		GridBagConstraints gbc_lblA = new GridBagConstraints();
		gbc_lblA.fill = GridBagConstraints.VERTICAL;
		gbc_lblA.insets = new Insets(0, 0, 0, 5);
		gbc_lblA.gridx = 1;
		gbc_lblA.gridy = 0;
		xcord.add(lblA, gbc_lblA);

		JLabel lblB = new JLabel("B");
		GridBagConstraints gbc_lblB = new GridBagConstraints();
		gbc_lblB.fill = GridBagConstraints.VERTICAL;
		gbc_lblB.insets = new Insets(0, 0, 0, 5);
		gbc_lblB.gridx = 2;
		gbc_lblB.gridy = 0;
		xcord.add(lblB, gbc_lblB);

		JLabel lblC = new JLabel("C");
		GridBagConstraints gbc_lblC = new GridBagConstraints();
		gbc_lblC.fill = GridBagConstraints.VERTICAL;
		gbc_lblC.insets = new Insets(0, 0, 0, 5);
		gbc_lblC.gridx = 3;
		gbc_lblC.gridy = 0;
		xcord.add(lblC, gbc_lblC);

		JLabel lblD = new JLabel("D");
		GridBagConstraints gbc_lblD = new GridBagConstraints();
		gbc_lblD.fill = GridBagConstraints.VERTICAL;
		gbc_lblD.insets = new Insets(0, 0, 0, 5);
		gbc_lblD.gridx = 4;
		gbc_lblD.gridy = 0;
		xcord.add(lblD, gbc_lblD);

		JLabel lblE = new JLabel("E");
		GridBagConstraints gbc_lblE = new GridBagConstraints();
		gbc_lblE.fill = GridBagConstraints.VERTICAL;
		gbc_lblE.insets = new Insets(0, 0, 0, 5);
		gbc_lblE.gridx = 5;
		gbc_lblE.gridy = 0;
		xcord.add(lblE, gbc_lblE);

		JLabel lblF = new JLabel("F");
		GridBagConstraints gbc_lblF = new GridBagConstraints();
		gbc_lblF.fill = GridBagConstraints.VERTICAL;
		gbc_lblF.insets = new Insets(0, 0, 0, 5);
		gbc_lblF.gridx = 6;
		gbc_lblF.gridy = 0;
		xcord.add(lblF, gbc_lblF);

		JLabel lblG = new JLabel("G");
		GridBagConstraints gbc_lblG = new GridBagConstraints();
		gbc_lblG.fill = GridBagConstraints.VERTICAL;
		gbc_lblG.insets = new Insets(0, 0, 0, 5);
		gbc_lblG.gridx = 7;
		gbc_lblG.gridy = 0;
		xcord.add(lblG, gbc_lblG);
		
				JLabel lblH = new JLabel("H");
				GridBagConstraints gbc_lblH = new GridBagConstraints();
				gbc_lblH.insets = new Insets(0, 0, 0, 5);
				gbc_lblH.fill = GridBagConstraints.VERTICAL;
				gbc_lblH.gridx = 8;
				gbc_lblH.gridy = 0;
				xcord.add(lblH, gbc_lblH);

		JPanel ycord = new JPanel();
		getContentPane().add(ycord, BorderLayout.WEST);
		GridBagLayout gbl_ycord = new GridBagLayout();
		gbl_ycord.columnWidths = new int[] { 18, 0 };
		gbl_ycord.rowHeights = new int[] { 51, 51, 51, 51, 51, 51, 51, 51, 0 };
		gbl_ycord.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_ycord.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		ycord.setLayout(gbl_ycord);

		JLabel label = new JLabel("8");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.VERTICAL;
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		ycord.add(label, gbc_label);

		JLabel label_1 = new JLabel("7");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.fill = GridBagConstraints.VERTICAL;
		gbc_label_1.insets = new Insets(0, 0, 5, 0);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 1;
		ycord.add(label_1, gbc_label_1);

		JLabel label_2 = new JLabel("6");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.fill = GridBagConstraints.VERTICAL;
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 2;
		ycord.add(label_2, gbc_label_2);

		JLabel label_3 = new JLabel("5");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.fill = GridBagConstraints.VERTICAL;
		gbc_label_3.insets = new Insets(0, 0, 5, 0);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 3;
		ycord.add(label_3, gbc_label_3);

		JLabel label_4 = new JLabel("4");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.fill = GridBagConstraints.VERTICAL;
		gbc_label_4.insets = new Insets(0, 0, 5, 0);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 4;
		ycord.add(label_4, gbc_label_4);

		JLabel label_5 = new JLabel("3");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.fill = GridBagConstraints.VERTICAL;
		gbc_label_5.insets = new Insets(0, 0, 5, 0);
		gbc_label_5.gridx = 0;
		gbc_label_5.gridy = 5;
		ycord.add(label_5, gbc_label_5);

		JLabel label_6 = new JLabel("2");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.fill = GridBagConstraints.VERTICAL;
		gbc_label_6.insets = new Insets(0, 0, 5, 0);
		gbc_label_6.gridx = 0;
		gbc_label_6.gridy = 6;
		ycord.add(label_6, gbc_label_6);

		JLabel label_7 = new JLabel("1");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.fill = GridBagConstraints.VERTICAL;
		gbc_label_7.gridx = 0;
		gbc_label_7.gridy = 7;
		ycord.add(label_7, gbc_label_7);

		JPanel board = new JPanel();
		board.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(board, BorderLayout.CENTER);
		GridBagLayout gbl_board = new GridBagLayout();
		gbl_board.columnWidths = new int[] { 55, 55, 55, 55, 55, 55, 55, 55, 0 };
		gbl_board.rowHeights = new int[] { 51, 51, 51, 51, 51, 51, 51, 51, 0 };
		gbl_board.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_board.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		board.setLayout(gbl_board);

		JPanel a8 = new JPanel();
		a8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		a8.setBorder(new LineBorder(new Color(0, 0, 0)));
		a8.setBackground(Color.GRAY);
		GridBagConstraints gbc_a8 = new GridBagConstraints();
		gbc_a8.fill = GridBagConstraints.BOTH;
		gbc_a8.insets = new Insets(0, 0, 5, 5);
		gbc_a8.gridx = 0;
		gbc_a8.gridy = 0;
		board.add(a8, gbc_a8);
		
		JLabel stl = new JLabel("ST");
		a8.add(stl);

		JPanel b8 = new JPanel();
		b8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		b8.setBorder(new LineBorder(new Color(0, 0, 0)));
		b8.setBackground(Color.WHITE);
		GridBagConstraints gbc_b8 = new GridBagConstraints();
		gbc_b8.fill = GridBagConstraints.BOTH;
		gbc_b8.insets = new Insets(0, 0, 5, 5);
		gbc_b8.gridx = 1;
		gbc_b8.gridy = 0;
		board.add(b8, gbc_b8);
		
		JLabel ssl = new JLabel("SS");
		b8.add(ssl);

		JPanel c8 = new JPanel();
		c8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		c8.setBorder(new LineBorder(new Color(0, 0, 0)));
		c8.setBackground(Color.GRAY);
		GridBagConstraints gbc_c8 = new GridBagConstraints();
		gbc_c8.fill = GridBagConstraints.BOTH;
		gbc_c8.insets = new Insets(0, 0, 5, 5);
		gbc_c8.gridx = 2;
		gbc_c8.gridy = 0;
		board.add(c8, gbc_c8);
		
		JLabel sll = new JLabel("SL");
		c8.add(sll);

		JPanel d8 = new JPanel();
		d8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		d8.setBorder(new LineBorder(new Color(0, 0, 0)));
		d8.setBackground(Color.WHITE);
		GridBagConstraints gbc_d8 = new GridBagConstraints();
		gbc_d8.fill = GridBagConstraints.BOTH;
		gbc_d8.insets = new Insets(0, 0, 5, 5);
		gbc_d8.gridx = 3;
		gbc_d8.gridy = 0;
		board.add(d8, gbc_d8);
		
		JLabel sd = new JLabel("SD");
		d8.add(sd);

		JPanel e8 = new JPanel();
		e8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		e8.setBorder(new LineBorder(new Color(0, 0, 0)));
		e8.setBackground(Color.GRAY);
		GridBagConstraints gbc_e8 = new GridBagConstraints();
		gbc_e8.fill = GridBagConstraints.BOTH;
		gbc_e8.insets = new Insets(0, 0, 5, 5);
		gbc_e8.gridx = 4;
		gbc_e8.gridy = 0;
		board.add(e8, gbc_e8);
		
		JLabel sk = new JLabel("SK");
		e8.add(sk);

		JPanel f8 = new JPanel();
		f8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		f8.setBorder(new LineBorder(new Color(0, 0, 0)));
		f8.setBackground(Color.WHITE);
		GridBagConstraints gbc_f8 = new GridBagConstraints();
		gbc_f8.fill = GridBagConstraints.BOTH;
		gbc_f8.insets = new Insets(0, 0, 5, 5);
		gbc_f8.gridx = 5;
		gbc_f8.gridy = 0;
		board.add(f8, gbc_f8);
		
		JLabel slr = new JLabel("SL");
		f8.add(slr);

		JPanel g8 = new JPanel();
		g8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		g8.setBorder(new LineBorder(new Color(0, 0, 0)));
		g8.setBackground(Color.GRAY);
		GridBagConstraints gbc_g8 = new GridBagConstraints();
		gbc_g8.fill = GridBagConstraints.BOTH;
		gbc_g8.insets = new Insets(0, 0, 5, 5);
		gbc_g8.gridx = 6;
		gbc_g8.gridy = 0;
		board.add(g8, gbc_g8);
		
		JLabel ssr = new JLabel("SS");
		g8.add(ssr);

		JPanel h8 = new JPanel();
		h8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		h8.setBorder(new LineBorder(new Color(0, 0, 0)));
		h8.setBackground(Color.WHITE);
		GridBagConstraints gbc_h8 = new GridBagConstraints();
		gbc_h8.fill = GridBagConstraints.BOTH;
		gbc_h8.insets = new Insets(0, 0, 5, 0);
		gbc_h8.gridx = 7;
		gbc_h8.gridy = 0;
		board.add(h8, gbc_h8);
		
		JLabel str = new JLabel("ST");
		h8.add(str);

		JPanel a7 = new JPanel();
		a7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		a7.setBorder(new LineBorder(new Color(0, 0, 0)));
		a7.setBackground(Color.WHITE);
		GridBagConstraints gbc_a7 = new GridBagConstraints();
		gbc_a7.fill = GridBagConstraints.BOTH;
		gbc_a7.insets = new Insets(0, 0, 5, 5);
		gbc_a7.gridx = 0;
		gbc_a7.gridy = 1;
		board.add(a7, gbc_a7);
		
		JLabel br9 = new JLabel("SB");
		a7.add(br9);

		JPanel b7 = new JPanel();
		b7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		b7.setBorder(new LineBorder(new Color(0, 0, 0)));
		b7.setBackground(Color.GRAY);
		GridBagConstraints gbc_b7 = new GridBagConstraints();
		gbc_b7.fill = GridBagConstraints.BOTH;
		gbc_b7.insets = new Insets(0, 0, 5, 5);
		gbc_b7.gridx = 1;
		gbc_b7.gridy = 1;
		board.add(b7, gbc_b7);
		
		JLabel br10 = new JLabel("SB");
		b7.add(br10);

		JPanel c7 = new JPanel();
		c7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		c7.setBorder(new LineBorder(new Color(0, 0, 0)));
		c7.setBackground(Color.WHITE);
		GridBagConstraints gbc_c7 = new GridBagConstraints();
		gbc_c7.fill = GridBagConstraints.BOTH;
		gbc_c7.insets = new Insets(0, 0, 5, 5);
		gbc_c7.gridx = 2;
		gbc_c7.gridy = 1;
		board.add(c7, gbc_c7);
		
		JLabel br11 = new JLabel("SB");
		c7.add(br11);

		JPanel d7 = new JPanel();
		d7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		d7.setBorder(new LineBorder(new Color(0, 0, 0)));
		d7.setBackground(Color.GRAY);
		GridBagConstraints gbc_d7 = new GridBagConstraints();
		gbc_d7.fill = GridBagConstraints.BOTH;
		gbc_d7.insets = new Insets(0, 0, 5, 5);
		gbc_d7.gridx = 3;
		gbc_d7.gridy = 1;
		board.add(d7, gbc_d7);
		
		JLabel br12 = new JLabel("SB");
		d7.add(br12);

		JPanel e7 = new JPanel();
		e7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		e7.setBorder(new LineBorder(new Color(0, 0, 0)));
		e7.setBackground(Color.WHITE);
		GridBagConstraints gbc_e7 = new GridBagConstraints();
		gbc_e7.fill = GridBagConstraints.BOTH;
		gbc_e7.insets = new Insets(0, 0, 5, 5);
		gbc_e7.gridx = 4;
		gbc_e7.gridy = 1;
		board.add(e7, gbc_e7);
		
		JLabel br13 = new JLabel("SB");
		e7.add(br13);

		JPanel f7 = new JPanel();
		f7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		f7.setBorder(new LineBorder(new Color(0, 0, 0)));
		f7.setBackground(Color.GRAY);
		GridBagConstraints gbc_f7 = new GridBagConstraints();
		gbc_f7.fill = GridBagConstraints.BOTH;
		gbc_f7.insets = new Insets(0, 0, 5, 5);
		gbc_f7.gridx = 5;
		gbc_f7.gridy = 1;
		board.add(f7, gbc_f7);
		
		JLabel br14 = new JLabel("SB");
		f7.add(br14);

		JPanel g7 = new JPanel();
		g7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		g7.setBorder(new LineBorder(new Color(0, 0, 0)));
		g7.setBackground(Color.WHITE);
		GridBagConstraints gbc_g7 = new GridBagConstraints();
		gbc_g7.fill = GridBagConstraints.BOTH;
		gbc_g7.insets = new Insets(0, 0, 5, 5);
		gbc_g7.gridx = 6;
		gbc_g7.gridy = 1;
		board.add(g7, gbc_g7);
		
		JLabel br15 = new JLabel("SB");
		g7.add(br15);

		JPanel h7 = new JPanel();
		h7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		h7.setBorder(new LineBorder(new Color(0, 0, 0)));
		h7.setBackground(Color.GRAY);
		GridBagConstraints gbc_h7 = new GridBagConstraints();
		gbc_h7.fill = GridBagConstraints.BOTH;
		gbc_h7.insets = new Insets(0, 0, 5, 0);
		gbc_h7.gridx = 7;
		gbc_h7.gridy = 1;
		board.add(h7, gbc_h7);
		
		JLabel br16 = new JLabel("SB");
		h7.add(br16);

		JPanel a6 = new JPanel();
		a6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		a6.setBorder(new LineBorder(new Color(0, 0, 0)));
		a6.setBackground(Color.GRAY);
		GridBagConstraints gbc_a6 = new GridBagConstraints();
		gbc_a6.fill = GridBagConstraints.BOTH;
		gbc_a6.insets = new Insets(0, 0, 5, 5);
		gbc_a6.gridx = 0;
		gbc_a6.gridy = 2;
		board.add(a6, gbc_a6);

		JPanel b6 = new JPanel();
		b6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		b6.setBorder(new LineBorder(new Color(0, 0, 0)));
		b6.setBackground(Color.WHITE);
		GridBagConstraints gbc_b6 = new GridBagConstraints();
		gbc_b6.fill = GridBagConstraints.BOTH;
		gbc_b6.insets = new Insets(0, 0, 5, 5);
		gbc_b6.gridx = 1;
		gbc_b6.gridy = 2;
		board.add(b6, gbc_b6);

		JPanel c6 = new JPanel();
		c6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		c6.setBorder(new LineBorder(new Color(0, 0, 0)));
		c6.setBackground(Color.GRAY);
		GridBagConstraints gbc_c6 = new GridBagConstraints();
		gbc_c6.fill = GridBagConstraints.BOTH;
		gbc_c6.insets = new Insets(0, 0, 5, 5);
		gbc_c6.gridx = 2;
		gbc_c6.gridy = 2;
		board.add(c6, gbc_c6);

		JPanel d6 = new JPanel();
		d6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		d6.setBorder(new LineBorder(new Color(0, 0, 0)));
		d6.setBackground(Color.WHITE);
		GridBagConstraints gbc_d6 = new GridBagConstraints();
		gbc_d6.fill = GridBagConstraints.BOTH;
		gbc_d6.insets = new Insets(0, 0, 5, 5);
		gbc_d6.gridx = 3;
		gbc_d6.gridy = 2;
		board.add(d6, gbc_d6);

		JPanel e6 = new JPanel();
		e6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		e6.setBorder(new LineBorder(new Color(0, 0, 0)));
		e6.setBackground(Color.GRAY);
		GridBagConstraints gbc_e6 = new GridBagConstraints();
		gbc_e6.fill = GridBagConstraints.BOTH;
		gbc_e6.insets = new Insets(0, 0, 5, 5);
		gbc_e6.gridx = 4;
		gbc_e6.gridy = 2;
		board.add(e6, gbc_e6);

		JPanel f6 = new JPanel();
		f6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		f6.setBorder(new LineBorder(new Color(0, 0, 0)));
		f6.setBackground(Color.WHITE);
		GridBagConstraints gbc_f6 = new GridBagConstraints();
		gbc_f6.fill = GridBagConstraints.BOTH;
		gbc_f6.insets = new Insets(0, 0, 5, 5);
		gbc_f6.gridx = 5;
		gbc_f6.gridy = 2;
		board.add(f6, gbc_f6);

		JPanel g6 = new JPanel();
		g6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		g6.setBorder(new LineBorder(new Color(0, 0, 0)));
		g6.setBackground(Color.GRAY);
		GridBagConstraints gbc_g6 = new GridBagConstraints();
		gbc_g6.fill = GridBagConstraints.BOTH;
		gbc_g6.insets = new Insets(0, 0, 5, 5);
		gbc_g6.gridx = 6;
		gbc_g6.gridy = 2;
		board.add(g6, gbc_g6);

		JPanel h6 = new JPanel();
		h6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		h6.setBorder(new LineBorder(new Color(0, 0, 0)));
		h6.setBackground(Color.WHITE);
		GridBagConstraints gbc_h6 = new GridBagConstraints();
		gbc_h6.fill = GridBagConstraints.BOTH;
		gbc_h6.insets = new Insets(0, 0, 5, 0);
		gbc_h6.gridx = 7;
		gbc_h6.gridy = 2;
		board.add(h6, gbc_h6);

		JPanel a5 = new JPanel();
		a5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		a5.setBorder(new LineBorder(new Color(0, 0, 0)));
		a5.setBackground(Color.WHITE);
		GridBagConstraints gbc_a5 = new GridBagConstraints();
		gbc_a5.fill = GridBagConstraints.BOTH;
		gbc_a5.insets = new Insets(0, 0, 5, 5);
		gbc_a5.gridx = 0;
		gbc_a5.gridy = 3;
		board.add(a5, gbc_a5);

		JPanel b5 = new JPanel();
		b5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		b5.setBorder(new LineBorder(new Color(0, 0, 0)));
		b5.setBackground(Color.GRAY);
		GridBagConstraints gbc_b5 = new GridBagConstraints();
		gbc_b5.fill = GridBagConstraints.BOTH;
		gbc_b5.insets = new Insets(0, 0, 5, 5);
		gbc_b5.gridx = 1;
		gbc_b5.gridy = 3;
		board.add(b5, gbc_b5);

		JPanel c5 = new JPanel();
		c5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		c5.setBorder(new LineBorder(new Color(0, 0, 0)));
		c5.setBackground(Color.WHITE);
		GridBagConstraints gbc_c5 = new GridBagConstraints();
		gbc_c5.fill = GridBagConstraints.BOTH;
		gbc_c5.insets = new Insets(0, 0, 5, 5);
		gbc_c5.gridx = 2;
		gbc_c5.gridy = 3;
		board.add(c5, gbc_c5);

		JPanel d5 = new JPanel();
		d5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		d5.setBorder(new LineBorder(new Color(0, 0, 0)));
		d5.setBackground(Color.GRAY);
		GridBagConstraints gbc_d5 = new GridBagConstraints();
		gbc_d5.fill = GridBagConstraints.BOTH;
		gbc_d5.insets = new Insets(0, 0, 5, 5);
		gbc_d5.gridx = 3;
		gbc_d5.gridy = 3;
		board.add(d5, gbc_d5);

		JPanel e5 = new JPanel();
		e5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		e5.setBorder(new LineBorder(new Color(0, 0, 0)));
		e5.setBackground(Color.WHITE);
		GridBagConstraints gbc_e5 = new GridBagConstraints();
		gbc_e5.fill = GridBagConstraints.BOTH;
		gbc_e5.insets = new Insets(0, 0, 5, 5);
		gbc_e5.gridx = 4;
		gbc_e5.gridy = 3;
		board.add(e5, gbc_e5);

		JPanel f5 = new JPanel();
		f5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		f5.setBorder(new LineBorder(new Color(0, 0, 0)));
		f5.setBackground(Color.GRAY);
		GridBagConstraints gbc_f5 = new GridBagConstraints();
		gbc_f5.fill = GridBagConstraints.BOTH;
		gbc_f5.insets = new Insets(0, 0, 5, 5);
		gbc_f5.gridx = 5;
		gbc_f5.gridy = 3;
		board.add(f5, gbc_f5);

		JPanel g5 = new JPanel();
		g5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		g5.setBorder(new LineBorder(new Color(0, 0, 0)));
		g5.setBackground(Color.WHITE);
		GridBagConstraints gbc_g5 = new GridBagConstraints();
		gbc_g5.fill = GridBagConstraints.BOTH;
		gbc_g5.insets = new Insets(0, 0, 5, 5);
		gbc_g5.gridx = 6;
		gbc_g5.gridy = 3;
		board.add(g5, gbc_g5);

		JPanel h5 = new JPanel();
		h5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		h5.setBorder(new LineBorder(new Color(0, 0, 0)));
		h5.setBackground(Color.GRAY);
		GridBagConstraints gbc_h5 = new GridBagConstraints();
		gbc_h5.fill = GridBagConstraints.BOTH;
		gbc_h5.insets = new Insets(0, 0, 5, 0);
		gbc_h5.gridx = 7;
		gbc_h5.gridy = 3;
		board.add(h5, gbc_h5);

		JPanel a4 = new JPanel();
		a4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		a4.setBorder(new LineBorder(new Color(0, 0, 0)));
		a4.setBackground(Color.GRAY);
		GridBagConstraints gbc_a4 = new GridBagConstraints();
		gbc_a4.fill = GridBagConstraints.BOTH;
		gbc_a4.insets = new Insets(0, 0, 5, 5);
		gbc_a4.gridx = 0;
		gbc_a4.gridy = 4;
		board.add(a4, gbc_a4);

		JPanel b4 = new JPanel();
		b4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		b4.setBorder(new LineBorder(new Color(0, 0, 0)));
		b4.setBackground(Color.WHITE);
		GridBagConstraints gbc_b4 = new GridBagConstraints();
		gbc_b4.fill = GridBagConstraints.BOTH;
		gbc_b4.insets = new Insets(0, 0, 5, 5);
		gbc_b4.gridx = 1;
		gbc_b4.gridy = 4;
		board.add(b4, gbc_b4);

		JPanel c4 = new JPanel();
		c4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		c4.setBorder(new LineBorder(new Color(0, 0, 0)));
		c4.setBackground(Color.GRAY);
		GridBagConstraints gbc_c4 = new GridBagConstraints();
		gbc_c4.fill = GridBagConstraints.BOTH;
		gbc_c4.insets = new Insets(0, 0, 5, 5);
		gbc_c4.gridx = 2;
		gbc_c4.gridy = 4;
		board.add(c4, gbc_c4);

		JPanel d4 = new JPanel();
		d4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		d4.setBorder(new LineBorder(new Color(0, 0, 0)));
		d4.setBackground(Color.WHITE);
		GridBagConstraints gbc_d4 = new GridBagConstraints();
		gbc_d4.fill = GridBagConstraints.BOTH;
		gbc_d4.insets = new Insets(0, 0, 5, 5);
		gbc_d4.gridx = 3;
		gbc_d4.gridy = 4;
		board.add(d4, gbc_d4);

		JPanel e4 = new JPanel();
		e4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		e4.setBorder(new LineBorder(new Color(0, 0, 0)));
		e4.setBackground(Color.GRAY);
		GridBagConstraints gbc_e4 = new GridBagConstraints();
		gbc_e4.fill = GridBagConstraints.BOTH;
		gbc_e4.insets = new Insets(0, 0, 5, 5);
		gbc_e4.gridx = 4;
		gbc_e4.gridy = 4;
		board.add(e4, gbc_e4);

		JPanel f4 = new JPanel();
		f4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		f4.setBorder(new LineBorder(new Color(0, 0, 0)));
		f4.setBackground(Color.WHITE);
		GridBagConstraints gbc_f4 = new GridBagConstraints();
		gbc_f4.fill = GridBagConstraints.BOTH;
		gbc_f4.insets = new Insets(0, 0, 5, 5);
		gbc_f4.gridx = 5;
		gbc_f4.gridy = 4;
		board.add(f4, gbc_f4);

		JPanel g4 = new JPanel();
		g4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		g4.setBorder(new LineBorder(new Color(0, 0, 0)));
		g4.setBackground(Color.GRAY);
		GridBagConstraints gbc_g4 = new GridBagConstraints();
		gbc_g4.fill = GridBagConstraints.BOTH;
		gbc_g4.insets = new Insets(0, 0, 5, 5);
		gbc_g4.gridx = 6;
		gbc_g4.gridy = 4;
		board.add(g4, gbc_g4);

		JPanel h4 = new JPanel();
		h4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		h4.setBorder(new LineBorder(new Color(0, 0, 0)));
		h4.setBackground(Color.WHITE);
		GridBagConstraints gbc_h4 = new GridBagConstraints();
		gbc_h4.fill = GridBagConstraints.BOTH;
		gbc_h4.insets = new Insets(0, 0, 5, 0);
		gbc_h4.gridx = 7;
		gbc_h4.gridy = 4;
		board.add(h4, gbc_h4);

		JPanel a3 = new JPanel();
		a3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		a3.setBorder(new LineBorder(new Color(0, 0, 0)));
		a3.setBackground(Color.WHITE);
		GridBagConstraints gbc_a3 = new GridBagConstraints();
		gbc_a3.fill = GridBagConstraints.BOTH;
		gbc_a3.insets = new Insets(0, 0, 5, 5);
		gbc_a3.gridx = 0;
		gbc_a3.gridy = 5;
		board.add(a3, gbc_a3);

		JPanel b3 = new JPanel();
		b3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		b3.setBorder(new LineBorder(new Color(0, 0, 0)));
		b3.setBackground(Color.GRAY);
		GridBagConstraints gbc_b3 = new GridBagConstraints();
		gbc_b3.fill = GridBagConstraints.BOTH;
		gbc_b3.insets = new Insets(0, 0, 5, 5);
		gbc_b3.gridx = 1;
		gbc_b3.gridy = 5;
		board.add(b3, gbc_b3);

		JPanel c3 = new JPanel();
		c3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		c3.setBorder(new LineBorder(new Color(0, 0, 0)));
		c3.setBackground(Color.WHITE);
		GridBagConstraints gbc_c3 = new GridBagConstraints();
		gbc_c3.fill = GridBagConstraints.BOTH;
		gbc_c3.insets = new Insets(0, 0, 5, 5);
		gbc_c3.gridx = 2;
		gbc_c3.gridy = 5;
		board.add(c3, gbc_c3);

		JPanel d3 = new JPanel();
		d3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		d3.setBorder(new LineBorder(new Color(0, 0, 0)));
		d3.setBackground(Color.GRAY);
		GridBagConstraints gbc_d3 = new GridBagConstraints();
		gbc_d3.fill = GridBagConstraints.BOTH;
		gbc_d3.insets = new Insets(0, 0, 5, 5);
		gbc_d3.gridx = 3;
		gbc_d3.gridy = 5;
		board.add(d3, gbc_d3);

		JPanel e3 = new JPanel();
		e3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		e3.setBorder(new LineBorder(new Color(0, 0, 0)));
		e3.setBackground(Color.WHITE);
		GridBagConstraints gbc_e3 = new GridBagConstraints();
		gbc_e3.fill = GridBagConstraints.BOTH;
		gbc_e3.insets = new Insets(0, 0, 5, 5);
		gbc_e3.gridx = 4;
		gbc_e3.gridy = 5;
		board.add(e3, gbc_e3);

		JPanel f3 = new JPanel();
		f3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		f3.setBorder(new LineBorder(new Color(0, 0, 0)));
		f3.setBackground(Color.GRAY);
		GridBagConstraints gbc_f3 = new GridBagConstraints();
		gbc_f3.fill = GridBagConstraints.BOTH;
		gbc_f3.insets = new Insets(0, 0, 5, 5);
		gbc_f3.gridx = 5;
		gbc_f3.gridy = 5;
		board.add(f3, gbc_f3);

		JPanel g3 = new JPanel();
		g3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		g3.setBorder(new LineBorder(new Color(0, 0, 0)));
		g3.setBackground(Color.WHITE);
		GridBagConstraints gbc_g3 = new GridBagConstraints();
		gbc_g3.fill = GridBagConstraints.BOTH;
		gbc_g3.insets = new Insets(0, 0, 5, 5);
		gbc_g3.gridx = 6;
		gbc_g3.gridy = 5;
		board.add(g3, gbc_g3);

		JPanel h3 = new JPanel();
		h3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		h3.setBorder(new LineBorder(new Color(0, 0, 0)));
		h3.setBackground(Color.GRAY);
		GridBagConstraints gbc_h3 = new GridBagConstraints();
		gbc_h3.fill = GridBagConstraints.BOTH;
		gbc_h3.insets = new Insets(0, 0, 5, 0);
		gbc_h3.gridx = 7;
		gbc_h3.gridy = 5;
		board.add(h3, gbc_h3);

		JPanel a2 = new JPanel();
		a2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
			@Override
			public void mousePressed(MouseEvent e) {
				test2=(JLabel) ((JPanel) e.getComponent()).getComponent(0);
				((JPanel) e.getComponent()).removeAll();
				((JPanel) e.getComponent()).invalidate();
			}
		});
		a2.setBorder(new LineBorder(new Color(0, 0, 0)));
		a2.setBackground(Color.GRAY);
		GridBagConstraints gbc_a2 = new GridBagConstraints();
		gbc_a2.fill = GridBagConstraints.BOTH;
		gbc_a2.insets = new Insets(0, 0, 5, 5);
		gbc_a2.gridx = 0;
		gbc_a2.gridy = 6;
		board.add(a2, gbc_a2);
		
		JLabel br1 = new JLabel("WB");
		a2.add(br1);

		JPanel b2 = new JPanel();
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		b2.setBorder(new LineBorder(new Color(0, 0, 0)));
		b2.setBackground(Color.WHITE);
		GridBagConstraints gbc_b2 = new GridBagConstraints();
		gbc_b2.fill = GridBagConstraints.BOTH;
		gbc_b2.insets = new Insets(0, 0, 5, 5);
		gbc_b2.gridx = 1;
		gbc_b2.gridy = 6;
		board.add(b2, gbc_b2);
		
		JLabel br2 = new JLabel("WB");
		b2.add(br2);

		JPanel c2 = new JPanel();
		c2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		c2.setBorder(new LineBorder(new Color(0, 0, 0)));
		c2.setBackground(Color.GRAY);
		GridBagConstraints gbc_c2 = new GridBagConstraints();
		gbc_c2.fill = GridBagConstraints.BOTH;
		gbc_c2.insets = new Insets(0, 0, 5, 5);
		gbc_c2.gridx = 2;
		gbc_c2.gridy = 6;
		board.add(c2, gbc_c2);
		
		JLabel br3 = new JLabel("WB");
		c2.add(br3);

		JPanel d2 = new JPanel();
		d2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		d2.setBorder(new LineBorder(new Color(0, 0, 0)));
		d2.setBackground(Color.WHITE);
		GridBagConstraints gbc_d2 = new GridBagConstraints();
		gbc_d2.fill = GridBagConstraints.BOTH;
		gbc_d2.insets = new Insets(0, 0, 5, 5);
		gbc_d2.gridx = 3;
		gbc_d2.gridy = 6;
		board.add(d2, gbc_d2);
		
		JLabel br4 = new JLabel("WB");
		d2.add(br4);

		JPanel e2 = new JPanel();
		e2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		e2.setBorder(new LineBorder(new Color(0, 0, 0)));
		e2.setBackground(Color.GRAY);
		GridBagConstraints gbc_e2 = new GridBagConstraints();
		gbc_e2.fill = GridBagConstraints.BOTH;
		gbc_e2.insets = new Insets(0, 0, 5, 5);
		gbc_e2.gridx = 4;
		gbc_e2.gridy = 6;
		board.add(e2, gbc_e2);
		
		JLabel br5 = new JLabel("WB");
		e2.add(br5);

		JPanel f2 = new JPanel();
		f2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		f2.setBorder(new LineBorder(new Color(0, 0, 0)));
		f2.setBackground(Color.WHITE);
		GridBagConstraints gbc_f2 = new GridBagConstraints();
		gbc_f2.fill = GridBagConstraints.BOTH;
		gbc_f2.insets = new Insets(0, 0, 5, 5);
		gbc_f2.gridx = 5;
		gbc_f2.gridy = 6;
		board.add(f2, gbc_f2);
		
		JLabel br6 = new JLabel("WB");
		f2.add(br6);

		JPanel g2 = new JPanel();
		g2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		g2.setBorder(new LineBorder(new Color(0, 0, 0)));
		g2.setBackground(Color.GRAY);
		GridBagConstraints gbc_g2 = new GridBagConstraints();
		gbc_g2.fill = GridBagConstraints.BOTH;
		gbc_g2.insets = new Insets(0, 0, 5, 5);
		gbc_g2.gridx = 6;
		gbc_g2.gridy = 6;
		board.add(g2, gbc_g2);
		
		JLabel br7 = new JLabel("WB");
		g2.add(br7);

		JPanel h2 = new JPanel();
		h2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		h2.setBorder(new LineBorder(new Color(0, 0, 0)));
		h2.setBackground(Color.WHITE);
		GridBagConstraints gbc_h2 = new GridBagConstraints();
		gbc_h2.fill = GridBagConstraints.BOTH;
		gbc_h2.insets = new Insets(0, 0, 5, 0);
		gbc_h2.gridx = 7;
		gbc_h2.gridy = 6;
		board.add(h2, gbc_h2);
		
		JLabel br8 = new JLabel("WB");
		h2.add(br8);

		JPanel a1 = new JPanel();
		JLabel wtl = new JLabel("WT");
		a1.add(wtl);
		a1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		a1.setBorder(new LineBorder(new Color(0, 0, 0)));
		a1.setBackground(Color.WHITE);
		GridBagConstraints gbc_a1 = new GridBagConstraints();
		gbc_a1.fill = GridBagConstraints.BOTH;
		gbc_a1.insets = new Insets(0, 0, 0, 5);
		gbc_a1.gridx = 0;
		gbc_a1.gridy = 7;
		board.add(a1, gbc_a1);
		
		

		JPanel b1 = new JPanel();
		JLabel wsl = new JLabel("WS");
		b1.add(wsl);
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		b1.setBorder(new LineBorder(new Color(0, 0, 0)));
		b1.setBackground(Color.GRAY);
		GridBagConstraints gbc_b1 = new GridBagConstraints();
		gbc_b1.fill = GridBagConstraints.BOTH;
		gbc_b1.insets = new Insets(0, 0, 0, 5);
		gbc_b1.gridx = 1;
		gbc_b1.gridy = 7;
		board.add(b1, gbc_b1);
		
		

		JPanel c1 = new JPanel();
		c1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		c1.setBorder(new LineBorder(new Color(0, 0, 0)));
		c1.setBackground(Color.WHITE);
		GridBagConstraints gbc_c1 = new GridBagConstraints();
		gbc_c1.fill = GridBagConstraints.BOTH;
		gbc_c1.insets = new Insets(0, 0, 0, 5);
		gbc_c1.gridx = 2;
		gbc_c1.gridy = 7;
		board.add(c1, gbc_c1);
		
		JLabel wll = new JLabel("WL");
		c1.add(wll);

		JPanel d1 = new JPanel();
		d1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		d1.setBorder(new LineBorder(new Color(0, 0, 0)));
		d1.setBackground(Color.GRAY);
		GridBagConstraints gbc_d1 = new GridBagConstraints();
		gbc_d1.fill = GridBagConstraints.BOTH;
		gbc_d1.insets = new Insets(0, 0, 0, 5);
		gbc_d1.gridx = 3;
		gbc_d1.gridy = 7;
		board.add(d1, gbc_d1);
		
		JLabel wd = new JLabel("WD");
		d1.add(wd);

		JPanel e1 = new JPanel();
		e1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		e1.setBorder(new LineBorder(new Color(0, 0, 0)));
		e1.setBackground(Color.WHITE);
		GridBagConstraints gbc_e1 = new GridBagConstraints();
		gbc_e1.fill = GridBagConstraints.BOTH;
		gbc_e1.insets = new Insets(0, 0, 0, 5);
		gbc_e1.gridx = 4;
		gbc_e1.gridy = 7;
		board.add(e1, gbc_e1);
		
		JLabel wk = new JLabel("WK");
		e1.add(wk);

		JPanel f1 = new JPanel();
		f1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		f1.setBorder(new LineBorder(new Color(0, 0, 0)));
		f1.setBackground(Color.GRAY);
		GridBagConstraints gbc_f1 = new GridBagConstraints();
		gbc_f1.fill = GridBagConstraints.BOTH;
		gbc_f1.insets = new Insets(0, 0, 0, 5);
		gbc_f1.gridx = 5;
		gbc_f1.gridy = 7;
		board.add(f1, gbc_f1);
		
		JLabel wlr = new JLabel("WL");
		f1.add(wlr);

		JPanel g1 = new JPanel();
		g1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		g1.setBorder(new LineBorder(new Color(0, 0, 0)));
		g1.setBackground(Color.WHITE);
		GridBagConstraints gbc_g1 = new GridBagConstraints();
		gbc_g1.fill = GridBagConstraints.BOTH;
		gbc_g1.insets = new Insets(0, 0, 0, 5);
		gbc_g1.gridx = 6;
		gbc_g1.gridy = 7;
		board.add(g1, gbc_g1);
		
		JLabel wsr = new JLabel("WS");
		g1.add(wsr);

		JPanel h1 = new JPanel();
		h1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				move((JPanel) e.getComponent());
			}
		});
		h1.setBorder(new LineBorder(new Color(0, 0, 0)));
		h1.setBackground(Color.GRAY);
		GridBagConstraints gbc_h1 = new GridBagConstraints();
		gbc_h1.fill = GridBagConstraints.BOTH;
		gbc_h1.gridx = 7;
		gbc_h1.gridy = 7;
		board.add(h1, gbc_h1);
		
		JLabel wtr = new JLabel("WT");
		h1.add(wtr);

		JSplitPane splitPane = new JSplitPane();
		getContentPane().add(splitPane, BorderLayout.EAST);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);

		JPanel panel = new JPanel();
		splitPane.setLeftComponent(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 18, 0 };
		gbl_panel.rowHeights = new int[] { 0, 15, 0, 0, 0, 100, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblSb = new JLabel("SB");
		lblSb.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				test =((JLabel) e.getComponent()).getText();
			}
		});
		GridBagConstraints gbc_lblSb = new GridBagConstraints();
		gbc_lblSb.insets = new Insets(0, 0, 5, 0);
		gbc_lblSb.anchor = GridBagConstraints.NORTH;
		gbc_lblSb.gridx = 0;
		gbc_lblSb.gridy = 0;
		panel.add(lblSb, gbc_lblSb);

		JLabel lblSt = new JLabel("ST");
		lblSt.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				test =((JLabel) e.getComponent()).getText();
			}
		});
		GridBagConstraints gbc_lblSt = new GridBagConstraints();
		gbc_lblSt.insets = new Insets(0, 0, 5, 0);
		gbc_lblSt.anchor = GridBagConstraints.NORTH;
		gbc_lblSt.gridx = 0;
		gbc_lblSt.gridy = 1;
		panel.add(lblSt, gbc_lblSt);

		JLabel lblSs = new JLabel("SS");
		lblSs.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				test =((JLabel) e.getComponent()).getText();
			}
		});
		GridBagConstraints gbc_lblSs = new GridBagConstraints();
		gbc_lblSs.insets = new Insets(0, 0, 5, 0);
		gbc_lblSs.gridx = 0;
		gbc_lblSs.gridy = 2;
		panel.add(lblSs, gbc_lblSs);

		JLabel lblSl = new JLabel("SL");
		lblSl.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				test =((JLabel) e.getComponent()).getText();
			}
		});
		GridBagConstraints gbc_lblSl = new GridBagConstraints();
		gbc_lblSl.insets = new Insets(0, 0, 5, 0);
		gbc_lblSl.gridx = 0;
		gbc_lblSl.gridy = 3;
		panel.add(lblSl, gbc_lblSl);

		JLabel lblSk = new JLabel("SK");
		lblSk.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				test =((JLabel) e.getComponent()).getText();
			}
		});
		GridBagConstraints gbc_lblSk = new GridBagConstraints();
		gbc_lblSk.insets = new Insets(0, 0, 5, 0);
		gbc_lblSk.gridx = 0;
		gbc_lblSk.gridy = 4;
		panel.add(lblSk, gbc_lblSk);

		JLabel lblSd = new JLabel("SD");
		lblSd.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				test =((JLabel) e.getComponent()).getText();
			}
		});
		GridBagConstraints gbc_lblSd = new GridBagConstraints();
		gbc_lblSd.anchor = GridBagConstraints.NORTH;
		gbc_lblSd.gridx = 0;
		gbc_lblSd.gridy = 5;
		panel.add(lblSd, gbc_lblSd);

		JPanel panel_1 = new JPanel();
		splitPane.setRightComponent(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 39, 0 };
		gbl_panel_1.rowHeights = new int[] { 15, 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JLabel lblWb = new JLabel("WB");
		lblWb.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				test =((JLabel) e.getComponent()).getText();
			}
		});
		GridBagConstraints gbc_lblWb = new GridBagConstraints();
		gbc_lblWb.anchor = GridBagConstraints.NORTH;
		gbc_lblWb.insets = new Insets(0, 0, 5, 0);
		gbc_lblWb.gridx = 0;
		gbc_lblWb.gridy = 0;
		panel_1.add(lblWb, gbc_lblWb);

		JLabel label_8 = new JLabel("WT");
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				test =((JLabel) e.getComponent()).getText();
			}
		});
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.NORTH;
		gbc_label_8.insets = new Insets(0, 0, 5, 0);
		gbc_label_8.gridx = 0;
		gbc_label_8.gridy = 1;
		panel_1.add(label_8, gbc_label_8);

		JLabel label_9 = new JLabel("WS");
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				test =((JLabel) e.getComponent()).getText();
			}
		});
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.anchor = GridBagConstraints.NORTH;
		gbc_label_9.insets = new Insets(0, 0, 5, 0);
		gbc_label_9.gridx = 0;
		gbc_label_9.gridy = 2;
		panel_1.add(label_9, gbc_label_9);

		JLabel label_10 = new JLabel("WL");
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				test =((JLabel) e.getComponent()).getText();
			}
		});
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.anchor = GridBagConstraints.NORTH;
		gbc_label_10.insets = new Insets(0, 0, 5, 0);
		gbc_label_10.gridx = 0;
		gbc_label_10.gridy = 3;
		panel_1.add(label_10, gbc_label_10);

		JLabel label_11 = new JLabel("WK");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				test =((JLabel) e.getComponent()).getText();
			}
		});
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.anchor = GridBagConstraints.NORTH;
		gbc_label_11.insets = new Insets(0, 0, 5, 0);
		gbc_label_11.gridx = 0;
		gbc_label_11.gridy = 4;
		panel_1.add(label_11, gbc_label_11);

		JLabel label_12 = new JLabel("WD");
		label_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				test =((JLabel) e.getComponent()).getText();
			}
		});
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.anchor = GridBagConstraints.NORTH;
		gbc_label_12.gridx = 0;
		gbc_label_12.gridy = 5;
		panel_1.add(label_12, gbc_label_12);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmNewgame = new JMenuItem("NewGame");
		mnFile.add(mntmNewgame);
	}

}
