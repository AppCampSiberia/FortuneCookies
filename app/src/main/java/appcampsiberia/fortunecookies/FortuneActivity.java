package appcampsiberia.fortunecookies;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FortuneActivity extends AppCompatActivity {

    Button buttonMenu;
    TextView textView;
    MediaPlayer mp;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortune);
Random rand= new Random();
        name = getIntent().getStringExtra("pechen");

        buttonMenu = (Button) findViewById(R.id.buttonMenu);

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FortuneActivity.this, MainActivity.class);
                intent.putExtra("pechen", name);
                startActivity(intent);
            }
        });
        textView=  (TextView) findViewById(R.id.textViewFortune);
        int a;
        a=rand.nextInt(31);
        if(a==0){
            textView.setText("ИМЯ, вы потеряете душу".replace("ИМЯ", name));
        }else if(a==1) o{
            textView.setText("ИМЯ, ты крутая, а другие никто".replace("ИМЯ", name));
        }
        else if(a==2) {
            textView.setText("Получишь 5 (во всех смыслах)! ");
        }
        else if(a==3) {
            textView.setText("Сегодня стоит держаться подальше от  одноклассников. ");
        }
        else if(a==4) {
            textView.setText("Сегодня день будет такой же сладкий, как эта жвачка.");
        }

        else if(a==5) {
            textView.setText("Если ты сегодня не умрешь на перестрелке кокаина, значит, ты молодец(писал Андрей).");
        }


        else if(a==6) {
            textView.setText(" ИМЯ, ты молодец! Не обращай внимание на другие раздражающие факторы.".replace("ИМЯ", name));
        }

        else if(a==7) {
            textView.setText(" В твоей жизни будут грандиозные изменения, но они не повлияют на твою красоту,на твой стиль и на твой внутренний мир.");
        }

        else if(a==8) {
            textView.setText(" Сегодня тебя ждут сюрпризы и новые открытия, но немногие из них будут приятными. ");
        }

        else if(a==9) {
            textView.setText(" Именно сегодня ты должна выйти из зоны комфорта ");
        }
        else if(a==10) {
            textView.setText(" Черная полоса закончилась,можешь отдыхать и расслабляться. ");
        }
        else if(a==11) {
            textView.setText("Знай, что все пройдет. ");
        }
        else if(a==12) {
            textView.setText(" ИМЯ,  сделаешь все, что в твоих силах. ".replace("ИМЯ", name));
        }
        else if(a==13) {
            textView.setText("Сегодня ты должен/должна совершить сумасшедший поступок. ");
        }
        else if(a==14) {
            textView.setText("Скоро начнется\"черная полоса\" в твоей жизни. ");
        }
        else if(a==15) {
            textView.setText("Многие люди отвернутся от тебя сегодня, а некоторые и вовсе предадут. ");
        }
        else if(a==16) {
            textView.setText("Сегодня от тебя отвернется много людей,не пугайся этим переменам. ");
        }
        else if(a==17) {
            textView.setText("Остерегайся людей в масках. ");
        }

        else if(a==18) {
            textView.setText("Кто ищет,тот всегда найдет.");
        }
        else if(a==19) {
            textView.setText("Стоит пробовать-наверняка получится. ");
        }

        else if(a==20) {
            textView.setText("Слушай свое сердце. ");
        }
        else if(a==21) {
            textView.setText("Люби себя,радуйся жизни. ");
        }
        else if(a==22) {
            textView.setText("Сегодня тебе лучше остаться дома. ");
        }

        else if(a==23) {
            textView.setText("Помни - семья всегда поддержит и поможет. ");
        }

        else if(a==24) {
            textView.setText("Не будьте эгоистом-все возвращается бумерангом. ");
        }
        else if(a==25) {
            textView.setText("Иди к своей цели.");
        }
        else if(a==26) {
            textView.setText("Надо радоваться,не надо напрягаться. ");
        }
        else if(a==27) {
            textView.setText("Делай то,что любишь.");
        }

        else if(a==28) {
            textView.setText("Не подливай масла в огонь.");
        }
        else if(a==29) {
            textView.setText("Живи так, будто живешь последний .");
        }
        else if(a==30) {
            textView.setText("ИМЯ, не отчаивайся,все будет хорошо! ".replace("ИМЯ", name));
        }

        new Thread() {
            public void run() {
                mp = MediaPlayer.create(FortuneActivity.this, R.raw.hrust);
                mp.start();
            }
        }.start();


    }
}





