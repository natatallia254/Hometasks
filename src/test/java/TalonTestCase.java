import Lesson_14.TalonBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TalonTestCase {

    @Test
    @DisplayName("Открытие всех ресурсов для регистрации на Talon.by и последующая регистрация через VK.com")
    public void TalonTest() throws InterruptedException {
        TalonBy talon = new TalonBy();
        talon.TalonByTest("natallia254@yandex.ru", "bna_nata1985");
    }


}
