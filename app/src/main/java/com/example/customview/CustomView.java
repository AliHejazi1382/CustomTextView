package com.example.customview;

import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CustomView extends androidx.appcompat.widget.AppCompatTextView {

    String text1, text2, bold, italic, boldItalic, big, small, underlined, deleted;

    public CustomView(@NonNull Context context) {
        super(context);
    }

    public void setColoredText(String text, int start, int end, int color){
        SpannableString string = new SpannableString(text);
        ForegroundColorSpan fColor = new ForegroundColorSpan(color);
        string.setSpan(fColor, start, end, SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE);
        super.setText(string);
    }

    public void setBoldText(String text, int start, int end){
        bold = "<b>" + text.substring(start, end) + "</b>";
        text1 = text.substring(0, start);
        text2 = text.substring(end, text.length());
        super.setText(Html.fromHtml(text1 + bold + text2));
    }

    public void setItalicText(String text, int start, int end){
        italic = "<i>" + text.substring(start, end) + "</i>";
        text1 = text.substring(0, start);
        text2 = text.substring(end, text.length());
        super.setText(Html.fromHtml(text1 + italic + text2));
    }

    public void setBoldItalicText(String text, int start, int end){
        boldItalic = "<i><b>" + text.substring(start, end) + "</b></i>";
        text1 = text.substring(0, start);
        text2 = text.substring(end, text.length());
        super.setText(Html.fromHtml(text1 + boldItalic + text2));
    }

    public void setColoredBackgroudText(String text, int start, int end, int color){
        SpannableString string = new SpannableString(text);
        BackgroundColorSpan bColor = new BackgroundColorSpan(color);
        string.setSpan(bColor, start, end, SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE);
        super.setText(string);
    }

    public void setBigText(String text, int start, int end){
        big = "<big>" + text.substring(start, end) + "</big>";
        text1 = text.substring(0, start);
        text2 = text.substring(end, text.length());
        super.setText(Html.fromHtml(text1 + big + text2));
    }

    public void setSmallText(String text, int start, int end){
        small = "<small>" + text.substring(start, end) + "</small>";
        text1 = text.substring(0, start);
        text2 = text.substring(end, text.length());
        super.setText(Html.fromHtml(text1 + small + text2));
    }

    public void setUnderlinedText(String text, int start, int end){
        underlined = "<u>" + text.substring(start, end) + "</u>";
        text1 = text.substring(0, start);
        text2 = text.substring(end, text.length());
        super.setText(Html.fromHtml(text1 + underlined + text2));
    }

    public void setDeletedText(String text, int start, int end){
        deleted = "<del>" + text.substring(start, end) + "</del>";
        text1 = text.substring(0, start);
        text2 = text.substring(end, text.length());
        super.setText(Html.fromHtml(text1 + deleted + text2));
    }

}
