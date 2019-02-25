package kz.karaev.questionnaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getIntent().getBooleanExtra("finish", false)) finish();
    }

    public void startClick(View v) {
        Intent frame_2 = new Intent(MainActivity.this, MainActivity_2.class);

        startActivity(frame_2);
    }
}
