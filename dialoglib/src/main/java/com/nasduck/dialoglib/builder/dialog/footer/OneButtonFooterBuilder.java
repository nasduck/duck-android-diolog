package com.nasduck.dialoglib.builder.dialog.footer;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.interfaces.IDialogFooter;
import com.nasduck.dialoglib.config.DialogConfig;
import com.nasduck.dialoglib.dialog.footer.OneButtonFooter;
import com.nasduck.dialoglib.interfaces.OnNormalClickListener;

public class OneButtonFooterBuilder implements IDialogFooter {

    private OnNormalClickListener normalClickListener;

    private float cornerRadius;
    private int backgroundColor;
    private int clickBackgroundColor;

    private String normalButtonText;
    private int normalButtonTextColor;
    private int normalButtonTextSize;

    public OneButtonFooterBuilder() {
        cornerRadius = 0f;
        clickBackgroundColor = R.color.gray_light;
        normalButtonText = "确定";
        normalButtonTextColor = R.color.text_black;
        normalButtonTextSize = 16;
        normalClickListener = null;
    }

    public static OneButtonFooterBuilder create() {
        return new OneButtonFooterBuilder();
    }

    @Override
    public View getView(FragmentActivity activity, Context context, String tag) {
        return OneButtonFooter.create(activity, context, new DialogConfig(OneButtonFooterBuilder.this), tag);
    }

    @Override
    public void getCornerRadius(float cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    @Override
    public void getNormalStatusColor(int color) {
        this.backgroundColor = color;
    }

    /**********************************************************************************************/

    public OneButtonFooterBuilder setClickBackgroundColor(int clickBackgroundColor) {
        this.clickBackgroundColor = clickBackgroundColor;
        return this;
    }

    public OneButtonFooterBuilder setNormalClickListener(OnNormalClickListener normalClickListener) {
        this.normalClickListener = normalClickListener;
        return this;
    }

    public OneButtonFooterBuilder setNormalButtonText(String normalButtonText) {
        this.normalButtonText = normalButtonText;
        return this;
    }

    public OneButtonFooterBuilder setNormalButtonTextColor(int normalButtonTextColor) {
        this.normalButtonTextColor = normalButtonTextColor;
        return this;
    }

    public OneButtonFooterBuilder setNormalButtonTextSize(int normalButtonTextSize) {
        this.normalButtonTextSize = normalButtonTextSize;
        return this;
    }

    /**********************************************************************************************/

    public float getCornerRadius() {
        return cornerRadius;
    }

    public int getClickBackgroundColor() {
        return clickBackgroundColor;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public OnNormalClickListener getNormalClickListener() {
        return normalClickListener;
    }

    public String getNormalButtonText() {
        return normalButtonText;
    }

    public int getNormalButtonTextColor() {
        return normalButtonTextColor;
    }

    public int getNormalButtonTextSize() {
        return normalButtonTextSize;
    }
}