//import java.awt.*;
//import javax.swing.*;
//
//public class BarGraph extends JPanel {
//    private static final Color BACKGROUND_COLOR = Color.white;
//    private static final Color BAR_COLOR = Color.red;
//
//
//    public BarGraph() {
//        
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        drawBars(g);
//    }
//
//    private void drawBars(Graphics g) {
//        int OUTER_MARGIN = 20,
//            WIDTH = 800 + 2 * OUTER_MARGIN,
//            HEIGHT = 600 + 2 * OUTER_MARGIN;
//
//        g.setColor(BACKGROUND_COLOR);
//        g.fillRect(0, 0, WIDTH, HEIGHT);
//
//        g.setColor(BAR_COLOR);
//        final int barWidth = 20;
//        for (int itemIndex = 0; itemIndex < inputData.length; itemIndex++) {
//            final int x = OUTER_MARGIN + 25 * itemIndex;
//            final int barHeight = 10 * inputData[itemIndex];
//            final int y = 0;//[...y is calculated using barHeight; the higher the bar, the lower y should be...];
//            g.fillRect(x, y, barWidth, barHeight);
//        }
//    }
//}