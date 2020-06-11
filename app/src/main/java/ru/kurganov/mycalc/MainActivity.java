package ru.kurganov.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textTable;
    TextView textResult;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button plus;
    Button minus;
    Button multiple;
    Button div;
    Button equals;
    Button commit;
    Button clear;

    int a;
    int b;
    int res;
    String operation = "";
    boolean flagOperation = false;
    boolean flagEquals = false;
    boolean reset = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textTable = findViewById(R.id.textTable);
        textResult = findViewById(R.id.textResult);
        textResult.setMovementMethod(new ScrollingMovementMethod());
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btn0 = findViewById(R.id.btn_0);
        plus = findViewById(R.id.btn_plus);
        minus = findViewById(R.id.btn_minus);
        multiple = findViewById(R.id.btn_multiple);
        div = findViewById(R.id.btn_div);
        equals = findViewById(R.id.btn_equals);
        commit = findViewById(R.id.btn_commit);
        clear = findViewById(R.id.btn_clear);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        commit.setOnClickListener(this);
        clear.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiple.setOnClickListener(this);
        div.setOnClickListener(this);
        equals.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_1) {
            if (flagOperation) {
                textTable.setText("");
                flagOperation = false;
            }
            if (textTable.getText().equals("0") || reset || flagEquals) {
                textTable.setText("1");
                textResult.setText("");
                reset = false;
                flagEquals = false;
            } else {
                textTable.append("1");
            }
        }

        if (v.getId() == R.id.btn_2) {
            if (flagOperation) {
                textTable.setText("");
                flagOperation = false;
            }
            if (textTable.getText().equals("0") || reset || flagEquals) {
                textTable.setText("2");
                textResult.setText("");
                reset = false;
                flagEquals = false;
            } else {
                textTable.append("2");
            }
        }

        if (v.getId() == R.id.btn_3) {
            if (flagOperation) {
                textTable.setText("");
                flagOperation = false;
            }
            if (textTable.getText().equals("0") || reset || flagEquals) {
                textTable.setText("3");
                textResult.setText("");
                reset = false;
                flagEquals = false;
            } else {
                textTable.append("3");
            }
        }

        if (v.getId() == R.id.btn_4) {
            if (flagOperation) {
                textTable.setText("");
                flagOperation = false;
            }
            if (textTable.getText().equals("0") || reset || flagEquals) {
                textTable.setText("4");
                textResult.setText("");
                reset = false;
                flagEquals = false;
            } else {
                textTable.append("4");
            }
        }

        if (v.getId() == R.id.btn_5) {
            if (flagOperation) {
                textTable.setText("");
                flagOperation = false;
            }
            if (textTable.getText().equals("0") || reset || flagEquals) {
                textTable.setText("5");
                textResult.setText("");
                reset = false;
                flagEquals = false;
            } else {
                textTable.append("5");
            }
        }

        if (v.getId() == R.id.btn_6) {
            if (flagOperation) {
                textTable.setText("");
                flagOperation = false;
            }
            if (textTable.getText().equals("0") || reset || flagEquals) {
                textTable.setText("6");
                textResult.setText("");
                reset = false;
                flagEquals = false;
            } else {
                textTable.append("6");
            }
        }

        if (v.getId() == R.id.btn_7) {
            if (flagOperation) {
                textTable.setText("");
                flagOperation = false;
            }
            if (textTable.getText().equals("0") || reset || flagEquals) {
                textTable.setText("7");
                textResult.setText("");
                reset = false;
                flagEquals = false;
            } else {
                textTable.append("7");
            }
        }

        if (v.getId() == R.id.btn_8) {
            if (flagOperation) {
                textTable.setText("");
                flagOperation = false;
            }
            if (textTable.getText().equals("0") || reset || flagEquals) {
                textTable.setText("8");
                textResult.setText("");
                reset = false;
                flagEquals = false;
            } else {
                textTable.append("8");
            }
        }

        if (v.getId() == R.id.btn_9) {
            if (flagOperation) {
                textTable.setText("");
                flagOperation = false;
            }
            if (textTable.getText().equals("0") || reset || flagEquals) {
                textTable.setText("9");
                textResult.setText("");
                reset = false;
                flagEquals = false;
            } else {
                textTable.append("9");
            }
        }

        if (v.getId() == R.id.btn_0) {
            if (flagOperation) {
                textTable.setText("");
                flagOperation = false;
            }
            if (textTable.getText().equals("0") || reset || flagEquals) {
                textTable.setText("0");
                textResult.setText("");
                reset = false;
                flagEquals = false;
            } else {
                textTable.append("0");
            }
        }

        if (v.getId() == R.id.btn_commit) {
            if (!textTable.getText().equals("0")) {
                textTable.append(".");
            }
        }

        if (v.getId() == R.id.btn_clear) {
            textResult.setText("");
            reset = true;
            textTable.setText(R.string._0table);
        }

        if (v.getId() == R.id.btn_plus) {
            a = Integer.parseInt(textTable.getText().toString());
            operation = "plus";
            flagOperation = true;
            flagEquals = false;
            textResult.append(a + " + ");
        }

        if (v.getId() == R.id.btn_minus) {
            a = Integer.parseInt(textTable.getText().toString());
            operation = "minus";
            flagOperation = true;
            flagEquals = false;
            textResult.append(a + " - ");
        }

        if (v.getId() == R.id.btn_div) {
            a = Integer.parseInt(textTable.getText().toString());
            operation = "div";
            flagOperation = true;
            flagEquals = false;
            textResult.append(a + " / ");
        }

        if (v.getId() == R.id.btn_multiple) {
            a = Integer.parseInt(textTable.getText().toString());
            operation = "multiple";
            flagOperation = true;
            flagEquals = false;
            textResult.append(a + " * ");
        }

        if (v.getId() == R.id.btn_equals) {
            b = Integer.parseInt(textTable.getText().toString());
            flagEquals = true;

            if (operation.equals("plus")) {
                res = a + b;
                textResult.append(b + " = ");
                textTable.setText("" + res);
            }

            if (operation.equals("minus")) {
                res = a - b;
                textResult.append(b + " = ");
                textTable.setText("" + res);
            }

            if (operation.equals("div")) {
                res = a / b;
                textResult.append(b + " = ");
                textTable.setText("" + res);
            }

            if (operation.equals("multiple")) {
                res = a * b;
                textResult.append(b + " = ");
                textTable.setText("" + res);
            }
        }
    }
}