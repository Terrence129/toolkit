package io.yaqi.toolkit.basicEnum;

/**
 * @author chenyaqi
 * @Description 学习枚举类
 * @Date 2024/8/27 00:05
 * @Param
 **/
public enum SeasonInEnum {
    SPRING("Mar - May", 1),
    SUMMER("Jun - Aug", 2),
    AUTUMN("Sep - Dec", 3),
    WINTER("Nov - Feb", 4),;

    private String duration;
    private int number;

    SeasonInEnum(String duration, int number) {
        this.duration = duration;
        this.number = number;
    }

    public String getDuration() {
        return duration + number;
    }
}
