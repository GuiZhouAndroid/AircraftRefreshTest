package com.zs.itking.aircraftrefresh.flyrefresh;

/**
 * created by on 2021/8/15
 * 描述：
 *
 * @author ZSAndroid
 * @create 2021-08-15-20:48
 */
public interface IPullHeader {
    void onPullProgress(PullHeaderLayout parent, int state, float progress);
}
