package app.aritmatika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtAlas, edtTinggi;
    Button btnHitung;
    TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAlas     = (EditText) findViewById(R.id.edtAlas);
        edtTinggi   = (EditText) findViewById(R.id.edtTinggi);
        btnHitung   = (Button) findViewById(R.id.btnHitung);
        txthasil    = (TextView) findViewById(R.id.txthasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( edtAlas.getText().toString().equals("") || edtTinggi.getText().toString().equals("") ){
                    Toast.makeText(getApplicationContext(), "Isi data dengan benar",
                            Toast.LENGTH_SHORT).show();
                } else {
                    rumusJajargenjang();
                }
            }
        });
    }

    private void rumusJajargenjang(){
        int alas    = Integer.parseInt( edtAlas.getText().toString() );
        int tingggi = Integer.parseInt( edtTinggi.getText().toString() );
        int hasil   = alas * tingggi;
        txthasil.setText( String.valueOf( hasil ) );
    }
}
