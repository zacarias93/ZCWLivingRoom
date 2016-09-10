package lee.zac.ZCWLivingRoom;


import static org.junit.Assert.*;
import org.junit.Test;


public class TelevisionTest {

    @Test
    public void getVolumeTest(){
        Television television = new Television();
        Integer expectedValue = 0;
        Integer actualValue = television.getVolume();
        assertEquals("The value should be 0", expectedValue, actualValue);
    }

    @Test
    public void setVolumeTest(){
        Television television = new Television();
        Integer expectedValue = 7;
        television.setVolume(7);
        Integer actualValue = television.getVolume();
        assertEquals("The value should be ", expectedValue, actualValue);
    }
}
