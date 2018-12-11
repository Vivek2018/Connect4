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

    public void resetBoard() {
        final ImageButton button = findViewById(R.id.imageButton38);
        final ImageButton button2 = findViewById(R.id.imageButton45);
        final ImageButton button3 = findViewById(R.id.imageButton52);
        final ImageButton button4 = findViewById(R.id.imageButton59);
        final ImageButton button5 = findViewById(R.id.imageButton66);
        final ImageButton button6 = findViewById(R.id.imageButton73);
        final ImageButton button7 = findViewById(R.id.imageButton39);
        final ImageButton button8 = findViewById(R.id.imageButton46);
        final ImageButton button9 = findViewById(R.id.imageButton53);
        final ImageButton button10 = findViewById(R.id.imageButton60);
        final ImageButton button11 = findViewById(R.id.imageButton67);
        final ImageButton button12 = findViewById(R.id.imageButton74);
        final ImageButton button13 = findViewById(R.id.imageButton40);
        final ImageButton button14 = findViewById(R.id.imageButton47);
        final ImageButton button15 = findViewById(R.id.imageButton54);
        final ImageButton button16 = findViewById(R.id.imageButton61);
        final ImageButton button17 = findViewById(R.id.imageButton68);
        final ImageButton button18 = findViewById(R.id.imageButton75);
        final ImageButton button19 = findViewById(R.id.imageButton41);
        final ImageButton button20 = findViewById(R.id.imageButton48);
        final ImageButton button21 = findViewById(R.id.imageButton55);
        final ImageButton button22 = findViewById(R.id.imageButton62);
        final ImageButton button23 = findViewById(R.id.imageButton69);
        final ImageButton button24 = findViewById(R.id.imageButton76);
        final ImageButton button25 = findViewById(R.id.imageButton42);
        final ImageButton button26 = findViewById(R.id.imageButton49);
        final ImageButton button27 = findViewById(R.id.imageButton56);
        final ImageButton button28 = findViewById(R.id.imageButton63);
        final ImageButton button29 = findViewById(R.id.imageButton70);
        final ImageButton button30 = findViewById(R.id.imageButton77);
        final ImageButton button31 = findViewById(R.id.imageButton43);
        final ImageButton button32 = findViewById(R.id.imageButton50);
        final ImageButton button33 = findViewById(R.id.imageButton57);
        final ImageButton button34 = findViewById(R.id.imageButton64);
        final ImageButton button35 = findViewById(R.id.imageButton71);
        final ImageButton button36 = findViewById(R.id.imageButton78);
        final ImageButton button37 = findViewById(R.id.imageButton44);
        final ImageButton button38 = findViewById(R.id.imageButton51);
        final ImageButton button39 = findViewById(R.id.imageButton58);
        final ImageButton button40 = findViewById(R.id.imageButton65);
        final ImageButton button41 = findViewById(R.id.imageButton72);
        final ImageButton button42 = findViewById(R.id.imageButton79);
        button.setImageResource(R.drawable.roundbutton);
        button2.setImageResource(R.drawable.roundbutton);
        button3.setImageResource(R.drawable.roundbutton);
        button4.setImageResource(R.drawable.roundbutton);
        button5.setImageResource(R.drawable.roundbutton);
        button6.setImageResource(R.drawable.roundbutton);
        button7.setImageResource(R.drawable.roundbutton);
        button8.setImageResource(R.drawable.roundbutton);
        button9.setImageResource(R.drawable.roundbutton);
        button10.setImageResource(R.drawable.roundbutton);
        button11.setImageResource(R.drawable.roundbutton);
        button12.setImageResource(R.drawable.roundbutton);
        button13.setImageResource(R.drawable.roundbutton);
        button14.setImageResource(R.drawable.roundbutton);
        button15.setImageResource(R.drawable.roundbutton);
        button16.setImageResource(R.drawable.roundbutton);
        button17.setImageResource(R.drawable.roundbutton);
        button18.setImageResource(R.drawable.roundbutton);
        button19.setImageResource(R.drawable.roundbutton);
        button20.setImageResource(R.drawable.roundbutton);
        button21.setImageResource(R.drawable.roundbutton);
        button22.setImageResource(R.drawable.roundbutton);
        button23.setImageResource(R.drawable.roundbutton);
        button24.setImageResource(R.drawable.roundbutton);
        button25.setImageResource(R.drawable.roundbutton);
        button26.setImageResource(R.drawable.roundbutton);
        button27.setImageResource(R.drawable.roundbutton);
        button28.setImageResource(R.drawable.roundbutton);
        button29.setImageResource(R.drawable.roundbutton);
        button30.setImageResource(R.drawable.roundbutton);
        button31.setImageResource(R.drawable.roundbutton);
        button32.setImageResource(R.drawable.roundbutton);
        button33.setImageResource(R.drawable.roundbutton);
        button34.setImageResource(R.drawable.roundbutton);
        button35.setImageResource(R.drawable.roundbutton);
        button36.setImageResource(R.drawable.roundbutton);
        button37.setImageResource(R.drawable.roundbutton);
        button38.setImageResource(R.drawable.roundbutton);
        button39.setImageResource(R.drawable.roundbutton);
        button40.setImageResource(R.drawable.roundbutton);
        button41.setImageResource(R.drawable.roundbutton);
        button42.setImageResource(R.drawable.roundbutton);
        board = new Player[7][6];
    }

    public int getWinner() {
        for (int i = 0; i < board[0].length; i++) {
            int player1HCounter = 1;
            int player2HCounter = 1;
            for (int j = 0; j < board.length - 1; j++) {
                if (this.board[j][i] == null || this.board[j + 1][i] == null) {
                    player1HCounter = 1;
                    player2HCounter = 1;
                    continue;
                }
                if (this.board[j][i].equals(this.board[j + 1][i])) {
                    if (this.board[j][i].equals(player1)) {
                        player1HCounter++;
                    } else if (this.board[j][i].equals(player2)) {
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
                    player2VCounter = 1;
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
        player1 = new Player();
        player2 = new Player();
        final ImageButton red = findViewById(R.id.imageButton);
        final ImageButton yellow = findViewById(R.id.imageButton2);
        red.setImageResource(R.drawable.redroundbutton);
        yellow.setImageResource(R.drawable.blankbutton);
        final Button reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resetBoard();
            }
        });
        final ImageButton button = findViewById(R.id.imageButton38);
        final ImageButton button2 = findViewById(R.id.imageButton45);
        final ImageButton button3 = findViewById(R.id.imageButton52);
        final ImageButton button4 = findViewById(R.id.imageButton59);
        final ImageButton button5 = findViewById(R.id.imageButton66);
        final ImageButton button6 = findViewById(R.id.imageButton73);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[0][5] == null) {
                    if (player1Counter == 1) {
                        board[0][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);


                        button6.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[0][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);

                        button6.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[0][i] == null && board[0][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[0][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button5.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button4.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button3.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button2.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[0][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button5.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button4.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button3.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button2.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
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
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[0][5] == null) {
                    if (player1Counter == 1) {
                        board[0][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button6.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[0][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button6.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[0][i] == null && board[0][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[0][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button5.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button4.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button3.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button2.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[0][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button5.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button4.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button3.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button2.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
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
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[0][5] == null) {
                    if (player1Counter == 1) {
                        board[0][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button6.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[0][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button6.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[0][i] == null && board[0][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[0][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button5.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button4.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button3.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button2.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[0][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button5.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button4.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button3.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button2.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
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
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[0][5] == null) {
                    if (player1Counter == 1) {
                        board[0][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button6.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[0][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button6.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[0][i] == null && board[0][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[0][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button5.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button4.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button3.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button2.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[0][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button5.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button4.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button3.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button2.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
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
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[0][5] == null) {
                    if (player1Counter == 1) {
                        board[0][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button6.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[0][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button6.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[0][i] == null && board[0][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[0][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button5.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button4.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button3.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button2.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[0][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button5.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button4.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button3.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button2.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
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
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[0][5] == null) {
                    if (player1Counter == 1) {
                        board[0][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button6.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[0][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button6.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[0][i] == null && board[0][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[0][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button5.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button4.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button3.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button2.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[0][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button5.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button4.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button3.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button2.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
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
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        final ImageButton button7 = findViewById(R.id.imageButton39);
        final ImageButton button8 = findViewById(R.id.imageButton46);
        final ImageButton button9 = findViewById(R.id.imageButton53);
        final ImageButton button10 = findViewById(R.id.imageButton60);
        final ImageButton button11 = findViewById(R.id.imageButton67);
        final ImageButton button12 = findViewById(R.id.imageButton74);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[1][5] == null) {
                    if (player1Counter == 1) {
                        board[1][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button12.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[1][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button12.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[1][i] == null && board[1][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[1][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button11.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button10.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button9.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button8.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button7.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[1][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button11.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button10.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button9.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button8.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button7.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[1][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[1][5] == null) {
                    if (player1Counter == 1) {
                        board[1][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button12.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[1][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button12.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[1][i] == null && board[1][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[1][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button11.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button10.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button9.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button8.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button7.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[1][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button11.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button10.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button9.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button8.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button7.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[1][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[1][5] == null) {
                    if (player1Counter == 1) {
                        board[1][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button12.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[1][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button12.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[1][i] == null && board[1][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[1][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button11.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button10.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button9.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button8.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button7.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[1][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button11.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button10.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button9.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button8.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button7.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[1][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[1][5] == null) {
                    if (player1Counter == 1) {
                        board[1][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button12.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[1][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button12.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[1][i] == null && board[1][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[1][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button11.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button10.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button9.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button8.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button7.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[1][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button11.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button10.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button9.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button8.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button7.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[1][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[1][5] == null) {
                    if (player1Counter == 1) {
                        board[1][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button12.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[1][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button12.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[1][i] == null && board[1][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[1][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button11.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button10.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button9.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button8.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button7.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[1][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button11.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button10.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button9.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button8.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button7.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[1][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[1][5] == null) {
                    if (player1Counter == 1) {
                        board[1][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button12.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[1][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button12.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[1][i] == null && board[1][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[1][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button11.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button10.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button9.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button8.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button7.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[1][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button11.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button10.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button9.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button8.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button7.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[1][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        final ImageButton button13 = findViewById(R.id.imageButton40);
        final ImageButton button14 = findViewById(R.id.imageButton47);
        final ImageButton button15 = findViewById(R.id.imageButton54);
        final ImageButton button16 = findViewById(R.id.imageButton61);
        final ImageButton button17 = findViewById(R.id.imageButton68);
        final ImageButton button18 = findViewById(R.id.imageButton75);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[2][5] == null) {
                    if (player1Counter == 1) {
                        board[2][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button18.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[2][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button18.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[2][i] == null && board[2][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[2][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button17.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button16.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button15.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button14.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button13.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[2][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button17.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button16.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button15.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button14.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button13.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[2][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[2][5] == null) {
                    if (player1Counter == 1) {
                        board[2][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button18.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[2][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button18.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[2][i] == null && board[2][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[2][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button17.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button16.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button15.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button14.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button13.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[2][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button17.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button16.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button15.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button14.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button13.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[2][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[2][5] == null) {
                    if (player1Counter == 1) {
                        board[2][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button18.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[2][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button18.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[2][i] == null && board[2][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[2][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button17.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button16.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button15.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button14.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button13.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[2][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button17.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button16.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button15.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button14.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button13.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[2][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[2][5] == null) {
                    if (player1Counter == 1) {
                        board[2][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button18.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[2][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button18.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[2][i] == null && board[2][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[2][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button17.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button16.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button15.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button14.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button13.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[2][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button17.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button16.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button15.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button14.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button13.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[2][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[2][5] == null) {
                    if (player1Counter == 1) {
                        board[2][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button18.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[2][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button18.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[2][i] == null && board[2][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[2][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button17.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button16.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button15.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button14.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button13.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[2][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button17.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button16.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button15.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button14.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button13.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[2][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[2][5] == null) {
                    if (player1Counter == 1) {
                        board[2][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button18.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[2][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button18.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[2][i] == null && board[2][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[2][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button17.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button16.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button15.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button14.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button13.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[2][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button17.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button16.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button15.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button14.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button13.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[2][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        final ImageButton button19 = findViewById(R.id.imageButton41);
        final ImageButton button20 = findViewById(R.id.imageButton48);
        final ImageButton button21 = findViewById(R.id.imageButton55);
        final ImageButton button22 = findViewById(R.id.imageButton62);
        final ImageButton button23 = findViewById(R.id.imageButton69);
        final ImageButton button24 = findViewById(R.id.imageButton76);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[3][5] == null) {
                    if (player1Counter == 1) {
                        board[3][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button24.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[3][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button24.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[3][i] == null && board[3][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[3][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button23.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button22.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button21.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button20.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button19.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[3][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button23.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button22.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button21.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button20.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button19.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[3][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[3][5] == null) {
                    if (player1Counter == 1) {
                        board[3][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button24.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[3][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button24.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[3][i] == null && board[3][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[3][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button23.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button22.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button21.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button20.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button19.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[3][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button23.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button22.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button21.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button20.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button19.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[3][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[3][5] == null) {
                    if (player1Counter == 1) {
                        board[3][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button24.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[3][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button24.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[3][i] == null && board[3][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[3][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button23.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button22.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button21.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button20.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button19.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[3][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button23.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button22.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button21.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button20.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button19.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[3][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[3][5] == null) {
                    if (player1Counter == 1) {
                        board[3][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button24.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[3][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button24.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[3][i] == null && board[3][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[3][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button23.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button22.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button21.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button20.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button19.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[3][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button23.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button22.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button21.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button20.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button19.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[3][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[3][5] == null) {
                    if (player1Counter == 1) {
                        board[3][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button24.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[3][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button24.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[3][i] == null && board[3][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[3][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button23.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button22.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button21.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button20.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button19.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[3][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button23.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button22.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button21.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button20.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button19.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[3][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[3][5] == null) {
                    if (player1Counter == 1) {
                        board[3][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button24.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[3][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button24.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[3][i] == null && board[3][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[3][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button23.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button22.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button21.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button20.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button19.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[3][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button23.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button22.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button21.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button20.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button19.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[3][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        final ImageButton button25 = findViewById(R.id.imageButton42);
        final ImageButton button26 = findViewById(R.id.imageButton49);
        final ImageButton button27 = findViewById(R.id.imageButton56);
        final ImageButton button28 = findViewById(R.id.imageButton63);
        final ImageButton button29 = findViewById(R.id.imageButton70);
        final ImageButton button30 = findViewById(R.id.imageButton77);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[4][5] == null) {
                    if (player1Counter == 1) {
                        board[4][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button30.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[4][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button30.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[4][i] == null && board[4][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[4][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button29.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button28.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button27.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button26.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button25.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[4][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button29.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button28.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button27.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button26.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button25.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[4][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[4][5] == null) {
                    if (player1Counter == 1) {
                        board[4][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button30.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[4][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button30.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[4][i] == null && board[4][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[4][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button29.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button28.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button27.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button26.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button25.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[4][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button29.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button28.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button27.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button26.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button25.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[4][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[4][5] == null) {
                    if (player1Counter == 1) {
                        board[4][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button30.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[4][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button30.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[4][i] == null && board[4][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[4][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button29.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button28.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button27.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button26.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button25.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[4][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button29.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button28.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button27.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button26.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button25.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[4][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[4][5] == null) {
                    if (player1Counter == 1) {
                        board[4][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button30.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[4][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button30.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[4][i] == null && board[4][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[4][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button29.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button28.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button27.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button26.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button25.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[4][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button29.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button28.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button27.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button26.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button25.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[4][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[4][5] == null) {
                    if (player1Counter == 1) {
                        board[4][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button30.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[4][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button30.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[4][i] == null && board[4][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[4][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button29.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button28.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button27.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button26.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button25.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[4][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button29.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button28.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button27.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button26.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button25.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[4][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[4][5] == null) {
                    if (player1Counter == 1) {
                        board[4][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button30.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[4][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button30.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[4][i] == null && board[4][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[4][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button29.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button28.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button27.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button26.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button25.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[4][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button29.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button28.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button27.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button26.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button25.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[4][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        final ImageButton button31 = findViewById(R.id.imageButton43);
        final ImageButton button32 = findViewById(R.id.imageButton50);
        final ImageButton button33 = findViewById(R.id.imageButton57);
        final ImageButton button34 = findViewById(R.id.imageButton64);
        final ImageButton button35 = findViewById(R.id.imageButton71);
        final ImageButton button36 = findViewById(R.id.imageButton78);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[5][5] == null) {
                    if (player1Counter == 1) {
                        board[5][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button36.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[5][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button36.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[5][i] == null && board[5][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[5][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button35.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button34.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button33.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button32.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button31.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[5][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button35.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button34.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button33.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button32.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button31.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[5][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[5][5] == null) {
                    if (player1Counter == 1) {
                        board[5][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button36.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[5][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button36.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[5][i] == null && board[5][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[5][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button35.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button34.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button33.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button32.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button31.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[5][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button35.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button34.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button33.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button32.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button31.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[5][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[5][5] == null) {
                    if (player1Counter == 1) {
                        board[5][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button36.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[5][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button36.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[5][i] == null && board[5][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[5][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button35.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button34.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button33.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button32.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button31.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[5][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button35.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button34.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button33.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button32.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button31.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[5][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[5][5] == null) {
                    if (player1Counter == 1) {
                        board[5][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button36.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[5][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button36.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[5][i] == null && board[5][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[5][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button35.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button34.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button33.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button32.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button31.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[5][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button35.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button34.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button33.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button32.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button31.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[5][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[5][5] == null) {
                    if (player1Counter == 1) {
                        board[5][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button36.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[5][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button36.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[5][i] == null && board[5][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[5][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button35.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button34.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button33.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button32.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button31.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[5][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button35.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button34.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button33.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button32.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button31.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[5][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[5][5] == null) {
                    if (player1Counter == 1) {
                        board[5][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button36.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[5][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button36.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[5][i] == null && board[5][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[5][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button35.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button34.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button33.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button32.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button31.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[5][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button35.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button34.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button33.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button32.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button31.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[5][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        final ImageButton button37 = findViewById(R.id.imageButton44);
        final ImageButton button38 = findViewById(R.id.imageButton51);
        final ImageButton button39 = findViewById(R.id.imageButton58);
        final ImageButton button40 = findViewById(R.id.imageButton65);
        final ImageButton button41 = findViewById(R.id.imageButton72);
        final ImageButton button42 = findViewById(R.id.imageButton79);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[6][5] == null) {
                    if (player1Counter == 1) {
                        board[6][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button42.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[6][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button42.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[6][i] == null && board[6][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[6][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button41.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button40.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button39.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button38.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button37.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[6][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button41.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button40.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button39.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button38.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button37.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[6][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[6][5] == null) {
                    if (player1Counter == 1) {
                        board[6][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button42.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[6][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button42.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[6][i] == null && board[6][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[6][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button41.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button40.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button39.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button38.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button37.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[6][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button41.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button40.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button39.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button38.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button37.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[6][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[6][5] == null) {
                    if (player1Counter == 1) {
                        board[6][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button42.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[6][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button42.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[6][i] == null && board[6][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[6][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button41.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button40.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button39.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button38.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button37.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[6][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button41.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button40.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button39.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button38.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button37.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[6][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[6][5] == null) {
                    if (player1Counter == 1) {
                        board[6][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button42.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[6][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button42.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[6][i] == null && board[6][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[6][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button41.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button40.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button39.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button38.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button37.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[6][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button41.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button40.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button39.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button38.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button37.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[6][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[6][5] == null) {
                    if (player1Counter == 1) {
                        board[6][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button42.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[6][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button42.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[6][i] == null && board[6][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[6][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button41.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button40.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button39.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button38.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button37.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[6][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button41.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button40.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button39.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button38.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button37.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[6][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[6][5] == null) {
                    if (player1Counter == 1) {
                        board[6][5] = player1;
                        player1Counter = 0;
                        player2Counter = 1;
                        red.setImageResource(R.drawable.blankbutton);
                        yellow.setImageResource(R.drawable.yellowroundbutton);

                        button42.setImageResource(R.drawable.redroundbutton);
                    } else if (player2Counter == 1) {
                        board[6][5] = player2;
                        player1Counter = 1;
                        player2Counter = 0;
                        red.setImageResource(R.drawable.redroundbutton);
                        yellow.setImageResource(R.drawable.blankbutton);
                        button42.setImageResource(R.drawable.yellowroundbutton);
                    }
                } else {
                    for (int i = 4; i >= 0; i--) {
                        if (board[6][i] == null && board[6][i + 1] != null) {
                            if (player1Counter == 1) {
                                board[6][i] = player1;
                                player1Counter = 0;
                                player2Counter = 1;
                                red.setImageResource(R.drawable.blankbutton);
                                yellow.setImageResource(R.drawable.yellowroundbutton);

                                if (i == 4) {
                                    button41.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button40.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button39.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button38.setImageResource(R.drawable.redroundbutton);
                                    break;
                                } else {
                                    button37.setImageResource(R.drawable.redroundbutton);
                                    break;
                                }
                            } else if (player2Counter == 1) {
                                board[6][i] = player2;
                                player1Counter = 1;
                                player2Counter = 0;
                                red.setImageResource(R.drawable.redroundbutton);
                                yellow.setImageResource(R.drawable.blankbutton);
                                if (i == 4) {
                                    button41.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 3) {
                                    button40.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 2) {
                                    button39.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else if (i == 1) {
                                    button38.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                } else {
                                    button37.setImageResource(R.drawable.yellowroundbutton);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (board[6][0] != null) {
                    Toast.makeText(MainActivity.this, "Please select a different column!", Toast.LENGTH_LONG).show();
                }
                if (getWinner() == 1) {
                    Toast.makeText(MainActivity.this, "Player 1 is the winner!", Toast.LENGTH_LONG).show();
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(MainActivity.this, "Player 2 is the winner!", Toast.LENGTH_LONG).show();
                    player2.addScore();
                    resetBoard();
                }
            }
        });
    }
    public void showScore(View view) {
        Toast.makeText(this, "Player 1: " + player1.getScore() + " Player 2: " + player2.getScore(), Toast.LENGTH_LONG).show();
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
}