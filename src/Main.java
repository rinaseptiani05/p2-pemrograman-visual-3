import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // 1. Buat JFrame
        JFrame jFrame = new JFrame("Data Mahasiswa");

        // 2. set content pane
        jFrame.setContentPane(new TableForm().panel1);

        // 3. set jika tombol x di klik
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setSize(800, 800);

        jFrame.setVisible(true);
    }
}
