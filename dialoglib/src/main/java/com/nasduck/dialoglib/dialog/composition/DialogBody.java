package com.nasduck.dialoglib.dialog.composition;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.nasduck.dialoglib.dialog.config.BodyConfig;
import com.nasduck.dialoglib.utils.DensityUtils;

public class DialogBody extends FrameLayout {

    private BodyConfig mConfig;

    public static DialogBody create(Context context, BodyConfig config) {
        return new DialogBody(context, config);
    }

    public DialogBody(Context context, BodyConfig config) {
        super(context);
        mConfig = config;
        init(context);
    }

    private void init(Context context) {

        this.setBackgroundResource(mConfig.getBgColor());

        TextView tv = new TextView(context);
        tv.setText(mConfig.getContent());
        tv.setTextSize(mConfig.getContentTextSize());
        tv.setTextColor(getResources().getColor(mConfig.getContentTextColor()));
        tv.setGravity(mConfig.getGravity());

        // LayoutGravity
        LayoutParams lp = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        lp.gravity = mConfig.getLayoutGravity();
        tv.setLayoutParams(lp);

        // Padding
        tv.setPadding(DensityUtils.dp2px(context, mConfig.getPaddingLeft()),
                DensityUtils.dp2px(context, mConfig.getPaddingTop()),
                DensityUtils.dp2px(context, mConfig.getPaddingRight()),
                DensityUtils.dp2px(context, mConfig.getPaddingBottom()));

        this.addView(tv);
    }

    public void setCornerRadius(Context context, int cornerRadius) {
        float radius =cornerRadius;
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadii(new float[]{DensityUtils.dp2px(context, radius),
                DensityUtils.dp2px(context, radius),
                DensityUtils.dp2px(context, radius),
                DensityUtils.dp2px(context, radius), 0, 0, 0, 0});
        drawable.setColor(getResources().getColor(mConfig.getBgColor()));
        this.setBackground(drawable);
    }
}