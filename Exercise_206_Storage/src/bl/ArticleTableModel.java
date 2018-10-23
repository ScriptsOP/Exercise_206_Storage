package bl;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ArticleTableModel extends AbstractTableModel {
    
    private ArrayList<Article> articles = new ArrayList<>();
    private String[] colNames = {"ID", "Description", "Amount", "Place"};

    public void add(Article a) {
        articles.add(a);
        fireTableRowsInserted(articles.size() - 1, articles.size() - 1);
    }
    
    public void remove(int index) {
        articles.remove(index);
        fireTableRowsDeleted(articles.size() - 1, articles.size() - 1);
    }
    
    @Override
    public int getRowCount() {
        return articles.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Article a = articles.get(rowIndex);
        return a;
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }
}
