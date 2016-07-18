package appcampsiberia.fortunecookies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FortuneActivity extends AppCompatActivity {

    Button buttonMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortune);

        buttonMenu = (Button)

                findViewById(R.id.buttonMenu);

        buttonMenu.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FortuneActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }

        ;
    }
}




