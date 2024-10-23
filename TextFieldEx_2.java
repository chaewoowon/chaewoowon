import javax.swing.JFrame;

public class TextFieldEx_2 extends JFrame {
	private JButton button;
	private JTextField text, result;

	public TextFieldEx_2() {
		setSize(280, 150);
		setTitle("제곱 계산하기");
		ButtonListener listener = new ButtonListener();
		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 입력: "));
		text = new JTextField(15);
		text.addActionListener(listener);
		panel.add(text);
		panel.add(new JLabel("제곱한 값: "));
		result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		button = new JButton("OK");
		button.addActionListener(listener);
		panel.add(button);
		add(panel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}

private class ButtonListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button || e.getSource() == text) {
			String num = text.getText();
			int value = Integer.parseInt(num);
			result.setText(" " + value * value);
			text.requestFocus();
		}
	}

}

	public static void main(String[] args) {
		new TextFieldEx_2();
	}
}
