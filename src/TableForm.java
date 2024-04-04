import javax.swing.*;

public class TableForm {
    private JTable tableMhs;
    public JPanel panel1;
    private JScrollPane scrollPane;

    String[] columnNames = {"No", "Nama", "NIM", "Asal Kota"};
    Object[][] data = {
            {"1.", "Rina Septiani", "21051017", "Sukabumi"},
            {"2.", "Destria Al-Desyar", "21051028", "Bogor"},
            {"3.", "M.Syarifudin", "21051010", "Sukabumi"},
            {"4.", "Ghaida Sandie Hayatus Sahla", "21051044", "Bandung"},
            {"5.", "Muhammad Ikhsanudin", "21051057", "Bogor"},
            {"6.", "Rahadi Ramlan", "21051015", "Sukabumi"},
            {"7.", "Consinta Margaretha Bhei", "21051027", "Bogor"},
            {"8.", "Sahrul Maulana", "21051019", "Sukabumi"},
            {"9.", "Neneng Yuli Purbayanti", "21051109", "Sukabumi"},
            {"10.", "Nuri Maladewi", "21051111", "Bandung"},
    };

    public TableForm() {
        // Buat tabel dengan data
        tableMhs = new JTable(data, columnNames);

        // Buat scroll pane untuk tabel
        scrollPane = new JScrollPane(tableMhs);
        tableMhs.setFillsViewportHeight(true);

        // Buat panel dan tambahkan scroll pane ke dalamnya
        panel1 = new JPanel();
        panel1.add(scrollPane);
    }
}
