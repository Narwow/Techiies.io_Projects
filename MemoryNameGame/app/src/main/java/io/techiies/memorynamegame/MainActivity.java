package io.techiies.memorynamegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Method to create a new "Class" Executed when the "New Class" button is pressed
    public void createNewClass(View v)
    {
        Intent deckCreatorIntent = new Intent(MainActivity.this, DeckCreator.class);
        startActivity(deckCreatorIntent);
    }

    //Method to play the game in easy mode. Executed when the "Play on Easy" button is pressed
    public void playGameEasy(View v)
    {
        Intent easyModeIntent = new Intent(MainActivity.this, EasyGameActivity.class);
        startActivity(easyModeIntent);
    }

    //Method to play the game in hard mode. Executed when the "Play on Hard" button is pressed
    public void playGameHard(View v)
    {
        Intent hardModeIntent = new Intent(MainActivity.this, HardGameActivity.class);
        startActivity(hardModeIntent);
    }
}