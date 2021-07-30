package com.example.ahnsimsteak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Evaluation_Guide extends AppCompatActivity {
    public static double GPA = 0;
    public static boolean setStar = false;

    private int oneV;
    private int twoV;
    private int threeV;
    private int fourV;
    private int fiveV;

    private boolean oneC = false;
    private boolean twoC = false;
    private boolean threeC = false;
    private boolean fourC = false;
    private boolean fiveC = false;

    private TextView tv_estimatedGPA;

    Button btn_setGPA1;
    Button btn_setGPA2;


    private RadioGroup rg1, rg2, rg3, rg4, rg5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation_guide);

        btn_setGPA1 = (Button) findViewById(R.id.btn_setGPA1);
        btn_setGPA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(GPA != 0) {
                    setStar = true;
                    finish();
                } else Toast.makeText(Evaluation_Guide.this, "만족도 조사를 진행해주세요!", Toast.LENGTH_SHORT).show();;
            }
        });

        btn_setGPA2 = (Button) findViewById(R.id.btn_setGPA2);
        btn_setGPA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        tv_estimatedGPA = (TextView) findViewById(R.id.tv_estimatedGPA);

        ImageButton ib_back = (ImageButton) findViewById(R.id.ib_back);
        ib_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                oneC = true;
                if(i == R.id.r1_btn1) {
                    oneV = 5;
                } else if(i == R.id.r1_btn2) {
                    oneV = 4;
                } else if(i == R.id.r1_btn3) {
                    oneV = 3;
                } else if(i == R.id.r1_btn4) {
                    oneV = 2;
                } else if(i == R.id.r1_btn5) {
                    oneV = 1;
                }
                if (oneC && twoC && threeC && fourC && fiveC) GPASum();
            }
        });

        rg2 = (RadioGroup) findViewById(R.id.rg2);
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                twoC = true;
                if(i == R.id.r2_btn1) {
                    twoV = 5;
                } else if(i == R.id.r2_btn2) {
                    twoV = 4;
                } else if(i == R.id.r2_btn3) {
                    twoV = 3;
                } else if(i == R.id.r2_btn4) {
                    twoV = 2;
                } else if(i == R.id.r2_btn5) {
                    twoV = 1;
                }
                if (oneC && twoC && threeC && fourC && fiveC) GPASum();
            }
        });

        rg3 = (RadioGroup) findViewById(R.id.rg3);
        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                threeC = true;
                if(i == R.id.r3_btn1) {
                    threeV = 5;
                } else if(i == R.id.r3_btn2) {
                    threeV = 4;
                } else if(i == R.id.r3_btn3) {
                    threeV = 3;
                } else if(i == R.id.r3_btn4) {
                    threeV = 2;
                } else if(i == R.id.r3_btn5) {
                    threeV = 1;
                }
                if (oneC && twoC && threeC && fourC && fiveC) GPASum();
            }
        });

        rg4 = (RadioGroup) findViewById(R.id.rg4);
        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                fourC = true;
                if(i == R.id.r4_btn1) {
                    fourV = 5;
                } else if(i == R.id.r4_btn2) {
                    fourV = 4;
                } else if(i == R.id.r4_btn3) {
                    fourV = 3;
                } else if(i == R.id.r4_btn4) {
                    fourV = 2;
                } else if(i == R.id.r4_btn5) {
                    fourV = 1;
                }
                if (oneC && twoC && threeC && fourC && fiveC) GPASum();
            }
        });

        rg5 = (RadioGroup) findViewById(R.id.rg5);
        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                fiveC = true;
                if(i == R.id.r5_btn1) {
                    fiveV = 5;
                } else if(i == R.id.r5_btn2) {
                    fiveV = 4;
                } else if(i == R.id.r5_btn3) {
                    fiveV = 3;
                } else if(i == R.id.r5_btn4) {
                    fiveV = 2;
                } else if(i == R.id.r5_btn5) {
                    fiveV = 1;
                }
                if (oneC && twoC && threeC && fourC && fiveC) GPASum();
            }
        });


    }

    private void GPASum() {
        GPA = oneV + twoV + threeV + fourV + fiveV;

        GPA = GPA/5;

        tv_estimatedGPA.setText(GPA + "");
    }
}