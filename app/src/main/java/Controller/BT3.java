package Controller;

import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.baitap1.MainActivity;
import com.example.baitap1.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class BT3 {
    private MainActivity main;
    private Button btn;
    private EditText text;
    private TextView textV;
    public BT3(MainActivity mainActivity){
        main=mainActivity;
    }
    public void run(){
        this.main.setContentView(R.layout.activity_main_2);
        btn = (Button) main.findViewById(R.id.button2);
        text = (EditText) main.findViewById(R.id.editTextText);
        textV = (TextView) main.findViewById(R.id.textView2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickBtn(v);
            }
        });
    }
    private void ClickBtn(View view){
        String value = this.text.getText().toString().trim();
        String kq = "";
        textV.setText(value);
        for (int i = value.length()-1;i>=0;i--){
            kq+= value.charAt(i);
        }
        Toast.makeText(main,"Chuổi đảo ngược : "+kq,Toast.LENGTH_LONG).show();
    }
}
