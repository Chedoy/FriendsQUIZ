package com.example.android.friendsquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import com.example.android.friendsquiz.R;

import static android.R.attr.id;
import static com.example.android.friendsquiz.R.id.RadioThree;
import static com.example.android.friendsquiz.R.id.sister_amanda;
import static com.example.android.friendsquiz.R.id.sister_amy;
import static com.example.android.friendsquiz.R.id.sister_cookie;
import static com.example.android.friendsquiz.R.id.sister_dina;
import static com.example.android.friendsquiz.R.id.sister_felicity;
import static com.example.android.friendsquiz.R.id.sister_gina;
import static com.example.android.friendsquiz.R.id.sister_jane;
import static com.example.android.friendsquiz.R.id.sister_jill;
import static com.example.android.friendsquiz.R.id.sister_judy;
import static com.example.android.friendsquiz.R.id.sister_mary_angela;
import static com.example.android.friendsquiz.R.id.sister_mary_therese;
import static com.example.android.friendsquiz.R.id.sister_tamy;
import static com.example.android.friendsquiz.R.id.sister_tina;
import static com.example.android.friendsquiz.R.id.sister_veronica;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitAnswers(View view) {
        int score = 0;


        // Registers users name
        EditText checkNameText = (EditText) findViewById(R.id.your_name);
        String nameText = checkNameText.getText().toString();

        // Question One Checking

        RadioButton checkRadioOne = (RadioButton) findViewById(R.id.radio_mindy);
        boolean RadioOneCorrect = checkRadioOne.isChecked();
        if (RadioOneCorrect) {
            score = score + 1;
        }

        // Question Two Checking

        RadioButton checkRadioTwo = (RadioButton) findViewById(R.id.radio_keyboard);
        boolean RadioTwoCorrect = checkRadioTwo.isChecked();
        if (RadioTwoCorrect) {
            score = score + 1;
        }

        // Question Three Checking

        CheckBox checkOpOne = (CheckBox) findViewById(sister_jill);
        boolean opOne = checkOpOne.isChecked();
        CheckBox checkOpTwo = (CheckBox) findViewById(sister_tamy);
        boolean opTwo = checkOpTwo.isChecked();
        CheckBox checkOpThree = (CheckBox) findViewById(sister_judy);
        boolean opThree = checkOpThree.isChecked();
        CheckBox checkOpFour = (CheckBox) findViewById(sister_amy);
        boolean opFour = checkOpFour.isChecked();
        CheckBox checkOpFive = (CheckBox) findViewById(sister_jane);
        boolean opFive = checkOpFive.isChecked();
        CheckBox checkOpSix = (CheckBox) findViewById(sister_amanda);
        boolean opSix = checkOpSix.isChecked();
        CheckBox checkOpSeven = (CheckBox) findViewById(sister_felicity);
        boolean opSeven = checkOpSeven.isChecked();
        if ((opOne) && (!opTwo) && (!opThree) && (opFour) && (!opFive) && (!opSix) && (!opSeven)) {
            score = score + 1;
        }

        // Question Four Checking

        EditText checkEditText = (EditText) findViewById(R.id.name_answer_one);
        String answerText = checkEditText.getText().toString();
        if (answerText.equals("frank jr")) {
            score = score + 1;
        }
        if (answerText.equals("Frank jr")) {
            score = score + 1;
        }
        if (answerText.equals("Frank Jr.")) {
            score = score + 1;
        }
        if (answerText.equals("Frank jr.")) {
            score = score + 1;
        }
        if (answerText.equals("frank jr.")) {
            score = score + 1;
        }
        if (answerText.equals("Frank Jr")) {
            score = score + 1;
        }

        if (answerText.equals("Frank JR.")) {
            score = score + 1;
        }
        if (answerText.equals("Frank JR")) {
            score = score + 1;
        }


        RadioButton checkRadioThree = (RadioButton) findViewById(R.id.radio_mitsy);
        boolean RadioThreeCorrect = checkRadioThree.isChecked();
        if (RadioThreeCorrect) {
            score = score + 1;
        }

        // Question Six Checking

        RadioButton checkRadioFour = (RadioButton) findViewById(R.id.radio_ice_skater);
        boolean RadioFourCorrect = checkRadioFour.isChecked();
        if (RadioFourCorrect) {
            score = score + 1;
        }

        // Question Seven Checking

        EditText checkEditTextTwo = (EditText) findViewById(R.id.name_answer_two);
        String answerTextTwo = checkEditTextTwo.getText().toString();
        if (answerTextTwo.equals("tibidabo")) {
            score = score + 1;
        }
        if (answerTextTwo.equals("Tibidabo")) {
            score = score + 1;
        }

        // Question Eight Checking

        RadioButton checkRadioFive = (RadioButton) findViewById(R.id.radio_jack_judy);
        boolean RadioFiveCorrect = checkRadioFive.isChecked();
        if (RadioFiveCorrect) {
            score = score + 1;
        }


        // Question Nine Checking

        EditText checkEditTextThree = (EditText) findViewById(R.id.name_answer_three);
        String answerTextThree = checkEditTextThree.getText().toString();
        if (answerTextThree.equals("Parker")) {
            score = score + 1;
        }
        if (answerTextThree.equals("parker")) {
            score = score + 1;
        }


        // Question Ten Checking


        CheckBox checkSisOne = (CheckBox) findViewById(R.id.sister_gina);
        boolean sisOne = checkSisOne.isChecked();
        CheckBox checkSisTwo = (CheckBox) findViewById(R.id.sister_tina);
        boolean sisTwo = checkSisTwo.isChecked();
        CheckBox checkSisThree = (CheckBox) findViewById(sister_dina);
        boolean sisThree = checkSisThree.isChecked();
        CheckBox checkSisFour = (CheckBox) findViewById(R.id.sister_mary_angela);
        boolean sisFour = checkSisFour.isChecked();
        CheckBox checkSisFive = (CheckBox) findViewById(R.id.sister_mary_therese);
        boolean sisFive = checkSisFive.isChecked();
        CheckBox checkSisSix = (CheckBox) findViewById(R.id.sister_veronica);
        boolean sisSix = checkSisSix.isChecked();
        CheckBox checkSisSeven = (CheckBox) findViewById(R.id.sister_cookie);
        boolean sisSeven = checkSisSeven.isChecked();
        if ((sisOne) && (sisTwo) && (sisThree) && (sisFour) && (sisFive) && (sisSix) && (sisSeven)) {
            score = score + 1;
        }

        // Show Score

        String result = nameText + " scored " + score + "/10!";
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }


    //Reset button

    public void resetAll(View view) {

        ScrollView mainScrollView = (ScrollView)findViewById(R.id.mainScrollView);

        //Reset Name

        EditText text = (EditText) findViewById(R.id.your_name);
        text.setText(null);

        //Reset Question One

        RadioGroup RadioOne = (RadioGroup) findViewById(R.id.RadioOne);
        RadioOne.clearCheck();

        //Reset Question Two

        RadioGroup RadioTwo = (RadioGroup) findViewById(R.id.RadioTwo);
        RadioTwo.clearCheck();

        //Reset Question Three

        CheckBox check = (CheckBox) findViewById(R.id.sister_jill);
        check.setChecked(false);
        check = (CheckBox) findViewById(R.id.sister_tamy);
        check.setChecked(false);
        check = (CheckBox) findViewById(R.id.sister_judy);
        check.setChecked(false);
        check = (CheckBox) findViewById(R.id.sister_amy);
        check.setChecked(false);
        check = (CheckBox) findViewById(R.id.sister_jane);
        check.setChecked(false);
        check = (CheckBox) findViewById(R.id.sister_amanda);
        check.setChecked(false);
        check = (CheckBox) findViewById(R.id.sister_felicity);
        check.setChecked(false);


        //Reset Question Four

        text = (EditText) findViewById(R.id.name_answer_one);
        text.setText(null);

        //Reset Question Five

        RadioGroup RadioThree = (RadioGroup) findViewById(R.id.RadioThree);
        RadioThree.clearCheck();

        //Reset Question Six

        RadioGroup RadioFour = (RadioGroup) findViewById(R.id.RadioFour);
        RadioFour.clearCheck();


        //Reset Question Seven

        text = (EditText) findViewById(R.id.name_answer_two);
        text.setText(null);

        //Reset Question Eight

        RadioGroup RadioFive = (RadioGroup) findViewById(R.id.RadioFive);
        RadioFive.clearCheck();

        //Reset Question Nine

        text = (EditText) findViewById(R.id.name_answer_three);
        text.setText(null);

        //Reset Question Ten

        CheckBox checkSisOne = (CheckBox) findViewById(R.id.sister_gina);
        checkSisOne.setChecked(false);
        CheckBox checkSisTwo = (CheckBox) findViewById(R.id.sister_tina);
        checkSisTwo.setChecked(false);
        CheckBox checkSisThree = (CheckBox) findViewById(R.id.sister_dina);
        checkSisThree.setChecked(false);
        CheckBox checkSisFour = (CheckBox) findViewById(R.id.sister_mary_angela);
        checkSisFour.setChecked(false);
        CheckBox checkSisFive = (CheckBox) findViewById(R.id.sister_mary_therese);
        checkSisFive.setChecked(false);
        CheckBox checkSisSix = (CheckBox) findViewById(R.id.sister_veronica);
        checkSisSix.setChecked(false);
        CheckBox checkSisSeven = (CheckBox) findViewById(R.id.sister_cookie);
        checkSisSeven.setChecked(false);

        //Scrolls to top

        mainScrollView.fullScroll(ScrollView.FOCUS_UP);


    }
}
