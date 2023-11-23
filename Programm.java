import javax.swing.*;

import java.awt.*;

public class Programm {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("JFrame");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(494,494);
        frame.setLayout(new GridBagLayout());

		JLabel element_1699466218029 = new JLabel("NO ES VENTANA PRINCIPAL");
        GridBagConstraints constraints_element_1699466218029 = new GridBagConstraints();
        constraints_element_1699466218029.gridx = 4;
        constraints_element_1699466218029.gridy = 4;
        constraints_element_1699466218029.gridwidth = 2;
        constraints_element_1699466218029.gridheight = 1;
        constraints_element_1699466218029.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1699466218029, constraints_element_1699466218029);

		JButton element_1699466207718 = new JButton("Aceptar");
        GridBagConstraints constraints_element_1699466207718 = new GridBagConstraints();
        constraints_element_1699466207718.gridx = 4;
        constraints_element_1699466207718.gridy = 5;
        constraints_element_1699466207718.gridwidth = 2;
        constraints_element_1699466207718.gridheight = 1;
        constraints_element_1699466207718.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1699466207718, constraints_element_1699466207718);


        frame.setVisible(true);
    }
}
