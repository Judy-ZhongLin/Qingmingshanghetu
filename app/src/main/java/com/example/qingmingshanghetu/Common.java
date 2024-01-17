package com.example.qingmingshanghetu;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Common {

    /**
     * 初始化状态常量
     */
    public static final int STATUS_INIT = 1;

    /**
     * 图片放大状态常量
     */
    public static final int STATUS_OUT = 2;

    /**
     * 图片缩小状态常量
     */
    public static final int STATUS_IN = 3;

    /**
     * 图片拖动状态常量
     */
    public static final int STATUS_MOVE = 4;
    /**@Description 需要播放声音的区域所在的坐标 // 0 1 2 3
     * 一个区域以左上角和右下角两个点的坐标划分，(500,300)是左上角(1100,600)是右下角
     * */

    //郊野 市区 码头 河流
    //    public static final int ZonesX[]={-500,-1100};
//    public static final int ZonesY[]={-300,-600};
    public static final int jiaoye[] = {-300,-300,-1100,-1200};
    public static final int shiqv[] = {-2000,-200,-4000,-800};
    public static final int matou[] = {-4000,-300,-6000,-600};
    public static final int heliu[] = {-1500,-600,-10000,-5000};
    public static Map<Integer, int[]> common=new HashMap<Integer, int[]>();
    public static void init(){
        common.put(1,jiaoye);
        common.put(2,matou);
        common.put(3,shiqv);
        common.put(4,heliu);
    }

}
