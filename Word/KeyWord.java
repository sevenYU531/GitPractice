import java.util.*;

public class KeyWord {
    LinkedHashMap<String, ArrayList<String>> kw = new LinkedHashMap<>();

    public void AddKeyWord(){
        String keyword1 = new String("你好");
        ArrayList<String> answer1 = new ArrayList<>();
        answer1.add("你好。");
        answer1.add("爷很好！");
        answer1.add("谢谢，你也好！");
        answer1.add("好的呢");

        String keyword2 = new String("再见");
        ArrayList<String> answer2 = new ArrayList<>();
        answer2.add("再见。");
        answer2.add("滚哇！");
        answer2.add("拜拜~");
        answer2.add("好的呢");

        String keyword3 = new String("什么");
        ArrayList<String> answer3 = new ArrayList<>();
        answer3.add("嗯？");
        answer3.add("什么什么？");
        answer3.add("不知道你在那说啥了。");

        kw.put(keyword3,answer3);
        kw.put(keyword1,answer1);
        kw.put(keyword2,answer2);
    }

    //判断字符串中是否有关键词
    public boolean IfKeyWord(String str){
        Set<String> s = kw.keySet();
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

    //返回关键词的回答
    public String ReturnKWAnswer(String str){
        Integer count = 0;  //用于存储关键词出现的个数
        int max = 0;
        String maxkey = new String();
        String an = new String();

        Set<String> s = kw.keySet();    //取出全部key值，即关键字
        Iterator<String> it = s.iterator();
        while(it.hasNext()){
            String key = it.next();
            if(str.indexOf(key) != -1) {
                while (str.indexOf(key) != -1) {
                    count++;
                    str = str.substring(str.indexOf(key) + key.length());
                }
            }
            if(count > max){
                maxkey = key;
            }
            count = 0;
        }
        an = kw.get(maxkey).get(new Random().nextInt(kw.get(maxkey).size()));

        return an;
    }

}
