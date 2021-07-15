import java.awt.image.BufferedImage;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class main {

    public static void main(String[] args) throws IOException {

        File file = new File("D:/rafav/Documents/CEFET/Projetos/desafio-meteor/src/img/meteor.png");
        BufferedImage image = null;

        ArrayList<Color> colors = new ArrayList<Color>();

        try {
            image = ImageIO.read(file);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        int width = image.getWidth();
        int heigth = image.getHeight();

        int redPixels = 0, whitePixels = 0, meteorsFallingWater = 0;

        boolean redFound = false;

        for (int x = 0; x < width; x++) {

            int redCountAux = 0;

            for (int y = 0; y < heigth; y++) {

                int rgb = image.getRGB(x, y);

                Color color = new Color(rgb);

                if (color.equals(Color.RED)) {
                    redCountAux++;
                    redFound = true;
                }

                if (color.equals(Color.BLUE) && redFound) {
                    meteorsFallingWater += redCountAux;
                    redFound = false;
                    break;
                }

                if (color.equals(Color.WHITE)) {
                    whitePixels++;
                }

            }
            redPixels += redCountAux;
            redFound = false;
        }

        System.out.printf("Number of Stars: %d\nNumber of Meteors: %d\nMeteors falling on water: %d\n",
                whitePixels, redPixels, meteorsFallingWater);
    }
}