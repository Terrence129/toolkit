package io.yaqi.toolkit.basicEnum;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/8/27 00:29
 * @Param
 **/
public class SeasonInClass {
    public final String Spring = "Spring";
    public final String summerDuration = "6-8";

    public String season;

    public SeasonInClass(String season) {
        this.season = season;
    }

    public String getDuration() {
        switch (season) {
            case Spring:
                return summerDuration;
        }
        return "no this season";
    }
}
