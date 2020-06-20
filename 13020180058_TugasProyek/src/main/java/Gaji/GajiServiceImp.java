package Gaji;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 * @author ASUS-PC AprianiMagfira
 */
public class GajiServiceImp implements GajiService{
    @Override
    public void update(int id, gaji aku) {
    Datagaji.list.set(id, aku);
    }
    @Override
    public void insert(gaji aku) {
        Datagaji.list.add(aku);           
        JOptionPane.showMessageDialog(null, "Success");
    }
    @Override
    public void delete(int id) {
    Datagaji.list.remove(id);
    }
    @Override
    public DefaultTableModel tampil() {
    DefaultTableModel inp;
    String [] k = {"ID","NAMA","JENIS KELAMIN","JABATAN","No.Hp","ALAMAT","GAJI","LEMBUR","GAJI LEMBUR","TOTAL GAJI"};
    inp = new DefaultTableModel (null,k);
    for (gaji a : Datagaji.list){
    Object [] b = new Object [10];
    b [0] = a.getNik();
    b [1] = a.getNama();
    b [2] = a.getJk();
    b [3] = a.getJabatan();
    b [4] = a.getNohp();
    b [5] = a.getAlamat();
    b [6] = a.getGaji();
    b [7] = a.getLembur();
    b [8] = a.getGaji1();
    b [9] = a.getTot();
    
    inp.addRow(b);
    }
    return inp;
    }  
}
