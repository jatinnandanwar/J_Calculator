package com.example.j_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout r1;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btndot,btnadd,btnsub,btnmulti,btndiv,btneql;
    Button btnclear;
    EditText ed1;
    Float res1,res2;
    boolean Add,Sub,Multi,Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = findViewById(R.id.relativelayout);

        btn1 = (Button) findViewById(R.id.button13);
        btn2 = (Button) findViewById(R.id.button14);
        btn3 = (Button) findViewById(R.id.button15);
        btn4 = (Button) findViewById(R.id.button9);
        btn5 = (Button) findViewById(R.id.button10);
        btn6 = (Button) findViewById(R.id.button11);
        btn7 = (Button) findViewById(R.id.button5);
        btn8 = (Button) findViewById(R.id.button6);
        btn9 = (Button) findViewById(R.id.button7);
        btn0 = (Button) findViewById(R.id.button2);
        btndot = (Button) findViewById(R.id.button1);
        btnadd = (Button) findViewById(R.id.button16);
        btnsub = (Button) findViewById(R.id.button12);
        btnmulti = (Button) findViewById(R.id.button8);
        btndiv = (Button) findViewById(R.id.button4);
        btneql = (Button) findViewById(R.id.button3);
        btnclear = (Button) findViewById(R.id.btnclear);
        ed1 = (EditText) findViewById(R.id.et1);


    }

    public void btn1(View view) {
        ed1.setText(ed1.getText()+"1");
    }

    public void btn2(View view) {
        ed1.setText(ed1.getText()+"2");
    }

    public void btn3(View view) {
        ed1.setText(ed1.getText()+"3");
    }

    public void btn4(View view) {
        ed1.setText(ed1.getText()+"4");
    }

    public void btn5(View view) {
        ed1.setText(ed1.getText()+"5");
    }

    public void btn6(View view) {
        ed1.setText(ed1.getText()+"6");
    }

    public void btn7(View view) {
        ed1.setText(ed1.getText()+"7");
    }

    public void btn8(View view) {
        ed1.setText(ed1.getText()+"8");
    }

    public void btn9(View view) {
        ed1.setText(ed1.getText()+"9");
    }

    public void btn0(View view) {
        ed1.setText(ed1.getText()+"0");
    }

    public void btndot(View view) {
        ed1.setText(ed1.getText()+".");
    }

    public void btnclear(View view) {
        ed1.setText("");
    }

    public void btneql(View view) {
        res2=Float.parseFloat(ed1.getText()+"");
        if (Add==true) {
            ed1.setText(res1 + res2 + "");
            Add = false;
        }
        if (Sub==true) {
            ed1.setText(res1 - res2 + "");
            Sub = false;
        }
        if (Multi==true) {
            ed1.setText(res1 * res2 + "");
            Multi = false;
        }
        if (Div==true) {
            ed1.setText(res1 / res2 + "");
            Div = false;
        }
    }

    public void btnadd(View view) {
        if (ed1 == null)
            ed1.setText("");
        else {
            res1 = Float.parseFloat(ed1.getText()+"");
            Add=true;
            ed1.setText(null);
        }
    }

    public void btnsub(View view) {
        if (ed1 == null)
            ed1.setText("");
        else {
            res1 = Float.parseFloat(ed1.getText()+"");
            Sub=true;
            ed1.setText(null);
    }


}

    public void btnmulti(View view) {
        if (ed1 == null)
            ed1.setText("");
        else {
            res1 = Float.parseFloat(ed1.getText()+"");
            Multi=true;
            ed1.setText(null);
    }
    }

    public void btndiv(View view) {
        if (ed1 == null)
            ed1.setText("");
        else {
            res1 = Float.parseFloat(ed1.getText()+"");
            Div=true;
            ed1.setText(null);
    }
    }}

