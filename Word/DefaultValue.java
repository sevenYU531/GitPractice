import java.util.ArrayList;
import java.util.Random;

public class DefaultValue {
    ArrayList<String> defaultvalue = new ArrayList<>();

    //添加缺省值
    public void AddDefault(){
        defaultvalue.add("听不懂...");
        defaultvalue.add("说人话！");
        defaultvalue.add("我还没有学习这个");
        defaultvalue.add("那个,你能换种说法嘛?");
    }

    //随机返回缺省值
    public String ReturnDefaultValue(){
        int r = new Random().nextInt(4);
        return defaultvalue.get(r);
    }
}
