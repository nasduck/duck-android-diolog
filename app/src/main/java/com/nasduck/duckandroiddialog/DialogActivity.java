package com.nasduck.duckandroiddialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nasduck.dialoglib.DuckDialog;
import com.nasduck.dialoglib.base.enums.TextStyle;
import com.nasduck.dialoglib.dialog.controller.DialogController;
import com.nasduck.dialoglib.dialog.interfaces.OnNegativeClickListener;
import com.nasduck.dialoglib.dialog.interfaces.OnNormalClickListener;
import com.nasduck.dialoglib.dialog.interfaces.OnPositiveClickListener;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    public void onTipDialog(View view) {
        DuckDialog.showNoTitleTipDialog(this, "content", "确定",
                new OnNormalClickListener() {
                    @Override
                    public void onNormalClick() {
                        DuckDialog.show(DialogActivity.this, "我被点击了");
                    }
                });
    }

    public void onTitleTipDialog(View view) {
        DuckDialog.showTitleTipDialog(this, "title", "content", "确定",
                new OnNormalClickListener() {
                    @Override
                    public void onNormalClick() {
                        DuckDialog.show(DialogActivity.this, "我被点击了");
                    }
                });
    }

    public void onSelectDialog(View view) {
        DuckDialog.showNoTitleSelectDialog(this,
                "content", "确定", "取消"
                , new OnPositiveClickListener() {
                    @Override
                    public void onPositiveClick() {
                        DuckDialog.show(DialogActivity.this, "确定");
                    }
                }, new OnNegativeClickListener() {
                    @Override
                    public void onNegativeClick() {
                        DuckDialog.show(DialogActivity.this, "取消");
                    }
                });
    }

    public void onTitleSelectDialog(View view) {
        DuckDialog.showTitleSelectDialog(this,
                "title", "content", "确定", "取消"
                , new OnPositiveClickListener() {
                    @Override
                    public void onPositiveClick() {
                        DuckDialog.show(DialogActivity.this, "确定");
                    }
                }, new OnNegativeClickListener() {
                    @Override
                    public void onNegativeClick() {
                        DuckDialog.show(DialogActivity.this, "取消");
                    }
                });
    }

    public void onCustomDialog(View view) {
        DialogController.createTextDialog(this)
                .setTitleTextStyle(TextStyle.BOLD)
                .setTitle("1111")
                .show();
    }
}