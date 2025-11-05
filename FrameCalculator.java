import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CalculatorGUI implements ActionListener
{
    // Characteristics
    JFrame fobj;
    JButton aobj, sobj, mobj, dobj;
    JTextField t1obj, t2obj;
    JLabel Userlabel1, Userlabel2, Resultlabel;

    public CalculatorGUI(String title, int width, int height)
    {
        fobj = new JFrame(title);

        Userlabel1 = new JLabel("Number1");
        Userlabel1.setBounds(50,50,100,30);

        t1obj = new JTextField();
        t1obj.setBounds(150,50,100,30);

        Userlabel2 = new JLabel("Number2");
        Userlabel2.setBounds(50,100,100,30);

        t2obj = new JTextField();
        t2obj.setBounds(150,100,100,30);

        aobj = new JButton("+");
        aobj.setBounds(60,150,50,30);
        
        sobj = new JButton("-");
        sobj.setBounds(120,150,50,30);

        mobj = new JButton("*");
        mobj.setBounds(180,150,50,30);

        dobj = new JButton("/");
        dobj.setBounds(240,150,50,30);

        Resultlabel = new JLabel("");
        Resultlabel.setBounds(150,200,250,30);

        fobj.add(aobj);
        fobj.add(sobj);
        fobj.add(mobj);
        fobj.add(dobj);
        fobj.add(t1obj);
        fobj.add(t2obj);
        fobj.add(Userlabel1);
        fobj.add(Userlabel2);
        fobj.add(Resultlabel);

        aobj.addActionListener(this);
        sobj.addActionListener(this);
        mobj.addActionListener(this);
        dobj.addActionListener(this);

        fobj.setLayout(null);

        fobj.getContentPane().setBackground(Color.YELLOW);

        fobj.setSize(width,height);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent aeobj)
    {
        float Number1 = Float.parseFloat(t1obj.getText());
        float Number2 = Float.parseFloat(t2obj.getText());

        float result = 0;

        if(aeobj.getSource() == aobj)
        {
            result = Number1 + Number2;
        }
        else if(aeobj.getSource() == sobj)
        {
            result = Number1 - Number2;
        }
        else if(aeobj.getSource() == mobj)
        {
            result = Number1 * Number2;
        }
        else if(aeobj.getSource() == dobj)
        {
            result = Number1 / Number2;
        }

        Resultlabel.setText("Result is : "+result);

    }
}

class FrameCalculator
{
    public static void main(String A[])
    {
        CalculatorGUI cobj = new CalculatorGUI("Calculator",400,300);
    }
}