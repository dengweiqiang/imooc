package com.imooc.idea;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("zhangsan");
        stringList.add("lisi");
        stringList.add("wangwu");

        for (String str : stringList) {
            System.out.println(str);
        }

        String str = "\"kkkk\"";

        System.out.println(str);

        System.out.println(args[0]);

        System.out.println("运行成功");

}
    public static void strDiff(){
           String  str = "{\"kkkk\"}";
    }


    public String kk() {
        return null;
    }
}
