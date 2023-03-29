import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;


public class Prova extends JPanel {
	private Image image;
	/**
	 * Create the panel.
	 */
	public Prova() {
		ImageIcon imageIcon = new ImageIcon("src/113.png");
		JLabel label = new JLabel(new ImageIcon("C:\\Users\\david\\Desktop\\Weather\\JavaWheather_TPSIT\\WheaterApi_Tipsit\\src\\pngtree-sun-icon-isolated-on-background-png-image_1790445.jpg"));
		this.add(label);
	}
    

    public static void main(String[] args) {
        JFrame frame = new JFrame("Esempio di pannello con immagine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Prova());
        frame.pack();
        frame.setVisible(true);
    }
}
