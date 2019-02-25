package kz.karaev.questionnaire;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity_4 extends AppCompatActivity {
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_4);
        checkBox = (CheckBox) findViewById(R.id.checkBox);

    }

    public void next_click(View v) {
        String spinner = getIntent().getStringExtra("spinner");
        String radio = getIntent().getStringExtra("radio");
        Intent frame_5 = new Intent(MainActivity_4.this, MainActivity_5.class);
        frame_5.putExtra("spinner", spinner);
        frame_5.putExtra("radio", radio);
        frame_5.putExtra("checkbox", checkBox.isChecked() ? getString(R.string.yes) : getString(R.string.no));

        startActivity(frame_5);
    }

}
