package cs125project.connect4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Player[][] board = new Player[7][6];
    private Player player1;
    private Player player2;
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
                if (this.board[i][j].equals(this.board[i][j])) {
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

    public void showScore(View view) {
        Toast.makeText(this, "Player 1: " + player1.getScore() + " Player 2: " + player2.getScore(), Toast.LENGTH_LONG).show();
    }

    public void resetBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = null;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button38);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                    System.out.println("Column is full, pick another row!");
                }
                if (getWinner() == 1) {
                    System.out.println("Player 1 is the Winner!");
                    player1.addScore();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    System.out.println("Player 2 is the Winner!");
                    player2.addScore();
                    resetBoard();
                }
            }
        });
    }
}
