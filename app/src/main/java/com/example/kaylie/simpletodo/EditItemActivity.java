package com.example.kaylie.simpletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    private final int RESULT_CODE = 20;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        EditText editor = (EditText)findViewById(R.id.editText);
        String origText = getIntent().getStringExtra("itemText");
        position = getIntent().getIntExtra("pos",0);
        if(origText != null) {
            editor.setText(origText);
        }
        editor.setSelection(editor.getText().length());


    }

    public void onClickSave(View view){
        Intent intentReturn = new Intent();
        EditText editor = (EditText)findViewById(R.id.editText);
        String text = editor.getText().toString();
        intentReturn.putExtra("newTask", text);
        intentReturn.putExtra("pos", position);

        setResult(20, intentReturn);
        finish();





    }
}
