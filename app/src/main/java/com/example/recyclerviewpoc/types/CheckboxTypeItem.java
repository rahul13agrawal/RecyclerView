package com.example.recyclerviewpoc.types;

import com.example.recyclerviewpoc.TypeMapper;
import com.example.recyclerviewpoc.visit.CheckBoxTypeHolder;
import com.example.recyclerviewpoc.visit.VisitListable;

public class CheckboxTypeItem extends VisitListable<CheckBoxTypeHolder> {

    @Override
    public void showIcon(boolean show) {

    }

    @Override
    public void onBind(CheckBoxTypeHolder viewHolder) {

    }

    @Override
    public TypeMapper.Type getType() {
        return TypeMapper.Type.INPUT;
    }
}
