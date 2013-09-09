import java.awt.*;

public class MyDrawPanel extends MiniGui {

    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
    }

}
