package com.example.tictactoe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView btnn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    String StartGame = "X";
    int arr[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int i;
    int countX,countY;

    TextView txt1,txt2;
    Button btnreset;

//x=1
//y=2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnn1 = (ImageView) findViewById(R.id.btnn1);
        btn2 = (ImageView) findViewById(R.id.btn2);
        btn3 = (ImageView) findViewById(R.id.btn3);
        btn4 = (ImageView) findViewById(R.id.btn4);
        btn5 = (ImageView) findViewById(R.id.btn5);
        btn6 = (ImageView) findViewById(R.id.btn6);
        btn7 = (ImageView) findViewById(R.id.btn7);
        btn8 = (ImageView) findViewById(R.id.btn8);
        btn9 = (ImageView) findViewById(R.id.btn9);

        btnreset=(Button)findViewById(R.id.btnreset);
        txt1=(TextView)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);

        btnn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (StartGame.equals("X")) {
                    btnn1.setImageResource(R.drawable.picx);
                    arr[0] = 1;
                    i++;
                } else {
                    btnn1.setImageResource(R.drawable.circle);
                    arr[0] = 2;
                    i++;
                }
                choosePalyer();
                winningGame();
            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (StartGame.equals("X")) {
                    btn2.setImageResource(R.drawable.picx);
                    arr[1] = 1;
                    i++;
                } else {
                    btn2.setImageResource(R.drawable.circle);
                    arr[1] = 2;
                    i++;
                }
                choosePalyer();
                winningGame();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (StartGame.equals("X")) {
                    btn3.setImageResource(R.drawable.picx);
                    arr[2] = 1;
                    i++;
                } else {
                    btn3.setImageResource(R.drawable.circle);
                    arr[2] = 2;
                    i++;
                }
                choosePalyer();
                winningGame();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (StartGame.equals("X")) {
                    btn4.setImageResource(R.drawable.picx);
                    arr[3] = 1;
                    i++;
                } else {
                    btn4.setImageResource(R.drawable.circle);
                    arr[3] = 2;
                    i++;
                }
                choosePalyer();
                winningGame();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (StartGame.equals("X")) {
                    btn5.setImageResource(R.drawable.picx);
                    arr[4] = 1;
                    i++;
                } else {
                    btn5.setImageResource(R.drawable.circle);
                    arr[4] = 2;
                    i++;
                }
                choosePalyer();
                winningGame();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (StartGame.equals("X")) {
                    btn6.setImageResource(R.drawable.picx);
                    arr[5] = 1;
                    i++;
                } else {
                    btn6.setImageResource(R.drawable.circle);
                    arr[5] = 2;
                    i++;
                }
                choosePalyer();
                winningGame();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (StartGame.equals("X")) {
                    btn7.setImageResource(R.drawable.picx);
                    arr[6] = 1;
                    i++;
                } else {
                    btn7.setImageResource(R.drawable.circle);
                    arr[6] = 2;
                    i++;
                }
                choosePalyer();
                winningGame();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (StartGame.equals("X")) {
                    btn8.setImageResource(R.drawable.picx);
                    arr[7] = 1;
                    i++;
                } else {
                    btn8.setImageResource(R.drawable.circle);
                    arr[7] = 2;
                    i++;
                }
                choosePalyer();
                winningGame();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (StartGame.equals("X")) {
                    btn9.setImageResource(R.drawable.picx);
                    arr[8] = 1;
                    i++;
                } else {
                    btn9.setImageResource(R.drawable.circle);
                    arr[8] = 2;
                    i++;
                }
                choosePalyer();
                winningGame();
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnn1.setImageDrawable(null);
                btn2.setImageDrawable(null);
                btn3.setImageDrawable(null);
                btn4.setImageDrawable(null);
                btn5.setImageDrawable(null);
                btn6.setImageDrawable(null);
                btn7.setImageDrawable(null);
                btn8.setImageDrawable(null);
                btn9.setImageDrawable(null);
                resetval();
                countX=0;
                countY=0;
                txt1.setText("Player X: "+String.valueOf(countX));
                txt2.setText("Player Y: "+String.valueOf(countY));

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.share:
                Toast.makeText(this, "This Service is No Avilable",Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                startActivity(new Intent(this, about_us.class));
                overridePendingTransition(0,0);
                break;
                
        }
        return false;
    }

    public void choosePalyer() {
        if (StartGame.equals("X")) {
            StartGame = "O";
        } else {
            StartGame = "X";
        }
    }

    public void winningGame() {
        if ((arr[0] == 1 && arr[1] == 1 && arr[2] == 1) || (arr[3] == 1 && arr[4] == 1 && arr[5] == 1) || (arr[6] == 1 && arr[7] == 1 && arr[8] == 1) || (arr[0] == 1 && arr[3] == 1 && arr[6] == 1) || (arr[1] == 1 && arr[4] == 1 && arr[7] == 1) || (arr[2] == 1 && arr[5] == 1 && arr[8] == 1) || (arr[0] == 1 && arr[4] == 1 && arr[8] == 1) || (arr[2] == 1 && arr[4] == 1 && arr[6] == 1)) {

            AlertDialog.Builder build=new AlertDialog.Builder(this);
            build.setMessage("Player X Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btnn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetval();

                }
            });

            AlertDialog aleret=build.create();
            aleret.show();
            countX++;
            txt1.setText("Player X: "+String.valueOf(countX));

        } else if ((arr[0] == 2 && arr[1] == 2 && arr[2] == 2) || (arr[3] == 2 && arr[4] == 2 && arr[5] == 2) || (arr[6] == 2 && arr[7] == 2 && arr[8] == 2) || (arr[0] == 2 && arr[3] == 2 && arr[6] == 2) || (arr[1] == 2 && arr[4] == 2 && arr[7] == 2) || (arr[2] == 2 && arr[5] == 2 && arr[8] == 2) || (arr[0] == 2 && arr[4] == 2 && arr[8] == 2) || (arr[2] == 2 && arr[4] == 2 && arr[6] == 2)) {

            AlertDialog.Builder build=new AlertDialog.Builder(this);
            build.setMessage("Player O Wins").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btnn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetval();

                }
            });

            AlertDialog aleret=build.create();
            aleret.show();
            countY++;
            txt2.setText("Player Y: "+String.valueOf(countY));
        }
//        else{
//            AlertDialog.Builder build=new AlertDialog.Builder(this);
//            build.setMessage("The Game Is Draw").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialogInterface, int i) {
//
//                    btnn1.setImageDrawable(null);
//                    btn2.setImageDrawable(null);
//                    btn3.setImageDrawable(null);
//                    btn4.setImageDrawable(null);
//                    btn5.setImageDrawable(null);
//                    btn6.setImageDrawable(null);
//                    btn7.setImageDrawable(null);
//                    btn8.setImageDrawable(null);
//                    btn9.setImageDrawable(null);
//                    resetval();
//
//                }
//            });
//
//            AlertDialog aleret=build.create();
//            aleret.show();
//        }
    }

    public void resetval(){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
    }
}