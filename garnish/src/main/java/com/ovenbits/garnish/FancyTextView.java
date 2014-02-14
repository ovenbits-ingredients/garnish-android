package com.ovenbits.garnish;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Html;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

public class FancyTextView extends TextView{

    private static final String TAG = "FancyTextView";
    private Typeface mTypeface;
    private TypedArray mTypedArray;


    public FancyTextView(Context context) {
        super(context);
    }

    public FancyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        loadAttributes(context, attrs);
    }

    public FancyTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        loadAttributes(context, attrs);
    }

    private void loadAttributes(Context context, AttributeSet attrs) {
        if (mTypedArray == null) {
            mTypedArray = context.obtainStyledAttributes(attrs, R.styleable.FancyTextView);
            final int  N = mTypedArray.getIndexCount();

            for (int i = 0; i < N; ++i) {
                int currentAttr = mTypedArray.getIndex(i);

                if (currentAttr == R.styleable.FancyTextView_textFont) {
                    loadTypeface(context, mTypedArray.getString(i));
                }
            }
        }
    }

    private void loadTypeface(Context context, String fontFileName) {
        if (mTypeface == null) {
            try {
                mTypeface = Typeface.createFromAsset(context.getAssets(), fontFileName);
            } catch (Exception e) {
                Log.e(TAG, "Failed to load font: " + e.getMessage());
                mTypeface = Typeface.DEFAULT;
            }
            setTypeface(mTypeface);
        }
    }
}
