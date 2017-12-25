package com.lws.fragment.demo.test;

import com.lws.fragment.demo.db.CategoryMetaData;
import com.lws.fragment.demo.db.MaterialMetaData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lws on 2017/12/25.
 * <p>
 * 生成测试数据
 */

public final class DBTestData {

    public static class Category {
        private static String[] names = {"已下载", "变妆", "动物", "氛围", "变脸"};

        private static CategoryMetaData getMetaData(int id, String name) {
            return new CategoryMetaData(id, name);
        }

        public static List<CategoryMetaData> genTestData() {
            ArrayList<CategoryMetaData> list = new ArrayList<>();
            for (int i = 0; i < names.length; i++) {
                list.add(getMetaData(i, names[i]));
            }
            return list;
        }
    }

    public static class Material {
        private static int[] count = {0, 20, 15, 15, 15};

        private static MaterialMetaData getMetaData(int cid, String name, int downloaded) {
            return new MaterialMetaData(cid, name, downloaded);
        }

        public static List<MaterialMetaData> genTestData() {
            ArrayList<MaterialMetaData> list = new ArrayList<>();
            for (int i = 0; i < count.length; i++) {
                for (int j = 0; j < count[i]; j++) {
                    String name = i + "-" + j;
                    int downloaded = 0;
                    list.add(getMetaData(i, name, downloaded));
                }
            }
            return list;
        }
    }
}
