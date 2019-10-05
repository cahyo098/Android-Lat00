package id.ac.poliban.dts.latihan00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //konten view dihubungkan dengan koding
        //java kita
        setContentView(R.layout.activity_main);

        //menghubungkan view dengan object Button
        //dalam source code kita
        Button btFirts = findViewById(R.id.btPertama);
        Button btSecond = findViewById(R.id.btKedua);
        Button btThird = findViewById(R.id.btKetiga);
        Button btForth = findViewById(R.id.btKeempat);

        //Interface onClickListener merupakan interface yang ada dikelas View
        //hanya berisi satu method onClick(View view)

        //berikut kode memasang event listener onClick pada object Button
        btFirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hai Istri Pertama", Toast.LENGTH_SHORT).show();
            }
        });

        btSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hai Istri Kedua", Toast.LENGTH_SHORT).show();
            }
        });

        btThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hai Istri Ketiga", Toast.LENGTH_SHORT).show();
            }
        });

        btForth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hai Istri Keempat", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
