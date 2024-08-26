import io.yaqi.toolkit.basicEnum.SeasonInClass;
import io.yaqi.toolkit.basicEnum.SeasonInEnum;

/**
 * @author chenyaqi
 * @Description
 * @Date 2024/8/27 00:14
 * @Param
 **/
public class Main {
    public static void main(String[] args) {
        SeasonInEnum resp = SeasonInEnum.AUTUMN;
        System.out.println(resp.getDuration());

        SeasonInClass resp1 = new SeasonInClass("Spring");
        System.out.println(resp1.getDuration());
    }
}
