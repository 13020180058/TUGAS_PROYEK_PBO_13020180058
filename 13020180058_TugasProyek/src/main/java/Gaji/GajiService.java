

package Gaji;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS-PC AprianiMagfira
 */
public interface GajiService {

    public void update(int id,gaji aku);
    public void insert (gaji aku);
    public void delete (int id);
    
    public DefaultTableModel tampil();
}
