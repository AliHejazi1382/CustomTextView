package com.example.customview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ConstraintSet constraintSet = new ConstraintSet();
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //custom views
        CustomView coloredCustomView = new CustomView(this);
        CustomView boldCustomView = new CustomView(this);
        CustomView italicCustomView = new CustomView(this);
        CustomView boldItalicCustomView = new CustomView(this);
        CustomView coloredBackgroundCustomView = new CustomView(this);
        CustomView bigTextCustomView = new CustomView(this);
        CustomView smallTextCustomView = new CustomView(this);
        CustomView underlinedTextCustomView = new CustomView(this);
        CustomView deletedTextCustomView = new CustomView(this);

        //main layout
        layout = findViewById(R.id.layout);

        //text of custom views
        coloredCustomView.setColoredText("this is a TextView with COLORED text.", 24, 31, Color.RED);
        boldCustomView.setBoldText("this is a TextView with BOLD text", 24, 28);
        italicCustomView.setItalicText("this is a TextView with a ITALIC text.", 24, 30);
        boldItalicCustomView.setBoldItalicText("this is a TextView with a BOLDITALIC text.", 25, 36);
        coloredBackgroundCustomView.setColoredBackgroudText("this is a TextView with COLORED BACKGROUND text.", 24, 42, Color.YELLOW);
        bigTextCustomView.setBigText("this a TextView with BIG text", 21, 25);
        smallTextCustomView.setSmallText("this is a TextView with SMALL text.", 24, 30);
        underlinedTextCustomView.setUnderlinedText("this is a TextView with UNDERLINED text.", 24, 34);
        deletedTextCustomView.setDeletedText("this is a TextView with DELETED text.", 24 ,31);

        //add to layout
        layout.addView(coloredCustomView);
        layout.addView(boldCustomView);
        layout.addView(italicCustomView);
        layout.addView(boldItalicCustomView);
        layout.addView(coloredBackgroundCustomView);
        layout.addView(bigTextCustomView);
        layout.addView(smallTextCustomView);
        layout.addView(underlinedTextCustomView);
        layout.addView(deletedTextCustomView);

        //setId
        coloredCustomView.setId(View.generateViewId());
        boldCustomView.setId(View.generateViewId());
        italicCustomView.setId(View.generateViewId());
        boldItalicCustomView.setId(View.generateViewId());
        coloredBackgroundCustomView.setId(View.generateViewId());
        bigTextCustomView.setId(View.generateViewId());
        smallTextCustomView.setId(View.generateViewId());
        underlinedTextCustomView.setId(View.generateViewId());
        deletedTextCustomView.setId(View.generateViewId());

        //constraintSet
        constraintSet.clone(layout);

        //coloredCustomView
        constraintSet.connect(coloredCustomView.getId(), ConstraintSet.LEFT, layout.getId(), ConstraintSet.LEFT);
        constraintSet.connect(coloredCustomView.getId(), ConstraintSet.RIGHT, layout.getId(), ConstraintSet.RIGHT);
        constraintSet.connect(coloredCustomView.getId(), ConstraintSet.TOP, layout.getId(), ConstraintSet.TOP);
        //boldCustomView
        constraintSet.connect(boldCustomView.getId(), ConstraintSet.RIGHT, layout.getId(), ConstraintSet.RIGHT);
        constraintSet.connect(boldCustomView.getId(), ConstraintSet.LEFT, layout.getId(), ConstraintSet.LEFT);
        constraintSet.connect(boldCustomView.getId(), ConstraintSet.TOP, coloredCustomView.getId(), ConstraintSet.BOTTOM);
        //italicCustomView
        constraintSet.connect(italicCustomView.getId(), ConstraintSet.RIGHT, layout.getId(), ConstraintSet.RIGHT);
        constraintSet.connect(italicCustomView.getId(), ConstraintSet.LEFT, layout.getId(), ConstraintSet.LEFT);
        constraintSet.connect(italicCustomView.getId(), ConstraintSet.TOP, boldCustomView.getId(), ConstraintSet.BOTTOM);
        //boldItalicCustomView
        constraintSet.connect(boldItalicCustomView.getId(), ConstraintSet.RIGHT, layout.getId(), ConstraintSet.RIGHT);
        constraintSet.connect(boldItalicCustomView.getId(), ConstraintSet.LEFT, layout.getId(), ConstraintSet.LEFT);
        constraintSet.connect(boldItalicCustomView.getId(), ConstraintSet.TOP, italicCustomView.getId(), ConstraintSet.BOTTOM);
        //coloredBackgroundCustomView
        constraintSet.connect(coloredBackgroundCustomView.getId(), ConstraintSet.RIGHT, layout.getId(), ConstraintSet.RIGHT);
        constraintSet.connect(coloredBackgroundCustomView.getId(), ConstraintSet.LEFT, layout.getId(), ConstraintSet.LEFT);
        constraintSet.connect(coloredBackgroundCustomView.getId(), ConstraintSet.TOP, boldItalicCustomView.getId(), ConstraintSet.BOTTOM);
        //bigTextCustomView
        constraintSet.connect(bigTextCustomView.getId(), ConstraintSet.RIGHT, layout.getId(), ConstraintSet.RIGHT);
        constraintSet.connect(bigTextCustomView.getId(), ConstraintSet.LEFT, layout.getId(), ConstraintSet.LEFT);
        constraintSet.connect(bigTextCustomView.getId(), ConstraintSet.TOP, coloredBackgroundCustomView.getId(), ConstraintSet.BOTTOM);
        //smallTextCustomView
        constraintSet.connect(smallTextCustomView.getId(), ConstraintSet.RIGHT, layout.getId(), ConstraintSet.RIGHT);
        constraintSet.connect(smallTextCustomView.getId(), ConstraintSet.LEFT, layout.getId(), ConstraintSet.LEFT);
        constraintSet.connect(smallTextCustomView.getId(), ConstraintSet.TOP, bigTextCustomView.getId(), ConstraintSet.BOTTOM);
        //underlinedTextCustomView
        constraintSet.connect(underlinedTextCustomView.getId(), ConstraintSet.RIGHT, layout.getId(), ConstraintSet.RIGHT);
        constraintSet.connect(underlinedTextCustomView.getId(), ConstraintSet.LEFT, layout.getId(), ConstraintSet.LEFT);
        constraintSet.connect(underlinedTextCustomView.getId(), ConstraintSet.TOP, smallTextCustomView.getId(), ConstraintSet.BOTTOM);
        //deletedTextCustomView
        constraintSet.connect(deletedTextCustomView.getId(), ConstraintSet.RIGHT, layout.getId(), ConstraintSet.RIGHT);
        constraintSet.connect(deletedTextCustomView.getId(), ConstraintSet.LEFT, layout.getId(), ConstraintSet.LEFT);
        constraintSet.connect(deletedTextCustomView.getId(), ConstraintSet.TOP, underlinedTextCustomView.getId(), ConstraintSet.BOTTOM);
        constraintSet.applyTo(layout);
    }
}