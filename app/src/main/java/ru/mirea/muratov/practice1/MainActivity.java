package ru.mirea.muratov.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saveContact(View view) {
        Toast.makeText(this, "Контакт сохранён", Toast.LENGTH_SHORT).show();
    }
}