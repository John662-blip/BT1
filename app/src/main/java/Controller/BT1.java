package Controller;

import android.app.Activity;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.baitap1.MainActivity;
import com.example.baitap1.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BT1 {
    private MainActivity main;
    public BT1(MainActivity mainActivity){
        main=mainActivity;
    }
    public void run(){
        this.main.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.main.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.main.setContentView(R.layout.activity_main);
    }
}