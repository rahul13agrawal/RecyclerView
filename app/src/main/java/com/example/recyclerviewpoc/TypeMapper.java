package com.example.recyclerviewpoc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerviewpoc.checklist.ImageTypeHolder;
import com.example.recyclerviewpoc.checklist.InputTypeHolder;
import com.example.recyclerviewpoc.checklist.ViewTypeHolder;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public final class TypeMapper {

    private TypeMapper() {
    }

    public static RecyclerView.ViewHolder getViewHolderForType(@NonNull ViewGroup viewGroup, int type) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(getLayoutId(type), viewGroup, false);
        return getViewHolderForType(view, type);
    }

    private static RecyclerView.ViewHolder getViewHolderForType(View view, int type) {

        switch (type) {
            case 1:
                return new InputTypeHolder(view);
            case 2:
                return new ViewTypeHolder(view);
            case 3:
                return new ImageTypeHolder(view);

        }

        throw new RuntimeException("Unknown checklist item type " + type);
    }

    @LayoutRes
    private static int getLayoutId(int type) {

        int layoutRes = -1;

        switch (type) {
            case 1:
                layoutRes = R.layout.row_input_type;
                break;
            case 2:
                layoutRes = R.layout.row_view_type;
                break;
            case 3:
                layoutRes = R.layout.row_image_type;
        }

        if (layoutRes == -1) {
            throw new RuntimeException("Unknown checklist item type " + type);
        }

        return layoutRes;
    }

    public enum Type {

        INPUT(1),
        VIEW(2),
        IMAGE(3);

        private int type;

        Type(int type) {
            this.type = type;
        }

        public int getType() {
            return type;
        }
    }

}
