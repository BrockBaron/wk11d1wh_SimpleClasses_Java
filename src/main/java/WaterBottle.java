public class WaterBottle {
    private int volume;


    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public int volumeAfterDrink() {
        int drink = 10;
        return this.volume - drink;
//        for loop, append item each time till 0
//        get volume, if volume is greater than 0 then reduce volume by 10
//        append volume to new value until 0
//        return new volume, or 0 - empty
    }

    public int volumeEmpty() {
        return this.volume - this.volume;
//        get current volume
//        subtract current volume
    }


    public int volumeFull() {
        return this.volume;

//        get current volume
//        add fluid up to 100
    }
}
