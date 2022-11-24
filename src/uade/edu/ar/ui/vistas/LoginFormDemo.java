package uade.edu.ar.ui.vistas;
//importar clases y paquetes requeridos

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;


//crear la clase CreateLoginForm para crear el formulario de inicio de sesión
//la clase extiende JFrame para crear una ventana donde se agrega nuestro componente
//la clase implementa ActionListener para realizar una acción al hacer clic en un botón
class CreateLoginForm extends JFrame implements ActionListener
{
    //inicializar botón, panel, etiqueta y campo de texto
    JButton b1;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    final JTextField  textField1, textField2;

    //llamando al constructor
    CreateLoginForm()
    {

        //crear etiqueta para nombre de usuario
        userLabel = new JLabel();
        userLabel.setText("Username");      //establecer el valor de la etiqueta para textField1

        //crear campo de texto para obtener el nombre de usuario del usuario
        textField1 = new JTextField(15);    //establecer la longitud del texto![](C:/Users/tomas/AppData/Local/Temp/download.jpg)

        //crear etiqueta para contraseña
        passLabel = new JLabel();
        passLabel.setText("Password");      //establecer el valor de la etiqueta para textField2

        //crear campo de texto para obtener la contraseña del usuario
        textField2 = new JPasswordField(15);    //establecer la longitud de la contraseña

        //crear boton de enviar
        b1 = new JButton("SUBMIT"); //establece la etiqueta al botón

        //crear panel para poner elementos de formulario
        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(userLabel);    //establece la etiqueta de nombre de usuario en el panel
        newPanel.add(textField1);   //establece el campo de texto en el panel
        newPanel.add(passLabel);    //establece la etiqueta de contraseña en el panel
        newPanel.add(textField2);   //establece el campo de texto en el panel
        newPanel.add(b1);           //configura el boton en el panel

        //establece el borde del panel
        add(newPanel, BorderLayout.CENTER);

        //realizar la acción al hacer clic en el botón
        b1.addActionListener(this);     //añadir oyente de acción al botón
        setTitle("LOGIN FORM");         //establecer el título del formulario de inicio de sesión
    }

    //definir el método abstracto actionPerformed() que se llamará al hacer clic en el botón
    public void actionPerformed(ActionEvent ae)     //pasar el oyente de acción como parámetro
    {
        String userValue = textField1.getText();        //obtener el nombre de usuario ingresado por el usuario desde textField1
        String passValue = textField2.getText();        //obtener la contraseña ingresada por el usuario del textField2
        //comprobar si las credenciales son autenticas o no
        if (userValue.equals("test1@gmail.com") && passValue.equals("test")) {  //si es auténtico, lleva al usuario a una nueva página

            //crear instancia de NewPage
            NewPage page = new NewPage();

            //hacer que la página sea visible para el usuario
            page.setVisible(true);

            //crea una etiqueta de bienvenida y configúrala en la nueva página
            JLabel wel_label = new JLabel("Welcome: "+userValue);
            page.getContentPane().add(wel_label);
        }
        else{
            //mostrar mensaje de error
            System.out.println("Please enter valid username and password");
        }
    }
}
    //crear la clase principal
public class LoginFormDemo {
    //inicio del método main()
    public static void main(String arg[])
    {
        try
        {
            //crear instancia de CreateLoginForm
            CreateLoginForm form = new CreateLoginForm();
            form.setSize(300,100);  // establecer el tamaño del marco
            form.setVisible(true);  //hacer que el formulario sea visible para el usuario
        }
        catch(Exception e)
        {
            //manejar excepción
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }


}
