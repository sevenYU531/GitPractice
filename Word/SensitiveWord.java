import java.util.*;

public class SensitiveWord {
    HashMap<String,ArrayList<String>> sw= new HashMap<>();
    ArrayList<String> answer = new ArrayList<>();
    int[] weight = {0,0,0};//为3个敏感词设定初始权重

    //添加敏感词
    public void AddSensitiveWord(){
        String str1 = new String("你妈的");
        String str2 = new String("操你妈");
        String str3= new String("傻逼");

        answer.add("****");
        answer.add("你妈就这么教你说话的?");
        answer.add("赶紧给爷爬！！！");
        answer.add("自重一点好吗?");

        sw.put(str1,answer);
        sw.put(str2,answer);
        sw.put(str3,answer);
    }

    //判断是否有敏感词
    public boolean IfSensitiveWord(String str){
        Set<String> s = sw.keySet();//取出所有key值，即敏感词
        Iterator<String> it = s.iterator();
        while(it.hasNext()){
            if(str.indexOf(it.next()) != -1) {
                break;
            }
            else{
                if(!it.hasNext()){
                    return false;
                }
            }
        }
        return true;
    }

    //判断权重
    public int Min(int[] a){
        int fin = a[0];
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            if(fin > a[i]){
                fin = a[i];
                num = i;
            }
        }
        return num;
    }
    public int[] Weight(int[] a){
        int random = new Random().nextInt(3);
        if(random == 0){
            a[Min(a)]++;
        }
        else if(random == 1){
            a[Min(a)]+=2;
        }
        else if(random == 2){
            a[Min(a)]+=3;
        }
        return a;
    }

    //返回敏感词结果
    public String ReturnSWAnswer(){
        String an = new String();
            an = answer.get(Min(weight));
            weight = Weight(weight);

        return an;
    }
}
