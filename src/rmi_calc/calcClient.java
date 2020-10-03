package rmi_calc;

import java.rmi.*;
import java.rmi.registry.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class calcClient extends JFrame implements Calculate
{

		private JPanel contentPane;
		private JTextField txtAnswer;
		private JTextArea cnsl;
		private int clientNo;


		public calcClient() {
//gives the client initialized each time a random number

			Random randomNum = new Random();
			clientNo = randomNum.nextInt(1000);

//initializes GUI with txtFields and buttons 

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 534);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			txtAnswer = new JTextField();
			txtAnswer.setBounds(5, 5, 440, 81);
			txtAnswer.setHorizontalAlignment(SwingConstants.CENTER);
			txtAnswer.setEditable(false);
			contentPane.add(txtAnswer);
			txtAnswer.setColumns(10);

                        
//Action Listeners for the claculate buttons

			JButton button_7 = new JButton("7");
			button_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String answer = txtAnswer.getText();
					answer = answer + "7";
					txtAnswer.setText(answer);
				}
			});		
			button_7.setBounds(29, 98, 75, 100);
			contentPane.add(button_7);
			
			JButton button_4 = new JButton("4");
			button_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String answer = txtAnswer.getText();
					answer = answer + "4";
					txtAnswer.setText(answer);
				}
			});	
			button_4.setBounds(29, 210, 75, 100);
			contentPane.add(button_4);
			
			JButton button_1 = new JButton("1");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String answer = txtAnswer.getText();
					answer = answer + "1";
					txtAnswer.setText(answer);
				}
			});
			button_1.setBounds(29, 322, 75, 100);
			contentPane.add(button_1);

			JButton button_0 = new JButton("0");
			button_0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String answer = txtAnswer.getText();
					answer = answer + "0";
					txtAnswer.setText(answer);
				}
			});
			button_0.setBounds(29, 427, 120, 44);
			contentPane.add(button_0);
			
			JButton button_8 = new JButton("8");
			button_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String answer = txtAnswer.getText();
					answer = answer + "8";
					txtAnswer.setText(answer);
				}
			});
			button_8.setBounds(116, 98, 75, 100);
			contentPane.add(button_8);
			
			JButton button_5 = new JButton("5");
			button_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String answer = txtAnswer.getText();
					answer = answer + "5";
					txtAnswer.setText(answer);
				}
			});	
			button_5.setBounds(116, 210, 75, 100);
			contentPane.add(button_5);
			
			JButton button_2 = new JButton("2");
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String answer = txtAnswer.getText();
					answer = answer + "2";
					txtAnswer.setText(answer);
				}
			});	
			button_2.setBounds(116, 322, 75, 100);
			contentPane.add(button_2);
			
			JButton button_9 = new JButton("9");
			button_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String answer = txtAnswer.getText();
					answer = answer + "9";
					txtAnswer.setText(answer);
				}
			});	
			button_9.setBounds(203, 98, 75, 100);
			contentPane.add(button_9);
			
			JButton button_6 = new JButton("6");
			button_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String answer = txtAnswer.getText();
					answer = answer + "6";
					txtAnswer.setText(answer);
				}
			});	
			button_6.setBounds(203, 210, 75, 100);
			contentPane.add(button_6);
			
			JButton button_3 = new JButton("3");
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String answer = txtAnswer.getText();
					answer = answer + "3";
					txtAnswer.setText(answer);
				}
			});	
			button_3.setBounds(203, 322, 75, 100);
			contentPane.add(button_3);
			
			JButton btndiv = new JButton("/");
			btndiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String answer = txtAnswer.getText();
					answer = answer + "/";
					txtAnswer.setText(answer);
				}
			});	
			btndiv.setBounds(290, 98, 117, 49);
			contentPane.add(btndiv);
			
			JButton btnMlt = new JButton("*");
			btnMlt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String answer = txtAnswer.getText();
					answer = answer + "*";
					txtAnswer.setText(answer);
				}
			});	
			btnMlt.setBounds(290, 159, 117, 49);
			contentPane.add(btnMlt);
			
			JButton btn_mns = new JButton("-");
			btn_mns.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String answer = txtAnswer.getText();
					answer = answer + "-";
					txtAnswer.setText(answer);
				}
			});	
			btn_mns.setBounds(290, 220, 117, 49);
			contentPane.add(btn_mns);
			
			JButton btnPls = new JButton("+");
			btnPls.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String answer = txtAnswer.getText();
					answer = answer + "+";
					txtAnswer.setText(answer);
				}
			});
			btnPls.setBounds(290, 281, 117, 49);
			contentPane.add(btnPls);


			JButton btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String answer = txtAnswer.getText();
					answer = "";
					txtAnswer.setText(answer);
				}
			});	
			btnClear.setBounds(161, 427, 117, 39);
			contentPane.add(btnClear);

//textArea for console
			cnsl = new JTextArea();
			cnsl.setEditable(false);
			cnsl.setBounds(29, 483, 378, 100);
			contentPane.add(cnsl);
			cnsl.setColumns(10);
			
