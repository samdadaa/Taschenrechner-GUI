import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class Main
{

    public static void main(String[] args)
    {

        Taschenrechner taschenrechner = new Taschenrechner();


    }
}
class Taschenrechner extends JFrame implements ActionListener
{
    private  final JTextField textField = new JTextField();
  Taschenrechner()
  {
      setSize(new Dimension(220,320));
      setLocationRelativeTo(null);

      textField.setFont(new Font("",Font.PLAIN,40));
      textField.setHorizontalAlignment(JTextField.RIGHT);
      textField.setForeground(new Color(102, 117, 255));
      add(textField,BorderLayout.NORTH);


      JPanel panel =new JPanel();
      panel.setLayout(new GridLayout(4,4));

      JPanel grid = new JPanel();
      grid.setLayout(new GridLayout(4,4));
      add(grid);
      grid.setForeground(Color.darkGray);

      JButton button1 = new JButton("1");
      button1.addActionListener(this);
      button1.setFont(new Font("",Font.PLAIN,20));
      JButton button2 = new JButton("2");
      button2.addActionListener(this);
      button2.setFont(new Font("",Font.PLAIN,20));
      JButton button3 = new JButton("3");
      button3.addActionListener(this);
      button3.setFont(new Font("",Font.PLAIN,20));
      JButton button4 = new JButton("4");
      button4.setFont(new Font("",Font.PLAIN,20));
      button4.addActionListener(this);
      JButton button5 = new JButton("5");
      button5.setFont(new Font("",Font.PLAIN,20));
      button5.addActionListener(this);
      JButton button6 = new JButton("6");
      button6.setFont(new Font("",Font.PLAIN,20));
      button6.addActionListener(this);
      JButton button7 = new JButton("7");
      button7.setFont(new Font("",Font.PLAIN,20));
      button7.addActionListener(this);
      JButton button8 = new JButton("8");
      button8.setFont(new Font("",Font.PLAIN,20));
      button8.addActionListener(this);
      JButton button9 = new JButton("9");
      button9.setFont(new Font("",Font.PLAIN,20));
      button9.addActionListener(this);
      JButton button0 = new JButton("0");
      button0.setFont(new Font("",Font.PLAIN,20));
      button0.addActionListener(this);
      JButton plus = new JButton("+");
      plus.setFont(new Font("",Font.PLAIN,20));
      plus.setForeground(new Color(102, 117, 255));
      plus.addActionListener(this);
      JButton minus = new JButton("-");
      minus.setForeground(new Color(102, 117, 255));
      minus.addActionListener(this);
      minus.setFont(new Font("",Font.PLAIN,20));
      JButton mal = new JButton("*");
      mal.addActionListener(this);
      mal.setFont(new Font("",Font.PLAIN,20));
      mal.setForeground(new Color(102, 117, 255));
      JButton geteilt = new JButton("/");
      geteilt.addActionListener(this);
      geteilt.setFont(new Font("",Font.PLAIN,20));
      geteilt.setForeground(new Color(102, 117, 255));
      JButton gleich = new JButton("=");
      gleich.addActionListener(this);
      gleich.setFont(new Font("",Font.PLAIN,20));
      gleich.setForeground(new Color(102, 117, 255));
      JButton delete = new JButton("del");
      delete.setFont(new Font("",Font.PLAIN,20));
      delete.setForeground(new Color(102, 117, 255));
      delete.addActionListener(this);
      grid.add(button7);
      grid.add(button8);
      grid.add(button9);
      grid.add(geteilt);

      grid.add(button4);
      grid.add(button5);
      grid.add(button6);
      grid.add(mal);

      grid.add(button1);
      grid.add(button2);
      grid.add(button3);
      grid.add(plus);
      grid.add(button0);

      grid.add(minus);
      grid.add(delete);
      grid.add(gleich);


      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


  }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();
        if (Pattern.matches("[\\d]{1}",btn.getText()))
        {
            textField.setText(textField.getText()+btn.getText());
        }
        if (btn.getText().equals("del")&& !textField.getText().equals(""))
        {
            textField.setText(textField.getText().substring(0,textField.getText().length()-1));
        }
    }
}