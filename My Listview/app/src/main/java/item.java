

/**
 * Created by Howell on 2015/12/11.
 */
public class item {
    private String text;
    private int imageid;
    public item(String text, int imageid){
        this.imageid=imageid;
        this.text=text;
    }
    public String getText(){
        return text;
    }
    public int getImageid(){
        return imageid;
    }
}
