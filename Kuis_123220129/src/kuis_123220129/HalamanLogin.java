/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220129;

/**
 *
 * @author ASUS Vivobook
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class HalamanLogin extends JFrame implements ActionListener {
    JLabel judulgd = new JLabel ("Halo Mahasiswa UPNVY");
    JLabel judulkcl = new JLabel ("Selamat Datang di Spada");
    JLabel username = new JLabel ("Nama Mahasiswa");
    JLabel nim = new JLabel ("NIM");
    JTextField inputusername = new JTextField();
    JTextField inputnim = new JTextField();
    JButton login = new JButton ("Masuk");

    HalamanLogin(){
        setVisible(true);
        setSize(550, 550);
        setTitle("Login");
        setDefaultCloseOperation
        (JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add(judulgd);
        judulgd.setFont(judulgd.getFont().deriveFont(30.0F));
        judulgd.setBounds(100, 40, 400, 45);
        
        add(judulkcl);
        judulkcl.setFont(judulkcl.getFont().deriveFont(20.0F));
        judulkcl.setBounds(150, 70, 300, 45);
        
        add(username);
        add(nim);
        add(inputusername);
        add(inputnim);
        add(login);
        
        username.setBounds(40, 130, 200, 50);
        inputusername.setBounds(40, 170, 450, 35);
        username.setFont(username.getFont().deriveFont(17.0F));
        
        nim.setBounds(40, 220, 50, 50);
        inputnim.setBounds(40, 260, 450, 35);
        nim.setFont(nim.getFont().deriveFont(17.0F));
        
        login.setBounds(40, 390, 450, 35);
        login.setFont(login.getFont().deriveFont(17.0F));
        login.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String username = inputusername.getText();
            String pass = inputnim.getText();
        
            if(username.isEmpty() || pass.isEmpty()){
                throw new Exception ("Gaboleh ada yang kosong yh, harus diisi");
            }
        
            new FirstPageImpl(username);
            this.dispose();
        } catch (Exception error){
            JOptionPane.showMessageDialog(null, error.getMessage());
        }
        
    }

    private static class FirstPageImpl extends FirstPage {

        public FirstPageImpl(String username) {
           
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            throw new UnsupportedOperationException("Gk support"); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    
}
