package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw2.R;

public class Practice07ColorMatrixColorFilterView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Bitmap bitmap;

    public Practice07ColorMatrixColorFilterView(Context context) {
        super(context);
    }

    public Practice07ColorMatrixColorFilterView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice07ColorMatrixColorFilterView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.batman);

        // 使用 setColorFilter() 设置一个 ColorMatrixColorFilter
        // 用 ColorMatrixColorFilter.setSaturation() 把饱和度去掉
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int iColor = Color.parseColor("#EC2421");

        int red   = (iColor & 0xFF0000) / 0xFFFF;
        int green = (iColor & 0xFF00) / 0xFF;
        int blue  = iColor & 0xFF;
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(new float[]{
            1, 1, 1, 1, 1, //red
            0, 0, 0, 0, 0, //green
            0, 0, 0, 0, 0, //blue
            1, 1, 1, 1, 1 //alpha
        });

        paint.setColorFilter(colorMatrixColorFilter);
        canvas.drawBitmap(bitmap, 0, 0, paint);
    }
}
