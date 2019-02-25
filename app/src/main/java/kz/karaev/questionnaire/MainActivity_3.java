package kz.karaev.questionnaire;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity_3 extends AppCompatActivity{

    private RadioGroup radioGroup;
    private RadioButton selectRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_3);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

    }

    public void next_click(View v) {
        selectRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
        Intent frame_4 = new Intent(MainActivity_3.this, MainActivity_4.class);
        String spinner = getIntent().getStringExtra("spinner");
        frame_4.putExtra("spinner", spinner);
        frame_4.putExtra("radio", selectRadioButton.getText());

        startActivity(frame_4);
    }

}
