package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //將所有圖片儲存存至陣列中
    int[] imgId={R.drawable.im01 , R.drawable.im02, R.drawable.im03, R.drawable.im04, R.drawable.im05,
            R.drawable.im06, R.drawable.im07, R.drawable.im08,R.drawable.im09, R.drawable.im10};
    Button btnPrev, btnNext;
    ImageView imageView;
    //圖片索引，第幾張圖片
    int p=0;
    //總共有多少張
    int count=imgId.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
    }

    public void prev(View v){
        //張數-1表示前一張
        p--;
        //如果已經到第一張，則顯示最後一張
        if (p<0) p=count-1;
        imageView.setImageResource(imgId[p]);
        //第一張對應到p值為0，因此要+1
        setTitle("第"+(p+1)+"/"+count);
    };

    //後一張
    public void next(View v){
        //張數+1表示後一張
        p++;
        //如果已經是最後一張，按下後顯示第一張
        if (p==count) p=0;
        imageView.setImageResource(imgId[p]);
        setTitle("第"+(p+1)+"/"+count);
    };


}