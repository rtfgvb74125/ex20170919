import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    private Button bt = new Button("exit");
    private Button btAdd = new Button("Add");
    private Button btSub = new Button("Sub");
    private Label lab = new Label("0");
    private int n = 0;
    public MainFrame(){
        init();
    }
    private void init(){
        this.setLocation(500,250);
        this.setSize(400,300);
        this.setLayout(null);
        this.add(bt);
        this.add(btAdd);
        this.add(btSub);
        this.add(lab);
        bt.setBounds(200,150,50,50);
        bt.setBackground(new Color(255, 54, 151));
        btAdd.setBounds(150,150,50,50);
        btAdd.setBackground(new Color(96, 218, 97));
        lab.setBounds(180,200,50,50);
        lab.setBackground(new Color(255, 68, 19));
        lab.setFont(new Font(null,Font.BOLD,50));
        btSub.setBounds(250,150,50,50);
        btSub.setBackground(new Color(135,255, 71));


        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                lab.setText(Integer.toString(n));
            }
        });

        btSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n--;
                lab.setText(Integer.toString(n));
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
