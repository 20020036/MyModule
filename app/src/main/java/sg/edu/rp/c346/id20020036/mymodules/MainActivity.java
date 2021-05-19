package sg.edu.rp.c346.id20020036.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC203;
    TextView tvC206;
    TextView tvC218;
    TextView tvC235;
    TextView tvC346;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC203 = findViewById(R.id.tvC203);
        tvC206 = findViewById(R.id.tvC206);
        tvC218 = findViewById(R.id.tvC218);
        tvC235 = findViewById(R.id.tvC235);
        tvC346 = findViewById(R.id.tvC346);

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("info", "C203\nWeb AppIn Development in PHP\n2021\n1\n4\nW67M");
                startActivity(intent);
            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("info", "C206\nSoftware Development Process\n2021\n1\n4\nW67L");
                startActivity(intent);
            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("info", "C218\nUI/UX Design for Apps\n2021\n1\n4\nW64G");
                startActivity(intent);
            }
        });

        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("info", "C235\nIT Security and Management\n2021\n1\n4\nE65Q");
                startActivity(intent);
            }
        });

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("info", "C346\nMobile App Development\n2021\n1\n4\nE62E");
                startActivity(intent);
            }
        });
    }
}