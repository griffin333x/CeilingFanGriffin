import com.griffin.ceilingfangriffin.CeilingFan;
import com.griffin.ceilingfangriffin.enums.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.Month;

public class CeilingFanTest {
    private CeilingFan fan;

    @BeforeEach
    public void setUp() {
        fan = new CeilingFan();
    }

    @Test
    public void testSpeed() {
        assertEquals(Speed.OFF, fan.getSpeed());
        fan.speedCord();
        assertEquals(Speed.LOW, fan.getSpeed());
        fan.speedCord();
        assertEquals(Speed.MEDIUM, fan.getSpeed());
        fan.speedCord();
        assertEquals(Speed.HIGH, fan.getSpeed());
        fan.speedCord();
        assertEquals(Speed.OFF, fan.getSpeed());
    }

    @Test
    public void testDirection() {
        assertEquals(Direction.CLOCKWISE, fan.getDirection());
        fan.directionCord();
        assertEquals(Direction.COUNTERCLOCKWISE, fan.getDirection());
        fan.directionCord();
        assertEquals(Direction.CLOCKWISE, fan.getDirection());
        fan.speedCord();
        assertEquals(Speed.LOW, fan.getSpeed());
        assertEquals(Direction.CLOCKWISE, fan.getDirection());
        fan.directionCord();
        assertEquals(Direction.COUNTERCLOCKWISE, fan.getDirection());
        assertEquals(Speed.LOW, fan.getSpeed());
    }

    @Test
    public void testChristmas() {
        fan.setCurrentDate(LocalDate.of(2024, 12, 25));
        fan.speedCord();
        assertEquals(Speed.OFF, fan.getSpeed());
        fan.speedCord();
        assertEquals(Speed.OFF, fan.getSpeed());
        fan.directionCord();
        assertEquals(Direction.CLOCKWISE, fan.getDirection());
        fan.directionCord();
        assertEquals(Direction.CLOCKWISE, fan.getDirection());
    }
}
