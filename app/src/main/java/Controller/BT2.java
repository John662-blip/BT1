package Controller;

import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.baitap1.MainActivity;
import com.example.baitap1.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class BT2 {
    private MainActivity main;
    private Button btn;
    private TextInputEditText text;
    public BT2(MainActivity mainActivity){
        main=mainActivity;
    }
    public void run(){
        this.main.setContentView(R.layout.activity_main_1);
        btn = (Button) main.findViewById(R.id.button);
        text = (TextInputEditText) main.findViewById(R.id.textIp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickBtn(v);
            }
        });
    }
    private void ClickBtn(View view){
        String value = this.text.getText().toString().trim();
        xuli(value);
    }
    private void xuli(String s){
        if (s == null || s.trim().isEmpty()) {
            Log.d("TAG", "Chuỗi nhập vào rỗng hoặc không hợp lệ.");
            return;
        }
        s = s.trim().replaceAll("\\s+", " ");
        String[] strArray = s.split(" ");
        int[] intArray = new int[strArray.length];
        List<Integer> soChan = new ArrayList<>();
        List<Integer> soLe = new ArrayList<>();
        for (int i = 0; i < strArray.length; i++) {
            if (Integer.parseInt(strArray[i])%2==1) soLe.add(Integer.parseInt(strArray[i]));
            else soChan.add(Integer.parseInt(strArray[i]));
        }
        String Kq_chan="";
        String Kq_le="";
        for (Integer m : soLe) Kq_le += m.toString()+" ";
        for (Integer m : soChan) Kq_chan += m.toString()+" ";
        Log.d("Tag","So le : "+Kq_le);
        Log.d("Tag","So chan : "+Kq_chan);
        try{

        }catch (Exception e){
            Log.d("TAG","Khong the xuat mang");
        }
    }
}
