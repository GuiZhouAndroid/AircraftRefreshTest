package com.zs.itking.aircraftrefresh.flyrefresh;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.zs.itking.aircraftrefresh.R;

import jp.wasabeef.recyclerview.animators.BaseItemAnimator;

/**
 * created by on 2021/8/15
 * 描述：
 *
 * @author ZSAndroid
 * @create 2021-08-15-20:57
 */
public class SampleItemAnimator extends BaseItemAnimator {

    @Override
    protected void preAnimateAddImpl(RecyclerView.ViewHolder holder) {
        View icon = holder.itemView.findViewById(R.id.icon);
        icon.setRotationX(30);
        View right = holder.itemView.findViewById(R.id.right);
        right.setPivotX(0);
        right.setPivotY(0);
        right.setRotationY(90);
    }

    @Override
    protected void animateRemoveImpl(RecyclerView.ViewHolder viewHolder) {
    }

    @Override
    protected void animateAddImpl(final RecyclerView.ViewHolder holder) {
        View target = holder.itemView;
        View icon = target.findViewById(R.id.icon);
        Animator swing = ObjectAnimator.ofFloat(icon, "rotationX", 45, 0);
        swing.setInterpolator(new OvershootInterpolator(5));

        View right = holder.itemView.findViewById(R.id.right);
        Animator rotateIn = ObjectAnimator.ofFloat(right, "rotationY", 90, 0);
        rotateIn.setInterpolator(new DecelerateInterpolator());

        AnimatorSet animator = new AnimatorSet();
        animator.setDuration(getAddDuration());
        animator.playTogether(swing, rotateIn);

        animator.start();
    }

    @Override
    public boolean animateDisappearance(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull ItemHolderInfo preLayoutInfo, @Nullable ItemHolderInfo postLayoutInfo) {
        return false;
    }

    @Override
    public boolean animateAppearance(@NonNull RecyclerView.ViewHolder viewHolder, @Nullable ItemHolderInfo preLayoutInfo, @NonNull ItemHolderInfo postLayoutInfo) {
        return false;
    }

    @Override
    public boolean animatePersistence(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull ItemHolderInfo preLayoutInfo, @NonNull ItemHolderInfo postLayoutInfo) {
        return false;
    }

    @Override
    public boolean animateChange(@NonNull RecyclerView.ViewHolder oldHolder, @NonNull RecyclerView.ViewHolder newHolder, @NonNull ItemHolderInfo preLayoutInfo, @NonNull ItemHolderInfo postLayoutInfo) {
        return false;
    }
}
