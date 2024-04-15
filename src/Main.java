import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JFrame implements KeyListener {
    private JPanel MainPanel;

    /*
        ICONS
     */

    // Face
    ImageIcon faceid_grey =new ImageIcon("src/Graphics/faceid_grey.png");
    ImageIcon faceid_blue =new ImageIcon("src/Graphics/faceid_blue.png");
    ImageIcon faceid_green =new ImageIcon("src/Graphics/faceid_green.png");
    ImageIcon faceid_red =new ImageIcon("src/Graphics/faceid_red.png");

    // Fingerprint
    ImageIcon fingerprint_grey =new ImageIcon("src/Graphics/fingerprint_grey.png");
    ImageIcon fingerprint_blue =new ImageIcon("src/Graphics/fingerprint_blue.png");
    ImageIcon fingerprint_green =new ImageIcon("src/Graphics/fingerprint_green.png");
    ImageIcon fingerprint_red =new ImageIcon("src/Graphics/fingerprint_red.png");

    // RFID
    ImageIcon rfid_grey =new ImageIcon("src/Graphics/rfid_grey.png");
    ImageIcon rfid_blue =new ImageIcon("src/Graphics/rfid_blue.png");
    ImageIcon rfid_green =new ImageIcon("src/Graphics/rfid_green.png");
    ImageIcon rfid_red =new ImageIcon("src/Graphics/rfid_red.png");

    // Lock
    ImageIcon lock_grey =new ImageIcon("src/Graphics/lock_grey.png");
    ImageIcon lock_blue =new ImageIcon("src/Graphics/lock_blue.png");
    ImageIcon lock_green =new ImageIcon("src/Graphics/lock_green.png");
    ImageIcon lock_red =new ImageIcon("src/Graphics/lock_red.png");

    /* Buttons */
    JButton rfidButton = new JButton(rfid_green);
    JButton faceIDButton = new JButton(faceid_blue);

    JButton fingerprintButton = new JButton(fingerprint_blue);
    JButton lockButton = new JButton(lock_blue);

    JFrame f;


    public void keyTyped(KeyEvent e) {
        // Invoked when a key has been typed.
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public Main () {
        // Main Frame
        f = new JFrame();
        f.setSize(1200,740);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // RFID Button
        rfidButton.setBounds(475, 245, 250, 250);
        rfidButton.setBorderPainted(false);
        rfidButton.setContentAreaFilled(false);
        rfidButton.setFocusPainted(false);
        rfidButton.setOpaque(false);
        f.add(rfidButton);

        // Fingerprint Button
        fingerprintButton.setBounds(90, 245, 250, 250);
        fingerprintButton.setBorderPainted(false);
        fingerprintButton.setContentAreaFilled(false);
        fingerprintButton.setFocusPainted(false);
        fingerprintButton.setOpaque(false);
        f.add(fingerprintButton);

        // FaceID Button
        faceIDButton.setBounds(860, 245, 250, 250);
        faceIDButton.setBorderPainted(false);
        faceIDButton.setContentAreaFilled(false);
        faceIDButton.setFocusPainted(false);
        faceIDButton.setOpaque(false);
        f.add(faceIDButton);

    }

    public static void main(String[] args) {
        new Main();
    }
}
