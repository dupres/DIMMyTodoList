package stephen.dupre.dimmytodolist;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnValider;
    private EditText input;
    private TextView messages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnValider = (Button) findViewById(R.id.btnValiderID);
            btnValider.setOnClickListener(this);
        input = (EditText) findViewById(R.id.inputID);
        messages = (TextView) findViewById(R.id.TextViewID);

    }

    @Override
    public void onClick(View v){
        if (messages.getText() != "") {
            messages.append("\n" + input.getText());
            input.setText("");
            Toast.makeText(getApplicationContext(), "Sent !", Toast.LENGTH_SHORT).show();
        }
    }





}
