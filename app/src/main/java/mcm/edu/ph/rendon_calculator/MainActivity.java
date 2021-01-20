package mcm.edu.ph.rendon_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd,btnSub,btnDiv,btnMul,btnEqu,btnCle,btnSym,btnDec;
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);
        btnEqu = findViewById(R.id.btnEqu);
        btnCle = findViewById(R.id.btnCle);
        btnSym = findViewById(R.id.btnSym);
        btnDec = findViewById(R.id.btnDec);


    }
}