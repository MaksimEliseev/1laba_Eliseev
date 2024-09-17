package com.example.laba1_eliseev;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);

        // Обработчик нажатия на кнопку
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход на второе активити и передача параметра
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("parameter", "Елисеев Максим"); // Передаем фамилию
                startActivity(intent);
            }
        });
    }
}