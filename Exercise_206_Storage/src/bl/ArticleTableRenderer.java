package bl;

import java.awt.Color;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class ArticleTableRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Article a = (Article) value;
        JLabel label = new JLabel();
        label.setOpaque(true);

        switch (column) {
            case 0:
                label.setText(a.getId() + "");
                break;
            case 1:
                label.setText(a.getDescription());
                break;
            case 2: {
                try {
                    label.setText(a.getAmount() + "");
                    if (a.getAmount() == 0) {
                        label.setBackground(Color.red);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
            break;

            case 3:
                label.setText(a.getPlace() + "");
                break;
        }
        return label;
    }

}
