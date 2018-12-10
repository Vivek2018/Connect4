package cs125project.connect4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Player[][] board = new Player[7][6];
    private Player player1;
    private Player player2;
    private int turn = (int) (Math.random() * 2);
    private int player1Counter = 1;
    private int player2Counter = 0;

    public int getWinner() {
        for (int i = 0; i < board.length - 1; i++) {
            int player1HCounter = 1;
            int player2HCounter = 1;
            for (int j = 0; j < board[0].length; j++) {
                if (this.board[i][j] == null || this.board[i + 1][j] == null) {
                    player1HCounter = 1;
                    player2HCounter = 1;
                    continue;
                }
                if (this.board[i][j].equals(this.board[i + 1][j])) {
                    if (this.board[i][j].equals(player1)) {
                        player1HCounter++;
                    } else if (this.board[i][j].equals(player2)) {
                        player2HCounter++;
                    }
                    if (player1HCounter == 4) {
                        return 1;
                    } else if (player2HCounter == 4) {
                        return 2;
                    }
                } else {
                    player1HCounter = 1;
                    player2HCounter = 1;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            int player1VCounter = 1;
            int player2VCounter = 1;
            for (int j = 0; j < board[0].length - 1; j++) {
                if (this.board[i][j] == null || this.board[i][j + 1] == null) {
                    player1VCounter = 1;
                    player2VCounter = 2;
                    continue;
                }

                if (this.board[i][j].equals(this.board[i][j + 1])) {
                    if (this.board[i][j].equals(player1)) {
                        player1VCounter++;
                    } else if (this.board[i][j].equals(player2)) {
                        player2VCounter++;
                    }
                    if (player1VCounter == 4) {
                        player1.addScore();
                        return 1;
                    } else if (player2VCounter == 4) {
                        player2.addScore();
                        return 2;
                    }

                } else {
                    player1VCounter = 1;
                    player2VCounter = 1;
                }
            }
        }
        return 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton redPlayer = (ImageButton) findViewById(R.id.imageButton);
        ImageButton yellowPlayer = (ImageButton) findViewById(R.id.imageButton2);
        if (turn == 1) {
            redPlayer.setImageResource(R.drawable.blankbutton);
        } else {
            yellowPlayer.setImageResource(R.drawable.blankbutton);
        }
        final ImageButton button = (ImageButton) findViewById(R.id.imageButton38);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBoard(button); winner();
            }
        });

        ImageButton button2 = findViewById(R.id.imageButton45);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button8 = findViewById(R.id.imageButton39);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button9 = findViewById(R.id.imageButton40);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button10 = findViewById(R.id.imageButton41);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button11 = findViewById(R.id.imageButton42);
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button12 = findViewById(R.id.imageButton43);
        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button13 = findViewById(R.id.imageButton44);
        button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });



        ImageButton button15 = findViewById(R.id.imageButton46);
        button15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button16 = findViewById(R.id.imageButton47);
        button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button17 = findViewById(R.id.imageButton48);
        button17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button18 = findViewById(R.id.imageButton49);
        button18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button19 = findViewById(R.id.imageButton50);
        button19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button20 = findViewById(R.id.imageButton51);
        button20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button21 = findViewById(R.id.imageButton52);
        button21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button22 = findViewById(R.id.imageButton53);
        button22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button23 = findViewById(R.id.imageButton54);
        button23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button24 = findViewById(R.id.imageButton55);
        button24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button25 = findViewById(R.id.imageButton56);
        button25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button26 = findViewById(R.id.imageButton57);
        button26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button27 = findViewById(R.id.imageButton58);
        button27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button28 = findViewById(R.id.imageButton59);
        button28.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button29 = findViewById(R.id.imageButton60);
        button29.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button30 = findViewById(R.id.imageButton61);
        button30.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button31 = findViewById(R.id.imageButton62);
        button31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button32 = findViewById(R.id.imageButton63);
        button32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button33 = findViewById(R.id.imageButton64);
        button33.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button34 = findViewById(R.id.imageButton65);
        button34.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button35 = findViewById(R.id.imageButton66);
        button35.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button36 = findViewById(R.id.imageButton67);
        button36.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button37 = findViewById(R.id.imageButton68);
        button37.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button38 = findViewById(R.id.imageButton69);
        button38.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button39 = findViewById(R.id.imageButton70);
        button39.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button40 = findViewById(R.id.imageButton71);
        button40.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button42 = findViewById(R.id.imageButton72);
        button42.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button43 = findViewById(R.id.imageButton73);
        button43.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button44 = findViewById(R.id.imageButton74);
        button44.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button45 = findViewById(R.id.imageButton75);
        button45.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button46 = findViewById(R.id.imageButton76);
        button46.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button47 = findViewById(R.id.imageButton77);
        button47.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button48 = findViewById(R.id.imageButton78);
        button48.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });

        ImageButton button49 = findViewById(R.id.imageButton79);
        button49.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                winner();
            }
        });
    }

    public void showScore(View view) {
        Toast.makeText(this, "Player 1: " + player1.getScore() + " Player 2: " + player2.getScore(), Toast.LENGTH_LONG).show();
    }

    public void resetBoard(View view) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = null;
            }
        }
    }
    public void setBoard(ImageButton button) {
        if (turn == 1) {
            button.setImageResource(R.drawable.yellowroundbutton);
            turn = 0;
        } else {
            button.setImageResource(R.drawable.redroundbutton);
            turn = 1;
        }
    }
    public void winner() {
        if (board[0][0] == null) {
            for (int i = 1; i < board[0].length; i++) {
                if (board[0][i] != null) {
                    if (player1Counter == 1) {
                        board[0][i - 1] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                    } else if (player2Counter == 1) {
                        board[0][i - 1] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                    }
                }
            }
        }
        if (board[0][0] != null) {
            Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
        }
        if (getWinner() == 1) {
            Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
            player1.addScore();
        }
        if (getWinner() == 2) {
            Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
            player2.addScore();
        }
    }
}
