package cs125project.connect4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private int[][] board = new int[7][6];
    static int player1Counter = 1;
    static int player2Counter = 0;

    public int getWinner() {
        for (int i = 0; i < board.length; i++) {
            int player1HCounter = 1;
            int player2HCounter = 1;
            for (int j = 0; j < board[0].length; j++) {
                if (this.board[i][j] == 0 || this.board[i + 1][j] == 0) {
                    horizontalCounter = 1;
                    continue;
                }
                if (this.board[j][i].equals(this.board[j + 1][i])) {
                    horizontalCounter++;
                    if (horizontalCounter >= this.n) {
                        this.end = true;
                        this.board[j][i].addScore();
                        return this.board[j][i];
                    }
                } else {
                    horizontalCounter = 1;
                }
            }
        }
        for (int i = 0; i < this.width; i++) {
            int verticalCounter = 1;
            for (int j = 0; j < this.height - 1; j++) {
                if (this.board[i][j] == null || this.board[i][j + 1] == null) {
                    verticalCounter = 1;
                    continue;
                }

                if (this.board[i][j].equals(this.board[i][j + 1])) {

                    verticalCounter++;

                    if (verticalCounter >= this.n) {

                        this.end = true;

                        this.board[i][j].addScore();

                        return this.board[i][j];

                    }

                } else {

                    verticalCounter = 1;

                }

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
                if (board[0][0] == 0) {
                    for (int i = 1; i < board[0].length; i++) {
                        if (board[0][i] != 0) {
                            if (player1Counter == 1) {
                                board[0][i - 1] = 1;
                                player1Counter = 0;
                                player2Counter = 1;
                            } else if (player2Counter == 1) {
                                board[0][i - 1] = 2;
                                player1Counter = 1;
                                player2Counter = 0;
                            }
                        }
                    }
                }
                if (board[0][0] != 0) {
                    System.out.println("Column is full, pick another row!");
                }
                if (getWinner() == 1) {
                    System.out.println("Player 1 is the Winner!");
                    board = new int[7][6];
                }
                if (getWinner() == 2) {
                    System.out.println("Player 2 is the Winner!");
                    board = new int[7][6];
                }
            }
        });
    }
}
