package com.film.cat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnFood;
    private Button mBtnHealth;
    private Button mBtnClean;
    private Button mBtnHabit;
    private Button mBtnDisease;
    private Button mBtnAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnFood =(Button)findViewById(R.id.btn_food);
        mBtnHealth =(Button)findViewById(R.id.btn_health);
        mBtnClean =(Button)findViewById(R.id.btn_clean);
        mBtnHabit =(Button)findViewById(R.id.btn_habit);
        mBtnDisease =(Button)findViewById(R.id.btn_disease);
        mBtnAge =(Button)findViewById(R.id.btn_age);

        mBtnFood.setOnClickListener(this);
        mBtnHealth.setOnClickListener(this);
        mBtnClean.setOnClickListener(this);
        mBtnHabit.setOnClickListener(this);
        mBtnDisease.setOnClickListener(this);
        mBtnAge.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_food:
                startActivity(new Intent(getBaseContext(),FoodActivity.class));
                break;
            case R.id.btn_health:
                startActivity(new Intent(getBaseContext(),HealthActivity.class));
                break;
            case R.id.btn_clean:
                startActivity(new Intent(getBaseContext(),CleanActivity.class));
                break;
            case R.id.btn_habit:
                startActivity(new Intent(getBaseContext(),HabitActivity.class));
                break;
            case R.id.btn_disease:
                startActivity(new Intent(getBaseContext(),DiseaseActivity.class));
                break;
            case R.id.btn_age:
                startActivity(new Intent(getBaseContext(),AgeActivity.class));
                break;
        }
    }
}
