package appcampsiberia.fortunecookies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FortuneActivity extends AppCompatActivity {

    Button buttonMenu;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortune);
Random rand= new Random();

        buttonMenu = (Button) findViewById(R.id.buttonMenu);

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FortuneActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        textView=  (TextView) findViewById(R.id.textViewFortune);
        int a;
        a=rand.nextInt(10);
        if(a==0){
            textView.setText("вы потеряете душу");
        }else if(a==1) {
            textView.setText("ты крутая, а другие никто");
        }
        else if(a==2) {
            textView.setText("Получишь 5! (У себя вмыслях");
        }
        else if(a==3) {
            textView.setText("Сегодня стоит держаться подальше от твоих одноклассников ");
        }
        else if(a==4) {
            textView.setText("Сегодня день будет такой же сладкий, как эта жвачка");
        }

        else if(a==5) {
            textView.setText("Если ты сегодня не умрешь на перестрелке кокаина, значит, ты молодец)");
        }


        else if(a==6) {
            textView.setText("Ты молодец! Не обращай внимание на другие разражающие факторы");
        }

        else if(a==7) {
            textView.setText("В твоей жизни будут грандиозные изменения, но они не повлияют на твою красоту,на твой стиль и на твой внутренний мир");
        }

        else if(a==8) {
            textView.setText("Сегодня тебя ждут сюрпризы и новые открытия, но немногие из них будут приятными ");
        }

        else if(a==9) {
            textView.setText("Именно сегодня ты должна выйти из своей зоны комфорта ");
        }







    }
}





