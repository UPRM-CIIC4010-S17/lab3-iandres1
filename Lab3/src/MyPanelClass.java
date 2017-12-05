import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.CYAN);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        //Draw a border
                        g.setColor(Color.YELLOW);
                        g.drawRect(x1, y1, width, height);
                        
                        //Draw a border
                        g.setColor(Color.GREEN);q
                        g.drawRect(x1+5, y1+5, width-10, height-10);
                      
//                        g.setColor(Color.BLUE);
//                        g.drawLine(x1, y1, x2, y2);
//                      
//                        g.setColor(Color.RED);
//                        g.drawLine(x1, y2, x2, y1);
                      
//                        g.setColor(Color.BLACK);
//                        g.fillOval((width-55)/2, (height-55)/2, 55,55);
                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
//                        
//                        Polygon p2 = new Polygon();
//                        p2.addPoint(x1 + 25, y1 + 73);
//                        p2.addPoint(x1 + 41, y1 + 73);
//                        p2.addPoint(x1 + 47, y1 + 58);
//                        p2.addPoint(x1 + 53, y1 + 73);
//                        p2.addPoint(x1 + 69, y1 + 73);
//                        p2.addPoint(x1 + 56, y1 + 83);
//                        p2.addPoint(x1 + 61, y1 + 98);
//                        p2.addPoint(x1 + 47, y1 + 88);
//                        p2.addPoint(x1 + 34, y1 + 98);
//                        p2.addPoint(x1 + 38, y1 + 83);
//                        g.setColor(Color.WHITE);
//                        g.drawPolygon(p2);
                        
                        Polygon s = new Polygon();
                        s.addPoint(x1+10, y1);
                        s.addPoint(x1+220, y1);
                        s.addPoint(x1 + 220, y1+37);
                        s.addPoint(x1+10, y1 + 37);
                        g.setColor(Color.RED);
                        g.fillPolygon(s);
                        
                        Polygon s3 = new Polygon();
                        s3.addPoint(x1+10, y1+113);
                        s3.addPoint(x1+220, y1+113);
                        s3.addPoint(x1 + 220, y1+150);
                        s3.addPoint(x1+10, y1 + 150);
                        g.setColor(Color.RED);
                        g.fillPolygon(s3);
                        
                        Polygon s2 = new Polygon();
                        s2.addPoint(x1+10, y1+55);
                        s2.addPoint(x1+220, y1+55);
                        s2.addPoint(x1 + 220, y1+90);
                        s2.addPoint(x1+10, y1 + 90);
                        g.setColor(Color.RED);
                        g.fillPolygon(s2);
                        
                        Polygon s4 = new Polygon();
                        s4.addPoint(x1+10, y1+37);
                        s4.addPoint(x1+220, y1+37);
                        s4.addPoint(x1 + 220, y1+55);
                        s4.addPoint(x1+10, y1 + 55);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(s4);
                        
                        Polygon s5 = new Polygon();
                        s5.addPoint(x1+10, y1+90);
                        s5.addPoint(x1+220, y1+90);
                        s5.addPoint(x1 + 220, y1+113);
                        s5.addPoint(x1+10, y1 + 113);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(s5);
                        
                        Polygon tri = new Polygon();
                        tri.addPoint(x1+10, y1);
                        tri.addPoint(x1 + 10, y1+150);
                        tri.addPoint(x1 + 115, y1+75);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(tri);
                        
                        
                        
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
            }
}