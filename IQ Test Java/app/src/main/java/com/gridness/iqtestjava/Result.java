package com.gridness.iqtestjava;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 6, 0},
        k = 1,
        d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0015¨\u0006\t"},
        d2 = {"Lcom/gridness/iqtest/Result;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "determineIQLevel", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "IQTest.app.main"}
)
public final class Result extends AppCompatActivity {
    @SuppressLint({"SetTextI18n"})
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_result);
        ActionBar var10000 = this.getSupportActionBar();
        if (var10000 != null) {
            var10000.hide();
        }

        ((TextView)this.findViewById(R.id.nameView)).setText((CharSequence)this.getIntent().getStringExtra("username"));
        Unit usernameView = Unit.INSTANCE;
        ((TextView)this.findViewById(R.id.iqView)).setText((CharSequence)(this.getIntent().getIntExtra("score", -1) + " IQ"));
        Unit iqview = Unit.INSTANCE;
        ((TextView)this.findViewById(R.id.iqLevelView)).setText((CharSequence)this.determineIQLevel());
        Unit iqLevelView = Unit.INSTANCE;
        Button restartButton = (Button)this.findViewById(R.id.button9);
        restartButton.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Intent var3 = new Intent((Context)Result.this, MainActivity.class);
                //int var5 = false;
                var3.removeExtra("username");
                var3.removeExtra("score");
                Result.this.startActivity(var3);
            }
        }));
    }

    private String determineIQLevel() {
        int score = this.getIntent().getIntExtra("score", -1);
        if (score < 0) {
            return "игрок в DOTA 2";
        } else if (score < 50) {
            return "хлебный мякиш";
        } else {
            return score < 100 ? "резиновый тапочек" : "Альберт Эйнштейн";
        }
    }
}