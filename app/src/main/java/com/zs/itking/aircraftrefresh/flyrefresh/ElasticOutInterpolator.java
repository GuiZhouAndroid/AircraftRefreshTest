package com.zs.itking.aircraftrefresh.flyrefresh;

import android.view.animation.Interpolator;

/**
 * created by on 2021/8/15
 * 描述：
 *
 * @author ZSAndroid
 * @create 2021-08-15-20:50
 */
public class ElasticOutInterpolator implements Interpolator {

    @Override
    public float getInterpolation(float t) {
        if (t == 0) return 0;
        if (t >= 1) return 1;
        float p=.3f;
        float s=p/4;
        return ((float)Math.pow(2,-10*t) * (float)Math.sin( (t-s)*(2*(float)Math.PI)/p) + 1);
    }
}
