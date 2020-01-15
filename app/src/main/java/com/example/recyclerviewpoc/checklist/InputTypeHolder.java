package com.example.recyclerviewpoc.checklist;

import android.view.View;
import android.widget.EditText;

import com.example.recyclerviewpoc.R;
import com.example.recyclerviewpoc.viewholder.CheckHolders;

import androidx.annotation.NonNull;

public class InputTypeHolder extends CheckHolders {

    public EditText et_text;

    public InputTypeHolder(@NonNull View itemView) {
        super(itemView);
        et_text = itemView.findViewById(R.id.et_text);
    }
}
