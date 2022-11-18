import javax.swing.*;
// 
import java.awt.event.*;
import java.awt.*;
// original GUI for java 


// Need 2 buttons AND 2 inputs for conversion 
public class TempConverter {

    // Declare GUI Elements (JFrame Object)
    public static JFrame frameMain;

    // Label and Text Field for Celsius
    public static JLabel labelCelsius;
    public static JTextField textCelsisus;

    // Label Text Field for Fahrenheit
    public static JLabel labelFahrenheit;
    public static JTextField textFahrenheit;

    // Buttons for calculate
    public static JButton btnCalculateCtoF;
    public static JButton btnCalculateFtoC;

    public static void main(String[] args) {

        // Set up the frame
        frameMain = new JFrame("Temperature Converter");
        frameMain.setSize(200, 200);
        frameMain.setLayout(new FlowLayout());

        // Create GUI Elements
        labelCelsius = new JLabel("Celsius");
        textCelsisus = new JTextField(10);
        labelFahrenheit = new JLabel("Fahrenheit");
        textFahrenheit = new JTextField(10);

        btnCalculateCtoF = new JButton("Convert C to F");

        // Add ActionListener for C to F
        btnCalculateCtoF.addActionListener 
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    // Convert C to F
                    String celsiusText = textCelsisus.getText();
                    double celsius = Double.parseDouble(celsiusText);
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    textFahrenheit.setText(String.valueOf(fahrenheit));
                }
            }
        );

        btnCalculateFtoC = new JButton("Convert F to C");

        // Add ActionListener for C to F
        btnCalculateFtoC.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    String fahrenheitText = textFahrenheit.getText();
                    double fahrenheit = Double.parseDouble(fahrenheitText);
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    textCelsisus.setText(String.valueOf(celsius));
                }
            }
        );

        // Add the GUI Elements to the frame
        frameMain.add(labelCelsius);
        frameMain.add(textCelsisus);
        frameMain.add(labelFahrenheit);
        frameMain.add(textFahrenheit);
        frameMain.add(btnCalculateCtoF);
        frameMain.add(btnCalculateFtoC);

        // Make the frame visible
        frameMain.setVisible(true);
    }
}