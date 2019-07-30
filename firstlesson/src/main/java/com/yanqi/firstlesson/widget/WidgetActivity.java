package com.yanqi.firstlesson.widget;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.yanqi.firstlesson.R;

/**
 * author : yanqi
 * date   : 2019-07-30 11:31
 */
public class WidgetActivity extends Activity {

    private TextView mTvTextView;
    private EditText mEditText;
    private CheckBox mCheckBox;
    private ProgressBar mProgressBar;
    private SeekBar mSeekBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);

        //textView相关
        mTvTextView = findViewById(R.id.tv_textview);
        spannableTextView();
        clickTextView();

        //editView相关
        mEditText = findViewById(R.id.et_edit_text);
        clickEditText();

        //checkBox相关
        mCheckBox = findViewById(R.id.checkbox);
        clickCheckBox();

        //seekBar和Progressbar
        mProgressBar = findViewById(R.id.progress_bar);
        mSeekBar = findViewById(R.id.seek_bar);
        seekTo();

    }

    /**
     * 多彩的文字
     */
    private void spannableTextView() {
        SpannableString spStr = new SpannableString("这是一段多彩的文字");
        spStr.setSpan(new ForegroundColorSpan(Color.RED), 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spStr.setSpan(new StrikethroughSpan(), spStr.length() - 3, spStr.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        mTvTextView.setText(spStr);
    }

    /**
     * 给textview设置click事件
     */
    private void clickTextView() {
        mTvTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WidgetActivity.this, "点了textview", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void clickEditText() {
        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.i("studylog", "beforeTextChanged=" + s + "&start=" + start + "&count=" + count + "&after=" + after);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.i("studylog", "onTextChanged=" + s + "&start=" + start + "&count=" + count + "&before=" + before);
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.i("studylog", "Editable=" + s.toString());

            }
        });
    }

    private void clickCheckBox() {
        mCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mTvTextView.setText("现在的点击状态=" + isChecked);
            }
        });
    }

    private void seekTo() {
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mProgressBar.setProgress(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
