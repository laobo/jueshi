package com.designpattern.observer.test2;

/**
 * Created by duanxiangchao on 2018/5/25
 */
public class Test {

    public static void main(String[] args) {

        SpecialReporter reporter = new SpecialReporter();
        PeopleDaily peopleDaily = new PeopleDaily(reporter);
        GlobalTimes globalTimes = new GlobalTimes(reporter);
        XinhuaDaily xinhuaDaily = new XinhuaDaily(reporter);

        reporter.getNewNews("new news!");
        peopleDaily.remove();
        reporter.getNewNews("another new news!");

    }

}
