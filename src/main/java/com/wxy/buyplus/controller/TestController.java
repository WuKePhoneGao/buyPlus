package com.wxy.buyplus.controller;

import com.alibaba.fastjson.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class TestController {
    /**
     * 1.查询最近20条数据并倒序遍历
     * 2.倒序遍历时，通过商品标题+时间查询数据库，判断是否已有该条数据
     * 2.1 已存在则跳过
     * 2.2 无该数据则将商品详细详细保存在数据库，并推送商品信息至微信端
     */
    public static void main(String[] args) throws IOException {
        System.out.println("23333");
        String url = "https://search.smzdm.com/?c=faxian&s=%E7%89%9B%E5%A5%B6&order=time";
        //获取请求链接
        Connection con = Jsoup.connect(url);
        con.header("Cookie", "__ckguid=Xe93lb5OSrAAPQ22tPb86HG6; device_id=213070643315713613555737866d89924f085fd1229fdc8df63ad6b947; homepage_sug=d; r_sort_type=score; _ga=GA1.2.247609647.1571361358; __gads=ID=e8de97667d4dd990:T=1571361357:S=ALNI_MZ7poKMGcRzMv-Uhz5Tl_1kTFtdeg; __jsluid_s=dc2642f253c04fe5ba76082d28c5425a; shequ_pc_sug=a; smzdm_user_source=41F8B2B418771B5A09D4BD836ACD17D8; wt3_eid=%3B999768690672041%7C2157162345200600413%232158312808600869910; PHPSESSID=bafe8feabf9031d0f41528e845fa688e; _gid=GA1.2.1191960114.1586242369; __jsluid_h=67a36bfa6bb1a4f0fefe69b3484126f1; ss_ab=ss47; _zdmA.uid=ZDMA._9bEfZnHE.1586309892.2419200; Hm_lvt_9b7ac3d38f30fe89ff0b8a0546904e58=1584331032,1586242369,1586247627,1586309892; zdm_qd=%7B%22referrer%22%3A%22https%3A%2F%2Fwww.baidu.com%2Flink%3Furl%3Dze2CN0cy_kQncY2Gp52BWE6X6pO4NBfifvwErrQEyPq%26ck%3D3294.2.78.245.188.338.180.150%26shh%3Dwww.baidu.com%26sht%3Dbaiduhome_pg%26wd%3D%26eqid%3Dc853ff820058f4f2000000045e8d2afd%22%7D; Hm_lpvt_9b7ac3d38f30fe89ff0b8a0546904e58=1586310304; _gat_UA-27058866-1=1; s_his=%E5%90%B4%E8%A3%95%E6%B3%B0%2C%E7%89%9B%E5%A5%B6");
//        con.header("Cookie", "__ckguid=Xe93lb5OSrAAPQ22tPb86HG6; device_id=213070643315713613555737866d89924f085fd1229fdc8df63ad6b947; homepage_sug=d; r_sort_type=score; _ga=GA1.2.247609647.1571361358; __gads=ID=e8de97667d4dd990:T=1571361357:S=ALNI_MZ7poKMGcRzMv-Uhz5Tl_1kTFtdeg; __jsluid_s=dc2642f253c04fe5ba76082d28c5425a; shequ_pc_sug=a; smzdm_user_source=41F8B2B418771B5A09D4BD836ACD17D8; wt3_eid=%3B999768690672041%7C2157162345200600413%232158312808600869910; PHPSESSID=bafe8feabf9031d0f41528e845fa688e; _gid=GA1.2.1191960114.1586242369; Hm_lvt_9b7ac3d38f30fe89ff0b8a0546904e58=1584331032,1586242369,1586247627; zdm_qd=%7B%22referrer%22%3A%22https%3A%2F%2Fwww.baidu.com%2Flink%3Furl%3D15pZ9JqVjLV5rn6-amYfutrQIACd7vXjUTyaFPM2M0u%26ck%3D4865.1.4.280.214.220.216.466%26shh%3Dwww.baidu.com%26sht%3Dbaiduhome_pg%26wd%3D%26eqid%3Df88afe160005c98d000000045e8c37c3%22%7D; __jsluid_h=67a36bfa6bb1a4f0fefe69b3484126f1; ss_ab=ss47; _zdmA.uid=ZDMA._9bEfZnHE.1586249803.2419200; s_his=%E5%90%B4%E8%A3%95%E6%B3%B0%2C%E7%89%9B%E5%A5%B6; Hm_lpvt_9b7ac3d38f30fe89ff0b8a0546904e58=1586249960; _gat_UA-27058866-1=1");
        Document document = con.get();

        //获取li整块
        Elements elements = document.getElementsByClass("feed-row-wide");
//        //获取内容节点
//        Element contentNode = elements.get(0).getElementsByClass("z-feed-img").get(0).getElementsByTag("a").get(0);
//        //获取价格节点
//        Element priceNode = elements.get(0).getElementsByClass("z-highlight").get(0);
//        //获取a标签里面的内容
//        Element content = elements.get(0).getElementsByTag("a").get(0);
//        String href = content.attr("href");
//        String title = content.attr("title");
//        String price = priceNode.html();
        //feed-pagenation 翻页


        for (int i = 0; i < elements.size(); i++) {
            //获取内容节点
            Element contentNode = elements.get(i).getElementsByClass("z-feed-img").get(0).getElementsByTag("a").get(0);
            //获取价格节点
            Element priceNode = elements.get(i).getElementsByClass("z-highlight").get(0);
            //获取a标签里面的内容
            Element content = elements.get(i).getElementsByTag("a").get(0);
            String href = content.attr("href");
            String title = content.attr("title");
            String price = priceNode.html();
            String time = elements.get(i).getElementsByClass("feed-block-extras").get(0).childNodes().get(0).outerHtml();
            JSONObject json = new JSONObject();
            String onclickEvent = content.attr("onclick");
            JSONObject type = JSONObject.parseObject(onclickEvent.substring(onclickEvent.indexOf("{"), onclickEvent.lastIndexOf("}") + 1));
            System.out.println("===========数据获取序号：" + i + "，时间：" + time + ", 标题：" + title + "，链接：" + href + "，价格：" + price);

        }
    }
}
