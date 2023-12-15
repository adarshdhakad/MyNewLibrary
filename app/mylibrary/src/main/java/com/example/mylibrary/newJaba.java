package com.example.mylibrary;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class newJaba {
}


class Solutionj {
    public String destCity(List<List<String>> paths) {

        Set<String> set = new HashSet<String>();
        int n = paths.size();

        for (int i = 0; i < n; i++) {
            set.add(paths.get(i).get(0));
        }

        for (int i = 0; i < n; i++) {
            if (!set.contains(paths.get(i).get(1))) {
                return paths.get(i).get(1);
            }
        }
        return "";
    }
}