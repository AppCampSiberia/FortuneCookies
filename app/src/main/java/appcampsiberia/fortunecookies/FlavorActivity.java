package appcampsiberia.fortunecookies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FlavorActivity extends AppCompatActivity {

    Button buttonNext3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flavor);


        buttonNext3 = (Button) findViewById(R.id.buttonNext3);
        buttonNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FlavorActivity.this, CookieActivity.class);
                startActivity(intent);
            }
        });


    }
}
