package com.example.ganesh.magic8ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button pushButton = (Button) findViewById(R.id.AskButton);
       final ImageView magicImage = (ImageView) findViewById(R.id.imageView_magicBall);
        final int[] ballArray = {R.drawable.ball1,
                                 R.drawable.ball2,
                                 R.drawable.ball3,
                                    R.drawable.ball4,
                                    R.drawable.ball5};



pushButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Log.d("magic8ball","Button pressed");
        Random rand = new Random();
        int number = rand.nextInt(5);
        Log.d("magic8ball","The number is" + number);
        magicImage.setImageResource(ballArray[number]);
    }
});

    }
}
