import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaChallenge extends Applet {
    int GewichtJer;
    int GewichtVal;
    int GewichtHans;
    int YVal;
    int YJer;
    int YHans;

    TextField Valerie;
    TextField Jeroen;
    TextField Hans;


public void init() {

    Valerie = new TextField(10);
    Label label = new Label("Valerie");
    add (label);
    add (Valerie);
    Jeroen = new TextField(10);
    label = new Label("Jeroen");
    add (label);
    add (Jeroen);
    Hans = new TextField(10);
    label = new Label("Hans");
    add (label);
    add (Hans);


    Button Show = new Button("Toon");
    ShowListener Sl = new ShowListener();
    Show.addActionListener ( Sl );
    add (Show);
}


public void paint (Graphics g){
    g.setColor(Color.black);
    g.drawLine(50,300,350,300);
    g.drawLine(50, 40,50,300);
    g.drawString("20", 30, 265);
    g.drawLine(60,260, 50,260);
    g.drawString("40", 30, 225);
    g.drawLine(60,220, 50,220);
    g.drawString("60", 30, 185);
    g.drawLine(60,180, 50,180);
    g.drawString("80", 30, 145);
    g.drawLine(60,140, 50,140);
    g.drawString("100", 25, 105);
    g.drawLine(60,100, 50,100);
    g.drawString("120",25, 65);
    g.drawLine(60,60, 50,60);

    //Val
    g.setColor(Color.black);
    g.drawString("Valerie", 75,320);
    g.setColor(Color.red);
    g.fillRect(70, YVal, 50, GewichtVal*2);

    //Je
    g.setColor(Color.black);
    g.drawString("Jeroen", 145,320);
    g.setColor(Color.green);
    g.fillRect(140, YJer, 50, GewichtJer*2);

    //Hans
    g.setColor(Color.black);
    g.drawString("Hans", 215,320);
    g.setColor(Color.cyan);
    g.fillRect(210, YHans, 50, GewichtHans*2);
}


class ShowListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        int start = 300;


        GewichtVal = Integer.parseInt(Valerie.getText());
        YVal = start - GewichtVal*2;

        GewichtJer = Integer.parseInt(Jeroen.getText());
        YJer = start - GewichtJer*2;

        GewichtHans = Integer.parseInt(Hans.getText());
        YHans = start - GewichtHans*2;

        repaint();


    }
}

}