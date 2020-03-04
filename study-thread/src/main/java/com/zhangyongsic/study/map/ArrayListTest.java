package com.zhangyongsic.study.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: study
 * @description:
 * @author: zhang yong
 * @create: 2020/03/04
 */
public class ArrayListTest {

    public static void main(String[] args) {
        String[] s = new String[]{"zy1","zy2","zy3","zy4","zy5","zy6","zy7","zy8","zy9","zy10"};
        List<String>  strings = new ArrayList<String>(Arrays.asList(s));
        for (int i = 1;i<100;i++){
            strings.add("ly"+i);
            System.out.println(strings.size());
        }
    }
}
