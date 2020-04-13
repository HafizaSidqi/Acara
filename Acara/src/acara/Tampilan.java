
package acara;

import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class Tampilan extends JFrame{       //tampilan
    JLabel lid = new JLabel("ID");
    public String fid;
    
    JLabel ljudul = new JLabel("Judul");
    JTextField fjudul = new JTextField();
    
    JLabel ltipe = new JLabel("Tipe");
    JTextField ftipe = new JTextField();
    
    JLabel lepisode = new JLabel("Episode");
    JTextField fepisode = new JTextField();
    
    JLabel lgenre = new JLabel("Genre");
    JTextField fgenre = new JTextField();
    
    JLabel lstatus = new JLabel("Status");
    JTextField fstatus = new JTextField();
    
    JLabel lrating = new JLabel("Rating");
    JTextField frating = new JTextField();
    
    JLabel lsearch = new JLabel("Search");
    JTextField fsearch = new JTextField();
    
    JButton btnrefresh = new JButton("Refresh");
    JButton btncreate = new JButton("Create");
    JButton btnupdate = new JButton("Update");
    JButton btndelete = new JButton("Delete");
    JButton btnexit = new JButton("Exit");
    
    JTable tabel;
    DefaultTableModel tablemodel;
    JScrollPane scrollpane;
    Object namakolom[] = {"#", "ID","Judul","Tipe","Episode","Genre","Status","Rating"};    //membuat kolom dengan array tipe objek
    
    public Tampilan() {
        tablemodel = new DefaultTableModel(namakolom,0);    //0 menandakan jumlah baris
        tabel = new JTable(tablemodel);                     //tabel merupakan variable untuk tabelnya dengan isi tablemodel
        scrollpane = new JScrollPane(tabel);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(950,600);
        
        //TABLE
        add(scrollpane);
        scrollpane.setBounds(50, 10, 800, 200);
        scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        //scrollpane nya vertical
        
        add(ljudul);
        ljudul.setBounds(50,230,90,20);
        add(fjudul);
        fjudul.setBounds(50,260,300,20);
        add(ltipe);
        ltipe.setBounds(50,290,90,20);
        add(ftipe);
        ftipe.setBounds(50,310,120,20);
        add(lepisode);
        lepisode.setBounds(50,330,90,20);
        add(fepisode);
        fepisode.setBounds(50,360,120,20);
        add(lgenre);
        lgenre.setBounds(50,390,90,20);
        add(fgenre);
        fgenre.setBounds(50,410,300,20);
        add(lstatus);
        lstatus.setBounds(220,290,90,20);
        add(fstatus);
        fstatus.setBounds(220,310,120,20);
        add(lrating);
        lrating.setBounds(220,330,120,20);
        add(frating);
        frating.setBounds(220,360,120,20);
        add(lsearch);
        lsearch.setBounds(420, 230, 90, 20);
        add(fsearch);
        fsearch.setBounds(420, 260, 200, 20);
        add(btnrefresh);
        btnrefresh.setBounds(400,410, 90, 20);
        add(btncreate);
        btncreate.setBounds(500,410, 90, 20);
        add(btnupdate);
        btnupdate.setBounds(600,410, 90, 20);
        add(btndelete);
        btndelete.setBounds(700,410, 90, 20);
        add(btnexit);
        btnexit.setBounds(800,410, 90, 20);
        
    }
    public String getid(){
        return fid; 
    }
    /*public void setid(String fid){
    this.fid = fid;
    }*/
    public String getjudul(){
        return fjudul.getText();
    }
    public String gettipe(){
        return ftipe.getText();
    }
    public String getepisode(){
        return fepisode.getText();
    }
    public String getgenre(){
        return fgenre.getText();
    }
    public String getstatus(){
        return fstatus.getText();
    }
    public String getrating(){
        return frating.getText();
    }
}
