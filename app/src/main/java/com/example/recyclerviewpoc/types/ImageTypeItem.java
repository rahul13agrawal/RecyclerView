package com.example.recyclerviewpoc.types;

import com.example.recyclerviewpoc.TypeMapper;
import com.example.recyclerviewpoc.checklist.CheckListListable;
import com.example.recyclerviewpoc.checklist.ImageTypeHolder;

public class ImageTypeItem extends CheckListListable<ImageTypeHolder> {

    @Override
    public void showMandatoryText(boolean show) {

    }

    @Override
    public void onBind(ImageTypeHolder viewHolder) {

    }

    @Override
    public TypeMapper.Type getType() {
        return TypeMapper.Type.IMAGE;
    }
}
