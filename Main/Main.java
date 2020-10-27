import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        int a = A.nextInt();
        System.out.println("你可以在此处输入" + a + "段话：");

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            Scanner B = new Scanner(System.in);
            String s = B.next();
            list.add(s);
        }

        //字符替换
        ArrayList<String> fin = new ReplaceMethod().ReplaceMethod(list);
        //分割
        ArrayList<String> fin1 = new CutMethod().cutlist(fin);
        //返回答案
        ArrayList<String> fin2 = new FindAnswer().FindTheAnswer(fin1);
        System.out.println(fin2);
    }
}
