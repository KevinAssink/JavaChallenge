import java.applet.Applet;
import java.awt.*;

public class JavaChallenge extends Applet {
    int GewichtJer;
    int GewichtVal;
    int GewichtHans;
    int NULL;
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


    Button Toon = new Button("Toon");
    ShowListener Sl = new ShowListener();
    show.addActionListener ( Sl );
    add (Toon);
}


public void paint (Graphics g){
    g.setColor(Color.black);
    g.drawLine(50,260,350,260);
    g.drawLine(50, 40,50,260);
    g.drawString("20", 30, 225);
    g.drawLine(60,220, 50,220);
    g.drawString("40", 30, 185);
    g.drawLine(60,180, 50,180);
    g.drawString("60", 30, 145);
    g.drawLine(60,140, 50,140);
    g.drawString("80", 30, 105);
    g.drawLine(60,100, 50,100);
    g.drawString("100", 25, 65);
    g.drawLine(60,60, 50,60);


    //Val
    g.setColor(Color.black);
    g.drawString("Valerie", 75,270);
    g.setColor(Color.red);
    g.fillRect(70, YVal, 50, GewichtVal*2);

    //Jer
    g.setColor(Color.black);
    g.drawString("Jeroen", 145,270);
    g.setColor(Color.green);
    g.fillRect(140, YJer, 50, GewichtJer*2);

    //Hans
    g.setColor(Color.black);
    g.drawString("Hans", 215,270);
    g.setColor(Color.cyan);
    g.fillRect(210, YHans, 50, GewichtHans*2);
}


}