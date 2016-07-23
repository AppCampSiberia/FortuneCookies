package appcampsiberia.fortunecookies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {

    Button buttonNext;
    EditText editText;
    RadioGroup group2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        group2 = (RadioGroup) findViewById(R.id.group2);
        group2.getCheckedRadioButtonId();

        editText = (EditText) findViewById(R.id.editText);
        buttonNext = (Button) findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NameActivity.this, FlavorActivity.class);
                intent.putExtra("pechen", editText.getText().toString());
                intent.putExtra("Pol", group2.getCheckedRadioButtonId());
                startActivity(intent);
            }
        });
    }
}
