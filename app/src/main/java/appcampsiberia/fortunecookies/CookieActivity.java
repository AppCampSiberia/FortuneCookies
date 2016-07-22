package appcampsiberia.fortunecookies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CookieActivity extends AppCompatActivity {

    ImageView imageViewcookie1;
    ImageView imageViewcookie2;
    ImageView imageViewcookie3;
    ImageView imageViewcookie4;
    ImageView imageViewcookie5;
    ImageView imageViewcookie6;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cookie);
        name = getIntent().getStringExtra("pechen");

        imageViewcookie1 = (ImageView) findViewById(R.id.cookie1);
        imageViewcookie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CookieActivity.this, FortuneActivity.class);
                intent.putExtra("pechen", name);
                startActivity(intent);


            }

        });
        imageViewcookie2 = (ImageView) findViewById(R.id.cookie2);
        imageViewcookie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CookieActivity.this, FortuneActivity.class);
                intent.putExtra("pechen", name);
                startActivity(intent);
            }
        });
        imageViewcookie3 = (ImageView) findViewById(R.id.cookie3);
        imageViewcookie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CookieActivity.this, FortuneActivity.class);
                intent.putExtra("pechen", name);
                startActivity(intent);
            }
        });
        imageViewcookie4 = (ImageView) findViewById(R.id.cookie4);
        imageViewcookie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CookieActivity.this, FortuneActivity.class);
                intent.putExtra("pechen", name);
                startActivity(intent);
            }
        });
        imageViewcookie5 = (ImageView) findViewById(R.id.cookie5);
        imageViewcookie5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CookieActivity.this, FortuneActivity.class);
                intent.putExtra("pechen", name);
                startActivity(intent);
            }
        });
        imageViewcookie6 = (ImageView) findViewById(R.id.cookie6);
        imageViewcookie6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CookieActivity.this, FortuneActivity.class);
                intent.putExtra("pechen", name);
                startActivity(intent);
            }
        });
    }
}