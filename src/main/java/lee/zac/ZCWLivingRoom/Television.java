package lee.zac.ZCWLivingRoom;

/**
 * Created by zaclee on 9/9/16.
 */
public class Television {
    private Integer volume;
    private Integer channel;

    public Television() {
        volume = 0;
        channel = 0;
    }

    public Integer getVolume(){
        return volume;
    }

    public void setVolume(Integer amount) {
        this.volume = amount;
    }
}
