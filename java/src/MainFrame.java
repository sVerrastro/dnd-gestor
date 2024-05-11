import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel currentPanel;
    public JProgressBar progressBar;

    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Inizializza la barra di caricamento
        progressBar = new JProgressBar();
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        progressBar.setValue(0);

        // Aggiungi la barra di caricamento al frame
        setLayout(new BorderLayout());
        add(progressBar, BorderLayout.NORTH);

        JPanel initialPanel = new JPanel();
        JButton button = new JButton("--->");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Quando il bottone viene premuto, cambiare la schermata
                changePanel(new NewPanel(progressBar,button));
                // Aumenta il valore della barra di caricamento
                progressBar.setValue(progressBar.getValue() + 20); // Aumenta di un quinto
            }
        });
        initialPanel.add(button);

        // Imposta il pannello iniziale
        currentPanel = initialPanel;
        add(currentPanel, BorderLayout.CENTER);
    }

    private void changePanel(JPanel newPanel) {
        getContentPane().removeAll(); // Rimuovi tutti i componenti attuali
        currentPanel = newPanel;
        add(currentPanel, BorderLayout.CENTER);
        revalidate(); // Ricarica il contenuto
        repaint(); // Ridisegna la finestra
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame frame = new MainFrame();
                frame.setVisible(true);
            }
        });
    }
}

class NewPanel extends JPanel {
    public NewPanel(JProgressBar progressBar,JButton btn) {
        add(progressBar);
        add(btn);
    }
}