package com.gridness.iqtestjava;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 6, 0},
        k = 1,
        d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¨\u0006\u000b"},
        d2 = {"Lcom/gridness/iqtest/FirstQuestion;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "defineValue", "", "answer", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "IQTest.app.main"}
)
public final class FirstQuestion extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_first_question);
        ActionBar var10000 = this.getSupportActionBar();
        if (var10000 != null) {
            var10000.hide();
        }

        final String name = this.getIntent().getStringExtra("username");
        final int currentScore = this.getIntent().getIntExtra("score", -1);
        Button wrongAnswerOne = (Button)this.findViewById(R.id.button);
        wrongAnswerOne.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                int newScore = currentScore + FirstQuestion.this.defineValue("wrong");
                Intent var4 = new Intent((Context)FirstQuestion.this, SecondQuestion.class);
                //int var6 = false;
                var4.removeExtra("score");
                var4.putExtra("score", newScore);
                var4.putExtra("username", name);
                FirstQuestion.this.startActivity(var4);
            }
        }));
        Button wrongAnswerTwo = (Button)this.findViewById(R.id.button2);
        wrongAnswerTwo.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                int newScore = currentScore + FirstQuestion.this.defineValue("wrong");
                Intent var4 = new Intent((Context)FirstQuestion.this, SecondQuestion.class);
                //int var6 = false;
                var4.removeExtra("score");
                var4.putExtra("score", newScore);
                var4.putExtra("username", name);
                FirstQuestion.this.startActivity(var4);
            }
        }));
        Button wrongAnswerThree = (Button)this.findViewById(R.id.button3);
        wrongAnswerThree.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                int newScore = currentScore + FirstQuestion.this.defineValue("wrong");
                Intent var4 = new Intent((Context)FirstQuestion.this, SecondQuestion.class);
                //int var6 = false;
                var4.removeExtra("score");
                var4.putExtra("score", newScore);
                var4.putExtra("username", name);
                FirstQuestion.this.startActivity(var4);
            }
        }));
        Button wrongAnswerFour = (Button)this.findViewById(R.id.button5);
        wrongAnswerFour.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                int newScore = currentScore + FirstQuestion.this.defineValue("wrong");
                Intent var4 = new Intent((Context)FirstQuestion.this, SecondQuestion.class);
                //int var6 = false;
                var4.removeExtra("score");
                var4.putExtra("score", newScore);
                var4.putExtra("username", name);
                FirstQuestion.this.startActivity(var4);
            }
        }));
        Button rightAnswer = (Button)this.findViewById(R.id.button4);
        rightAnswer.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                int newScore = currentScore + FirstQuestion.this.defineValue("right");
                Intent var4 = new Intent((Context)FirstQuestion.this, SecondQuestion.class);
                //int var6 = false;
                var4.removeExtra("score");
                var4.putExtra("score", newScore);
                var4.putExtra("username", name);
                FirstQuestion.this.startActivity(var4);
            }
        }));
    }

    private int defineValue(String answer) {
        int modifier = 25;
        return Intrinsics.areEqual(answer, "wrong") ? modifier - 2 * modifier : modifier;
    }
}