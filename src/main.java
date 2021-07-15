import java.awt.image.BufferedImage;
import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class main{

    public static void main(String[] args) throws IOException {
        
        File file = new File("./img/image.png");
        BufferedImage image = null;

        try {
            image = ImageIO.read(file);
        }catch(IOException exception){
            exception.printStackTrace();
        }

        int width = image.getWidth();
        int heigth = image.getHeight();

        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < width; j++) {
                // Pega cor
            }
        }
    }
}