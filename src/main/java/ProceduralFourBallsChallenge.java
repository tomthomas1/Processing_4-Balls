import processing.core.PApplet;

public class ProceduralFourBallsChallenge extends PApplet{

    public static final int WIDTH = 700;
    public static final int HEIGHT = 540;
    public static final int DIAMETER = 20;
    int x_axis=1;

    public static void main(String[] args) {
        PApplet.main("ProceduralFourBallsChallenge",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {
        for (int circleNo = 1; circleNo <=4 ; circleNo++) {
            drawCircle(circleNo);
        }
        x_axis++;
    }

    private void drawCircle(int i) {
        ellipse(x_axis * i, HEIGHT * i / 5, DIAMETER, DIAMETER);
    }
}
