package com.zs.itking.aircraftrefresh;

import android.graphics.Color;

import java.util.Date;

/**
 * created by on 2021/8/15
 * 描述：
 *
 * @author ZSAndroid
 * @create 2021-08-15-20:40
 */
public class ItemData {
    int color;
    public int icon;
    public String title;
    public Date time;

    public ItemData(int color, int icon, String title, Date time) {
        this.color = color;
        this.icon = icon;
        this.title = title;
        this.time = time;
    }

    public ItemData(int icon, String title) {
        this(Color.DKGRAY, icon, title, new Date());
    }
}
