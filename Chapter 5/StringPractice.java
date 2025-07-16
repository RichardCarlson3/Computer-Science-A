public class StringPractice {

    public String scroll(String s){
        String a=s.substring(1);
        String b=s.substring(0,1);
        String c=a+b;
        return c;
    }
    public String convertName(String s){
        int a=s.indexOf(",");
        String b=s.substring(0,a);
        String c=s.substring(a+1);
        String e=c.trim();
        String f=b.trim();
        String d=e+" "+f;
        return d;
    }
    public String negative(String s){
        String a=s.replace("0","2");
        String b=a.replace("1","0");
        String c=b.replace("2","1");
        return c;
    }
    public String convertDate(String s){
        int a=s.indexOf("/");
        int d=s.indexOf("/",a+1);
        String b=s.substring(0,a);
        String c=s.substring(a+1,d);
        String e=s.substring(d+1);
        String f=c+"-"+b+"-"+e;
        return f;
    }
    public String convertDate2(String s){
        int a=s.indexOf("/");
        int d=s.indexOf("/",a+1);
        String b=s.substring(0,a);
        String c=s.substring(a+1,d);
        String e=s.substring(d+1);
        if(b.length()<2)
            b=0+b;
        if(c.length()<2)
            c=0+c;
        String f=" "+c+"-"+b+"-"+e;
        return f;
    }
        public boolean startsWith(String s, String prefix){
            int a=prefix.length();
            int c=s.length();
            if (a>c) return false;
            String b=s.substring(0,a);
            if (b.equals(prefix)) return true;
            else return false;
            
        }
        public boolean endsWith(String s, String suffix){
            int a=suffix.length();
            int c=s.length();
            int d=c-a;
            if (a>c) return false;
            String b=s.substring(d);
            if (b.equals(suffix)) return true;
            else return false;
        }
        public String removeTag(String s, String a){
            int b=s.indexOf("<"+a+">");
            int c=s.indexOf("<"+"/"+a+">");
            int d=a.length();
            if(b==-1||c==-1){
            return s;}
            if(b>c) return s;
            String e=s.substring(d+2+b,c);
            return e;
            


        }
    public static void main(String [] args){
        StringPractice a= new StringPractice();
        System.out.println("scroll");
        System.out.println(a.scroll("Hello World"));
        System.out.println(a.scroll("happy"));
        System.out.println(a.scroll("h"));
        System.out.println();
        System.out.println("convertName");
        System.out.println(a.convertName(" Reubenstein, Lori Renee "));
        System.out.println(a.convertName("Biden,Joe"));
        System.out.println(a.convertName("the Clown, Bozo"));
        System.out.println();
        System.out.println("negative");
        System.out.println(a.negative("0010111001"));
        System.out.println(a.negative("11111111"));
        System.out.println();
        System.out.println("convertDate");
        System.out.println("04/20/2014 becomes " + a.convertDate("04/20/2014"));
        System.out.println();
        System.out.println("convertDate2");
        System.out.println("04/20/2014 becomes" + a.convertDate2("04/20/2014"));
        System.out.println("4/20/2014 becomes" + a.convertDate2("4/20/2014"));
        System.out.println("04/2/2014 becomes" + a.convertDate2("04/2/2014"));
        System.out.println("4/2/2014 becomes" + a.convertDate2("4/2/2014"));
        System.out.println("\nstartsWith");
        System.out.println(a.startsWith("architecture", "arch"));
        System.out.println(a.startsWith("architecture", "a"));
        System.out.println(a.startsWith("arch", "architecture"));
        System.out.println(a.startsWith("architecture", "rch"));
        System.out.println(a.startsWith("architecture", "architecture"));
        System.out.println("\nendsWith");
        System.out.println(a.endsWith("astronomy", "nomy"));
        System.out.println(a.endsWith("astronomy", "y"));
        System.out.println(a.endsWith("astronomy", "nom"));
        System.out.println(a.endsWith("nomy", "astronomy"));
        System.out.println(a.endsWith("astronomy", "astronomy"));
        System.out.println("\nremoveTag");
        System.out.println(a.removeTag("<b>Hello World</b>", "b"));
        System.out.println(a.removeTag("<b>Hello World</b>", "head"));
        System.out.println(a.removeTag("Hello World</b>", "b"));
        System.out.println(a.removeTag("<b>Hello World", "b"));
        System.out.println(a.removeTag("</img>Hello World<img>", "img"));
        System.out.println(a.removeTag("Happy Birthday <b>Hello World</b>", "b"));
        System.out.println(a.removeTag("<title>Hello World</title> Happy Birthday",
        "title"));
        System.out.println(a.removeTag("Happy <b>Hello World</b> Birthday", "b"));
}
}
