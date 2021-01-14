
package Janela;

import jogo.Jogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela extends JFrame implements ActionListener{
    private JPanel pane;
    private JLabel lblTentativas;
    private JLabel lblValor;
    private JLabel lblNomeJogador;
    private JTextField fieldNome;
    private JTextField fieldValor;
    private JButton btnNovoJogo;
    private JButton btnJogar;
    private JButton btnSalvarJogo;
    private JButton btnRecuperarJogo;
    private Jogo jogo;
    private final String CAMINHO = "C:\\Teste\\Teste.dat";
    
     public Janela(String titulo){
        super(titulo);
        criarComponentes();
        ajustarPropriedadesJanela();
        this.iniciarValoresPadrao();
        jogo = new Jogo();

    }
    
    private void criarComponentes(){
        pane = new JPanel();
        lblTentativas = new JLabel("Tentativas Restantes: ");
        lblNomeJogador = new JLabel("Nome do Jogador:");
        fieldNome = new JTextField(10);
        fieldValor = new JTextField(5);
        
        lblValor = new JLabel("Digite o número:");
        btnNovoJogo = new JButton("NOVO JOGO");
        btnJogar = new JButton("JOGAR");
        btnSalvarJogo = new JButton("SALVAR");
        btnRecuperarJogo = new JButton("RECUPERAR");
        
        btnNovoJogo.addActionListener(this);
        btnJogar.addActionListener(this);
        btnSalvarJogo.addActionListener(this);
        btnRecuperarJogo.addActionListener(this);

        pane.add(lblNomeJogador);
        pane.add(fieldNome);
        pane.add(lblValor);
        pane.add(fieldValor);
        pane.add(btnNovoJogo);
        pane.add(btnJogar);
        pane.add(btnSalvarJogo);
        pane.add(btnRecuperarJogo);
        pane.add(lblTentativas);
        add(pane);

    }
    
    private void ajustarPropriedadesJanela() {
        setVisible(true);
        //pack();
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    private void iniciarValoresPadrao(){
        this.limparCampos();
        fieldNome.setEnabled(true);
        btnNovoJogo.setEnabled(true);
        btnJogar.setEnabled(false);
        btnSalvarJogo.setEnabled(false);
        fieldValor.setEnabled(false);
    }
    
    private void limparCampos(){
        fieldValor.setText("");
        fieldNome.setText("");
        lblTentativas.setText("Tentativas Restantes: " + Jogo.MAX_TENTATIVAS );
        jogo = new Jogo();
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnNovoJogo){
            if(this.fieldNome.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Digite o nome para começar!");
            }else{
                jogo.setNomeJogador(fieldNome.getText().trim());
                btnNovoJogo.setEnabled(false);
                btnJogar.setEnabled(true);
                jogo.lancarDados();
                fieldValor.setEnabled(true);
                fieldNome.setEnabled(false);
            }

        }else if(e.getSource() == btnJogar){
            try{
                int numero = Integer.parseInt(fieldValor.getText().trim());
                btnSalvarJogo.setEnabled(true);
                if(jogo.getTentativas() >= Jogo.MAX_TENTATIVAS){
                    JOptionPane.showMessageDialog(null, "Você atingiu o número máximo de tentativas!");
                    this.iniciarValoresPadrao();
                }else{
                    if(jogo.adivinharSoma(numero)){
                        JOptionPane.showMessageDialog(null, "Você acertoou!");
                        this.iniciarValoresPadrao();
                    }else{
                        lblTentativas.setText("Tentantivas Restantes: " + (Jogo.MAX_TENTATIVAS - jogo.getTentativas()));
                        JOptionPane.showMessageDialog(null, "Você errou! Restam: " + (Jogo.MAX_TENTATIVAS - jogo.getTentativas()) + " tentativas");
                    }
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }else if(e.getSource() == btnSalvarJogo){
            try {
                jogo.salvarJogo(this.CAMINHO);
                JOptionPane.showMessageDialog(null, "O jogo foi salvo com sucesso!");
                this.iniciarValoresPadrao();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }else if(e.getSource() == btnRecuperarJogo){
            try {
                jogo = Jogo.recuperarJogo(CAMINHO);
                fieldValor.setEnabled(true);
                fieldNome.setText(jogo.getNomeJogador());
                btnJogar.setEnabled(true);
                fieldNome.setEnabled(false);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
            lblTentativas.setText("Tentantivas Restantes: " + (Jogo.MAX_TENTATIVAS - jogo.getTentativas()));
        }
    }
}
