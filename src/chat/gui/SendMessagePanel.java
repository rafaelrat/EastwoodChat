package chat.gui;

import javax.swing.*;
import java.awt.*;

public class SendMessagePanel extends JPanel {

    private  static final Font SEND_MESSAGE_FONT = new Font(Font.SERIF, Font.PLAIN, 15);


    private JLabel sendMessageLabel;
    private JTextArea messageArea;

    private JButton sendMessageButton;


    private void configBorders(){
        this.setBorder(BorderFactory.createLoweredBevelBorder());
    }

    private void configComponents(){
        sendMessageLabel = new JLabel("Message: ");
        sendMessageLabel.setFont(SEND_MESSAGE_FONT);
        this.add(sendMessageLabel);

        messageArea = new JTextArea(3, 19);

        messageArea.setFont(SEND_MESSAGE_FONT);
        messageArea.setAutoscrolls(true);
        messageArea.setLineWrap(true);
        this.add(messageArea);

        sendMessageButton = new JButton("Send");
        this.add(sendMessageButton);
    }


    public SendMessagePanel(){
        configBorders();
        configComponents();
    }
}
