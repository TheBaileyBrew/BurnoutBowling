package com.thebaileybrew.burnoutbowling;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.daimajia.androidviewhover.BlurLayout;

import cdflynn.android.library.crossview.CrossView;

/**
 * Created by matthew.bailey on 3/16/2018.
 */

public class SelectionAvatarPlayerOne extends AppCompatActivity {
    Context mContext;
    ImageView playerOneImage;
    Boolean isSelectedIconOne;
    Boolean isSelectedIconTwo;
    Boolean isSelectedIconThree;
    Boolean isSelectedIconFour;
    Boolean isSelectedIconFive;
    BlurLayout avatarIconOne;
    BlurLayout avatarIconTwo;
    BlurLayout avatarIconThree;
    BlurLayout avatarIconFour;
    BlurLayout avatarIconFive;
    View hover;
    View hover2;
    View hover3;
    View hover4;
    View hover5;



    @Override
    @SuppressWarnings("ConstantConditions")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avatar_selection_one);
        mContext = this;
        playerOneImage = findViewById(R.id.player_one_main_image);
        isSelectedIconOne = false;
        isSelectedIconTwo = false;
        isSelectedIconThree = false;
        isSelectedIconFour = false;
        isSelectedIconFive = false;
        avatarIconOne = findViewById(R.id.player_one_avatar_icon_one);
        avatarIconTwo = findViewById(R.id.player_one_avatar_icon_two);
        avatarIconThree = findViewById(R.id.player_one_avatar_icon_three);
        avatarIconFour = findViewById(R.id.player_one_avatar_icon_four);
        avatarIconFive = findViewById(R.id.player_one_avatar_icon_five);
        hover = LayoutInflater.from(mContext).inflate(R.layout.hover_blur, null);
        hover2 = LayoutInflater.from(mContext).inflate(R.layout.hover_blur2, null);
        hover3 = LayoutInflater.from(mContext).inflate(R.layout.hover_blur3, null);
        hover4 = LayoutInflater.from(mContext).inflate(R.layout.hover_blur4, null);
        hover5 = LayoutInflater.from(mContext).inflate(R.layout.hover_blur5, null);

    }
    public void onClickAvatarBlack(View v) {
        avatarIconOne.setHoverView(hover);
        isSelectedIconTwo = false;
        isSelectedIconThree = false;
        isSelectedIconFour = false;
        isSelectedIconFive = false;
        if (!isSelectedIconOne) {
            avatarIconOne.setBlurDuration(1000);
            avatarIconOne.enableZoomBackground(true);
            YoYo.with(Techniques.Bounce)
                    .duration(500)
                    .playOn(v);
            CrossView avatarIconOnep1 = findViewById(R.id.hover_toggle);
            avatarIconOnep1.setColor(getResources().getColor(R.color.hardRed));
            avatarIconOnep1.cross(250);
            playerOneImage.setImageDrawable(getResources().getDrawable(R.drawable.blackball));
            isSelectedIconOne = true;
        } else {
            avatarIconOne.setBlurDuration(0);
            avatarIconOne.enableZoomBackground(false);
            YoYo.with(Techniques.Shake)
                    .duration(500)
                    .playOn(v);
            CrossView avatarIconOneP1 = findViewById(R.id.hover_toggle);
            avatarIconOneP1.setColor(getResources().getColor(R.color.regWhite));
            avatarIconOneP1.plus(250);
            playerOneImage.setImageDrawable(getResources().getDrawable(R.drawable.finalcamera));
            isSelectedIconOne = false;
        }

    }

    public void onClickAvatarRed(View v) {
    /*
                    Sets the animation and hover effect on Avatar Icon Two
                    Toggles the OnClick and Cross / Plus transition
                    */
        avatarIconTwo.setHoverView(hover2);
        isSelectedIconOne = false;
        isSelectedIconThree = false;
        isSelectedIconFour = false;
        isSelectedIconFive = false;
        if (!isSelectedIconTwo) {
            avatarIconTwo.setBlurDuration(1000);
            avatarIconTwo.enableZoomBackground(true);
            YoYo.with(Techniques.Bounce)
                    .duration(500)
                    .playOn(v);
            CrossView avatarIconTwop1 = findViewById(R.id.hover_toggle2);
            avatarIconTwop1.setColor(getResources().getColor(R.color.hardRed));
            avatarIconTwop1.cross(250);
            playerOneImage.setImageDrawable(getResources().getDrawable(R.drawable.redball));
            isSelectedIconTwo = true;
        } else {
            avatarIconTwo.setBlurDuration(0);
            avatarIconTwo.enableZoomBackground(false);
            YoYo.with(Techniques.Shake)
                    .duration(500)
                    .playOn(v);
            CrossView avatarIconTwop1 = findViewById(R.id.hover_toggle2);
            avatarIconTwop1.setColor(getResources().getColor(R.color.regWhite));
            avatarIconTwop1.plus(250);
            playerOneImage.setImageDrawable(getResources().getDrawable(R.drawable.finalcamera));
            isSelectedIconTwo = false;
        }

    }

    public void onClickAvatarPurple(View v) {
        /*
                    Sets the animation and hover effect on Avatar Icon Two
                    Toggles the OnClick and Cross / Plus transition
                    */
        avatarIconThree.setHoverView(hover3);
        isSelectedIconOne = false;
        isSelectedIconTwo = false;
        isSelectedIconFour = false;
        isSelectedIconFive = false;
        if (!isSelectedIconThree) {
            avatarIconThree.setBlurDuration(1000);
            avatarIconThree.enableZoomBackground(true);
            YoYo.with(Techniques.Bounce)
                    .duration(500)
                    .playOn(v);
            CrossView avatarIconThreep1 = findViewById(R.id.hover_toggle3);
            avatarIconThreep1.setColor(getResources().getColor(R.color.hardRed));
            avatarIconThreep1.cross(250);
            playerOneImage.setImageDrawable(getResources().getDrawable(R.drawable.purpleball));
            isSelectedIconThree = true;
        } else {
            avatarIconThree.setBlurDuration(0);
            avatarIconThree.enableZoomBackground(false);
            YoYo.with(Techniques.Shake)
                    .duration(500)
                    .playOn(v);
            CrossView avatarIconThreep1 = findViewById(R.id.hover_toggle3);
            avatarIconThreep1.setColor(getResources().getColor(R.color.regWhite));
            avatarIconThreep1.plus(250);
            playerOneImage.setImageDrawable(getResources().getDrawable(R.drawable.finalcamera));
            isSelectedIconThree = false;
        }
    }

    public void onClickAvatarGreen(View v) {
        /*
                    Sets the animation and hover effect on Avatar Icon Four
                    Toggles the OnClick and Cross / Plus transition
                    */
        avatarIconFour.setHoverView(hover4);
        isSelectedIconOne = false;
        isSelectedIconTwo = false;
        isSelectedIconThree = false;
        isSelectedIconFive = false;
        if (!isSelectedIconFour) {
            avatarIconFour.setBlurDuration(1000);
            avatarIconFour.enableZoomBackground(true);
            YoYo.with(Techniques.Bounce)
                    .duration(500)
                    .playOn(v);
            CrossView avatarIconFourp1 = findViewById(R.id.hover_toggle4);
            avatarIconFourp1.setColor(getResources().getColor(R.color.hardRed));
            avatarIconFourp1.cross(250);
            playerOneImage.setImageDrawable(getResources().getDrawable(R.drawable.greenball));
            isSelectedIconFour = true;
        } else {
            avatarIconFour.setBlurDuration(0);
            avatarIconFour.enableZoomBackground(false);
            YoYo.with(Techniques.Shake)
                    .duration(500)
                    .playOn(v);
            CrossView avatarIconFourp1 = findViewById(R.id.hover_toggle4);
            avatarIconFourp1.setColor(getResources().getColor(R.color.regWhite));
            avatarIconFourp1.plus(250);
            playerOneImage.setImageDrawable(getResources().getDrawable(R.drawable.finalcamera));
            isSelectedIconFour = false;
        }
    }

    public void onClickAvatarBlue(View v) {
        /*
        Sets the animation and hover effect on Avatar Icon Five
        Toggles the OnClick and Cross / Plus transition
        */
        avatarIconFive.setHoverView(hover5);
        isSelectedIconOne = false;
        isSelectedIconTwo = false;
        isSelectedIconThree = false;
        isSelectedIconFour = false;
        if (!isSelectedIconFive) {
            avatarIconFive.setBlurDuration(1000);
            avatarIconFive.enableZoomBackground(true);
            YoYo.with(Techniques.Bounce)
                    .duration(500)
                    .playOn(v);
            CrossView avatarIconFivep1 = findViewById(R.id.hover_toggle5);
            avatarIconFivep1.setColor(getResources().getColor(R.color.hardRed));
            avatarIconFivep1.cross(250);
            playerOneImage.setImageDrawable(getResources().getDrawable(R.drawable.blueball));
            isSelectedIconFive = true;
        } else {
            avatarIconFive.setBlurDuration(0);
            avatarIconFive.enableZoomBackground(false);
            YoYo.with(Techniques.Shake)
                    .duration(500)
                    .playOn(v);
            CrossView avatarIconFivep1 = findViewById(R.id.hover_toggle5);
            avatarIconFivep1.setColor(getResources().getColor(R.color.regWhite));
            avatarIconFivep1.plus(250);
            playerOneImage.setImageDrawable(getResources().getDrawable(R.drawable.finalcamera));
            isSelectedIconFive = false;
        }
    }
}
