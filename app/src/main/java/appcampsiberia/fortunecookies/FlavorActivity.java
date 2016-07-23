package appcampsiberia.fortunecookies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class FlavorActivity extends AppCompatActivity {

    Button buttonNext3;
    String name;
    int pol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flavor);
        name = getIntent().getStringExtra("pechen");
        pol = getIntent().getIntExtra("pol", -666);

        buttonNext3 = (Button) findViewById(R.id.buttonNext3);
        buttonNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FlavorActivity.this, CookieActivity.class);
                intent.putExtra("pechen", name);
                intent.putExtra("Pol", pol);
                startActivity(intent);
            }
        });


    }
}
