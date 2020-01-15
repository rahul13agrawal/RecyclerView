package com.example.recyclerviewpoc.types;

import com.example.recyclerviewpoc.TypeMapper;
import com.example.recyclerviewpoc.checklist.CheckListListable;
import com.example.recyclerviewpoc.checklist.InputTypeHolder;

public class InputTypeItem extends CheckListListable<InputTypeHolder> {

    private String abcd;

    public InputTypeItem(String abcd) {
        this.abcd = abcd;
    }

    @Override
    public void onBind(InputTypeHolder viewHolder) {

        viewHolder.et_text.setText(abcd);

    }

    @Override
    public void showMandatoryText(boolean show) {

    }

    @Override
    public TypeMapper.Type getType() {
        return TypeMapper.Type.INPUT;
    }
}
