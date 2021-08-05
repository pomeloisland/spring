package com.pomeloisland.util;

import com.pomeloisland.pojo.Content;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class HtmlParseUtil {
    public static void main(String[] args){
        try {
            new HtmlParseUtil().parseJD("java").forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Content> parseJD(String keywords) throws IOException {
        //获取请求 https://search.jd.com/Search?keyword=java
        //前提，需要联网，ajax 不能获取到
        String url = "https://search.jd.com/Search?keyword="+keywords;
        //解析网页(Jsoup返回的Document就是浏览器Document对象)
        Document parse = Jsoup.parse(new URL(url), 30000);
        //所有在js中可以使用的方法，都可以使用
        Element element = parse.getElementById("J_goodsList");
        //找到所有的li元素
        Elements li = element.getElementsByTag("li");

        ArrayList<Content> goodsList = new ArrayList<>();
        //获取元素中的内容,el就是每一个li标签了！
        for (Element el : li) {
            //关于图片特别多的网站，所有的图片都是延迟加载的！
            String img = el.getElementsByTag("img").eq(0).attr("source-data-lazy-img");
            String price = el.getElementsByClass("p-price").eq(0).text();
            String title = el.getElementsByClass("p-name").eq(0).text();
            Content content = new Content();
            content.setTitle(title);
            content.setImg(img);
            content.setPrice(price);
            goodsList.add(content);
        }
        return goodsList;
    }
}
