package kz.karaev.questionnaire;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;

public class MainActivity_2 extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        spinner = (Spinner) findViewById(R.id.spinner);
    }

    public void next_click(View v) {
        Intent frame_3 = new Intent(MainActivity_2.this, MainActivity_3.class);
        frame_3.putExtra("spinner", spinner.getSelectedItem().toString());

        startActivity(frame_3);
    }

}
