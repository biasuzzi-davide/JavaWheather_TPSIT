package GUI;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Label;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import java.awt.Font;
import javax.swing.JTextPane;
public class HistoryPane extends JPanel {

	/**
	 * Create the panel.
	 */
	public HistoryPane() {
		this.setSize(1000, 600);
		setLayout(new MigLayout("", "[15:15:15][100:100:100,grow][100:100:100,grow][100:100:100,grow][100:100:100][100:100:100][100:100:100][100:100:100,grow][100:100:100][100:100:100,grow][25:25:25]", "[25][30][20][50][20][25][][][grow]"));
		
		JLabel lblMercoledi = new JLabel("Mercoledi");
		lblMercoledi.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblMercoledi.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMercoledi.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblMercoledi, "cell 1 1,alignx center,aligny center");
		
		JLabel lblGiovedi = new JLabel("Giovedi");
		lblGiovedi.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblGiovedi.setHorizontalTextPosition(SwingConstants.CENTER);
		lblGiovedi.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblGiovedi, "cell 3 1,alignx center,aligny center");
		
		JLabel lblVenerdi = new JLabel("Venerdi");
		lblVenerdi.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblVenerdi.setHorizontalAlignment(SwingConstants.CENTER);
		lblVenerdi.setHorizontalTextPosition(SwingConstants.CENTER);
		add(lblVenerdi, "cell 5 1,alignx center,aligny center");
		
		JLabel lblSabato = new JLabel("Sabato");
		lblSabato.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblSabato.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSabato.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblSabato, "cell 7 1,alignx center,aligny center");
		

		ImageIcon imageIcon = new ImageIcon("src/images/sole.png");
		Image image = imageIcon.getImage();
		Image newimg = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(newimg);
		
		JLabel lblDomenica = new JLabel("Domenica");
		lblDomenica.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblDomenica.setHorizontalAlignment(SwingConstants.CENTER);
		lblDomenica.setHorizontalTextPosition(SwingConstants.CENTER);
		add(lblDomenica, "cell 9 1,alignx center,aligny center");
		 
		JLabel iconLabel_day1 = new JLabel(imageIcon);
//		iconLabel.setMinimumSize(new Dimension(200, 200));
//		iconLabel.setMaximumSize(new Dimension(200, 200));
		add(iconLabel_day1, "cell 1 3,alignx center,aligny center");
		
		JLabel iconLabel_day2 = new JLabel(imageIcon);
		add(iconLabel_day2, "cell 3 3,alignx center,aligny center");
		
		JLabel iconLabel_day3 = new JLabel(imageIcon);
		add(iconLabel_day3, "cell 5 3,alignx center,aligny center");
		
		JLabel iconLabel_day4 = new JLabel(imageIcon);
		add(iconLabel_day4, "cell 7 3,alignx center,aligny center");
		
		JLabel iconLabel_day5 = new JLabel(imageIcon);
		add(iconLabel_day5, "cell 9 3,alignx center,aligny center");
		
		JLabel labelWh_day1 = new JLabel("Sunny");
		labelWh_day1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		add(labelWh_day1, "cell 1 5,alignx center,aligny center");
		
		JLabel labelWh_day2 = new JLabel("Sunny");
		labelWh_day2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		add(labelWh_day2, "cell 3 5,alignx center,aligny center");
		
		JLabel labelWh_day3 = new JLabel("Sunny");
		labelWh_day3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		add(labelWh_day3, "cell 5 5,alignx center,aligny center");
		
		JLabel labelWh_day4 = new JLabel("Sunny");
		labelWh_day4.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		add(labelWh_day4, "cell 7 5,alignx center,aligny center");
		
		JLabel labelWh_day5 = new JLabel("Sunny");
		labelWh_day5.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		add(labelWh_day5, "cell 9 5,alignx center,aligny center");
		
		JLabel lblTemp_day1 = new JLabel("18 C");
		lblTemp_day1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day1, "cell 1 6,alignx center,aligny center");
		
		JLabel lblTemp_day2 = new JLabel("18 C");
		lblTemp_day2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day2.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day2, "cell 3 6,alignx center,aligny center");
		
		JLabel lblTemp_day3 = new JLabel("18 C");
		lblTemp_day3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day3.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day3, "cell 5 6,alignx center,aligny center");
		
		JLabel lblTemp_day4 = new JLabel("18 C");
		lblTemp_day4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day4.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day4, "cell 7 6,growx,aligny center");
		
		JLabel lblTemp_day5 = new JLabel("18 C");
		lblTemp_day5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTemp_day5.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTemp_day5, "cell 9 6,growx");
		
		JTextPane mainText1 = new JTextPane();
		mainText1.setEditable(false);
		mainText1.setText("blallalalala\r\nbllalalalala\r\nblallalalala\r\nbllalalalaal\r\nblallalalala\r\nbllalalalala\r\nblallalalala\r\nbllalalalaal");
		add(mainText1, "cell 1 8,alignx center,growy");
		
		JTextPane mainText2 = new JTextPane();
		mainText2.setEditable(false);
		mainText2.setText("blallalalala\r\nbllalalalala\r\nblallalalala\r\nbllalalalaal\r\nblallalalala\r\nbllalalalala\r\nblallalalala\r\nbllalalalaal");
		add(mainText2, "cell 3 8,alignx center,aligny top");
		
		JTextPane mainText3 = new JTextPane();
		mainText3.setText("blallalalala\r\nbllalalalala\r\nblallalalala\r\nbllalalalaal\r\nblallalalala\r\nbllalalalala\r\nblallalalala\r\nbllalalalaal");
		mainText3.setEditable(false);
		add(mainText3, "cell 5 8,alignx center,aligny top");
		
		JTextPane mainText4 = new JTextPane();
		mainText4.setText("blallalalala\r\nbllalalalala\r\nblallalalala\r\nbllalalalaal\r\nblallalalala\r\nbllalalalala\r\nblallalalala\r\nbllalalalaal");
		mainText4.setEditable(false);
		add(mainText4, "cell 7 8,alignx center,aligny top");
		
		JTextPane mainText5 = new JTextPane();
		mainText5.setText("blallalalala\r\nbllalalalala\r\nblallalalala\r\nbllalalalaal\r\nblallalalala\r\nbllalalalala\r\nblallalalala\r\nbllalalalaal");
		mainText5.setEditable(false);
		add(mainText5, "cell 9 8,alignx center,aligny top");
	}

}
