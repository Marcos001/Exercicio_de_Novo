
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Auxiliar extends JFrame implements ActionListener {

	//variaveis da janela de confirmacao
	
	JFrame ja = new JFrame();
	
	JButton cancela = new JButton("Cancela"),
	confirma = new JButton("Confirma");
	JLabel msg_decisao = new JLabel("Deseja Salvar Seus Dados?");
	public boolean resposta;	
	
	//fim da declaracao das primeiras variaveis
	
	//*********************************************************
	
	//propriedades da janela de cadastro	= janela_II()
	
	boolean a;
	
	JFrame jw = new JFrame();
	 
	JLabel label_sexo = new JLabel("Sexo"),
	       area_texto = new JLabel("Comentario"),
	       txt_nome = new JLabel(" Nome "),
	       txt_comentario = new JLabel("Disciplinas");
	
	JTextArea area = new JTextArea();
	
	TextField ct_nome = new TextField();
	
	//testando uma parada 
	

	List lista_disciplina = new List(5,true);	
	
	JButton bt_logo = new JButton("Lôgo"),
	        bt_surge = new JButton("Ver Detalhes"),
	        bt_cadastrar = new JButton("Cadastrar"),
			btjw_sair = new JButton("Sair");
	
	JRadioButton rb_masculino = new JRadioButton("Masculino",false);
	JRadioButton rb_feminino = new JRadioButton("Feminino",false);
	
	//fim da decaracao das variaveis da janela da tela de cadastro
	
	
	public void janela(){
		
		
		ja.setLayout(null);
		ja.setSize(300, 200);
		ja.setVisible(true);
		ja.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
		ja.setTitle("Confirmação");
		ja.setLocationRelativeTo(null);
	    	
        msg_decisao.setBounds(50,50,200,30);
        
		cancela.setBounds(50, 100, 100, 20);
		
		confirma.setBounds(150, 100, 100, 20);
		
		ja.add(cancela);
		ja.add(confirma);
		ja.add(msg_decisao);
		
		cancela.addActionListener(this);
		confirma.addActionListener(this);
			
	}

		@Override
		public void actionPerformed(ActionEvent e) {
	
				
		if( e.getSource() == cancela){
		ja.dispose();
		}
		else if(e.getSource() == confirma){
		JOptionPane.showMessageDialog(null,"Dados Cadastrados");
		jw.add(bt_surge);
		bt_surge.setVisible(true);
		ja.dispose();
		}
		else if(e.getSource() == bt_logo){
			Desenho d = new Desenho();
			d.janela_canvas();
		}
		else if(e.getSource() == bt_cadastrar){
			janela();
		}
		else if(e.getSource() == btjw_sair){
			JOptionPane.showMessageDialog(null,"Aplicação Finalizada!");
			System.exit(0);
		}
		else if(e.getSource() == bt_surge){
			janela_imprimir();
		}
		else{
			JOptionPane.showMessageDialog(null,"Opcao Invalida");
		
		}	
		
	
				
	
}//fim do metodo de acao do botao
		
		//janela de cadastro
		
		public void janela_cadastro(boolean a) {
			
			JLabel seta = new JLabel("Ver ->");
	
			lista_disciplina.add("Prolog");
			lista_disciplina.add("Fisica");
			lista_disciplina.add("Matematica");
			lista_disciplina.add("Estrutura de Dados");
			lista_disciplina.add("Redes I");
			
			txt_nome.setBounds(20,30,50,40);
			ct_nome.setBounds(100,30,350,30);
			label_sexo.setBounds(30,80,50,40);
			txt_comentario.setBounds(60, 130, 100, 20);
			
			rb_masculino.setBounds(80, 80, 100,40);
			rb_feminino.setBounds(190,80,100,40);
			lista_disciplina.setBounds(50, 150, 200, 200);
				
	        area.setBounds(300, 150, 180, 80);
			
	        area_texto.setBounds(320, 120, 100, 20);
	    
			bt_cadastrar.setBounds(300,250,180,30);

            btjw_sair.setBounds(400,330, 80, 25);
	        
	        bt_logo.setBounds(300,330,80,25);
	        
	        
	        bt_surge.setBounds(310,290,150,30);
	        seta.setBounds(260, 290, 350, 20);
	        
	        
	        
			jw.setLayout(null);
			jw.setTitle("Tela de Cadastro");
			jw.setVisible(a);
			jw.setSize(500,400);
			jw.setDefaultCloseOperation(EXIT_ON_CLOSE);
			jw.add(txt_nome);
			jw.add(ct_nome);
			jw.add(label_sexo);
			jw.add(rb_masculino);
			jw.add(rb_feminino);
			jw.add(lista_disciplina);
			jw.add(bt_cadastrar);
			jw.add(btjw_sair);
			jw.add(area);
			jw.add(area_texto);
			jw.add(bt_logo);
			jw.add(txt_comentario);
			jw.add(seta);
			
				btjw_sair.addActionListener(this);
			    bt_logo.addActionListener(this);
			    bt_cadastrar.addActionListener(this);
			    bt_surge.addActionListener(this);
		}
		
		public void janela_imprimir(){
			
		JFrame im = new JFrame();
		
		im.setLayout(null);
		im.setVisible(true);
		im.setSize(500, 400);
        im.setTitle("Relatorio de Cadastro!");
        im.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        im.setLocationRelativeTo(null);
        
        
        
	String opcao_sexual;
		
		if(rb_masculino.isSelected() == true && rb_feminino.isSelected() == false){
			opcao_sexual = "Maculino";
		}
		else if(rb_feminino.isSelected() == true && rb_masculino.isSelected() == false){
			opcao_sexual = "Feminino";
		}
		else if(rb_feminino.isSelected() == true && rb_masculino.isSelected() == true){
			opcao_sexual = "Em Metamorfose";
		}
		else{
			opcao_sexual = "Indecidido";
		}
		
		String disciplinas_s = "  ";
        	

					for(String i : lista_disciplina.getSelectedItems()){
						disciplinas_s = disciplinas_s + i;
					}
					
					
        	        
				JLabel t_comentario = new JLabel(area.getText());
        	        
		JLabel novo_I = new JLabel(" Aluno --> "+ct_nome.getText()),
		       novo_II = new JLabel(" Sexo --> "+opcao_sexual),
		       novo_III = new JLabel( "Disciplinas "),
		       novo_IV = new JLabel("Comentarios"),
		       novo_V = new JLabel("Dados Cadastrados pelo usuario"),
		       disci = new JLabel(disciplinas_s);
				
		novo_I.setBounds(60, 70, 300, 20);
		novo_II.setBounds(60, 100, 300, 20);
		
		novo_III.setBounds(60,120,100,30); //label disciplinas
		
		disci.setBounds(60, 150, 300, 50);//disciplinas selecionadas
		
		novo_IV.setBounds(60, 200, 100, 30);//label comentariso
		
		t_comentario.setBounds(60,300,300,50); //comentarios digitados

		novo_V.setBounds(150, 20, 300, 30);
		
		JTextArea imprimir = new JTextArea(area.getText());
		
		imprimir.setBounds(60, 250, 180, 80);
		
	
		
		
		im.add(novo_I);
		im.add(novo_II);
		im.add(novo_III);
		im.add(novo_IV);
		im.add(novo_V);
		im.add(disci);
		im.add(imprimir);
		
		
		
		}
		
}//fim da classe
