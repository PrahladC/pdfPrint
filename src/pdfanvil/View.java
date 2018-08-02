package pdfanvil;


import javax.swing.*;
import java.awt.BorderLayout;

public class View {
      
    private JFrame frame;
    private JLabel label;
    private JButton button;
    private JButton btnMonthlyReport;
    
    
    public View(String text){
        frame = new JFrame("View");                                    
        frame.getContentPane().setLayout(new BorderLayout());                                          
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
        frame.setSize(200,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        label = new JLabel(text);
        frame.getContentPane().add(label, BorderLayout.CENTER);
        
        button = new JButton("Button");      
        btnMonthlyReport =new JButton("Monthly Report");
        frame.getContentPane().add(btnMonthlyReport, BorderLayout.NORTH);
        frame.getContentPane().add(button, BorderLayout.SOUTH);        
    }
        
    public JButton getButton(){
        return button;
    }

    public JButton getMRPButton(){
        return btnMonthlyReport;
    }

    
    public void setText(String text)
    
    {
        label.setText(text);
    
    
    }
    
    
}