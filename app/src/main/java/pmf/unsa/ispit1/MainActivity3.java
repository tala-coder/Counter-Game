package pmf.unsa.ispit1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity3 extends AppCompatActivity {
    private TextView ta, tb, tc, td;
    private Button btna, btnb, btnc, btnd;
    private int suma = 0; private int brojac = 0;
    private int brojInt;
    String ime_i_prezime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle(" Counter");

        povezi_sa_layout();

        uzmiVrijednostiIPostavi();

    }

    private void uzmiVrijednostiIPostavi() {
        Intent intent = getIntent();
        String ime = intent.getStringExtra("ime") ;
        String prezime = intent.getStringExtra("prezime");
        String brojString = intent.getStringExtra("broj");
        ime_i_prezime = ime + " " + prezime;
        brojInt = Integer.parseInt(brojString);

        ta.setText("Player: " + ime + " " + prezime);
        tb.setText("Target Points: " + brojString);
        tc.setText("Current Point: 0");
        td.setText("0");
    }

    private void povezi_sa_layout() {
        ta = findViewById(R.id.textView3_a);
        tb = findViewById(R.id.textView3_b);
        tc = findViewById(R.id.textView3_c);
        td = findViewById(R.id.textView3_d);

        btna = findViewById(R.id.btn3_a);
        btnb = findViewById(R.id.btn3_b);
        btnc = findViewById(R.id.btn3_c);
        btnd = findViewById(R.id.btn3_d);
    }

    public void minus(View view) {
        final int min = -20;
        final int max = -1;
        final int random = new Random().nextInt((max - min) + 1) + min;

        suma += random;
        tc.setText(("Current Point: " + String.valueOf(suma) +
                "                     (" + String.valueOf(++brojac) + ")"));
        td.setText( String.valueOf(random) );

        daLiJeKraj();

    }

    public void plus(View view) {
        final int min = 1;
        final int max = 20;
        final int random = new Random().nextInt((max - min) + 1) + min;

        //suma += 10;
        suma += random;

        tc.setText(("Current Point: " + String.valueOf(suma) +
                "                     (" + String.valueOf(++brojac) + ")"));
        td.setText( String.valueOf(random) );

        daLiJeKraj();
    }


    public void odustani(View view) {
        Intent returnIntent = new Intent(this, MainActivity.class);
        startActivity(returnIntent);
    }

    private void daLiJeKraj() {
        if (brojInt == suma) {
            btnc.setText("FINISH");
            btna.getBackground().setAlpha(64);
            btna.setClickable(false);
            btnb.getBackground().setAlpha(64);
            btnb.setClickable(false);

            btnc.setVisibility(View.INVISIBLE);
            btnd.setVisibility(View.VISIBLE);
        }
    }


    public void dugmeFinish(View view) {
        Toast.makeText(getApplicationContext(), "You won!", Toast.LENGTH_SHORT).show();
            Intent returnIntent = new Intent(this, MainActivity2.class);
            String result1 = ime_i_prezime;
            String result2 = String.valueOf(brojac);
            returnIntent.putExtra("result1", result1);
            returnIntent.putExtra("result2", result2);

            setResult(Activity.RESULT_OK, returnIntent);
            finish();
    }
}
