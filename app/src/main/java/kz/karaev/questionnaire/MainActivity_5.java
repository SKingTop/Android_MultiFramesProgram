package kz.karaev.questionnaire;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
//import android.widget.EditText;

public class MainActivity_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_5);

        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setKeyListener(null);
        editText.setText("");
        editText.append(String.format("%s %s %s", getString(R.string.one_text), getIntent().getStringExtra("spinner"),getString(R.string.br)));
        editText.append(String.format("%s %s %s", getString(R.string.two_text), getIntent().getStringExtra("radio"),getString(R.string.br)));
        editText.append(String.format("%s %s %s", getString(R.string.three_text), getIntent().getStringExtra("checkbox"),getString(R.string.br)));

    }
    public void onExitClick(View v) {
        Intent frame_1 = new Intent(this, MainActivity.class);

        frame_1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        frame_1.putExtra("finish", true);

        startActivity(frame_1);
    }
}
