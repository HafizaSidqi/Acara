
package acara;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Controller {
    Model model;
    Tampilan tampilan;
    
    public Controller(Model model, Tampilan tampilan) {
        this.model = model;
        this.tampilan = tampilan;
        
        if(model.getBanyakData()!= 0){
            String datafilm[][]= model.readFilm();
            tampilan.tabel.setModel((new JTable(datafilm, tampilan.namakolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
    
        /*tampilan.btncreate.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        if(tampilan.getjudul().equals("")
        ||tampilan.gettipe().equals("")
        ||tampilan.getepisode().equals("")
        ||tampilan.getgenre().equals("")
        ||tampilan.getstatus().equals("")
        ||tampilan.getrating().equals("")) {
        JOptionPane.showMessageDialog(null, "Field Tidak Boleh Kosong");
        } else {
        String id = null;
        String judul = tampilan.getjudul();
        String tipe = tampilan.gettipe();
        String episode = tampilan.getepisode();
        String genre = tampilan.getgenre();
        String status = tampilan.getstatus();
        String rating = tampilan.getrating();
        
        model.insertFilm(id, judul, tipe, episode, genre, status, rating);
        tampilan.fjudul.setText("");
        tampilan.ftipe.setText("");
        tampilan.fepisode.setText("");
        tampilan.fgenre.setText("");
        tampilan.fstatus.setText("");
        tampilan.frating.setText("");       //untuk menampilkan output langsung tanpa reload
        
        String datafilm[][] = modelfilm.readFilm();
        tampilan.tabel.setModel(new JTable(datafilm, tampilan.namakolom).getModel());
        }
        }
        });*/
       tampilan.tabel.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e) {
            int baris = tampilan.tabel.getSelectedRow();
            int kolom = tampilan.tabel.getSelectedColumn();     //mengambil nama ang ada di kolom index
            
            String dataterpilih = tampilan.tabel.getValueAt(baris, 0).toString();
            
            System.out.println(dataterpilih);
            
            /*
            int input = JOptionPane.showConfirmDialog(null, "Apa anda ingin menghapus NIM "+dataterpilih+"?", "Pilih Opsi...", JOptionPane.YES_NO_CANCEL_OPTION);
            
            if(input == 0 ) {
            modelfilm.deleteFilm(dataterpilih);
            
            //untuk menampilkan output langsung tanpa reload
            
            String datafilm[][] = modelfilm.readFilm();
            tampilan.tabel.setModel(new JTable(datafilm, tampilan.namakolom).getModel());
            } else {
            JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
            }//konfirmasi untuk menghapus*/
           
        }
    });
    }
}
