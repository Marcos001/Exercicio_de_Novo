

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Janela extends JFrame implements ActionListener{

	//propriedades separadas -------------------------
	
	String nome = "Marcos";
	String senha = "123";
	
	static int quantidade = 5;
	
	//propriedades da janela home = janela_home()
	
	JFrame janela = new JFrame();
	
	JFrame jah = new JFrame();
	
	JButton botao = new JButton(" Logar ");

	
	JLabel t_login = new JLabel(" Login "),
		   t_senha = new JLabel(" Senha "),
		   t_msg   = new JLabel(" Entar Perfil X-V");
	
	TextField tx_login = new TextField(), //-----------------***********************
			  tx_senha = new TextField(); //---------------************************
	
	//propriedades da janela de confirmação = janela_I()
	
	JButton bt_proximo = new JButton(" Proximo "),
			bt_sair    = new JButton(" Sair ");
	
	JLabel txt_decisao = new JLabel(" Deseja realmente cadastrar essas informações? ");
	


	//instancia da janela auxiliar
	
	Auxiliar a = new Auxiliar();
	
	
	//tentando fazer de uma forma que nao bugue
	
	public void actionPerformed(ActionEvent e){
		
		boolean clique = true;
		
		if(botao.hasFocus() == clique){
			if(nome.equals(tx_login.getText()) && senha.equals(tx_senha.getText())){
				janela_home(false);
				janela_I(true);//org
			}
		    else{
			JOptionPane.showMessageDialog(null,"Informacoes Invalidas!");
			janela_home(true);
		    }
		}
		
		else if(bt_proximo.hasFocus() == clique){
			a.janela_cadastro(true);
			janela_I(false);
		}
		else if(bt_sair.hasFocus() == clique){
			System.exit(0);
		}
		
	}
		
	
	//funcao de tela de Decisao
	
	public void janela_I(boolean a){
		
		txt_decisao.setBounds(20, 50, 400, 50);
		bt_proximo.setBounds(200,200,100,20);
		bt_sair.setBounds(40,200,100,20);

		jah.setLayout(null);
		jah.setTitle("Ja Acabou Jessica?");	
		jah.setVisible(a);
		jah.setDefaultCloseOperation(HIDE_ON_CLOSE);
		jah.setLocationRelativeTo(null);
		jah.setSize(400, 300);
		jah.add(txt_decisao);
	    jah.add(bt_proximo);
	    jah.add(bt_sair);
	    
	    bt_sair.addActionListener(this);
	    bt_proximo.addActionListener(this);
		
	}
	
	// janela principal
	
	public void janela_home(boolean a){
		
	
	    botao.setBounds(160,240,100,30);	
        t_login.setBounds(0, 70, 50, 20);
        t_senha.setBounds(0, 140, 60, 20);
        t_msg.setBounds(130, 10, 200, 20);
        tx_login.setBounds(60,70,260,30);
        tx_senha.setBounds(60,140,200,30);
        
	    
		janela.setLayout(null);
		janela.setTitle("Home");
		janela.setVisible(a);
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(400, 300);
		janela.add(botao);
		janela.add(t_login);
		janela.add(t_senha);
		janela.add(t_msg);
		janela.add(tx_login);
		janela.add(tx_senha);

		botao.addActionListener(this);
		
		
	}
	
}
