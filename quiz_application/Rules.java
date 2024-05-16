/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz_application;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author muska
 */

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel heading=new JLabel("Welcome "+name+" to Simple Quiz");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("viner Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        JLabel rules =new JLabel("Welcome "+name+" to Simple Quiz");
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText("<html>"+ "1.Correctness: Participants receive a point for each correct answer. This encourages accuracy and rewards understanding of Java concepts.\n" +
"<br><br>" +
"2.Completion: Participants receive a point for completing the quiz. This ensures that they engage with all questions, even if they're unsure of the answers.\n" +
"<br><br>" +
"3.Timeliness: Deduct points for late submissions, if applicable. This incentivizes participants to submit their answers on time.\n" +
"<br><br" +
"4.Bonus Points: Offer bonus points for particularly insightful or creative answers to certain questions. This can encourage deeper thinking and engagement."+
                "<br><br>"+
"5.Clear Instructions: Provide clear instructions for each question, including what is expected in the answer and any specific format requirements. Ambiguity can lead to confusion and unfairness."+
                "<br><br>"+
"6.No Partial Credit: Decide whether partial credit will be awarded for partially correct answers or if only fully correct answers will receive points. Clearly communicate this to participants to avoid misunderstandings."
+"</html>");
add(rules);
 back = new JButton("Back");
        back.setBounds(250, 500, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        start = new JButton("Start");
        start.setBounds(400, 500, 120, 25);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);


        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    public static void main(String [] args){
        new Rules("User");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==start){
             setVisible(false);
            new Quiz(name);
            
        }else{
            setVisible(false);
            new Login();
        }
        }
}
