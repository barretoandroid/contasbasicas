package br.com.example.contasbsicas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import android.text.InputType;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Declaração dos atributos
    EditText editTextNum1;
    EditText editTextNum2;
    TextView textViewResultado;

    //Sobreescrevendo o método onCreate da classe pai AppCompatActivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNum1 = findViewById(R.id.etNum1);
        editTextNum2 = findViewById(R.id.etNum2);
        textViewResultado = findViewById(R.id.tvResultado);
    }

    public void soma(View v){

        String stringNum1 = editTextNum1.getText().toString().replace(",",".");
        String stringNum2 = editTextNum2.getText().toString().replace(",",".");
        if (!stringNum1.isEmpty() && !stringNum2.isEmpty()){
            Double numero1 = Double.parseDouble(stringNum1);
            Double numero2 = Double.parseDouble(stringNum2);
            Double resultado = numero1 + numero2;
            textViewResultado.setText(resultado.toString().replace(".", ","));
        }else{
            textViewResultado.setText("");
        }
        editTextNum1.onEditorAction(EditorInfo.IME_ACTION_DONE);
        editTextNum2.onEditorAction(EditorInfo.IME_ACTION_DONE);

    }

}