//invokes methods implimented in server class to perform the expected calculations
//sends data to the server & recieves data back from the server
//handles any divide by zero exceptions

			JButton btnSubmit = new JButton("Calculate");
			btnSubmit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String answer = txtAnswer.getText();
					for(int x = 0;x<answer.length();x++){
						char operator = answer.charAt(x);
						if(operator == 'C'){
							String old = txtAnswer.getText();
							for(int k = 0;k<old.length();k++){
								char exclmat = old.charAt(k);
								if(exclmat == '!'){
									String newString = old.substring(k+1);
									txtAnswer.setText(""+newString);
									x = 0;
								}
							}
						}
						if(operator == '+'){
							int i = Integer.parseInt(answer.substring(0, x));
							int j = Integer.parseInt(answer.substring(x+1, answer.length()));
							String str = "Sending " + i + "+" + j + " to the server!";
							cnsl.append("\n" + str);
							int val = add(i,j, clientNo);
							str = "Recieved " + i + "+" + j + " = " + val + " back from the server!";
							cnsl.append("\n" + str);
							txtAnswer.setText("" + val);
						}
						if(operator == '-'){
							int i = Integer.parseInt(answer.substring(0, x));
							int j = Integer.parseInt(answer.substring(x+1, answer.length()));
							String str = "Sending " + i + "-" + j + " to the server!";
							cnsl.append("\n" + str);
							int val = subt(i,j, clientNo);
							str = "Recieved " + i + "-" + j + " = " + val + " back from the server!";
							cnsl.append("\n" + str);
							txtAnswer.setText("" + val);
						}
						if(operator == '*'){
							int i = Integer.parseInt(answer.substring(0, x));
							int j = Integer.parseInt(answer.substring(x+1, answer.length()));
							String str = "Sending " + i + "*" + j + " to the server!";
							cnsl.append("\n" + str);
							int val = mult(i,j, clientNo);
							str = "Recieved " + i + "*" + j + " = " + val + " back from the server!";
							cnsl.append("\n" + str);
							txtAnswer.setText("" + val);
						}
						if(operator == '/'){
							int i = Integer.parseInt(answer.substring(0, x));
							int j = Integer.parseInt(answer.substring(x+1, answer.length()));
							String str;
							int val = 0;
							str = "Sending " + i + "/" + j + " to the server!";
							cnsl.append("\n" + str);
							if(i == 0 || j == 0){
								cnsl.append("Cannot divide by zero!");
								txtAnswer.setText("Cannot divide by zero!");

							}
							else{
							val = div(i,j, clientNo);
							txtAnswer.setText("" + val);
							str = "Recieved " + i + "/" + j + " = " + val + " back from the server!";
							cnsl.append("\n" + str);

							}

							
						}
						
					}
				}
			});
			btnSubmit.setBounds(290, 348, 117, 123);
			contentPane.add(btnSubmit);
			
			
		}


//Calls add method from calcServer via interface
//Passes i, j, and the clientNumber to the server
       
                
           
                
                
		public int add(int i, int j, int clientNo)
		{
			int val = 0;
			try
			{
				String ServerURL="calcServer";
				Calculate CI=(Calculate)Naming.lookup(ServerURL);
				val=CI.add(i,j, clientNo);
				return val;
			}
			catch(Exception ex)
			{
				System.out.println("Exception:"+ex);
			}
			return val;
		}

//Calls subt method from calcServer via interface
//Passes i, j, and the clientNumber to the server



		public int subt(int i, int j, int clientNo)
		{
			int val = 0;
			try
			{
				String ServerURL="calcServer";
				Calculate CI=(Calculate)Naming.lookup(ServerURL);
				val=CI.subt(i,j, clientNo);
				return val;
			}
			catch(Exception ex)
			{
				System.out.println("Exception:"+ex);
			}
			return val;

		}
	
//Calls mult method from calcServer via interface
//Passes i, j, and the clientNumber to the server

		

		public int mult(int i, int j, int clientNo)
		{
			int val = 0;
			try
			{
				String ServerURL="calcServer";
				Calculate CI=(Calculate)Naming.lookup(ServerURL);
				val=CI.mult(i,j, clientNo);
				return val;
			}
			catch(Exception ex)
			{
				System.out.println("Exception:"+ex);
			}
			return val;

		}
		
//Calls div method from calcServer via interface
//Passes i, j, and the clientNumber to the server

                public int div(int i, int j, int clientNo)
		{
			int val = 0;
			try
			{
				String ServerURL="calcServer";
				Calculate CI=(Calculate)Naming.lookup(ServerURL);
				val=CI.div(i,j, clientNo);
				return val;
			}
			catch(Exception ex)
			{
				System.out.println("Exception:"+ex);
			}
			return val;

		}
	
		public static void main(String args[])
		{
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try{
			calcClient calcClient=new calcClient();
			calcClient.setVisible(true);
                        calcClient.setTitle("Edureka Calculator App");
			calcClient.setSize(500,700);

			}
			catch (Exception e) {
				e.printStackTrace();
			}
				}
			});
		}
	}