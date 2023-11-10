import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private static JButton jButton = new JButton();
    private static JLabel jLabel = new JLabel();

    private static Timer timer;
    private static boolean stateEnabled = true;

    public Main() {
        JPanel jPanel = new JPanel();
        ListenAction listenAction = new ListenAction();

        this.setTitle("SwingTick");
        this.setSize(300, 150);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);

        jButton = new JButton("Start");
        jButton.addActionListener(listenAction);
        jButton.setVisible(true);

        jLabel = new JLabel("Text will appear here");
        jButton.setVisible(true);

        jPanel.add(jButton);
        jPanel.add(jLabel);
        this.add(jPanel);

        timer = new Timer(1000, listenAction);
    }

    public static void main(String[] args) {
        new Main();
    }

    public static class ListenAction implements ActionListener {
        private static boolean tick = true;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jButton) {
                stateEnabled = !stateEnabled;
                jButton.setText(jButton.getText().equals("Start") ? "Stop" : "Start");

                if (stateEnabled) {
                    timer.stop();
                    return;
                } else {
                    timer.start();
                }
            }

            jLabel.setText((tick ? "Tick" : "Tok"));
            tick = !tick;
        }
    }
}
