package com.thebaileybrew.burnoutbowling;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.daimajia.androidviewhover.BlurLayout;
import com.yarolegovich.lovelydialog.LovelyCustomDialog;
import com.yarolegovich.lovelydialog.LovelyInfoDialog;
import com.yarolegovich.lovelydialog.LovelySaveStateHandler;

import cdflynn.android.library.crossview.CrossView;

import static android.view.View.VISIBLE;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Define generic variables
    String playerOneName;
    String playerTwoName;
    int playerOneRunningScore;
    int playerTwoRunningScore;
    boolean playerOneTurn;
    boolean playerTwoTurn;
    Button playerOneChooseAvatar;

    Context mContext;
    Boolean isSelectedIconOne;
    Boolean isSelectedIconTwo;
    Boolean isSelectedIconThree;
    Boolean isSelectedIconFour;
    Boolean isSelectedIconFive;
    ImageView playerOneImage;
    ImageView avatar_black;
    ImageView avatar_green;
    ImageView avatar_red;
    ImageView avatar_purple;
    ImageView avatar_blue;
    GridLayout avatarSelectionGrid;




    private static final int ID_AVATARBLACK = R.id.avatar_black;
    private static final int ID_AVATARRED = R.id.avatar_red;
    private static final int ID_AVATARGREEN = R.id.avatar_green;
    private static final int ID_AVATARBLUE = R.id.avatar_blue;
    private static final int ID_AVATARPURPLE = R.id.avatar_purple;

    private LovelySaveStateHandler saveStateHandler;

    private static final int ID_CUSTOM_DIALOG_PLAYER_ONE = R.id.player_one_choose_avatar;
    private static final int ID_CUSTOM_DIALOG_PLAYER_TWO = R.id.player_two_choose_avatar;

    @Override
    @SuppressWarnings("ConstantConditions")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BlurLayout.setGlobalDefaultDuration(450);
        playerOneImage = findViewById(R.id.player_one_main_image);


        saveStateHandler = new LovelySaveStateHandler();

        playerOneChooseAvatar = findViewById(R.id.player_one_choose_avatar);
        playerOneChooseAvatar.setOnClickListener(this);

        //Declares the boolean values for avatar selection
        isSelectedIconOne = false;
        isSelectedIconTwo = false;
        isSelectedIconThree = false;
        isSelectedIconFour = false;
        isSelectedIconFive = false;

        playerOneImage = findViewById(R.id.player_one_main_image);
        avatar_black = findViewById(R.id.avatar_black);
        avatar_blue = findViewById(R.id.avatar_blue);
        avatar_green = findViewById(R.id.avatar_green);
        avatar_purple = findViewById(R.id.avatar_purple);
        avatar_red = findViewById(R.id.avatar_red);






    }
    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        if (v.getId() == ID_CUSTOM_DIALOG_PLAYER_ONE) {
            showLovelyDialog(v.getId(), null);
        } else if (v.getId() == ID_CUSTOM_DIALOG_PLAYER_TWO) {
            // Show Diag for Player Two
        } else {
            onClickSwitchVerify(v.getId(), v);
        }
    }

    private void showLovelyDialog(int dialogId, Bundle savedInstanceState) {
        switch (dialogId) {
            case ID_CUSTOM_DIALOG_PLAYER_ONE:
                showCustomDialogPlayerOne(savedInstanceState);
                break;
        }
    }

    private void showCustomDialogPlayerOne(Bundle savedInstanceState) {
        new LovelyCustomDialog(this)
                .setView(R.layout.avatar_selection_one)
                .setTopColorRes(R.color.hardRed)
                .setTitle("Choose Your Avatar Image")
                .show();
    }

    private void onClickSwitchVerify (int id, View v) {
        avatarSelectionGrid.setOnClickListener(this);
        avatar_black.setOnClickListener(this);
        avatar_blue.setOnClickListener(this);
        avatar_green.setOnClickListener(this);
        avatar_purple.setOnClickListener(this);
        avatar_red.setOnClickListener(this);

    }



    public void onClickStartNewGame(View view) {
        Intent startGame = new Intent(this,ScoringActivity.class);
        startActivity(startGame);
    }



}
