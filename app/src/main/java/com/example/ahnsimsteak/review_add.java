package com.example.ahnsimsteak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class review_add extends AppCompatActivity {
    ImageButton ib_back;
    ImageButton ib_next;
    ImageButton ib_next2;
    Button btn_moveGuide;

    ImageButton ib_star1;
    ImageButton ib_star2;
    ImageButton ib_star3;
    ImageButton ib_star4;
    ImageButton ib_star5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_add);

        ib_star1 = (ImageButton) findViewById(R.id.ib_star1);
        ib_star2 = (ImageButton) findViewById(R.id.ib_star2);
        ib_star3 = (ImageButton) findViewById(R.id.ib_star3);
        ib_star4 = (ImageButton) findViewById(R.id.ib_star4);
        ib_star5 = (ImageButton) findViewById(R.id.ib_star5);

        ib_back = (ImageButton) findViewById(R.id.ib_back);
        ib_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        ib_next2 = (ImageButton) findViewById(R.id.ib_next2);
        ib_next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(review_add.this, "리뷰 작성 감사합니다!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btn_moveGuide = (Button) findViewById(R.id.btn_moveGuide);
        btn_moveGuide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(review_add.this, Evaluation_Guide.class));
            }
        });
    }

    protected void onResume() {
        super.onResume();

        if(Evaluation_Guide.setStar) {
            setStar();
        }
    }

    private void setStar() {
        double GPA = Evaluation_Guide.GPA;
        double star = 0;
        if(GPA > 4.5) {
            star = 5;
        } else if (GPA > 4.0) {
            star = 4.5;
        } else if (GPA > 3.5) {
            star = 4;
        } else if (GPA > 3) {
            star = 3.5;
        } else if (GPA > 2.5) {
            star = 3;
        } else if (GPA > 2.0) {
            star = 2.5;
        } else if (GPA > 1.5) {
            star = 2;
        } else if (GPA > 1.0) {
            star = 1.5;
        } else if (GPA > 0.5) {
            star = 1.0;
        } else {
            star = 0.5;
        }

        if (star == 5) {
            ib_star1.setBackgroundResource(R.drawable.ic_star3);
            ib_star2.setBackgroundResource(R.drawable.ic_star3);
            ib_star3.setBackgroundResource(R.drawable.ic_star3);
            ib_star4.setBackgroundResource(R.drawable.ic_star3);
            ib_star5.setBackgroundResource(R.drawable.ic_star3);
        } else if (star == 4.5) {
            ib_star1.setBackgroundResource(R.drawable.ic_star3);
            ib_star2.setBackgroundResource(R.drawable.ic_star3);
            ib_star3.setBackgroundResource(R.drawable.ic_star3);
            ib_star4.setBackgroundResource(R.drawable.ic_star3);
            ib_star5.setBackgroundResource(R.drawable.ic_star2);
        } else if (star == 4) {
            ib_star1.setBackgroundResource(R.drawable.ic_star3);
            ib_star2.setBackgroundResource(R.drawable.ic_star3);
            ib_star3.setBackgroundResource(R.drawable.ic_star3);
            ib_star4.setBackgroundResource(R.drawable.ic_star3);
            ib_star5.setBackgroundResource(R.drawable.ic_star_outline);
        } else if (star == 3.5) {
            ib_star1.setBackgroundResource(R.drawable.ic_star3);
            ib_star2.setBackgroundResource(R.drawable.ic_star3);
            ib_star3.setBackgroundResource(R.drawable.ic_star3);
            ib_star4.setBackgroundResource(R.drawable.ic_star2);
            ib_star5.setBackgroundResource(R.drawable.ic_star_outline);
        } else if (star == 3.0) {
            ib_star1.setBackgroundResource(R.drawable.ic_star3);
            ib_star2.setBackgroundResource(R.drawable.ic_star3);
            ib_star3.setBackgroundResource(R.drawable.ic_star3);
            ib_star4.setBackgroundResource(R.drawable.ic_star_outline);
            ib_star5.setBackgroundResource(R.drawable.ic_star_outline);
        } else if (star == 2.5) {
            ib_star1.setBackgroundResource(R.drawable.ic_star3);
            ib_star2.setBackgroundResource(R.drawable.ic_star3);
            ib_star3.setBackgroundResource(R.drawable.ic_star2);
            ib_star4.setBackgroundResource(R.drawable.ic_star_outline);
            ib_star5.setBackgroundResource(R.drawable.ic_star_outline);
        } else if (star == 2) {
            ib_star1.setBackgroundResource(R.drawable.ic_star3);
            ib_star2.setBackgroundResource(R.drawable.ic_star3);
            ib_star3.setBackgroundResource(R.drawable.ic_star_outline);
            ib_star4.setBackgroundResource(R.drawable.ic_star_outline);
            ib_star5.setBackgroundResource(R.drawable.ic_star_outline);
        } else if (star == 1.5) {
            ib_star1.setBackgroundResource(R.drawable.ic_star3);
            ib_star2.setBackgroundResource(R.drawable.ic_star2);
            ib_star3.setBackgroundResource(R.drawable.ic_star_outline);
            ib_star4.setBackgroundResource(R.drawable.ic_star_outline);
            ib_star5.setBackgroundResource(R.drawable.ic_star_outline);
        } else if (star == 1) {
            ib_star1.setBackgroundResource(R.drawable.ic_star3);
            ib_star2.setBackgroundResource(R.drawable.ic_star_outline);
            ib_star3.setBackgroundResource(R.drawable.ic_star_outline);
            ib_star4.setBackgroundResource(R.drawable.ic_star_outline);
            ib_star5.setBackgroundResource(R.drawable.ic_star_outline);
        }
        else  {
            ib_star1.setBackgroundResource(R.drawable.ic_star2);
            ib_star2.setBackgroundResource(R.drawable.ic_star_outline);
            ib_star3.setBackgroundResource(R.drawable.ic_star_outline);
            ib_star4.setBackgroundResource(R.drawable.ic_star_outline);
            ib_star5.setBackgroundResource(R.drawable.ic_star_outline);
        }
    }
}