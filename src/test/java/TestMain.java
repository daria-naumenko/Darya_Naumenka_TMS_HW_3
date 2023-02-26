import by.naumenka.lesson34.Order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;


public class TestMain {
    private File file;

    @Test
    public void testOrderToString() {
        Order order = new Order();
        order.setName("малина");
        order.setQuantity(3);
        order.setCost(5.99);

        String result = order.toString();

        Assertions.assertEquals(result, order.toString(), "Не равен ожидаемому заказу");
    }

    @Test
    public void createFile() throws IOException {
        file = new File("orderInfo.txt");

        if (!file.exists()) {
            file.createNewFile();
        }
    }
}