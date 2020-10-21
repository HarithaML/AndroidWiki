package com.example.assign3lhm;

import java.util.Arrays;

public enum AndroidVersions {
    Alpha("https://en.wikipedia.org/wiki/Android_version_history#Android_1.0_(API_1)",
          "API 1",
          R.drawable.alpha),
    PetitFour("https://en.wikipedia.org/wiki/Android_version_history#Android_1.1_(API_2)",
              "API 2",
              R.drawable.petit),
    Cupcake("https://en.wikipedia.org/wiki/Android_Cupcake", "API 3", R.drawable.cupcake),
    Donut("https://en.wikipedia.org/wiki/Android_Donut", "API 4", R.drawable.donut),
    Eclair("https://en.wikipedia.org/wiki/Android_Eclair", "API 5 – 7", R.drawable.eclair),
    Froyo("https://en.wikipedia.org/wiki/Android_Froyo", "API 8", R.drawable.froyo),
    GingerBread("https://en.wikipedia.org/wiki/Android_Gingerbread",
                "API 9 – 10",
                R.drawable.gingerbread),
    HoneyComb("https://en.wikipedia.org/wiki/Android_Honeycomb",
              "API 11 - 13",
              R.drawable.honeycomb),
    IceCreamSandwich("https://en.wikipedia.org/wiki/Android_Ice_Cream_Sandwich",
                     "API 14 - 15",
                     R.drawable.icecream),
    JellyBean("https://en.wikipedia.org/wiki/Android_Jelly_Bean",
              "API 16 - 18",
              R.drawable.jellybean),
    KitKat("https://en.wikipedia.org/wiki/Android_KitKat", "API 19 - 20", R.drawable.kitkat),
    Lollipop("https://en.wikipedia.org/wiki/Android_Lollipop", "API 21 - 22", R.drawable.lollipop),
    Marshmallow("https://en.wikipedia.org/wiki/Android_Marshmallow",
                "API 23",
                R.drawable.marshmallow),
    Nougat("https://en.wikipedia.org/wiki/Android_Nougat", "API 24 - 25", R.drawable.nougat),
    Oreo("https://en.wikipedia.org/wiki/Android_Oreo", "API 26 - 28", R.drawable.oreo),
    Pie("https://en.wikipedia.org/wiki/Android_Pie", "API 29", R.drawable.pie),
    Android10("https://en.wikipedia.org/wiki/Android_10", "API 30", R.drawable.android);

    private final String url;
    private final String description;
    private final int image;

    AndroidVersions(String url, String description, int image) {
        this.url = url;
        this.description = description;
        this.image = image;
    }

    public static String[] names() {
        return Arrays.stream(AndroidVersions.values())
                .map(AndroidVersions::name)
                .toArray(String[]::new);
    }

    public static String[] urls() {
        return Arrays.stream(AndroidVersions.values())
                .map(AndroidVersions::getUrl)
                .toArray(String[]::new);
    }

    public static String[] descriptions() {
        return Arrays.stream(AndroidVersions.values())
                .map(AndroidVersions::getDescription)
                .toArray(String[]::new);
    }

    public static int[] images() {
        return Arrays.stream(AndroidVersions.values())
                .mapToInt(AndroidVersions::getImage)
                .toArray();
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }


}


