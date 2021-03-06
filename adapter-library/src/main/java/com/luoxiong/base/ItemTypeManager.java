package com.luoxiong.base;

import android.util.SparseArray;


/**
 * Created by zhy on 16/6/22.
 * ItemViewHolder管理
 * 每个适配器的管理ItemView
 */
public class ItemTypeManager<T> {

    /**
     * 存放Holder类型
     */
    private SparseArray<Object> typeSArr = new SparseArray<>();

    /**
     * type: text、button、ImageView
     */
    public int getItemViewType(Object type) {
        int index = typeSArr.indexOfValue(type);
        if (index == -1) {
            index = typeSArr.size();
            // 如果没用这个type，就存入这个type
            typeSArr.put(index, type);
        }
        return index;
    }
}
