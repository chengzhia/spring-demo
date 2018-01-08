package com.chengzhi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by xebest on 2017/12/4.
 */
public class ForTest {
    public static void main(String[] args){
        System.out.println("1".equals(new Integer(1)));
        List<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("cc")) iterator.remove();
        }
        System.out.println(list.toString());
//        iter  增强for快捷键
//        itli 普通for快捷键
    }
}
