package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposePathEffect;
import android.graphics.ComposeShader;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.DiscretePathEffect;
import android.graphics.EmbossMaskFilter;
import android.graphics.LightingColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SumPathEffect;
import android.graphics.SweepGradient;
import android.graphics.Xfermode;
import android.graphics.drawable.shapes.Shape;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.hencoder.hencoderpracticedraw2.R;

public class Practice01LinearGradientView extends View {
  Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
  Path path = new Path();

  public Practice01LinearGradientView(Context context) {
    super(context);
  }

  public Practice01LinearGradientView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public Practice01LinearGradientView(Context context, @Nullable AttributeSet attrs,
      int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  {
    // 用 Paint.setShader(shader) 设置一个 LinearGradient
    // LinearGradient 的参数：坐标：(100, 100) 到 (500, 500) ；颜色：#E91E63 到 #2196F3
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    //  LinearGradient
      Shader shader = new LinearGradient(100,100,500,500,
          Color.parseColor("#E91E63"),Color.parseColor("#2196F3"),Shader.TileMode.CLAMP);
      paint.setShader(shader);
    canvas.drawCircle(300, 300,200, paint);

    //RadialGradient
    //Shader shader = new RadialGradient(300,300,200,
    //    Color.parseColor("#E91E63"), Color.parseColor("#2196F3"), Shader.TileMode.CLAMP);

    //SweepGradient
    //Shader shader = new SweepGradient(300,300,Color.parseColor("#E91E63"),
    //    Color.parseColor("#2196F3"));

    //BitmapShader + ComposeShader
    //Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.batman);
    //Shader shader1 = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    //
    //Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.batman_logo);
    //Shader shader2 = new BitmapShader(bitmap2, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    //
    //Shader shader = new ComposeShader(shader1,shader2, PorterDuff.Mode.DST_IN);
    //paint.setShader(shader);
    //canvas.drawCircle(200, 200,200, paint);

    //Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(),R.drawable.dogme);
    //ColorFilter colorFilter = new LightingColorFilter(0xFFFFFF,0x000090);

    //ColorFilter colorFilter = new PorterDuffColorFilter(Color.RED, PorterDuff.Mode.SCREEN);

    //paint.setColorFilter(colorFilter);
    //canvas.drawBitmap(bitmap1,0,0,paint);

    //int saveLayer = canvas.saveLayer(null,null,Canvas.ALL_SAVE_FLAG);
    //
    //Bitmap rectBitmap = BitmapFactory.decodeResource(getResources(),R.drawable.batman);
    //Bitmap circleBitmap = BitmapFactory.decodeResource(getResources(),R.drawable.batman_logo);
    //
    //Xfermode xfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    //canvas.drawBitmap(rectBitmap,0,0,paint);
    //paint.setXfermode(xfermode);
    //canvas.drawBitmap(circleBitmap,0,0,paint);
    //paint.setXfermode(null);
    //
    //canvas.restoreToCount(saveLayer);

    //paint.setStyle(Paint.Style.STROKE);
    //paint.setStrokeWidth(50);

    ////Cap
    //paint.setStrokeCap(Paint.Cap.BUTT);
    //canvas.drawLine(200,200, 800,200,paint);
    //paint.setStrokeCap(Paint.Cap.SQUARE);
    //canvas.drawLine(200,300,800,300,paint);
    //paint.setStrokeCap(Paint.Cap.ROUND);
    //canvas.drawLine(200,400,800,400,paint);

    ////Join & Miter
    //paint.setStrokeJoin(Paint.Join.MITER);
    ////canvas.drawRect(200,200,600,600,paint);
    //paint.setStrokeMiter(0);
    //float[] floats ={200,200,500,200,500,200,300,500};
    //canvas.drawLines(floats,paint);

    //final BitmapFactory.Options options = new BitmapFactory.Options();
    //options.inPreferredConfig=Bitmap.Config.ALPHA_8;
    //Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(),R.drawable.dither2,
    //    options);
    //paint.setDither(false);
    //paint.setFilterBitmap(false);
    //canvas.drawBitmap(bitmap1,0,0,paint);

    //paint.setStyle(Paint.Style.STROKE);
    //paint.setStrokeWidth(10);
    //
    //path.lineTo(100, 100);
    //path.lineTo(200, 400);
    //path.lineTo(300, 50);
    //path.lineTo(400, 600);
    //path.lineTo(700, 20);
    //
    //PathEffect pathEffect = new DashPathEffect(new float[]{50,10,100,20},0);
    //CornerPathEffect cornerPathEffect = new CornerPathEffect(50);
    //DiscretePathEffect discretePathEffect = new DiscretePathEffect(10,20);
    //Path dashPash = new Path();
    //dashPash.moveTo(100,100);
    //dashPash.rLineTo(30,30);
    //dashPash.rLineTo(20,-20);
    //dashPash.close();
    //PathDashPathEffect pathDashPathEffect = new PathDashPathEffect(dashPash,100,100,PathDashPathEffect.Style.MORPH);
    //ComposePathEffect composePathEffect = new ComposePathEffect(pathEffect,cornerPathEffect);
    //SumPathEffect sumPathEffect = new SumPathEffect(discretePathEffect,cornerPathEffect);
    //paint.setPathEffect(sumPathEffect);
    //canvas.drawPath(path, paint);
    //canvas.drawCircle(300,300,200,paint);

    //paint.setShadowLayer(10,20,20,0x80E56634);
    //paint.setTextSize(100);
    ////paint.clearShadowLayer();
    //canvas.drawText("你是我的小啊小苹果",100,100,paint);

    //Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(),R.drawable.dogme);
    ////paint.setMaskFilter(new BlurMaskFilter(50, BlurMaskFilter.Blur.OUTER));
    //paint.setMaskFilter(new EmbossMaskFilter(new float[]{0,1,1}, 0.2f,8,10));
    //
    ////paint.getTextPath();
    //
    //paint.reset();
    //
    //paint.set(paint);
    //
    //paint.setFlags(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
    //paint.setAntiAlias(true);
    //paint.setDither(true);
    //
    //canvas.drawBitmap(bitmap1,100,100,paint);
  }
}
