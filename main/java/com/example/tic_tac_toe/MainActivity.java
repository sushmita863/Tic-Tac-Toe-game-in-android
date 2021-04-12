package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnreset;
    int turn=1; //x=1, o=2
    Boolean isEnded=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.bt1);
        btn2 = findViewById(R.id.bt2);
        btn3 = findViewById(R.id.bt3);
        btn4 = findViewById(R.id.bt4);
        btn5 = findViewById(R.id.bt5);
        btn6 = findViewById(R.id.bt6);
        btn7 = findViewById(R.id.bt7);
        btn8 = findViewById(R.id.bt8);
        btn9 = findViewById(R.id.bt9);
        btnreset = findViewById(R.id.reset);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               playgame(btn1);
               endgame();
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               playgame(btn2);
               endgame();


            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playgame(btn3);
                endgame();


            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playgame(btn4);
                endgame();


            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                playgame(btn5);

                endgame();

            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playgame(btn6);

                endgame();

            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playgame(btn7);
                endgame();


            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playgame(btn8);
                endgame();


            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playgame(btn9);
                endgame();


            }
        });


        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recreate();

            }
        });
    }

        private void playgame(Button button){

            if (button.getText().toString().equals("")){
                if (turn==1){
                    button.setText("x");
                    turn=2;
                }
                else{
                    button.setText("o");
                    turn=1;
                }

        }


    }
    private void endgame(){
        String box1,box2, box3, box4,box5,box6,box7,box8,box9;
        box1=btn1.getText().toString();
        box2=btn2.getText().toString();
        box3=btn3.getText().toString();
        box4=btn4.getText().toString();
        box5=btn5.getText().toString();
        box6=btn6.getText().toString();
        box7=btn7.getText().toString();
        box8=btn8.getText().toString();
        box9=btn9.getText().toString();


//for horizontal winning for player x
        if (box1.equals("x") && box2.equals("x") && box3.equals("x")) {
            Toast.makeText(MainActivity.this, "Player x is win", Toast.LENGTH_LONG).show();
            isEnded = true;
        }

        if (box4.equals("x") && box5.equals("x") && box6.equals("x")){
            Toast.makeText(MainActivity.this,"Player x is win",Toast.LENGTH_LONG ).show();
            isEnded=true;
        }

        if (box7.equals("x") && box8.equals("x") && box9.equals("x")){
            Toast.makeText(MainActivity.this,"Player x is win",Toast.LENGTH_SHORT ).show();
            isEnded=true;
        }

//for horizontal winning for player "o"
        if (box1.equals("o") && box2.equals("o") && box1.equals("o")){
            Toast.makeText(MainActivity.this,"Player o is win",Toast.LENGTH_SHORT ).show();
            isEnded=true;
        }
        if (box4.equals("o") && box5.equals("o") && box6.equals("o")){
                Toast.makeText(MainActivity.this,"Player o is win",Toast.LENGTH_SHORT ).show();
                isEnded=true;
        }
        if (box7.equals("0") && box8.equals("o") && box9.equals("o")){
            Toast.makeText(MainActivity.this,"Player o is win",Toast.LENGTH_SHORT ).show();
            isEnded=true;
        }


//for digonally winning for the player"x"
        if (box1.equals("x") && box5.equals("x") && box9.equals("x")){
            Toast.makeText(MainActivity.this,"Player x is win",Toast.LENGTH_SHORT ).show();
            isEnded=true;
//for digonally winning for the player"o"
        }
        if (box1.equals("0") && box5.equals("o") && box9.equals("o")){
            Toast.makeText(MainActivity.this,"Player o is win",Toast.LENGTH_SHORT ).show();
            isEnded=true;
        }


//for vertically winning for the player"x"

        if (box1.equals("x") && box4.equals("x") && box7.equals("x")){
            Toast.makeText(MainActivity.this,"Player x is win",Toast.LENGTH_SHORT ).show();
            isEnded=true;

        }

        if (box2.equals("x") && box5.equals("x") && box8.equals("x")){
            Toast.makeText(MainActivity.this,"Player x is win",Toast.LENGTH_SHORT ).show();
            isEnded=true;

        }
        if (box3.equals("x") && box6.equals("x") && box9.equals("x")){
            Toast.makeText(MainActivity.this,"Player x is win",Toast.LENGTH_SHORT ).show();
            isEnded=true;

        }

//for vertical winning for the player"0"

        if (box1.equals("o") && box4.equals("o") && box7.equals("o")){
            Toast.makeText(MainActivity.this,"Player o is win",Toast.LENGTH_SHORT ).show();
            isEnded=true;

        }

        if (box2.equals("o") && box5.equals("o") && box8.equals("o")){
            Toast.makeText(MainActivity.this,"Player o is win",Toast.LENGTH_SHORT ).show();
            isEnded=true;

        }
        if (box3.equals("o") && box6.equals("o") && box9.equals("o")){

            Toast.makeText(MainActivity.this,"Player o is win",Toast.LENGTH_SHORT ).show();
            isEnded=true;

        }






        if (isEnded){
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            btnreset.setText("Play Again");
        }


    }
}