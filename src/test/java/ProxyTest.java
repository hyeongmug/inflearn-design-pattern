import org.junit.jupiter.api.Test;

public class ProxyTest {

    @Test
    public void testProxy() {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        image1.display();
        image2.display();
        image1.display();
    }

    public interface Image {
        void display();
    }

    public class RealImage implements Image {
        private String fileName;

        public RealImage(String fileName) {
            this.fileName = fileName;
            loadFromDisk(fileName);
        }

        @Override
        public void display() {
            System.out.println("Displaying " + fileName);
        }

        private void loadFromDisk(String fileName) {
            System.out.println("Loading " + fileName);
        }
    }

    public class ProxyImage implements Image {
        private RealImage realImage;
        private String fileName;

        public ProxyImage(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void display() {
            if (realImage == null) {
                realImage = new RealImage(fileName);
            }
            realImage.display();
        }
    }

}
