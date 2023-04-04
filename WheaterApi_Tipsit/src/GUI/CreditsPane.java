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
public class CreditsPane extends JPanel {

	/**
	 * Create the panel.
	 */
	public CreditsPane() {
		System.out.println("Pane CreditsCreated");
		this.setSize(1000, 600);
		setLayout(new MigLayout("", "[400:400:400][200:200:200][400:400:400]", "[25][30][20][25][25][25][25][25][25][25][25][25][25][25][25][85][20]"));
		
		JLabel Credits = new JLabel("Credits");
		Credits.setFont(new Font("Segoe UI", Font.BOLD, 18));
		add(Credits, "cell 1 1,alignx center,aligny center");
		
		JLabel lblGuiDesigneBy = new JLabel("GUI designed by Davide Biasuzzi");
		add(lblGuiDesigneBy, "cell 1 3,alignx center,aligny center");
		
		JLabel lblServerInteractionBy = new JLabel("Server interaction by Davide Biasuzzi");
		add(lblServerInteractionBy, "cell 1 4,alignx center,aligny center");
		
		JLabel lblXmlManagementBy = new JLabel("XML Management by Filippo Parovel");
		add(lblXmlManagementBy, "cell 1 5");
		
		JLabel lblWhatherStatsBy = new JLabel("Whather Stats by Filippo Parovel");
		add(lblWhatherStatsBy, "cell 1 6,alignx center,aligny center");
		
		JLabel lblNewLabel = new JLabel("XML managed with JAXB");
		add(lblNewLabel, "cell 1 9,alignx center,aligny center");
		
		JLabel lblflatdarklafLookandfeel = new JLabel("\"FlatDarkLaf\" LookAndFeel");
		add(lblflatdarklafLookandfeel, "cell 1 10,alignx center,aligny center");
		
		JLabel lblNewLabel_1 = new JLabel("API provided by WatherApi.com");
		add(lblNewLabel_1, "cell 1 11,alignx center,aligny center");
		
		JLabel lblNewLabel_2 = new JLabel("GitHub");
		add(lblNewLabel_2, "cell 1 14,alignx center,aligny center");
		
		JLabel lblNewLabel_3 = new JLabel("@biasuzzi-davide & @elparo290");
		add(lblNewLabel_3, "cell 1 15,alignx center,aligny top");
		
		JLabel lblNewLabel_4 = new JLabel("Software Version: Release Candidate");
		add(lblNewLabel_4, "cell 1 16,alignx center,aligny center");
		

		ImageIcon imageIcon = new ImageIcon("src/images/sole.png");
		Image image = imageIcon.getImage();
		Image newimg = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(newimg);
	}

}
