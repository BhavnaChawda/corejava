package in.com.Deserializable;

import java.io.Serializable;

public class Marksheet implements Serializable {
	
    public int id = 0;
	public String name = null;
	public int java = 0;    // transient ka use data ko hide krne ke liye krte he
	public int python = 0;
	public int html= 0;
	public int css = 0;
	public int javascript = 0;
	public int total = 0;
	
	
}

	
	
