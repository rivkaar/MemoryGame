package com.example.rivkaarmoni.memorygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Intent intent = getIntent();
        Button NewGame = (Button) findViewById(R.id.NewGame);
        NewGame.setOnClickListener(new View.OnClickListener(){
                                       public void onClick(View v){
                                           Intent intent = new Intent(MenuActivity.this, NewGameActivity.class);
                                           startActivity(intent);
                                       }
                                   }
        );
        Button HighScore = (Button) findViewById(R.id.HighScore);
        HighScore.setOnClickListener(new View.OnClickListener(){
                                       public void onClick(View v){
                                           Intent intent = new Intent(MenuActivity.this, HighScoreActivity.class);
                                           startActivity(intent);
                                       }
                                   }
        );
        Button About = (Button) findViewById(R.id.About);
        About.setOnClickListener(new View.OnClickListener(){
                                         public void onClick(View v){
                                             Intent intent = new Intent(MenuActivity.this, AboutActivity.class);
                                             startActivity(intent);
                                         }
                                     }
        );

    }


}
