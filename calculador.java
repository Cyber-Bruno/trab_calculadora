package trab_calc;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class calculador extends JFrame {

	double firstnum,secondnum,result ;
	String operations,answer;

	private JPanel contentPane;
	private JTextField txtDisplay;
	private final JButton btn_clear = new JButton("C");
	
// -------------------------------------- Launch --------------------------------------

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculador frame = new calculador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// -------------------------------------- Frame --------------------------------------

	public calculador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 238, 321);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(0, 11, 164, 46);
		contentPane.add(txtDisplay);
		txtDisplay.setColumns(10);

		// -------------------------------------- Clear --------------------------------------

		JButton btn_clear = new JButton("C");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtDisplay.setText(null);
			}
		});

		// -------------------------------------- Row 1 --------------------------------------

		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(255, 250, 250));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn7.setBounds(0, 69, 48, 45);
		contentPane.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(255, 250, 250));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber );
			}

		});
		btn8.setBounds(58, 69, 48, 45);
		contentPane.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(255, 250, 250));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn9.setBounds(116, 69, 48, 45);
		contentPane.add(btn9);

		JButton btn_mais = new JButton("+");
		btn_mais.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_mais.setBackground(new Color(244, 164, 96));
		btn_mais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btn_mais.setBounds(174, 68, 48, 46);
		contentPane.add(btn_mais);

		// -------------------------------------- Row 2 --------------------------------------

		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(255, 250, 250));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn4.setBounds(0, 125, 48, 45);
		contentPane.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(255, 250, 250));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn5.setBounds(57, 125, 48, 45);
		contentPane.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(255, 250, 250));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn6.setBounds(115, 125, 48, 45);
		contentPane.add(btn6);

		JButton btn_menos = new JButton("-");
		btn_menos.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_menos.setBackground(new Color(244, 164, 96));
		btn_menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btn_menos.setBounds(174, 125, 48, 45);
		contentPane.add(btn_menos);

		// -------------------------------------- Row 3 --------------------------------------

		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(255, 250, 250));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn1.setBounds(0, 181, 48, 45);
		contentPane.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(255, 250, 250));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn2.setBounds(57, 181, 48, 45);
		contentPane.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(255, 250, 250));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn3.setBounds(116, 181, 48, 45);
		contentPane.add(btn3);

		JButton btn_vezes = new JButton("*");
		btn_vezes.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_vezes.setBackground(new Color(244, 164, 96));
		btn_vezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btn_vezes.setBounds(174, 181, 48, 45);
		contentPane.add(btn_vezes);

		// -------------------------------------- Row 4 --------------------------------------

		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(255, 250, 250));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn0.setBounds(0, 237, 48, 45);
		contentPane.add(btn0);

		JButton btn_ponto = new JButton(".");
		btn_ponto.setBackground(new Color(255, 250, 250));
		btn_ponto.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_ponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn_ponto.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn_ponto.setBounds(57, 237, 48, 45);
		contentPane.add(btn_ponto);

		JButton btn_dividir = new JButton("/");
		btn_dividir.setBackground(new Color(255, 250, 250));
		btn_dividir.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btn_dividir.setBounds(116, 237, 48, 45);
		contentPane.add(btn_dividir);

		JButton btn_igual = new JButton("=");
		btn_igual.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_igual.setBackground(new Color(244, 164, 96));
		btn_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				
		
				if (operations == "+") // -------------------- Adição --------------------
				{
					result = calcularSoma(firstnum,secondnum);
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);

				}
				else if (operations == "-") // -------------------- Subtração --------------------
				{
					result = calcularSubtracao(firstnum,secondnum);
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "*" ) // -------------------- Multiplicação --------------------
				{
					result = calcularMultiplicacao(firstnum,secondnum);
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "/") // -------------------- Divisão --------------------
				{
					result = calcularDivisao(firstnum,secondnum);
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
			}
		});
		btn_igual.setBounds(174, 237, 48, 45);
		contentPane.add(btn_igual);
		btn_clear.setBackground(new Color(50, 205, 50));
		btn_clear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_clear.setBounds(174, 11, 48, 46);
		contentPane.add(btn_clear);
}		
	
	// -------------------------------------- Função --------------------------------------

	public Double calcularSoma(double firstnum, double secondnum) {
		return firstnum + secondnum;
}
	public Double calcularSubtracao(double firstnum, double secondnum) {
		return firstnum - secondnum;
}
	public Double calcularMultiplicacao(double firstnum, double secondnum) {
		return firstnum * secondnum;
}
	public Double calcularDivisao(double firstnum, double secondnum) {
		return firstnum / secondnum;
}


}
