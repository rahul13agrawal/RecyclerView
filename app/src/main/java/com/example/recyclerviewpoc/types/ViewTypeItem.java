package com.example.recyclerviewpoc.types;

import com.example.recyclerviewpoc.TypeMapper;
import com.example.recyclerviewpoc.checklist.CheckListListable;
import com.example.recyclerviewpoc.checklist.ViewTypeHolder;

public class ViewTypeItem extends CheckListListable<ViewTypeHolder> {

    @Override
    public void showMandatoryText(boolean show) {

    }

    @Override
    public void onBind(ViewTypeHolder viewHolder) {

    }

    @Override
    public TypeMapper.Type getType() {
        return TypeMapper.Type.VIEW;
    }
}
