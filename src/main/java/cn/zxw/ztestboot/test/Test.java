package cn.zxw.ztestboot.test;

import java.io.*;

/**
 * @author : ZXW
 * @version : 1.0
 * @date : 2020-10-19 14:42
 * @Description :
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        String html = test.getHtmlByPageName1("dddddd");
        System.out.println(html);
    }

    /**
     * 获取对应pageName的html内容（本地eclipse里直接run）<br>
     * 字符流方式读取文件
     */
    public String getHtmlByPageName1(String pageName) {
        System.out.println();
        // URL url = this.getClass().getClassLoader().getResource("templates/" + pageName + ".html");
        // System.out.println("pageName : "+pageName+" - "+url);
        // File f = new
        // File("E:\\code_svn\\srp_trunk\\target\\classes\\templates\\404.html");
        File f = new File("E:\\IdeaProjects\\202010\\20_A8V7.1SP1_M_2019Y10M_哈药集团股份有限公司\\WebRoot\\WEB-INF\\cfgHome\\plugin\\hylmzxw\\test.html");
        StringBuffer sb = new StringBuffer();
        BufferedInputStream bis = null;
        try {
            // File f = new File(url.toURI());
            FileInputStream fis = new FileInputStream(f);
            bis = new BufferedInputStream(fis);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String s = "";
            while ((s = br.readLine()) != null) {
                sb.append(s).append("\n");
            }
            System.out.println("page content:"+sb.toString().substring(0, 200)+"...");
        } catch (Exception e){
            System.out.println(e);
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    System.out.println(e.toString());
                }
            }
        }
        return sb.toString();

    }
}
