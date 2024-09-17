# лабораторная работа №1

- Выполнил: Елисеев
- Язык программирования Java

# Основной функционал:
## 1. Первый экран (Activity 1):
- Отображает кнопку с текстом "Перейти к Activity 2".
<div align="center">
<img src="https://github.com/user-attachments/assets/5da2ad9c-7dfb-441f-a2de-f7a02e8236c4" width="300"/>
</div>

- При нажатии на кнопку выполняется переход на второй экран (Activity 2) с передачей параметра (Елисеев Максим) через Intent.

## 2. Второй экран (Activity 2):
- Принимает параметр от первого экрана и отображает его в TextView с сообщением: Переданный параметр: Елисеев Максим.
<div align="center">
- <img src="https://github.com/user-attachments/assets/f5339c17-b453-4819-a2eb-f51e596cb91f" width="300"/>
</div>

# Структура проекта

- В разметку для первой Activity (activity_main.xml) я добавил Button для перхода на Activity 2
```java
    <Button
        android:id="@+id/btn1"
        android:layout_width="147dp"
        android:layout_height="87dp"
        android:backgroundTint="#256EA8"
        android:text="Перейти к Activity 2"
        android:textColor="#FFFFFF"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.777" />
```
- Далее я добавил логигку в Activity 1 (MainActivity) для обработки нажатия на кнопку, а также для перехода Activity 2 с передачей параметра
```java
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
                intent.putExtra("parameter", "Елисеев Максим"); // Передача фамилии
                startActivity(intent);
            }
        });
    }
}
```
- Далее я создал Activity 2 и activity_second.xml 
- В разметку для Activity2 (activity_second.xml) я добавил TextView для отображения переданного параметра
```java
    <TextView
        android:id="@+id/textView"
        android:layout_width="245dp"
        android:layout_height="146dp"
        android:text="Переданный параметр:"
        android:textSize="24sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.295" />
```
- Далее я добавил логигку в Activity 2 (SecondActivity) для получения переданного параметра и его отображения в TextView:
```java
  public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Получение переданного параметра
        Intent intent = getIntent();
        String parameter = intent.getStringExtra("parameter");

        //текстовое поле с переданным параметром
        TextView textView = findViewById(R.id.textView);
        textView.setText("Переданный параметр: " + parameter);
    }
  }
```

  
