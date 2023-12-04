package com.rafsan.class234nestedforlooppart2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editInitialValue,editInitialNumber,editTargetedNumber;
    Button button,check_Prime_or_Not;
    TextView textView,textPrime,textNonPrime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editInitialValue = findViewById(R.id.editInitialValue);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);


        editInitialNumber = findViewById(R.id.editInitialNumber);
        editTargetedNumber = findViewById(R.id.editTargetedNumber);
        check_Prime_or_Not = findViewById(R.id.check_Prime_or_Not);
        textPrime = findViewById(R.id.textPrime);
        textNonPrime = findViewById(R.id.textNonPrime);



    //==================== Prime Number part ((one))=====================
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String myString = editInitialValue.getText().toString();

                if (myString.length() > 0) {

                    int numberString = Integer.parseInt(myString);

                    for ( int x=2; x < numberString; x++ ){

                        if( numberString % x == 0 ){

                            textView.setText( numberString+" is NOT a Prime Number");

                            break;

                        }
                        else{
                            textView.setText(numberString+" is a Prime Number");
                        }

                    }

                }

            }
        });


        //==================== Prime Number part ((TWO))=====================

        check_Prime_or_Not.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sInitialNum = editInitialNumber.getText().toString();
                String sTargetedNum = editTargetedNumber.getText().toString();

                if ( sInitialNum.length() > 0 && sTargetedNum.length() > 0 ){

                    int initialNum = Integer.parseInt(sInitialNum);
                    int targetedNum = Integer.parseInt(sTargetedNum);


                    textPrime.setText("prime :");
                    textNonPrime.setText("non_prime :");
                    int x,y;
                    for ( x = initialNum; x <= targetedNum; x++){

//                        textNonPrime.append(" "+x);

                        for (y = 2; y < x; y++){

                            if (x % y == 0){
                                textNonPrime.append(" "+x);
                                break;
                            }
//                            else {
//                                textPrime.append(" "+x);
//                            }

                        }
                        if (x == y) {
                            textPrime.append(" "+x);
                        }


                    }


                }

                else{
                    textPrime.setText("Please,enter above fields");
                    textNonPrime.setText("Please,enter above fields");
                }

            }
        });

    }
}