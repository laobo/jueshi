package com;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by duanxiangchao on 2018/6/28
 */
public class Test {

    public static String getAmount(Integer amount){
        if(amount < 10000){
            return amount.toString();
        }
        if(amount % 10000 < 1000){
            return amount / 10000 + "万";
        }
        BigDecimal bigDecimal = new BigDecimal(amount);
        return bigDecimal.divide(new BigDecimal(10000)).setScale(1, RoundingMode.HALF_DOWN).toString() + "万";
    }

    public static void main(String[] args) {

        System.out.println(DigestUtils.md5Hex("{\"examRoomId\":null,\"examFormat\":\"STRUCTURE\",\"examName\":\"2\",\"onlineTime\":1547568000000,\"startTime\":1547568120000,\"endTime\":1547575800000,\"userAmount\":2,\"enterType\":\"OPEN_ENROLLMENT\",\"waitExam\":\"FIVE\",\"teacherName\":\"2\",\"description\":\"2\",\"courseId\":\"null\",\"questionAmount\":2,\"examType\":null,\"nationAreaId\":-1,\"examYear\":-1,\"questionTypeId\":\"-1\",\"questionIds\":[]}"));

        List<String> list = new ArrayList<String>();
        list.add("laobo1");
        list.add("laobo2");
        list.add("laobo3");
        list.add("laobo4");
        list.add("laobo5");
        list.add("laobo6");
        list.add("laobo7");
        list.add("laobo8");
        list.add("laobo9");
        list.add("laobo0");

        Collections.shuffle(list);

        System.out.println(list);

        List<Long> list1 = Collections.emptyList();
        List<Long> list2 = new ArrayList<>();
        list2.add(1L);
        list1.addAll(list2);
        Collections.emptyList().addAll(list2);
        System.out.println("123");

    }




}
