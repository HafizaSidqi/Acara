
package acara;

public class MVC_Acara {
    //untuk menghubungkan 3 kelas view model dan controller
    Tampilan tampilan = new Tampilan();
    Model model = new Model();
    Controller controller = new Controller(model, tampilan);
}
