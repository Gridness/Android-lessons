package com.gridness.iqtestjava;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 6, 0},
        k = 1,
        d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\t"},
        d2 = {"Lcom/gridness/iqtest/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "rememberName", "", "IQTest.app.main"}
)
public final class MainActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        ActionBar var10000 = this.getSupportActionBar();
        if (var10000 != null) {
            var10000.hide();
        }

        final int defaultScore = 50;
        View var4 = this.findViewById(R.id.startBtn);
        Intrinsics.checkNotNullExpressionValue(var4, "findViewById(R.id.startBtn)");
        Button startBtn = (Button)var4;
        startBtn.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Intent var3 = new Intent((Context)MainActivity.this, FirstQuestion.class);
                //int var5 = false;
                var3.putExtra("username", MainActivity.this.rememberName());
                var3.putExtra("score", defaultScore);
                MainActivity.this.startActivity(var3);
            }
        }));
    }

    private String rememberName() {
        View var10000 = this.findViewById(R.id.firstName);
        Intrinsics.checkNotNullExpressionValue(var10000, "findViewById<EditText>(R.id.firstName)");
        String name = ((EditText)var10000).getText().toString();
        if (Intrinsics.areEqual(name, "")) {
            name = "Аноним";
        }

        return name;
    }
}
