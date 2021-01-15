package com.yui.tool.analysis.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author XuZhuohao
 * @date 2021/1/15
 */
public class ImgUrlUtil {
    private static Pattern imgPattern = Pattern.compile("<img src=\"(https:[^\"]*)\"");

    private List<String> findFromImg(String content){
        List<String> imgUrl = new ArrayList<>(16);
        final Matcher matcher = imgPattern.matcher(content);
        while (matcher.find()) {
            imgUrl.add(matcher.group(1));
        }
        return imgUrl;
    }
}
