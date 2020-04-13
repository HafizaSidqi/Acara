
package acara;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Model {
        //mengkoneksikan database. Model berisi query2
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/praktikum_film";   //nama database
    static final String USER = "root";
    static final String PASS = "";
    
    Connection koneksi;
    Statement statement;        //untuk penggunaan query
    
    public Model(){
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    public String[][] readFilm() {      //dua dimensi(baris-kolom)
        try{
            int jmldata = 0;            //menampung jml data sebanyak jml data yang ada, default nya 0
            String data[][] = new String[getBanyakData()][7];   //menampung array, barisnya isinya di getBanyakData, kolomnya itu atribut
            String query = "Select * from `acara`";
            ResultSet resultset = statement.executeQuery(query);
            while(resultset.next()) {
                int id = resultset.getInt("id_acara");
                int episode = resultset.getInt("episode");
                int rating = resultset.getInt("rating");
                
                data[jmldata][0] = Integer.toString(id);
                data[jmldata][1] = resultset.getString("judul_acara");
                data[jmldata][2] = resultset.getString("tipe");
                data[jmldata][3] = Integer.toString(episode);
                data[jmldata][4] = resultset.getString("genre");
                data[jmldata][5] = resultset.getString("status");
                data[jmldata][6] = Integer.toString(rating);
            }
            return data;
        } catch(SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    public int getBanyakData() {
            int jmldata = 0;
            try{
                statement = (Statement)koneksi.createStatement();
                String query = "Select * from `acara`";
                ResultSet resultset = statement.executeQuery(query);
                while(resultset.next()) {
                    jmldata++;
                }
                return jmldata;
            } catch(SQLException e){
                System.out.println(e.getMessage());
                System.out.println("SQL Error");
                return 0;
            }
        }

}
