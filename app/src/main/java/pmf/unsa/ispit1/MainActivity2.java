package pmf.unsa.ispit1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    public static final int SECOND_ACTIVITY = 2;
    private EditText firstName, lastName, num;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setTitle("FORM");
        ubaciPolja();
        }

    private void ubaciPolja() {
        firstName = findViewById(R.id.editTextText2_a);
        lastName  = findViewById(R.id.editTextText2_b);
        num = findViewById(R.id.editTextNumber2_c);
        btn2 = findViewById(R.id.btn2);
    }

    public void onNextButtonClick(View view) {
        Intent intent = new Intent(this, MainActivity3.class);

        String ime = firstName.getText().toString() ;
        String prezime = lastName.getText().toString() ;
        String broj = num.getText().toString();

        intent.putExtra("ime", ime);
        intent.putExtra("prezime", prezime);
        intent.putExtra("broj", broj);
        Log.d("myTag", ime);

        if (ime.isEmpty() || prezime.isEmpty() || broj.isEmpty() ||
                (Integer.parseInt(broj) < -300 || Integer.parseInt(broj) > 300 || Integer.parseInt(broj) == 0) ){
                Toast.makeText(getApplicationContext(), "Wrong entry", Toast.LENGTH_SHORT).show();
        }

        else {
            Toast.makeText(getApplicationContext(), "Successfully", Toast.LENGTH_SHORT).show();
            startActivityForResult(intent, SECOND_ACTIVITY);
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == SECOND_ACTIVITY) {
            if (resultCode == Activity.RESULT_OK) {
                String result1 = data.getStringExtra("result1");
                firstName.setText("Player: " + result1);
                firstName.setInputType(InputType.TYPE_NULL);

                String result2 = data.getStringExtra("result2");
                lastName.setText("Clicks: " + result2);
                lastName.setInputType(InputType.TYPE_NULL);

                setTitle("FINISH");
                btn2.setVisibility(View.INVISIBLE);
                num.setVisibility(View.INVISIBLE);

            }
            if (resultCode == Activity.RESULT_CANCELED) {

            }
        }
    }

}


