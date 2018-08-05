package com.edgarchipeta.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Deque;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    static int i = 0;
    static double d = 0;
    static String c = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView ResultTextView = (TextView) findViewById(R.id.ResultsTextView);
        final TextView InputTextView = (TextView) findViewById(R.id.InputTextView);



        Button addBtn = (Button) findViewById(R.id.addBtn);
        Button subBtn = (Button) findViewById(R.id.subBtn);
        Button mulBtn = (Button) findViewById(R.id.mulBtn);
        Button divBtn = (Button) findViewById(R.id.divBtn);
        Button clrBtn = (Button) findViewById(R.id.clrBtn);
        Button decBtn = (Button) findViewById((R.id.decBtn));
        Button equalBtn = (Button) findViewById((R.id.equalBtn));

        Button zeroBtn = (Button) findViewById((R.id.zeroBtn));
        Button oneBtn = (Button) findViewById((R.id.oneBtn));
        Button twoBtn = (Button) findViewById((R.id.twoBtn));
        Button threeBtn = (Button) findViewById((R.id.threeBtn));
        Button fourBtn = (Button) findViewById((R.id.fourBtn));
        Button fiveBtn = (Button) findViewById((R.id.fiveBtn));
        Button sixBtn = (Button) findViewById((R.id.sixBtn));
        Button sevenBtn = (Button) findViewById((R.id.sevenBtn));
        Button eightBtn = (Button) findViewById((R.id.eightBtn));
        Button nineBtn = (Button) findViewById((R.id.nineBtn));


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( InputTextView.getText() == "")
                    InputTextView.setText("+");
                else
                    InputTextView.append("+");
            }
        });
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( InputTextView.getText() == "")
                    InputTextView.setText("-");
                else
                    InputTextView.append("-");
            }
        });
        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( InputTextView.getText() == "")
                    InputTextView.setText("*");
                else
                    InputTextView.append("*");
            }
        });
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( InputTextView.getText() == "")
                    InputTextView.setText("/");
                else
                    InputTextView.append("/");
            }
        });
        clrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputTextView.setText("");
                ResultTextView.setText("");
            }
        });
        decBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( InputTextView.getText() == "")
                    InputTextView.setText("+");
                else
                    InputTextView.append(".");
            }
        });
        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = InputTextView.getText().toString();
                Deque<String> q = new LinkedList<>();

                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    String string = Character.toString(ch);
                    q.add(string);
                }
                ParserToken p = new ParserToken();
                ParseTree tree = p.Prog(q);
                if (tree != null) {
                    NodeTraverse(tree);

                    if( PrintStatement.ddone == 0.0) {
                        ResultTextView.setText(String.valueOf(PrintStatement.imdone));
                        PrintStatement.ddone = 0.0;
                        PrintStatement.imdone = 0;
                    }
                    else if( PrintStatement.imdone == 0) {
                        ResultTextView.setText(String.valueOf(PrintStatement.ddone));
                        PrintStatement.imdone = 0;
                        PrintStatement.ddone = 0.0;
                    }
                }
                else if(s.equals(""))
                    ;
                else{
                    ResultTextView.setText("ERROR");
                }

            }
        });

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( InputTextView.getText() == "")
                    InputTextView.setText("0");
                else
                    InputTextView.append("0");
            }
        });
        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( InputTextView.getText() == "")
                    InputTextView.setText("1");
                else
                    InputTextView.append("1");
            }
        });
        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( InputTextView.getText() == "")
                    InputTextView.setText("2");
                else
                    InputTextView.append("2");
            }
        });
        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( InputTextView.getText() == "")
                    InputTextView.setText("3");
                else
                    InputTextView.append("3");
            }
        });
        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( InputTextView.getText() == "")
                    InputTextView.setText("4");
                else
                    InputTextView.append("4");
            }
        });
        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( InputTextView.getText() == "")
                    InputTextView.setText("5");
                else
                    InputTextView.append("5");
            }
        });
        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( InputTextView.getText() == "")
                    InputTextView.setText("6");
                else
                    InputTextView.append("6");
            }
        });
        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( InputTextView.getText() == "")
                    InputTextView.setText("7");
                else
                    InputTextView.append("7");
            }
        });
        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( InputTextView.getText() == "")
                    InputTextView.setText("8");
                else
                    InputTextView.append("8");
            }
        });
        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( InputTextView.getText() == "")
                    InputTextView.setText("9");
                else
                    InputTextView.append("9");
            }
        });

    }

    static void NodeTraverse(ParseTree t)
    {
        if( t.getLeft() != null )
            NodeTraverse(t.getLeft());
        if( t.getRight() != null )
            NodeTraverse(t.getRight());
        t.eval();
    }
}
