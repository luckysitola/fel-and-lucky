import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PalindromeCheckerGUI extends JFrame implements ActionListener {
    private final JTextField inputField;
    private final JButton checkButton;
    private final JLabel resultLabel;

    public PalindromeCheckerGUI() {
        super("Palindrome Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // create and add components to the frame
        JLabel promptLabel = new JLabel("Enter a number:");
        add(promptLabel);

        inputField = new JTextField(10);
        add(inputField);

        checkButton = new JButton("Check");
        checkButton.addActionListener(this);
        add(checkButton);

        resultLabel = new JLabel("");
        add(resultLabel);

        // set the size of the frame and show it
        setSize(250, 150);
        setVisible(true);
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // get the input entered by the user
        String input = inputField.getText();

        // reverse the input string using StringBuilder
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        String reverseInput = sb.toString();

        // check if the input is a palindrome
        boolean isPalindrome = input.equals(reverseInput);

        // display the result
        if (isPalindrome) {
            resultLabel.setText(input + " is a palindrome.");
        } else {
            resultLabel.setText(input + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        PalindromeCheckerGUI palindromeCheckerGUI;
        palindromeCheckerGUI = new PalindromeCheckerGUI();
    }
}
