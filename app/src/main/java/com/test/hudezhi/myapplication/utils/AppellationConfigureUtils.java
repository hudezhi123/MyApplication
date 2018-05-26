package com.test.hudezhi.myapplication.utils;

import com.test.hudezhi.myapplication.bean.FamilyPerson;

import java.util.ArrayList;
import java.util.List;

/**
 * created by hudezhi on 2018/5/26
 * 根据自己的身份配置陪伴人员称呼
 */

public class AppellationConfigureUtils {

    private static final int GRAND_PARENTS = 1;
    private static final int PARENT = 2;
    private static final int SON = 3;
    private static final int GRAND_SON = 4;

    /**
     * 等级：rank  only in 5
     * 爷爷   奶奶
     * 爸爸   妈妈
     * 兄弟   姐妹
     * 儿子   女儿
     * 孙子   孙女
     * <p>
     * 序列：
     */
    public static List<String> Companies(FamilyPerson selfAppellation) {
        List<String> appellations = new ArrayList<>();
        int rank = selfAppellation.getRank();
        int order = selfAppellation.getOrder();
        String sex = selfAppellation.getSex();
        switch (rank) {
            case GRAND_PARENTS:

                break;
            case PARENT:
                if (FamilyPerson.FEMALE.equals(selfAppellation.getSex())) {
                    appellations.add("丈夫");
                } else if (FamilyPerson.MALE.equals(selfAppellation.getSex())) {
                    appellations.add("妻子");
                }
                partAppellation(rank, order);
                break;
            case SON:
                appellations.add("爸爸");
                appellations.add("妈妈");
                break;
            case GRAND_SON:

                break;
        }
        appellations.addAll(partAppellation(rank, order));
        return null;
    }

    /**
     * @param rank
     * @param order
     * @return
     */
    private static List<String> partAppellation(int rank, int order) {
        List<String> apps = new ArrayList<>();
        switch (rank) {
            case PARENT:
                apps.add("女儿");
                apps.add("大儿子");
                apps.add("二儿子");
                apps.add("三儿子");
                break;
            case SON:
                switch (order) {
                    case 1:
                        apps.add("大弟");
                        apps.add("二弟");
                        apps.add("三弟");
                        break;
                    case 2:
                        apps.add("大姐");
                        apps.add("二弟");
                        apps.add("三弟");
                        break;
                    case 3:
                        apps.add("大姐");
                        apps.add("大哥");
                        apps.add("三弟");
                        break;
                    case 4:
                        apps.add("大姐");
                        apps.add("大哥");
                        apps.add("二哥");
                        break;
                }
                break;
        }
        return apps;
    }
}
