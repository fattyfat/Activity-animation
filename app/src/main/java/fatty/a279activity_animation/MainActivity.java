package fatty.a279activity_animation;


import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //設置不同動畫效果
    public void explode(View view){
        intent = new Intent(this, Transitions.class);
        intent.putExtra("flag",0);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    //設置不同動畫效果
    public void slide(View view){
        intent = new Intent(this, Transitions.class);
        intent.putExtra("flag",1);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    //設置不同動畫效果
    public void fade(View view){
        intent = new Intent(this, Transitions.class);
        intent.putExtra("flag",2);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    //設置不同動畫效果
    public void share(View view){
        View fab = findViewById(R.id.fab_button);
        intent = new Intent(this, Transitions.class);
        intent.putExtra("flag",3);
        //創建單個共享元素
        //startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(this,view,"share").toBundle());
        startActivity(intent,
                ActivityOptions.makeSceneTransitionAnimation(
                        this,
                        Pair.create(view,"share"),  //創建多個共享元素
                        Pair.create(fab,"fab")).toBundle());
    }
}
