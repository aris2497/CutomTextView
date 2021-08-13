package com.example.cutomtext;

import android.content.Context;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;

public class CustomTextView extends AppCompatTextView {

    public CustomTextView(@NonNull Context context, String colorName,
                          int colorId) {
        super(context);

        int paddingSize = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 20,
                context.getResources().getDisplayMetrics()
        );

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.setMargins(0, paddingSize, 0, 0);
        setLayoutParams(lp);

        setPadding(0, paddingSize, 0, paddingSize);
        setBackgroundColor(getResources().getColor(colorId));
        setText(colorName);

        setGravity(Gravity.CENTER);


    }
}

