import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoffeeMachinePanel {
    String machineName = "Coffee Machine";
    private final JFrame panel;
    JLabel messageField;

    public CoffeeMachinePanel() {
        this.panel = new JFrame(machineName );
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBounds( 450, 150, 520, 500);
        panel.setLayout(null);

        JLabel proposition = new JLabel("Выбирите напиток : ");
        proposition.setBounds(180, 15,150,20);
        panel.add(proposition);

        JButton buttonEspresso = new JButton("espresso");
        buttonEspresso.setBounds(new Rectangle());
        buttonEspresso.setBounds(20,50,100,20);
        panel.add(buttonEspresso);

        JButton buttonAmericano = new JButton("americano");
        buttonAmericano.setBounds(new Rectangle());
        buttonAmericano.setBounds(140,50,100,20);
        panel.add(buttonAmericano);

        JButton buttonCappuccino = new JButton("cappuccino");
        buttonCappuccino.setBounds(new Rectangle());
        buttonCappuccino.setBounds(260,50,100,20);
        panel.add(buttonCappuccino);

        JButton buttonTea = new JButton("tea");
        buttonTea.setBounds(new Rectangle());
        buttonTea.setBounds(380,50,100,20);
        panel.add(buttonTea);

        messageField = new JLabel("сделайте выбор ...");
        messageField.setBounds(50, 70,400,200);
        panel.add(messageField);

        buttonEspresso.addActionListener(listener);
        buttonAmericano.addActionListener(listener);
        buttonCappuccino.addActionListener(listener);
        buttonTea.addActionListener(listener);
    }

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String orderedDrink = String.valueOf(e.getActionCommand());
            CoffeeMachine coffeeMachine = new CoffeeMachine(orderedDrink);
            messageField.setText("<html>"+coffeeMachine.getCookingMessage()+"</html>");
        }
    };

    public JFrame getPanel() {
        return panel;
    }
}
