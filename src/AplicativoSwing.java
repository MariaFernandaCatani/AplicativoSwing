import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplicativoSwing extends JFrame{
    public JLabel primeiroNumero;
    private JFormattedTextField textPrimeiroNumero;
    public JLabel segundoNumero;
    private JFormattedTextField textSegundoNumero;
    private JButton buttonAdicao;
    private JButton buttonSubtracao;
    private JButton buttonDivisao;
    private JButton buttonMultiplicacao;
    private JButton buttonLimpar;
    public JLabel Resultado;
    private JFormattedTextField textResultado;
    public JPanel formAppSwing;

    public AplicativoSwing() {
    buttonAdicao.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Double valorAdicao = 0d;
            valorAdicao = Double.valueOf(textPrimeiroNumero.getText()) + Double.valueOf(textSegundoNumero.getText());
            textResultado.setText(valorAdicao.toString());
        }
    });
    buttonSubtracao.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Double valorSubtracao = 0d;
            valorSubtracao = Double.valueOf(textPrimeiroNumero.getText()) - Double.valueOf(textSegundoNumero.getText());
            textResultado.setText(valorSubtracao.toString());

        }
    });
    buttonDivisao.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Double valorDivisao = 0d;
            valorDivisao = Double.valueOf(textPrimeiroNumero.getText()) / Double.valueOf(textSegundoNumero.getText());
            textResultado.setText(valorDivisao.toString());

        }
    });
    buttonMultiplicacao.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Double valorMultiplicacao = 0d;
            valorMultiplicacao = Double.valueOf(textPrimeiroNumero.getText()) * Double.valueOf(textSegundoNumero.getText());
            textResultado.setText(valorMultiplicacao.toString());
        }
    });
    buttonLimpar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textPrimeiroNumero.setText("");
            textSegundoNumero.setText("");
            textResultado.setText("");
        }
    });
}
}
