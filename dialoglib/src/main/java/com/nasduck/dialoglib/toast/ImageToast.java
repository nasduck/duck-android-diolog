package com.nasduck.dialoglib.toast;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.nasduck.dialoglib.base.BaseToast;
import com.nasduck.dialoglib.base.ConfigName;
import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.config.ToastImageConfigBean;
import com.nasduck.dialoglib.base.BaseDialogFragment;

public class ImageToast extends BaseToast {

    private FrameLayout mLayoutBackground;
    private ImageView mIvImage;

    private int mImage;

    public ImageToast() {

    }

    public static ImageToast newImageToast(ToastImageConfigBean configBean){
        ImageToast fragment = new ImageToast();
        Bundle args = new Bundle();
        args.putInt(ConfigName.BACKGROUND, configBean.getBackground());
        args.putBoolean(ConfigName.IS_CANCELABLE, configBean.isCancelable());
        args.putBoolean(ConfigName.HAS_SHADE, configBean.isHasShade());
        args.putInt(ConfigName.IMAGE, configBean.getImage());
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mBackground = getArguments().getInt(ConfigName.BACKGROUND);
            isCancelable = getArguments().getBoolean(ConfigName.IS_CANCELABLE);
            hasShade = getArguments().getBoolean(ConfigName.HAS_SHADE);
            mImage = getArguments().getInt(ConfigName.IMAGE);
        }
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.toast_image;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        mLayoutBackground = view.findViewById(R.id.background);
        mIvImage = view.findViewById(R.id.iv_image);

        mLayoutBackground.setBackgroundResource(mBackground);
        setShade(hasShade);
        setCancelable(isCancelable);
        mIvImage.setImageDrawable(getResources().getDrawable(mImage));
    }
}
