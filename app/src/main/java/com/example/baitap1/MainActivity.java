package com.example.baitap1;

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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.BT1;
import Controller.BT2;
import Controller.BT3;

public class MainActivity extends AppCompatActivity {
    private BT1 layout1 = new BT1(this);
    private BT2 layout2 = new BT2(this);
    private BT3 layout3 = new BT3(this);
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        layout3.run();
    }
}