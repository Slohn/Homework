import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class Decoder {
    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
    public static BufferedImage decodeToImage(String imageString) {
        BufferedImage image = null;
        byte[] imageByte;
        try {
            Base64.Decoder decoder = Base64.getDecoder();
            imageByte = decoder.decode(imageString);
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            image = ImageIO.read(bis);
            ImageIO.write(image, "png", new File("output.png") );
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }
    public static void main(String[] args) throws IOException {
     decodeToImage(readUsingFiles("D:\\проги\\homework\\Decoder\\src\\s.txt"));
    }
}
