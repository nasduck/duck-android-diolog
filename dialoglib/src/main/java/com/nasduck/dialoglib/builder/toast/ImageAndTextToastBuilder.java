package com.nasduck.dialoglib.builder.toast;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.base.BaseToastBuilder;
import com.nasduck.dialoglib.config.ToastConfig;
import com.nasduck.dialoglib.enums.ToastType;

public class ImageAndTextToastBuilder extends BaseToastBuilder {

    private FragmentActivity mActivity;

    private Integer image;
    private String text;       // content no set
    private Integer textColor; // 1A1A1A
    private Integer textSize;  // 16
    private Integer bgColor ;  // 99000000
    private Integer cornerRadius; // 3
    private Integer paddingHorizontal; // 32
    private Integer paddingVertical;   // 20

    public ImageAndTextToastBuilder(FragmentActivity activity) {
        mHandler.set(this);
        delay = 1500;
        mActivity = activity;

        image = 0;
        text = "";
        textColor = R.color.text_white;
        textSize = 16;
        bgColor = R.color.black_alpha_60;
        cornerRadius = 3;
        paddingHorizontal = 32;
        paddingVertical = 20;
    }

    @Override
    public FragmentActivity getActivity() {
        return mActivity;
    }

    @Override
    public ToastConfig build() {
        return new ToastConfig(ImageAndTextToastBuilder.this);
    }

    @Override
    public ToastType getType() {
        return ToastType.TEXT_AND_IMAGE_TOAST;
    }

    /**********************************************************************************************/

    public ImageAndTextToastBuilder setImage(Integer image) {
        this.image = image;
        return this;
    }

    public ImageAndTextToastBuilder setText(String text) {
        this.text = text;
        return this;
    }

    public ImageAndTextToastBuilder setTextColor(Integer textColor) {
        this.textColor = textColor;
        return this;
    }

    public ImageAndTextToastBuilder setTextSize(Integer textSize) {
        this.textSize = textSize;
        return this;
    }

    public ImageAndTextToastBuilder setBgColor(Integer bgColor) {
        this.bgColor = bgColor;
        return this;
    }

    public ImageAndTextToastBuilder setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
        return this;
    }

    public ImageAndTextToastBuilder setPaddingHorizontal(Integer paddingHorizontal) {
        this.paddingHorizontal = paddingHorizontal;
        return this;
    }

    public ImageAndTextToastBuilder setPaddingVertical(Integer paddingVertical) {
        this.paddingVertical = paddingVertical;
        return this;
    }

    /**********************************************************************************************/

    public Integer getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public Integer getTextColor() {
        return textColor;
    }

    public Integer getTextSize() {
        return textSize;
    }

    public Integer getBgColor() {
        return bgColor;
    }

    public Integer getCornerRadius() {
        return cornerRadius;
    }

    public Integer getPaddingHorizontal() {
        return paddingHorizontal;
    }

    public Integer getPaddingVertical() {
        return paddingVertical;
    }
}