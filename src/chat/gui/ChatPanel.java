package chat.gui;


import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class ChatPanel extends JTextPane{

    private static final Font  MESSAGE_FONT = new Font(Font.SERIF, Font.BOLD, 15);
    private static final Color SYSTEM_MESSAGE_COLOR = Color.orange;

    private void configBorders(){
        this.setBorder(BorderFactory.createLoweredBevelBorder());
    }

    private void addSystemMessage(String message){
        StyledDocument doc = this.getStyledDocument();

        Style style = this.addStyle("Color Style", null);
        StyleConstants.setForeground(style, SYSTEM_MESSAGE_COLOR);
        try {
            doc.insertString(doc.getLength(), message + "\n", style);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }


    private void addMessage(String nickname, String message, Color nicknameColor, Color messageColor){
            StyledDocument doc = this.getStyledDocument();

            //Nickname
            Style style = this.addStyle("Color Style", null);
            StyleConstants.setForeground(style, nicknameColor);
            try {
                doc.insertString(doc.getLength(), nickname + ": ", style);
            } catch (BadLocationException e) {
                e.printStackTrace();
            }

            //Message
            style = this.addStyle("Color Style", null);
            StyleConstants.setForeground(style, messageColor);
            try {
                doc.insertString(doc.getLength(), message + "\n", style);
            } catch (BadLocationException e) {
                e.printStackTrace();
            }
        }


    public ChatPanel(){
        configBorders();

        this.setEditable(false);
        this.setFont(MESSAGE_FONT);

        addMessage("rafael", "vai se fuder", Color.black, Color.green);
        addMessage("nicole", "alala o po mario",Color.black, Color.green);
        addMessage("alvim", "c que da se fala",Color.black, Color.green);
        addMessage("jao", "era uma vez, um dia em que todo dia era bom",Color.black, Color.green);

    }
}
